package edu.berkeley.cs.amplab.carat.android.protocol;

import java.util.Set;
import java.util.SortedMap;

import android.content.Context;
import android.util.Log;
import edu.berkeley.cs.amplab.carat.android.CaratApplication;
import edu.berkeley.cs.amplab.carat.android.Constants;
import edu.berkeley.cs.amplab.carat.android.R;
import edu.berkeley.cs.amplab.carat.android.storage.SampleDB;
import edu.berkeley.cs.amplab.carat.android.utils.Logger;
import edu.berkeley.cs.amplab.carat.android.utils.NetworkingUtil;
import edu.berkeley.cs.amplab.carat.android.utils.Util;
import edu.berkeley.cs.amplab.carat.thrift.Sample;

/**
 * Communicates with the Carat Server. Sends samples stored in CaratDB every
 * COMMS_INTERVAL ms.
 * 
 * @author Eemil Lagerspetz
 * 
 */
public class SampleSender {
    
    private static final String TAG = "sendSamples";
    private static final Object sendLock = new Object();

    public static boolean sendingSamples = false;

    // Prevent instantiation
    private SampleSender(){}
    
    public static boolean sendSamples(CaratApplication app) {
        synchronized(sendLock){
            Context c = app.getApplicationContext();
            boolean online = NetworkingUtil.isOnline(c);
            
            if (online) {
                SampleDB db = SampleDB.getInstance(c);
                CommunicationManager commManager = app.commManager;
                if(commManager == null){
                    Logger.d(TAG, "Communication manager is not ready yet");
                    return false;
                }
                int sampleCount = db.countSamples();
                int successSum = 0;
                int failures = 0;
                SortedMap<Long, Sample> batch = db.queryOldestSamples(Constants.COMMS_MAX_UPLOAD_BATCH);
                sendingSamples = true;
                while(batch.size() > 0 && failures <= 3){
                    int sent = commManager.uploadSamples(batch.values());
                    if(sent > 0){
                        failures = 0; // Reset tries
                        successSum += sent;
                        int progress = (int)(successSum / (sampleCount * 100.0));
                        String progressString = progress + "% " + app.getString(R.string.samplesreported);
                        CaratApplication.setStatus(progressString);

                        // Delete samples that were sent successfully
                        Set<Long> sentRowIds = Util.firstEntries(sent, batch).keySet();
                        db.deleteSamples(sentRowIds);
                    } else {
                        Log.d(TAG, "Failed sending batch, increasing failures to " + failures);
                        failures++;
                    }
                    batch = db.queryOldestSamples(Constants.COMMS_MAX_UPLOAD_BATCH);
                }
                commManager.disposeRpcService(); //
                sendingSamples = false;
                return db.countSamples() == 0 || successSum == sampleCount;
            } else {
                Logger.d(TAG, "Not online, cannot send samples");
            }
            return false;
        }
    }

    public static boolean isSendingSamples(){
        return sendingSamples;
    }
}
