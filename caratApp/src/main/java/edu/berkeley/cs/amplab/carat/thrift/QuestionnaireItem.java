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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-6-21")
public class QuestionnaireItem implements org.apache.thrift.TBase<QuestionnaireItem, QuestionnaireItem._Fields>, java.io.Serializable, Cloneable, Comparable<QuestionnaireItem> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QuestionnaireItem");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField QUESTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("questionId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CHOICES_FIELD_DESC = new org.apache.thrift.protocol.TField("choices", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField OTHER_OPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("otherOption", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField INPUT_NUMERIC_FIELD_DESC = new org.apache.thrift.protocol.TField("inputNumeric", org.apache.thrift.protocol.TType.BOOL, (short)7);
  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.LIST, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QuestionnaireItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QuestionnaireItemTupleSchemeFactory());
  }

  public String type; // required
  public int questionId; // optional
  public String title; // optional
  public String content; // optional
  public List<String> choices; // optional
  public boolean otherOption; // optional
  public boolean inputNumeric; // optional
  public List<Integer> location; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE((short)1, "type"),
    QUESTION_ID((short)2, "questionId"),
    TITLE((short)3, "title"),
    CONTENT((short)4, "content"),
    CHOICES((short)5, "choices"),
    OTHER_OPTION((short)6, "otherOption"),
    INPUT_NUMERIC((short)7, "inputNumeric"),
    LOCATION((short)8, "location");

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
        case 1: // TYPE
          return TYPE;
        case 2: // QUESTION_ID
          return QUESTION_ID;
        case 3: // TITLE
          return TITLE;
        case 4: // CONTENT
          return CONTENT;
        case 5: // CHOICES
          return CHOICES;
        case 6: // OTHER_OPTION
          return OTHER_OPTION;
        case 7: // INPUT_NUMERIC
          return INPUT_NUMERIC;
        case 8: // LOCATION
          return LOCATION;
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
  private static final int __QUESTIONID_ISSET_ID = 0;
  private static final int __OTHEROPTION_ISSET_ID = 1;
  private static final int __INPUTNUMERIC_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.QUESTION_ID,_Fields.TITLE,_Fields.CONTENT,_Fields.CHOICES,_Fields.OTHER_OPTION,_Fields.INPUT_NUMERIC,_Fields.LOCATION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUESTION_ID, new org.apache.thrift.meta_data.FieldMetaData("questionId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHOICES, new org.apache.thrift.meta_data.FieldMetaData("choices", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.OTHER_OPTION, new org.apache.thrift.meta_data.FieldMetaData("otherOption", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.INPUT_NUMERIC, new org.apache.thrift.meta_data.FieldMetaData("inputNumeric", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QuestionnaireItem.class, metaDataMap);
  }

  public QuestionnaireItem() {
  }

  public QuestionnaireItem(
    String type)
  {
    this();
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QuestionnaireItem(QuestionnaireItem other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.questionId = other.questionId;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetContent()) {
      this.content = other.content;
    }
    if (other.isSetChoices()) {
      List<String> __this__choices = new ArrayList<String>(other.choices);
      this.choices = __this__choices;
    }
    this.otherOption = other.otherOption;
    this.inputNumeric = other.inputNumeric;
    if (other.isSetLocation()) {
      List<Integer> __this__location = new ArrayList<Integer>(other.location);
      this.location = __this__location;
    }
  }

  public QuestionnaireItem deepCopy() {
    return new QuestionnaireItem(this);
  }

  @Override
  public void clear() {
    this.type = null;
    setQuestionIdIsSet(false);
    this.questionId = 0;
    this.title = null;
    this.content = null;
    this.choices = null;
    setOtherOptionIsSet(false);
    this.otherOption = false;
    setInputNumericIsSet(false);
    this.inputNumeric = false;
    this.location = null;
  }

  public String getType() {
    return this.type;
  }

  public QuestionnaireItem setType(String type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public int getQuestionId() {
    return this.questionId;
  }

  public QuestionnaireItem setQuestionId(int questionId) {
    this.questionId = questionId;
    setQuestionIdIsSet(true);
    return this;
  }

  public void unsetQuestionId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __QUESTIONID_ISSET_ID);
  }

  /** Returns true if field questionId is set (has been assigned a value) and false otherwise */
  public boolean isSetQuestionId() {
    return EncodingUtils.testBit(__isset_bitfield, __QUESTIONID_ISSET_ID);
  }

  public void setQuestionIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __QUESTIONID_ISSET_ID, value);
  }

  public String getTitle() {
    return this.title;
  }

  public QuestionnaireItem setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public String getContent() {
    return this.content;
  }

  public QuestionnaireItem setContent(String content) {
    this.content = content;
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
  }

  public int getChoicesSize() {
    return (this.choices == null) ? 0 : this.choices.size();
  }

  public java.util.Iterator<String> getChoicesIterator() {
    return (this.choices == null) ? null : this.choices.iterator();
  }

  public void addToChoices(String elem) {
    if (this.choices == null) {
      this.choices = new ArrayList<String>();
    }
    this.choices.add(elem);
  }

  public List<String> getChoices() {
    return this.choices;
  }

  public QuestionnaireItem setChoices(List<String> choices) {
    this.choices = choices;
    return this;
  }

  public void unsetChoices() {
    this.choices = null;
  }

  /** Returns true if field choices is set (has been assigned a value) and false otherwise */
  public boolean isSetChoices() {
    return this.choices != null;
  }

  public void setChoicesIsSet(boolean value) {
    if (!value) {
      this.choices = null;
    }
  }

  public boolean isOtherOption() {
    return this.otherOption;
  }

  public QuestionnaireItem setOtherOption(boolean otherOption) {
    this.otherOption = otherOption;
    setOtherOptionIsSet(true);
    return this;
  }

  public void unsetOtherOption() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OTHEROPTION_ISSET_ID);
  }

  /** Returns true if field otherOption is set (has been assigned a value) and false otherwise */
  public boolean isSetOtherOption() {
    return EncodingUtils.testBit(__isset_bitfield, __OTHEROPTION_ISSET_ID);
  }

  public void setOtherOptionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OTHEROPTION_ISSET_ID, value);
  }

  public boolean isInputNumeric() {
    return this.inputNumeric;
  }

  public QuestionnaireItem setInputNumeric(boolean inputNumeric) {
    this.inputNumeric = inputNumeric;
    setInputNumericIsSet(true);
    return this;
  }

  public void unsetInputNumeric() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INPUTNUMERIC_ISSET_ID);
  }

  /** Returns true if field inputNumeric is set (has been assigned a value) and false otherwise */
  public boolean isSetInputNumeric() {
    return EncodingUtils.testBit(__isset_bitfield, __INPUTNUMERIC_ISSET_ID);
  }

  public void setInputNumericIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INPUTNUMERIC_ISSET_ID, value);
  }

  public int getLocationSize() {
    return (this.location == null) ? 0 : this.location.size();
  }

  public java.util.Iterator<Integer> getLocationIterator() {
    return (this.location == null) ? null : this.location.iterator();
  }

  public void addToLocation(int elem) {
    if (this.location == null) {
      this.location = new ArrayList<Integer>();
    }
    this.location.add(elem);
  }

  public List<Integer> getLocation() {
    return this.location;
  }

  public QuestionnaireItem setLocation(List<Integer> location) {
    this.location = location;
    return this;
  }

  public void unsetLocation() {
    this.location = null;
  }

  /** Returns true if field location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return this.location != null;
  }

  public void setLocationIsSet(boolean value) {
    if (!value) {
      this.location = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((String)value);
      }
      break;

    case QUESTION_ID:
      if (value == null) {
        unsetQuestionId();
      } else {
        setQuestionId((Integer)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((String)value);
      }
      break;

    case CHOICES:
      if (value == null) {
        unsetChoices();
      } else {
        setChoices((List<String>)value);
      }
      break;

    case OTHER_OPTION:
      if (value == null) {
        unsetOtherOption();
      } else {
        setOtherOption((Boolean)value);
      }
      break;

    case INPUT_NUMERIC:
      if (value == null) {
        unsetInputNumeric();
      } else {
        setInputNumeric((Boolean)value);
      }
      break;

    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case QUESTION_ID:
      return Integer.valueOf(getQuestionId());

    case TITLE:
      return getTitle();

    case CONTENT:
      return getContent();

    case CHOICES:
      return getChoices();

    case OTHER_OPTION:
      return Boolean.valueOf(isOtherOption());

    case INPUT_NUMERIC:
      return Boolean.valueOf(isInputNumeric());

    case LOCATION:
      return getLocation();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case QUESTION_ID:
      return isSetQuestionId();
    case TITLE:
      return isSetTitle();
    case CONTENT:
      return isSetContent();
    case CHOICES:
      return isSetChoices();
    case OTHER_OPTION:
      return isSetOtherOption();
    case INPUT_NUMERIC:
      return isSetInputNumeric();
    case LOCATION:
      return isSetLocation();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QuestionnaireItem)
      return this.equals((QuestionnaireItem)that);
    return false;
  }

  public boolean equals(QuestionnaireItem that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_questionId = true && this.isSetQuestionId();
    boolean that_present_questionId = true && that.isSetQuestionId();
    if (this_present_questionId || that_present_questionId) {
      if (!(this_present_questionId && that_present_questionId))
        return false;
      if (this.questionId != that.questionId)
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
        return false;
    }

    boolean this_present_choices = true && this.isSetChoices();
    boolean that_present_choices = true && that.isSetChoices();
    if (this_present_choices || that_present_choices) {
      if (!(this_present_choices && that_present_choices))
        return false;
      if (!this.choices.equals(that.choices))
        return false;
    }

    boolean this_present_otherOption = true && this.isSetOtherOption();
    boolean that_present_otherOption = true && that.isSetOtherOption();
    if (this_present_otherOption || that_present_otherOption) {
      if (!(this_present_otherOption && that_present_otherOption))
        return false;
      if (this.otherOption != that.otherOption)
        return false;
    }

    boolean this_present_inputNumeric = true && this.isSetInputNumeric();
    boolean that_present_inputNumeric = true && that.isSetInputNumeric();
    if (this_present_inputNumeric || that_present_inputNumeric) {
      if (!(this_present_inputNumeric && that_present_inputNumeric))
        return false;
      if (this.inputNumeric != that.inputNumeric)
        return false;
    }

    boolean this_present_location = true && this.isSetLocation();
    boolean that_present_location = true && that.isSetLocation();
    if (this_present_location || that_present_location) {
      if (!(this_present_location && that_present_location))
        return false;
      if (!this.location.equals(that.location))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type);

    boolean present_questionId = true && (isSetQuestionId());
    list.add(present_questionId);
    if (present_questionId)
      list.add(questionId);

    boolean present_title = true && (isSetTitle());
    list.add(present_title);
    if (present_title)
      list.add(title);

    boolean present_content = true && (isSetContent());
    list.add(present_content);
    if (present_content)
      list.add(content);

    boolean present_choices = true && (isSetChoices());
    list.add(present_choices);
    if (present_choices)
      list.add(choices);

    boolean present_otherOption = true && (isSetOtherOption());
    list.add(present_otherOption);
    if (present_otherOption)
      list.add(otherOption);

    boolean present_inputNumeric = true && (isSetInputNumeric());
    list.add(present_inputNumeric);
    if (present_inputNumeric)
      list.add(inputNumeric);

    boolean present_location = true && (isSetLocation());
    list.add(present_location);
    if (present_location)
      list.add(location);

    return list.hashCode();
  }

  @Override
  public int compareTo(QuestionnaireItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQuestionId()).compareTo(other.isSetQuestionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuestionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.questionId, other.questionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, other.content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChoices()).compareTo(other.isSetChoices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChoices()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.choices, other.choices);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOtherOption()).compareTo(other.isSetOtherOption());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOtherOption()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.otherOption, other.otherOption);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInputNumeric()).compareTo(other.isSetInputNumeric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInputNumeric()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inputNumeric, other.inputNumeric);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocation()).compareTo(other.isSetLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.location, other.location);
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
    StringBuilder sb = new StringBuilder("QuestionnaireItem(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetQuestionId()) {
      if (!first) sb.append(", ");
      sb.append("questionId:");
      sb.append(this.questionId);
      first = false;
    }
    if (isSetTitle()) {
      if (!first) sb.append(", ");
      sb.append("title:");
      if (this.title == null) {
        sb.append("null");
      } else {
        sb.append(this.title);
      }
      first = false;
    }
    if (isSetContent()) {
      if (!first) sb.append(", ");
      sb.append("content:");
      if (this.content == null) {
        sb.append("null");
      } else {
        sb.append(this.content);
      }
      first = false;
    }
    if (isSetChoices()) {
      if (!first) sb.append(", ");
      sb.append("choices:");
      if (this.choices == null) {
        sb.append("null");
      } else {
        sb.append(this.choices);
      }
      first = false;
    }
    if (isSetOtherOption()) {
      if (!first) sb.append(", ");
      sb.append("otherOption:");
      sb.append(this.otherOption);
      first = false;
    }
    if (isSetInputNumeric()) {
      if (!first) sb.append(", ");
      sb.append("inputNumeric:");
      sb.append(this.inputNumeric);
      first = false;
    }
    if (isSetLocation()) {
      if (!first) sb.append(", ");
      sb.append("location:");
      if (this.location == null) {
        sb.append("null");
      } else {
        sb.append(this.location);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
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

  private static class QuestionnaireItemStandardSchemeFactory implements SchemeFactory {
    public QuestionnaireItemStandardScheme getScheme() {
      return new QuestionnaireItemStandardScheme();
    }
  }

  private static class QuestionnaireItemStandardScheme extends StandardScheme<QuestionnaireItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QuestionnaireItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUESTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.questionId = iprot.readI32();
              struct.setQuestionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.content = iprot.readString();
              struct.setContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CHOICES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list96 = iprot.readListBegin();
                struct.choices = new ArrayList<String>(_list96.size);
                String _elem97;
                for (int _i98 = 0; _i98 < _list96.size; ++_i98)
                {
                  _elem97 = iprot.readString();
                  struct.choices.add(_elem97);
                }
                iprot.readListEnd();
              }
              struct.setChoicesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // OTHER_OPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.otherOption = iprot.readBool();
              struct.setOtherOptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // INPUT_NUMERIC
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.inputNumeric = iprot.readBool();
              struct.setInputNumericIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list99 = iprot.readListBegin();
                struct.location = new ArrayList<Integer>(_list99.size);
                int _elem100;
                for (int _i101 = 0; _i101 < _list99.size; ++_i101)
                {
                  _elem100 = iprot.readI32();
                  struct.location.add(_elem100);
                }
                iprot.readListEnd();
              }
              struct.setLocationIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, QuestionnaireItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeString(struct.type);
        oprot.writeFieldEnd();
      }
      if (struct.isSetQuestionId()) {
        oprot.writeFieldBegin(QUESTION_ID_FIELD_DESC);
        oprot.writeI32(struct.questionId);
        oprot.writeFieldEnd();
      }
      if (struct.title != null) {
        if (struct.isSetTitle()) {
          oprot.writeFieldBegin(TITLE_FIELD_DESC);
          oprot.writeString(struct.title);
          oprot.writeFieldEnd();
        }
      }
      if (struct.content != null) {
        if (struct.isSetContent()) {
          oprot.writeFieldBegin(CONTENT_FIELD_DESC);
          oprot.writeString(struct.content);
          oprot.writeFieldEnd();
        }
      }
      if (struct.choices != null) {
        if (struct.isSetChoices()) {
          oprot.writeFieldBegin(CHOICES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.choices.size()));
            for (String _iter102 : struct.choices)
            {
              oprot.writeString(_iter102);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetOtherOption()) {
        oprot.writeFieldBegin(OTHER_OPTION_FIELD_DESC);
        oprot.writeBool(struct.otherOption);
        oprot.writeFieldEnd();
      }
      if (struct.isSetInputNumeric()) {
        oprot.writeFieldBegin(INPUT_NUMERIC_FIELD_DESC);
        oprot.writeBool(struct.inputNumeric);
        oprot.writeFieldEnd();
      }
      if (struct.location != null) {
        if (struct.isSetLocation()) {
          oprot.writeFieldBegin(LOCATION_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.location.size()));
            for (int _iter103 : struct.location)
            {
              oprot.writeI32(_iter103);
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

  private static class QuestionnaireItemTupleSchemeFactory implements SchemeFactory {
    public QuestionnaireItemTupleScheme getScheme() {
      return new QuestionnaireItemTupleScheme();
    }
  }

  private static class QuestionnaireItemTupleScheme extends TupleScheme<QuestionnaireItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QuestionnaireItem struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.type);
      BitSet optionals = new BitSet();
      if (struct.isSetQuestionId()) {
        optionals.set(0);
      }
      if (struct.isSetTitle()) {
        optionals.set(1);
      }
      if (struct.isSetContent()) {
        optionals.set(2);
      }
      if (struct.isSetChoices()) {
        optionals.set(3);
      }
      if (struct.isSetOtherOption()) {
        optionals.set(4);
      }
      if (struct.isSetInputNumeric()) {
        optionals.set(5);
      }
      if (struct.isSetLocation()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetQuestionId()) {
        oprot.writeI32(struct.questionId);
      }
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetContent()) {
        oprot.writeString(struct.content);
      }
      if (struct.isSetChoices()) {
        {
          oprot.writeI32(struct.choices.size());
          for (String _iter104 : struct.choices)
          {
            oprot.writeString(_iter104);
          }
        }
      }
      if (struct.isSetOtherOption()) {
        oprot.writeBool(struct.otherOption);
      }
      if (struct.isSetInputNumeric()) {
        oprot.writeBool(struct.inputNumeric);
      }
      if (struct.isSetLocation()) {
        {
          oprot.writeI32(struct.location.size());
          for (int _iter105 : struct.location)
          {
            oprot.writeI32(_iter105);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QuestionnaireItem struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = iprot.readString();
      struct.setTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.questionId = iprot.readI32();
        struct.setQuestionIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(2)) {
        struct.content = iprot.readString();
        struct.setContentIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list106 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.choices = new ArrayList<String>(_list106.size);
          String _elem107;
          for (int _i108 = 0; _i108 < _list106.size; ++_i108)
          {
            _elem107 = iprot.readString();
            struct.choices.add(_elem107);
          }
        }
        struct.setChoicesIsSet(true);
      }
      if (incoming.get(4)) {
        struct.otherOption = iprot.readBool();
        struct.setOtherOptionIsSet(true);
      }
      if (incoming.get(5)) {
        struct.inputNumeric = iprot.readBool();
        struct.setInputNumericIsSet(true);
      }
      if (incoming.get(6)) {
        {
          org.apache.thrift.protocol.TList _list109 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.location = new ArrayList<Integer>(_list109.size);
          int _elem110;
          for (int _i111 = 0; _i111 < _list109.size; ++_i111)
          {
            _elem110 = iprot.readI32();
            struct.location.add(_elem110);
          }
        }
        struct.setLocationIsSet(true);
      }
    }
  }

}

