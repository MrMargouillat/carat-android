/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.berkeley.cs.amplab.carat.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-6-20")
public class AppProcess implements org.apache.thrift.TBase<AppProcess, AppProcess._Fields>, java.io.Serializable, Cloneable, Comparable<AppProcess> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AppProcess");

  private static final org.apache.thrift.protocol.TField PROCESS_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("processName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField P_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("pId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FOREGROUND_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("foregroundTime", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField LAUNCH_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("launchCount", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField IMPORTANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("importance", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AppProcessStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AppProcessTupleSchemeFactory());
  }

  public String processName; // optional
  public int pId; // optional
  public double foregroundTime; // optional
  public double launchCount; // optional
  public int importance; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROCESS_NAME((short)1, "processName"),
    P_ID((short)2, "pId"),
    FOREGROUND_TIME((short)3, "foregroundTime"),
    LAUNCH_COUNT((short)4, "launchCount"),
    IMPORTANCE((short)5, "importance");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PROCESS_NAME
          return PROCESS_NAME;
        case 2: // P_ID
          return P_ID;
        case 3: // FOREGROUND_TIME
          return FOREGROUND_TIME;
        case 4: // LAUNCH_COUNT
          return LAUNCH_COUNT;
        case 5: // IMPORTANCE
          return IMPORTANCE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PID_ISSET_ID = 0;
  private static final int __FOREGROUNDTIME_ISSET_ID = 1;
  private static final int __LAUNCHCOUNT_ISSET_ID = 2;
  private static final int __IMPORTANCE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PROCESS_NAME,_Fields.P_ID,_Fields.FOREGROUND_TIME,_Fields.LAUNCH_COUNT,_Fields.IMPORTANCE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROCESS_NAME, new org.apache.thrift.meta_data.FieldMetaData("processName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.P_ID, new org.apache.thrift.meta_data.FieldMetaData("pId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FOREGROUND_TIME, new org.apache.thrift.meta_data.FieldMetaData("foregroundTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.LAUNCH_COUNT, new org.apache.thrift.meta_data.FieldMetaData("launchCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.IMPORTANCE, new org.apache.thrift.meta_data.FieldMetaData("importance", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AppProcess.class, metaDataMap);
  }

  public AppProcess() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AppProcess(AppProcess other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetProcessName()) {
      this.processName = other.processName;
    }
    this.pId = other.pId;
    this.foregroundTime = other.foregroundTime;
    this.launchCount = other.launchCount;
    this.importance = other.importance;
  }

  public AppProcess deepCopy() {
    return new AppProcess(this);
  }

  @Override
  public void clear() {
    this.processName = null;
    setPIdIsSet(false);
    this.pId = 0;
    setForegroundTimeIsSet(false);
    this.foregroundTime = 0.0;
    setLaunchCountIsSet(false);
    this.launchCount = 0.0;
    setImportanceIsSet(false);
    this.importance = 0;
  }

  public String getProcessName() {
    return this.processName;
  }

  public AppProcess setProcessName(String processName) {
    this.processName = processName;
    return this;
  }

  public void unsetProcessName() {
    this.processName = null;
  }

  /** Returns true if field processName is set (has been assigned a value) and false otherwise */
  public boolean isSetProcessName() {
    return this.processName != null;
  }

  public void setProcessNameIsSet(boolean value) {
    if (!value) {
      this.processName = null;
    }
  }

  public int getPId() {
    return this.pId;
  }

  public AppProcess setPId(int pId) {
    this.pId = pId;
    setPIdIsSet(true);
    return this;
  }

  public void unsetPId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PID_ISSET_ID);
  }

  /** Returns true if field pId is set (has been assigned a value) and false otherwise */
  public boolean isSetPId() {
    return EncodingUtils.testBit(__isset_bitfield, __PID_ISSET_ID);
  }

  public void setPIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PID_ISSET_ID, value);
  }

  public double getForegroundTime() {
    return this.foregroundTime;
  }

  public AppProcess setForegroundTime(double foregroundTime) {
    this.foregroundTime = foregroundTime;
    setForegroundTimeIsSet(true);
    return this;
  }

  public void unsetForegroundTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FOREGROUNDTIME_ISSET_ID);
  }

  /** Returns true if field foregroundTime is set (has been assigned a value) and false otherwise */
  public boolean isSetForegroundTime() {
    return EncodingUtils.testBit(__isset_bitfield, __FOREGROUNDTIME_ISSET_ID);
  }

  public void setForegroundTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FOREGROUNDTIME_ISSET_ID, value);
  }

  public double getLaunchCount() {
    return this.launchCount;
  }

  public AppProcess setLaunchCount(double launchCount) {
    this.launchCount = launchCount;
    setLaunchCountIsSet(true);
    return this;
  }

  public void unsetLaunchCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LAUNCHCOUNT_ISSET_ID);
  }

  /** Returns true if field launchCount is set (has been assigned a value) and false otherwise */
  public boolean isSetLaunchCount() {
    return EncodingUtils.testBit(__isset_bitfield, __LAUNCHCOUNT_ISSET_ID);
  }

  public void setLaunchCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LAUNCHCOUNT_ISSET_ID, value);
  }

  public int getImportance() {
    return this.importance;
  }

  public AppProcess setImportance(int importance) {
    this.importance = importance;
    setImportanceIsSet(true);
    return this;
  }

  public void unsetImportance() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IMPORTANCE_ISSET_ID);
  }

  /** Returns true if field importance is set (has been assigned a value) and false otherwise */
  public boolean isSetImportance() {
    return EncodingUtils.testBit(__isset_bitfield, __IMPORTANCE_ISSET_ID);
  }

  public void setImportanceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IMPORTANCE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROCESS_NAME:
      if (value == null) {
        unsetProcessName();
      } else {
        setProcessName((String)value);
      }
      break;

    case P_ID:
      if (value == null) {
        unsetPId();
      } else {
        setPId((Integer)value);
      }
      break;

    case FOREGROUND_TIME:
      if (value == null) {
        unsetForegroundTime();
      } else {
        setForegroundTime((Double)value);
      }
      break;

    case LAUNCH_COUNT:
      if (value == null) {
        unsetLaunchCount();
      } else {
        setLaunchCount((Double)value);
      }
      break;

    case IMPORTANCE:
      if (value == null) {
        unsetImportance();
      } else {
        setImportance((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROCESS_NAME:
      return getProcessName();

    case P_ID:
      return Integer.valueOf(getPId());

    case FOREGROUND_TIME:
      return Double.valueOf(getForegroundTime());

    case LAUNCH_COUNT:
      return Double.valueOf(getLaunchCount());

    case IMPORTANCE:
      return Integer.valueOf(getImportance());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROCESS_NAME:
      return isSetProcessName();
    case P_ID:
      return isSetPId();
    case FOREGROUND_TIME:
      return isSetForegroundTime();
    case LAUNCH_COUNT:
      return isSetLaunchCount();
    case IMPORTANCE:
      return isSetImportance();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AppProcess)
      return this.equals((AppProcess)that);
    return false;
  }

  public boolean equals(AppProcess that) {
    if (that == null)
      return false;

    boolean this_present_processName = true && this.isSetProcessName();
    boolean that_present_processName = true && that.isSetProcessName();
    if (this_present_processName || that_present_processName) {
      if (!(this_present_processName && that_present_processName))
        return false;
      if (!this.processName.equals(that.processName))
        return false;
    }

    boolean this_present_pId = true && this.isSetPId();
    boolean that_present_pId = true && that.isSetPId();
    if (this_present_pId || that_present_pId) {
      if (!(this_present_pId && that_present_pId))
        return false;
      if (this.pId != that.pId)
        return false;
    }

    boolean this_present_foregroundTime = true && this.isSetForegroundTime();
    boolean that_present_foregroundTime = true && that.isSetForegroundTime();
    if (this_present_foregroundTime || that_present_foregroundTime) {
      if (!(this_present_foregroundTime && that_present_foregroundTime))
        return false;
      if (this.foregroundTime != that.foregroundTime)
        return false;
    }

    boolean this_present_launchCount = true && this.isSetLaunchCount();
    boolean that_present_launchCount = true && that.isSetLaunchCount();
    if (this_present_launchCount || that_present_launchCount) {
      if (!(this_present_launchCount && that_present_launchCount))
        return false;
      if (this.launchCount != that.launchCount)
        return false;
    }

    boolean this_present_importance = true && this.isSetImportance();
    boolean that_present_importance = true && that.isSetImportance();
    if (this_present_importance || that_present_importance) {
      if (!(this_present_importance && that_present_importance))
        return false;
      if (this.importance != that.importance)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_processName = true && (isSetProcessName());
    list.add(present_processName);
    if (present_processName)
      list.add(processName);

    boolean present_pId = true && (isSetPId());
    list.add(present_pId);
    if (present_pId)
      list.add(pId);

    boolean present_foregroundTime = true && (isSetForegroundTime());
    list.add(present_foregroundTime);
    if (present_foregroundTime)
      list.add(foregroundTime);

    boolean present_launchCount = true && (isSetLaunchCount());
    list.add(present_launchCount);
    if (present_launchCount)
      list.add(launchCount);

    boolean present_importance = true && (isSetImportance());
    list.add(present_importance);
    if (present_importance)
      list.add(importance);

    return list.hashCode();
  }

  @Override
  public int compareTo(AppProcess other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProcessName()).compareTo(other.isSetProcessName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProcessName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.processName, other.processName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPId()).compareTo(other.isSetPId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pId, other.pId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetForegroundTime()).compareTo(other.isSetForegroundTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetForegroundTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.foregroundTime, other.foregroundTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLaunchCount()).compareTo(other.isSetLaunchCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLaunchCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.launchCount, other.launchCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetImportance()).compareTo(other.isSetImportance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImportance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.importance, other.importance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AppProcess(");
    boolean first = true;

    if (isSetProcessName()) {
      sb.append("processName:");
      if (this.processName == null) {
        sb.append("null");
      } else {
        sb.append(this.processName);
      }
      first = false;
    }
    if (isSetPId()) {
      if (!first) sb.append(", ");
      sb.append("pId:");
      sb.append(this.pId);
      first = false;
    }
    if (isSetForegroundTime()) {
      if (!first) sb.append(", ");
      sb.append("foregroundTime:");
      sb.append(this.foregroundTime);
      first = false;
    }
    if (isSetLaunchCount()) {
      if (!first) sb.append(", ");
      sb.append("launchCount:");
      sb.append(this.launchCount);
      first = false;
    }
    if (isSetImportance()) {
      if (!first) sb.append(", ");
      sb.append("importance:");
      sb.append(this.importance);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AppProcessStandardSchemeFactory implements SchemeFactory {
    public AppProcessStandardScheme getScheme() {
      return new AppProcessStandardScheme();
    }
  }

  private static class AppProcessStandardScheme extends StandardScheme<AppProcess> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AppProcess struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROCESS_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.processName = iprot.readString();
              struct.setProcessNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // P_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pId = iprot.readI32();
              struct.setPIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FOREGROUND_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.foregroundTime = iprot.readDouble();
              struct.setForegroundTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LAUNCH_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.launchCount = iprot.readDouble();
              struct.setLaunchCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IMPORTANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.importance = iprot.readI32();
              struct.setImportanceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AppProcess struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.processName != null) {
        if (struct.isSetProcessName()) {
          oprot.writeFieldBegin(PROCESS_NAME_FIELD_DESC);
          oprot.writeString(struct.processName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPId()) {
        oprot.writeFieldBegin(P_ID_FIELD_DESC);
        oprot.writeI32(struct.pId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetForegroundTime()) {
        oprot.writeFieldBegin(FOREGROUND_TIME_FIELD_DESC);
        oprot.writeDouble(struct.foregroundTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLaunchCount()) {
        oprot.writeFieldBegin(LAUNCH_COUNT_FIELD_DESC);
        oprot.writeDouble(struct.launchCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetImportance()) {
        oprot.writeFieldBegin(IMPORTANCE_FIELD_DESC);
        oprot.writeI32(struct.importance);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AppProcessTupleSchemeFactory implements SchemeFactory {
    public AppProcessTupleScheme getScheme() {
      return new AppProcessTupleScheme();
    }
  }

  private static class AppProcessTupleScheme extends TupleScheme<AppProcess> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AppProcess struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetProcessName()) {
        optionals.set(0);
      }
      if (struct.isSetPId()) {
        optionals.set(1);
      }
      if (struct.isSetForegroundTime()) {
        optionals.set(2);
      }
      if (struct.isSetLaunchCount()) {
        optionals.set(3);
      }
      if (struct.isSetImportance()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetProcessName()) {
        oprot.writeString(struct.processName);
      }
      if (struct.isSetPId()) {
        oprot.writeI32(struct.pId);
      }
      if (struct.isSetForegroundTime()) {
        oprot.writeDouble(struct.foregroundTime);
      }
      if (struct.isSetLaunchCount()) {
        oprot.writeDouble(struct.launchCount);
      }
      if (struct.isSetImportance()) {
        oprot.writeI32(struct.importance);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AppProcess struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.processName = iprot.readString();
        struct.setProcessNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.pId = iprot.readI32();
        struct.setPIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.foregroundTime = iprot.readDouble();
        struct.setForegroundTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.launchCount = iprot.readDouble();
        struct.setLaunchCountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.importance = iprot.readI32();
        struct.setImportanceIsSet(true);
      }
    }
  }

}

