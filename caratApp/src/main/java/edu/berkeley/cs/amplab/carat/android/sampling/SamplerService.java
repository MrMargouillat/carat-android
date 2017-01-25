package edu.berkeley.cs.amplab.carat.android.sampling;

import java.util.concurrent.TimeUnit;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.PowerManager;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import edu.berkeley.cs.amplab.carat.android.Constants;
import edu.berkeley.cs.amplab.carat.android.MainActivity;
import edu.berkeley.cs.amplab.carat.android.R;
import edu.berkeley.cs.amplab.carat.android.storage.CaratSampleDB;
import edu.berkeley.cs.amplab.carat.android.utils.BatteryUtils;
import edu.berkeley.cs.amplab.carat.android.utils.Boolean3;
import edu.berkeley.cs.amplab.carat.android.utils.Logger;
import edu.berkeley.cs.amplab.carat.thrift.Sample;

public class SamplerService extends IntentService {
    private static final String TAG = "SamplerService";
	private AlarmManager alarmManager;
	private Intent receiver;
    private double distance;
    
    public SamplerService() {
        super(TAG);
    }
    
    @SuppressLint("CommitPrefEdits")
	@Override
    protected void onHandleIntent(Intent intent) {
    	Sampler sampler = Sampler.getInstance();

		// At this point SimpleWakefulReceiver is still holding a wake lock
		// for us. We can do whatever we need to here and then tell it that
		// it can release the wakelock. This sample just does some slow work,
		// but more complicated implementations could take their own wake
		// lock here before releasing the receiver's.
		//
		// Note that when using this approach you should be aware that if your
		// service gets killed and restarted while in the middle of such work
		// (so the Intent gets re-delivered to perform the work again), it will
		// at that point no longer be holding a wake lock since we are depending
		// on SimpleWakefulReceiver to that for us. If this is a concern, you
		// can acquire a separate wake lock here.
		PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
		PowerManager.WakeLock wl = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, TAG);
		wl.acquire();

		Context context = getApplicationContext();
		alarmManager =
				(AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
		receiver = new Intent(this, SamplerService.class);
		receiver.setAction(Constants.ACTION_SCHEDULED_SAMPLE);

		String action = intent.getAction();
		switch (action) {
			case Intent.ACTION_BATTERY_CHANGED:
				Boolean3 charging = BatteryUtils.isCharging(intent);
				if (charging == Boolean3.YES) {
					startRapidSampling(context);
				} else if (charging == Boolean3.NO) {
					stopRapidSampling(context);
				}

				if (batteryLevelChanged(intent, context) || isRapidSampling()) {
					sample(intent, context);
				}
				break;
			case Constants.ACTION_SCHEDULED_SAMPLE:
				Intent check = context
						.registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
				if(check == null) break;
				if (BatteryUtils.isCharging(check) == Boolean3.NO || BatteryUtils.isFull(check)) {
					stopRapidSampling(context);
				} else {
					this.sample(check, context);
				}
				break;
			default:
				Log.d(TAG, "Creating sample after receiving " + action);
				sample(intent, context);
				break;
		}
        wl.release();
        if (sampler != null){
			Sampler.completeWakefulIntent(intent);
		}
    }

	private void startRapidSampling(Context context){
		if(!isRapidSampling()){
			PendingIntent rapidSampling = PendingIntent.getService(context, 0, receiver, 0);
			alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, SystemClock.elapsedRealtime(),
					TimeUnit.SECONDS.toMillis(60), rapidSampling);
			Log.d(TAG, "Started rapid sampling!");
		}
	}

	private void stopRapidSampling(Context context){
		if(isRapidSampling()){
			PendingIntent rapidSampling = PendingIntent.getService(this, 0, receiver, 0);
			rapidSampling.cancel();
			alarmManager.cancel(rapidSampling);
			Log.d(TAG, "Stopped rapid sampling!");
		}
	}

	private boolean isRapidSampling(){
		int PEEK_FLAG = PendingIntent.FLAG_NO_CREATE;
		return PendingIntent.getService(this, 0, receiver, PEEK_FLAG) != null;
	}

	private void sample(Intent intent, Context context){
		CaratSampleDB sampleDB = CaratSampleDB.getInstance(context);
		Sample lastSample = sampleDB.getLastSample(context);

		String lastBatteryState = lastSample != null ? lastSample.getBatteryState() : "Unknown";
		Sample s = SamplingLibrary.sample(context, intent.getAction(), lastBatteryState);
		if(s == null){
			Logger.d(TAG, "Sample was null!");
			return;
		}

		long id = sampleDB.putSample(s);
		notifyIfNeeded(context);
		Log.i(TAG, "Took sample " + id + " for " + intent.getAction());
	}

	private boolean batteryLevelChanged(Intent intent, Context context){
		double batteryLevel = BatteryUtils.getBatteryLevel(intent);
		if(batteryLevel <= 0){
			Logger.d(TAG, "Battery level was zero or negative");
			return false;
		}
		double lastBatteryLevel = SamplingLibrary.getLastSampledBatteryLevel(context);
		return batteryLevel != lastBatteryLevel;
	}
    
    private void notifyIfNeeded(Context context){
		final SharedPreferences p = PreferenceManager.getDefaultSharedPreferences(context);
		final boolean disableNotifications = p.getBoolean("noNotifications", false);
		if(disableNotifications){
			return;
		}

        long now = System.currentTimeMillis();
        long lastNotify = Sampler.getInstance().getLastNotify();
        
        // Do not notify if it is less than 2 days from last notification
        if (lastNotify + Constants.FRESHNESS_TIMEOUT_QUICKHOGS > now)
            return;
        
        int samples = CaratSampleDB.getInstance(context).countSamples();
        if (samples >= Sampler.MAX_SAMPLES){
            Sampler.getInstance().setLastNotify(now);
        PendingIntent launchCarat = PendingIntent.getActivity(context, 0,
                new Intent(context, MainActivity.class), 0);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(
                context)
                .setSmallIcon(R.drawable.carat_notif_icon)
                .setContentTitle("Please open Carat")
                .setContentText("Please open Carat. Samples to send:")
                .setNumber(samples);
        mBuilder.setContentIntent(launchCarat);
        mBuilder.setAutoCancel(true);
        NotificationManager mNotificationManager = (NotificationManager) context
                .getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(1, mBuilder.build());
        }
    }
}
