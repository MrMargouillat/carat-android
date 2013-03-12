/**
 * Autogenerated by Thrift Compiler (0.8.0)
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

public class ProcessInfo implements org.apache.thrift.TBase<ProcessInfo, ProcessInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProcessInfo");

  private static final org.apache.thrift.protocol.TField P_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("pId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField P_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("pName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField APPLICATION_LABEL_FIELD_DESC = new org.apache.thrift.protocol.TField("applicationLabel", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField IS_SYSTEM_APP_FIELD_DESC = new org.apache.thrift.protocol.TField("isSystemApp", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField IMPORTANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("importance", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField VERSION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("versionName", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField VERSION_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("versionCode", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField APP_SIGNATURES_FIELD_DESC = new org.apache.thrift.protocol.TField("appSignatures", org.apache.thrift.protocol.TType.LIST, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProcessInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProcessInfoTupleSchemeFactory());
  }

  public int pId; // optional
  public String pName; // optional
  public String applicationLabel; // optional
  public boolean isSystemApp; // optional
  public String importance; // optional
  public String versionName; // optional
  public int versionCode; // optional
  public List<String> appSignatures; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    P_ID((short)1, "pId"),
    P_NAME((short)2, "pName"),
    APPLICATION_LABEL((short)3, "applicationLabel"),
    IS_SYSTEM_APP((short)4, "isSystemApp"),
    IMPORTANCE((short)5, "importance"),
    VERSION_NAME((short)6, "versionName"),
    VERSION_CODE((short)7, "versionCode"),
    APP_SIGNATURES((short)8, "appSignatures");

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
        case 1: // P_ID
          return P_ID;
        case 2: // P_NAME
          return P_NAME;
        case 3: // APPLICATION_LABEL
          return APPLICATION_LABEL;
        case 4: // IS_SYSTEM_APP
          return IS_SYSTEM_APP;
        case 5: // IMPORTANCE
          return IMPORTANCE;
        case 6: // VERSION_NAME
          return VERSION_NAME;
        case 7: // VERSION_CODE
          return VERSION_CODE;
        case 8: // APP_SIGNATURES
          return APP_SIGNATURES;
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
  private static final int __ISSYSTEMAPP_ISSET_ID = 1;
  private static final int __VERSIONCODE_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);
  private _Fields optionals[] = {_Fields.P_ID,_Fields.P_NAME,_Fields.APPLICATION_LABEL,_Fields.IS_SYSTEM_APP,_Fields.IMPORTANCE,_Fields.VERSION_NAME,_Fields.VERSION_CODE,_Fields.APP_SIGNATURES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.P_ID, new org.apache.thrift.meta_data.FieldMetaData("pId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.P_NAME, new org.apache.thrift.meta_data.FieldMetaData("pName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APPLICATION_LABEL, new org.apache.thrift.meta_data.FieldMetaData("applicationLabel", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_SYSTEM_APP, new org.apache.thrift.meta_data.FieldMetaData("isSystemApp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IMPORTANCE, new org.apache.thrift.meta_data.FieldMetaData("importance", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION_NAME, new org.apache.thrift.meta_data.FieldMetaData("versionName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION_CODE, new org.apache.thrift.meta_data.FieldMetaData("versionCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.APP_SIGNATURES, new org.apache.thrift.meta_data.FieldMetaData("appSignatures", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProcessInfo.class, metaDataMap);
  }

  public ProcessInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProcessInfo(ProcessInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.pId = other.pId;
    if (other.isSetPName()) {
      this.pName = other.pName;
    }
    if (other.isSetApplicationLabel()) {
      this.applicationLabel = other.applicationLabel;
    }
    this.isSystemApp = other.isSystemApp;
    if (other.isSetImportance()) {
      this.importance = other.importance;
    }
    if (other.isSetVersionName()) {
      this.versionName = other.versionName;
    }
    this.versionCode = other.versionCode;
    if (other.isSetAppSignatures()) {
      List<String> __this__appSignatures = new ArrayList<String>();
      for (String other_element : other.appSignatures) {
        __this__appSignatures.add(other_element);
      }
      this.appSignatures = __this__appSignatures;
    }
  }

  public ProcessInfo deepCopy() {
    return new ProcessInfo(this);
  }

  @Override
  public void clear() {
    setPIdIsSet(false);
    this.pId = 0;
    this.pName = null;
    this.applicationLabel = null;
    setIsSystemAppIsSet(false);
    this.isSystemApp = false;
    this.importance = null;
    this.versionName = null;
    setVersionCodeIsSet(false);
    this.versionCode = 0;
    this.appSignatures = null;
  }

  public int getPId() {
    return this.pId;
  }

  public ProcessInfo setPId(int pId) {
    this.pId = pId;
    setPIdIsSet(true);
    return this;
  }

  public void unsetPId() {
    __isset_bit_vector.clear(__PID_ISSET_ID);
  }

  /** Returns true if field pId is set (has been assigned a value) and false otherwise */
  public boolean isSetPId() {
    return __isset_bit_vector.get(__PID_ISSET_ID);
  }

  public void setPIdIsSet(boolean value) {
    __isset_bit_vector.set(__PID_ISSET_ID, value);
  }

  public String getPName() {
    return this.pName;
  }

  public ProcessInfo setPName(String pName) {
    this.pName = pName;
    return this;
  }

  public void unsetPName() {
    this.pName = null;
  }

  /** Returns true if field pName is set (has been assigned a value) and false otherwise */
  public boolean isSetPName() {
    return this.pName != null;
  }

  public void setPNameIsSet(boolean value) {
    if (!value) {
      this.pName = null;
    }
  }

  public String getApplicationLabel() {
    return this.applicationLabel;
  }

  public ProcessInfo setApplicationLabel(String applicationLabel) {
    this.applicationLabel = applicationLabel;
    return this;
  }

  public void unsetApplicationLabel() {
    this.applicationLabel = null;
  }

  /** Returns true if field applicationLabel is set (has been assigned a value) and false otherwise */
  public boolean isSetApplicationLabel() {
    return this.applicationLabel != null;
  }

  public void setApplicationLabelIsSet(boolean value) {
    if (!value) {
      this.applicationLabel = null;
    }
  }

  public boolean isIsSystemApp() {
    return this.isSystemApp;
  }

  public ProcessInfo setIsSystemApp(boolean isSystemApp) {
    this.isSystemApp = isSystemApp;
    setIsSystemAppIsSet(true);
    return this;
  }

  public void unsetIsSystemApp() {
    __isset_bit_vector.clear(__ISSYSTEMAPP_ISSET_ID);
  }

  /** Returns true if field isSystemApp is set (has been assigned a value) and false otherwise */
  public boolean isSetIsSystemApp() {
    return __isset_bit_vector.get(__ISSYSTEMAPP_ISSET_ID);
  }

  public void setIsSystemAppIsSet(boolean value) {
    __isset_bit_vector.set(__ISSYSTEMAPP_ISSET_ID, value);
  }

  public String getImportance() {
    return this.importance;
  }

  public ProcessInfo setImportance(String importance) {
    this.importance = importance;
    return this;
  }

  public void unsetImportance() {
    this.importance = null;
  }

  /** Returns true if field importance is set (has been assigned a value) and false otherwise */
  public boolean isSetImportance() {
    return this.importance != null;
  }

  public void setImportanceIsSet(boolean value) {
    if (!value) {
      this.importance = null;
    }
  }

  public String getVersionName() {
    return this.versionName;
  }

  public ProcessInfo setVersionName(String versionName) {
    this.versionName = versionName;
    return this;
  }

  public void unsetVersionName() {
    this.versionName = null;
  }

  /** Returns true if field versionName is set (has been assigned a value) and false otherwise */
  public boolean isSetVersionName() {
    return this.versionName != null;
  }

  public void setVersionNameIsSet(boolean value) {
    if (!value) {
      this.versionName = null;
    }
  }

  public int getVersionCode() {
    return this.versionCode;
  }

  public ProcessInfo setVersionCode(int versionCode) {
    this.versionCode = versionCode;
    setVersionCodeIsSet(true);
    return this;
  }

  public void unsetVersionCode() {
    __isset_bit_vector.clear(__VERSIONCODE_ISSET_ID);
  }

  /** Returns true if field versionCode is set (has been assigned a value) and false otherwise */
  public boolean isSetVersionCode() {
    return __isset_bit_vector.get(__VERSIONCODE_ISSET_ID);
  }

  public void setVersionCodeIsSet(boolean value) {
    __isset_bit_vector.set(__VERSIONCODE_ISSET_ID, value);
  }

  public int getAppSignaturesSize() {
    return (this.appSignatures == null) ? 0 : this.appSignatures.size();
  }

  public java.util.Iterator<String> getAppSignaturesIterator() {
    return (this.appSignatures == null) ? null : this.appSignatures.iterator();
  }

  public void addToAppSignatures(String elem) {
    if (this.appSignatures == null) {
      this.appSignatures = new ArrayList<String>();
    }
    this.appSignatures.add(elem);
  }

  public List<String> getAppSignatures() {
    return this.appSignatures;
  }

  public ProcessInfo setAppSignatures(List<String> appSignatures) {
    this.appSignatures = appSignatures;
    return this;
  }

  public void unsetAppSignatures() {
    this.appSignatures = null;
  }

  /** Returns true if field appSignatures is set (has been assigned a value) and false otherwise */
  public boolean isSetAppSignatures() {
    return this.appSignatures != null;
  }

  public void setAppSignaturesIsSet(boolean value) {
    if (!value) {
      this.appSignatures = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case P_ID:
      if (value == null) {
        unsetPId();
      } else {
        setPId((Integer)value);
      }
      break;

    case P_NAME:
      if (value == null) {
        unsetPName();
      } else {
        setPName((String)value);
      }
      break;

    case APPLICATION_LABEL:
      if (value == null) {
        unsetApplicationLabel();
      } else {
        setApplicationLabel((String)value);
      }
      break;

    case IS_SYSTEM_APP:
      if (value == null) {
        unsetIsSystemApp();
      } else {
        setIsSystemApp((Boolean)value);
      }
      break;

    case IMPORTANCE:
      if (value == null) {
        unsetImportance();
      } else {
        setImportance((String)value);
      }
      break;

    case VERSION_NAME:
      if (value == null) {
        unsetVersionName();
      } else {
        setVersionName((String)value);
      }
      break;

    case VERSION_CODE:
      if (value == null) {
        unsetVersionCode();
      } else {
        setVersionCode((Integer)value);
      }
      break;

    case APP_SIGNATURES:
      if (value == null) {
        unsetAppSignatures();
      } else {
        setAppSignatures((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case P_ID:
      return Integer.valueOf(getPId());

    case P_NAME:
      return getPName();

    case APPLICATION_LABEL:
      return getApplicationLabel();

    case IS_SYSTEM_APP:
      return Boolean.valueOf(isIsSystemApp());

    case IMPORTANCE:
      return getImportance();

    case VERSION_NAME:
      return getVersionName();

    case VERSION_CODE:
      return Integer.valueOf(getVersionCode());

    case APP_SIGNATURES:
      return getAppSignatures();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case P_ID:
      return isSetPId();
    case P_NAME:
      return isSetPName();
    case APPLICATION_LABEL:
      return isSetApplicationLabel();
    case IS_SYSTEM_APP:
      return isSetIsSystemApp();
    case IMPORTANCE:
      return isSetImportance();
    case VERSION_NAME:
      return isSetVersionName();
    case VERSION_CODE:
      return isSetVersionCode();
    case APP_SIGNATURES:
      return isSetAppSignatures();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProcessInfo)
      return this.equals((ProcessInfo)that);
    return false;
  }

  public boolean equals(ProcessInfo that) {
    if (that == null)
      return false;

    boolean this_present_pId = true && this.isSetPId();
    boolean that_present_pId = true && that.isSetPId();
    if (this_present_pId || that_present_pId) {
      if (!(this_present_pId && that_present_pId))
        return false;
      if (this.pId != that.pId)
        return false;
    }

    boolean this_present_pName = true && this.isSetPName();
    boolean that_present_pName = true && that.isSetPName();
    if (this_present_pName || that_present_pName) {
      if (!(this_present_pName && that_present_pName))
        return false;
      if (!this.pName.equals(that.pName))
        return false;
    }

    boolean this_present_applicationLabel = true && this.isSetApplicationLabel();
    boolean that_present_applicationLabel = true && that.isSetApplicationLabel();
    if (this_present_applicationLabel || that_present_applicationLabel) {
      if (!(this_present_applicationLabel && that_present_applicationLabel))
        return false;
      if (!this.applicationLabel.equals(that.applicationLabel))
        return false;
    }

    boolean this_present_isSystemApp = true && this.isSetIsSystemApp();
    boolean that_present_isSystemApp = true && that.isSetIsSystemApp();
    if (this_present_isSystemApp || that_present_isSystemApp) {
      if (!(this_present_isSystemApp && that_present_isSystemApp))
        return false;
      if (this.isSystemApp != that.isSystemApp)
        return false;
    }

    boolean this_present_importance = true && this.isSetImportance();
    boolean that_present_importance = true && that.isSetImportance();
    if (this_present_importance || that_present_importance) {
      if (!(this_present_importance && that_present_importance))
        return false;
      if (!this.importance.equals(that.importance))
        return false;
    }

    boolean this_present_versionName = true && this.isSetVersionName();
    boolean that_present_versionName = true && that.isSetVersionName();
    if (this_present_versionName || that_present_versionName) {
      if (!(this_present_versionName && that_present_versionName))
        return false;
      if (!this.versionName.equals(that.versionName))
        return false;
    }

    boolean this_present_versionCode = true && this.isSetVersionCode();
    boolean that_present_versionCode = true && that.isSetVersionCode();
    if (this_present_versionCode || that_present_versionCode) {
      if (!(this_present_versionCode && that_present_versionCode))
        return false;
      if (this.versionCode != that.versionCode)
        return false;
    }

    boolean this_present_appSignatures = true && this.isSetAppSignatures();
    boolean that_present_appSignatures = true && that.isSetAppSignatures();
    if (this_present_appSignatures || that_present_appSignatures) {
      if (!(this_present_appSignatures && that_present_appSignatures))
        return false;
      if (!this.appSignatures.equals(that.appSignatures))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ProcessInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ProcessInfo typedOther = (ProcessInfo)other;

    lastComparison = Boolean.valueOf(isSetPId()).compareTo(typedOther.isSetPId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pId, typedOther.pId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPName()).compareTo(typedOther.isSetPName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pName, typedOther.pName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApplicationLabel()).compareTo(typedOther.isSetApplicationLabel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplicationLabel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.applicationLabel, typedOther.applicationLabel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsSystemApp()).compareTo(typedOther.isSetIsSystemApp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsSystemApp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isSystemApp, typedOther.isSystemApp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetImportance()).compareTo(typedOther.isSetImportance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImportance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.importance, typedOther.importance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersionName()).compareTo(typedOther.isSetVersionName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersionName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.versionName, typedOther.versionName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersionCode()).compareTo(typedOther.isSetVersionCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersionCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.versionCode, typedOther.versionCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAppSignatures()).compareTo(typedOther.isSetAppSignatures());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppSignatures()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appSignatures, typedOther.appSignatures);
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
    StringBuilder sb = new StringBuilder("ProcessInfo(");
    boolean first = true;

    if (isSetPId()) {
      sb.append("pId:");
      sb.append(this.pId);
      first = false;
    }
    if (isSetPName()) {
      if (!first) sb.append(", ");
      sb.append("pName:");
      if (this.pName == null) {
        sb.append("null");
      } else {
        sb.append(this.pName);
      }
      first = false;
    }
    if (isSetApplicationLabel()) {
      if (!first) sb.append(", ");
      sb.append("applicationLabel:");
      if (this.applicationLabel == null) {
        sb.append("null");
      } else {
        sb.append(this.applicationLabel);
      }
      first = false;
    }
    if (isSetIsSystemApp()) {
      if (!first) sb.append(", ");
      sb.append("isSystemApp:");
      sb.append(this.isSystemApp);
      first = false;
    }
    if (isSetImportance()) {
      if (!first) sb.append(", ");
      sb.append("importance:");
      if (this.importance == null) {
        sb.append("null");
      } else {
        sb.append(this.importance);
      }
      first = false;
    }
    if (isSetVersionName()) {
      if (!first) sb.append(", ");
      sb.append("versionName:");
      if (this.versionName == null) {
        sb.append("null");
      } else {
        sb.append(this.versionName);
      }
      first = false;
    }
    if (isSetVersionCode()) {
      if (!first) sb.append(", ");
      sb.append("versionCode:");
      sb.append(this.versionCode);
      first = false;
    }
    if (isSetAppSignatures()) {
      if (!first) sb.append(", ");
      sb.append("appSignatures:");
      if (this.appSignatures == null) {
        sb.append("null");
      } else {
        sb.append(this.appSignatures);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private static class ProcessInfoStandardSchemeFactory implements SchemeFactory {
    public ProcessInfoStandardScheme getScheme() {
      return new ProcessInfoStandardScheme();
    }
  }

  private static class ProcessInfoStandardScheme extends StandardScheme<ProcessInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProcessInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // P_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pId = iprot.readI32();
              struct.setPIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // P_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pName = iprot.readString();
              struct.setPNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // APPLICATION_LABEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.applicationLabel = iprot.readString();
              struct.setApplicationLabelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_SYSTEM_APP
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isSystemApp = iprot.readBool();
              struct.setIsSystemAppIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IMPORTANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.importance = iprot.readString();
              struct.setImportanceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // VERSION_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.versionName = iprot.readString();
              struct.setVersionNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // VERSION_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.versionCode = iprot.readI32();
              struct.setVersionCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // APP_SIGNATURES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.appSignatures = new ArrayList<String>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  String _elem2; // required
                  _elem2 = iprot.readString();
                  struct.appSignatures.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setAppSignaturesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProcessInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetPId()) {
        oprot.writeFieldBegin(P_ID_FIELD_DESC);
        oprot.writeI32(struct.pId);
        oprot.writeFieldEnd();
      }
      if (struct.pName != null) {
        if (struct.isSetPName()) {
          oprot.writeFieldBegin(P_NAME_FIELD_DESC);
          oprot.writeString(struct.pName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.applicationLabel != null) {
        if (struct.isSetApplicationLabel()) {
          oprot.writeFieldBegin(APPLICATION_LABEL_FIELD_DESC);
          oprot.writeString(struct.applicationLabel);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIsSystemApp()) {
        oprot.writeFieldBegin(IS_SYSTEM_APP_FIELD_DESC);
        oprot.writeBool(struct.isSystemApp);
        oprot.writeFieldEnd();
      }
      if (struct.importance != null) {
        if (struct.isSetImportance()) {
          oprot.writeFieldBegin(IMPORTANCE_FIELD_DESC);
          oprot.writeString(struct.importance);
          oprot.writeFieldEnd();
        }
      }
      if (struct.versionName != null) {
        if (struct.isSetVersionName()) {
          oprot.writeFieldBegin(VERSION_NAME_FIELD_DESC);
          oprot.writeString(struct.versionName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetVersionCode()) {
        oprot.writeFieldBegin(VERSION_CODE_FIELD_DESC);
        oprot.writeI32(struct.versionCode);
        oprot.writeFieldEnd();
      }
      if (struct.appSignatures != null) {
        if (struct.isSetAppSignatures()) {
          oprot.writeFieldBegin(APP_SIGNATURES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.appSignatures.size()));
            for (String _iter3 : struct.appSignatures)
            {
              oprot.writeString(_iter3);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProcessInfoTupleSchemeFactory implements SchemeFactory {
    public ProcessInfoTupleScheme getScheme() {
      return new ProcessInfoTupleScheme();
    }
  }

  private static class ProcessInfoTupleScheme extends TupleScheme<ProcessInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProcessInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPId()) {
        optionals.set(0);
      }
      if (struct.isSetPName()) {
        optionals.set(1);
      }
      if (struct.isSetApplicationLabel()) {
        optionals.set(2);
      }
      if (struct.isSetIsSystemApp()) {
        optionals.set(3);
      }
      if (struct.isSetImportance()) {
        optionals.set(4);
      }
      if (struct.isSetVersionName()) {
        optionals.set(5);
      }
      if (struct.isSetVersionCode()) {
        optionals.set(6);
      }
      if (struct.isSetAppSignatures()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetPId()) {
        oprot.writeI32(struct.pId);
      }
      if (struct.isSetPName()) {
        oprot.writeString(struct.pName);
      }
      if (struct.isSetApplicationLabel()) {
        oprot.writeString(struct.applicationLabel);
      }
      if (struct.isSetIsSystemApp()) {
        oprot.writeBool(struct.isSystemApp);
      }
      if (struct.isSetImportance()) {
        oprot.writeString(struct.importance);
      }
      if (struct.isSetVersionName()) {
        oprot.writeString(struct.versionName);
      }
      if (struct.isSetVersionCode()) {
        oprot.writeI32(struct.versionCode);
      }
      if (struct.isSetAppSignatures()) {
        {
          oprot.writeI32(struct.appSignatures.size());
          for (String _iter4 : struct.appSignatures)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProcessInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.pId = iprot.readI32();
        struct.setPIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.pName = iprot.readString();
        struct.setPNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.applicationLabel = iprot.readString();
        struct.setApplicationLabelIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isSystemApp = iprot.readBool();
        struct.setIsSystemAppIsSet(true);
      }
      if (incoming.get(4)) {
        struct.importance = iprot.readString();
        struct.setImportanceIsSet(true);
      }
      if (incoming.get(5)) {
        struct.versionName = iprot.readString();
        struct.setVersionNameIsSet(true);
      }
      if (incoming.get(6)) {
        struct.versionCode = iprot.readI32();
        struct.setVersionCodeIsSet(true);
      }
      if (incoming.get(7)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.appSignatures = new ArrayList<String>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            String _elem7; // required
            _elem7 = iprot.readString();
            struct.appSignatures.add(_elem7);
          }
        }
        struct.setAppSignaturesIsSet(true);
      }
    }
  }

}

