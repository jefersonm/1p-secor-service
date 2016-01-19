/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.pinterest.secor.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-01-13")
public class UnitTestMessage implements org.apache.thrift.TBase<UnitTestMessage, UnitTestMessage._Fields>, java.io.Serializable, Cloneable, Comparable<UnitTestMessage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UnitTestMessage");

  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField REQUIRED_FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("requiredField", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_TWO_FIELD_DESC = new org.apache.thrift.protocol.TField("timestampTwo", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField OPTIONAL_FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("optionalField", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ENUM_FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("enumField", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_THREE_FIELD_DESC = new org.apache.thrift.protocol.TField("timestampThree", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UnitTestMessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UnitTestMessageTupleSchemeFactory());
  }

  public long timestamp; // required
  public String requiredField; // required
  public int timestampTwo; // required
  public String optionalField; // optional
  /**
   * 
   * @see UnitTestEnum
   */
  public UnitTestEnum enumField; // optional
  public long timestampThree; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TIMESTAMP((short)1, "timestamp"),
    REQUIRED_FIELD((short)2, "requiredField"),
    TIMESTAMP_TWO((short)3, "timestampTwo"),
    OPTIONAL_FIELD((short)4, "optionalField"),
    /**
     * 
     * @see UnitTestEnum
     */
    ENUM_FIELD((short)5, "enumField"),
    TIMESTAMP_THREE((short)6, "timestampThree");

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
        case 1: // TIMESTAMP
          return TIMESTAMP;
        case 2: // REQUIRED_FIELD
          return REQUIRED_FIELD;
        case 3: // TIMESTAMP_TWO
          return TIMESTAMP_TWO;
        case 4: // OPTIONAL_FIELD
          return OPTIONAL_FIELD;
        case 5: // ENUM_FIELD
          return ENUM_FIELD;
        case 6: // TIMESTAMP_THREE
          return TIMESTAMP_THREE;
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
  private static final int __TIMESTAMP_ISSET_ID = 0;
  private static final int __TIMESTAMPTWO_ISSET_ID = 1;
  private static final int __TIMESTAMPTHREE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.OPTIONAL_FIELD,_Fields.ENUM_FIELD};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.REQUIRED_FIELD, new org.apache.thrift.meta_data.FieldMetaData("requiredField", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIMESTAMP_TWO, new org.apache.thrift.meta_data.FieldMetaData("timestampTwo", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OPTIONAL_FIELD, new org.apache.thrift.meta_data.FieldMetaData("optionalField", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENUM_FIELD, new org.apache.thrift.meta_data.FieldMetaData("enumField", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, UnitTestEnum.class)));
    tmpMap.put(_Fields.TIMESTAMP_THREE, new org.apache.thrift.meta_data.FieldMetaData("timestampThree", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UnitTestMessage.class, metaDataMap);
  }

  public UnitTestMessage() {
  }

  public UnitTestMessage(
    long timestamp,
    String requiredField,
    int timestampTwo,
    long timestampThree)
  {
    this();
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    this.requiredField = requiredField;
    this.timestampTwo = timestampTwo;
    setTimestampTwoIsSet(true);
    this.timestampThree = timestampThree;
    setTimestampThreeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UnitTestMessage(UnitTestMessage other) {
    __isset_bitfield = other.__isset_bitfield;
    this.timestamp = other.timestamp;
    if (other.isSetRequiredField()) {
      this.requiredField = other.requiredField;
    }
    this.timestampTwo = other.timestampTwo;
    if (other.isSetOptionalField()) {
      this.optionalField = other.optionalField;
    }
    if (other.isSetEnumField()) {
      this.enumField = other.enumField;
    }
    this.timestampThree = other.timestampThree;
  }

  public UnitTestMessage deepCopy() {
    return new UnitTestMessage(this);
  }

  @Override
  public void clear() {
    setTimestampIsSet(false);
    this.timestamp = 0;
    this.requiredField = null;
    setTimestampTwoIsSet(false);
    this.timestampTwo = 0;
    this.optionalField = null;
    this.enumField = null;
    setTimestampThreeIsSet(false);
    this.timestampThree = 0;
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public UnitTestMessage setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  public String getRequiredField() {
    return this.requiredField;
  }

  public UnitTestMessage setRequiredField(String requiredField) {
    this.requiredField = requiredField;
    return this;
  }

  public void unsetRequiredField() {
    this.requiredField = null;
  }

  /** Returns true if field requiredField is set (has been assigned a value) and false otherwise */
  public boolean isSetRequiredField() {
    return this.requiredField != null;
  }

  public void setRequiredFieldIsSet(boolean value) {
    if (!value) {
      this.requiredField = null;
    }
  }

  public int getTimestampTwo() {
    return this.timestampTwo;
  }

  public UnitTestMessage setTimestampTwo(int timestampTwo) {
    this.timestampTwo = timestampTwo;
    setTimestampTwoIsSet(true);
    return this;
  }

  public void unsetTimestampTwo() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMPTWO_ISSET_ID);
  }

  /** Returns true if field timestampTwo is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestampTwo() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMPTWO_ISSET_ID);
  }

  public void setTimestampTwoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMPTWO_ISSET_ID, value);
  }

  public String getOptionalField() {
    return this.optionalField;
  }

  public UnitTestMessage setOptionalField(String optionalField) {
    this.optionalField = optionalField;
    return this;
  }

  public void unsetOptionalField() {
    this.optionalField = null;
  }

  /** Returns true if field optionalField is set (has been assigned a value) and false otherwise */
  public boolean isSetOptionalField() {
    return this.optionalField != null;
  }

  public void setOptionalFieldIsSet(boolean value) {
    if (!value) {
      this.optionalField = null;
    }
  }

  /**
   * 
   * @see UnitTestEnum
   */
  public UnitTestEnum getEnumField() {
    return this.enumField;
  }

  /**
   * 
   * @see UnitTestEnum
   */
  public UnitTestMessage setEnumField(UnitTestEnum enumField) {
    this.enumField = enumField;
    return this;
  }

  public void unsetEnumField() {
    this.enumField = null;
  }

  /** Returns true if field enumField is set (has been assigned a value) and false otherwise */
  public boolean isSetEnumField() {
    return this.enumField != null;
  }

  public void setEnumFieldIsSet(boolean value) {
    if (!value) {
      this.enumField = null;
    }
  }

  public long getTimestampThree() {
    return this.timestampThree;
  }

  public UnitTestMessage setTimestampThree(long timestampThree) {
    this.timestampThree = timestampThree;
    setTimestampThreeIsSet(true);
    return this;
  }

  public void unsetTimestampThree() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMPTHREE_ISSET_ID);
  }

  /** Returns true if field timestampThree is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestampThree() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMPTHREE_ISSET_ID);
  }

  public void setTimestampThreeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMPTHREE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    case REQUIRED_FIELD:
      if (value == null) {
        unsetRequiredField();
      } else {
        setRequiredField((String)value);
      }
      break;

    case TIMESTAMP_TWO:
      if (value == null) {
        unsetTimestampTwo();
      } else {
        setTimestampTwo((Integer)value);
      }
      break;

    case OPTIONAL_FIELD:
      if (value == null) {
        unsetOptionalField();
      } else {
        setOptionalField((String)value);
      }
      break;

    case ENUM_FIELD:
      if (value == null) {
        unsetEnumField();
      } else {
        setEnumField((UnitTestEnum)value);
      }
      break;

    case TIMESTAMP_THREE:
      if (value == null) {
        unsetTimestampThree();
      } else {
        setTimestampThree((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIMESTAMP:
      return getTimestamp();

    case REQUIRED_FIELD:
      return getRequiredField();

    case TIMESTAMP_TWO:
      return getTimestampTwo();

    case OPTIONAL_FIELD:
      return getOptionalField();

    case ENUM_FIELD:
      return getEnumField();

    case TIMESTAMP_THREE:
      return getTimestampThree();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIMESTAMP:
      return isSetTimestamp();
    case REQUIRED_FIELD:
      return isSetRequiredField();
    case TIMESTAMP_TWO:
      return isSetTimestampTwo();
    case OPTIONAL_FIELD:
      return isSetOptionalField();
    case ENUM_FIELD:
      return isSetEnumField();
    case TIMESTAMP_THREE:
      return isSetTimestampThree();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UnitTestMessage)
      return this.equals((UnitTestMessage)that);
    return false;
  }

  public boolean equals(UnitTestMessage that) {
    if (that == null)
      return false;

    boolean this_present_timestamp = true;
    boolean that_present_timestamp = true;
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    boolean this_present_requiredField = true && this.isSetRequiredField();
    boolean that_present_requiredField = true && that.isSetRequiredField();
    if (this_present_requiredField || that_present_requiredField) {
      if (!(this_present_requiredField && that_present_requiredField))
        return false;
      if (!this.requiredField.equals(that.requiredField))
        return false;
    }

    boolean this_present_timestampTwo = true;
    boolean that_present_timestampTwo = true;
    if (this_present_timestampTwo || that_present_timestampTwo) {
      if (!(this_present_timestampTwo && that_present_timestampTwo))
        return false;
      if (this.timestampTwo != that.timestampTwo)
        return false;
    }

    boolean this_present_optionalField = true && this.isSetOptionalField();
    boolean that_present_optionalField = true && that.isSetOptionalField();
    if (this_present_optionalField || that_present_optionalField) {
      if (!(this_present_optionalField && that_present_optionalField))
        return false;
      if (!this.optionalField.equals(that.optionalField))
        return false;
    }

    boolean this_present_enumField = true && this.isSetEnumField();
    boolean that_present_enumField = true && that.isSetEnumField();
    if (this_present_enumField || that_present_enumField) {
      if (!(this_present_enumField && that_present_enumField))
        return false;
      if (!this.enumField.equals(that.enumField))
        return false;
    }

    boolean this_present_timestampThree = true;
    boolean that_present_timestampThree = true;
    if (this_present_timestampThree || that_present_timestampThree) {
      if (!(this_present_timestampThree && that_present_timestampThree))
        return false;
      if (this.timestampThree != that.timestampThree)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_timestamp = true;
    list.add(present_timestamp);
    if (present_timestamp)
      list.add(timestamp);

    boolean present_requiredField = true && (isSetRequiredField());
    list.add(present_requiredField);
    if (present_requiredField)
      list.add(requiredField);

    boolean present_timestampTwo = true;
    list.add(present_timestampTwo);
    if (present_timestampTwo)
      list.add(timestampTwo);

    boolean present_optionalField = true && (isSetOptionalField());
    list.add(present_optionalField);
    if (present_optionalField)
      list.add(optionalField);

    boolean present_enumField = true && (isSetEnumField());
    list.add(present_enumField);
    if (present_enumField)
      list.add(enumField.getValue());

    boolean present_timestampThree = true;
    list.add(present_timestampThree);
    if (present_timestampThree)
      list.add(timestampThree);

    return list.hashCode();
  }

  @Override
  public int compareTo(UnitTestMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, other.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequiredField()).compareTo(other.isSetRequiredField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequiredField()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requiredField, other.requiredField);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestampTwo()).compareTo(other.isSetTimestampTwo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestampTwo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestampTwo, other.timestampTwo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOptionalField()).compareTo(other.isSetOptionalField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOptionalField()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.optionalField, other.optionalField);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEnumField()).compareTo(other.isSetEnumField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnumField()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.enumField, other.enumField);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestampThree()).compareTo(other.isSetTimestampThree());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestampThree()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestampThree, other.timestampThree);
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
    StringBuilder sb = new StringBuilder("UnitTestMessage(");
    boolean first = true;

    sb.append("timestamp:");
    sb.append(this.timestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("requiredField:");
    if (this.requiredField == null) {
      sb.append("null");
    } else {
      sb.append(this.requiredField);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timestampTwo:");
    sb.append(this.timestampTwo);
    first = false;
    if (isSetOptionalField()) {
      if (!first) sb.append(", ");
      sb.append("optionalField:");
      if (this.optionalField == null) {
        sb.append("null");
      } else {
        sb.append(this.optionalField);
      }
      first = false;
    }
    if (isSetEnumField()) {
      if (!first) sb.append(", ");
      sb.append("enumField:");
      if (this.enumField == null) {
        sb.append("null");
      } else {
        sb.append(this.enumField);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("timestampThree:");
    sb.append(this.timestampThree);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'timestamp' because it's a primitive and you chose the non-beans generator.
    if (requiredField == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'requiredField' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'timestampTwo' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'timestampThree' because it's a primitive and you chose the non-beans generator.
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

  private static class UnitTestMessageStandardSchemeFactory implements SchemeFactory {
    public UnitTestMessageStandardScheme getScheme() {
      return new UnitTestMessageStandardScheme();
    }
  }

  private static class UnitTestMessageStandardScheme extends StandardScheme<UnitTestMessage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UnitTestMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REQUIRED_FIELD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.requiredField = iprot.readString();
              struct.setRequiredFieldIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIMESTAMP_TWO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.timestampTwo = iprot.readI32();
              struct.setTimestampTwoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OPTIONAL_FIELD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.optionalField = iprot.readString();
              struct.setOptionalFieldIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ENUM_FIELD
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.enumField = com.pinterest.secor.thrift.UnitTestEnum.findByValue(iprot.readI32());
              struct.setEnumFieldIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TIMESTAMP_THREE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestampThree = iprot.readI64();
              struct.setTimestampThreeIsSet(true);
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
      if (!struct.isSetTimestamp()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'timestamp' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetTimestampTwo()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'timestampTwo' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetTimestampThree()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'timestampThree' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, UnitTestMessage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.timestamp);
      oprot.writeFieldEnd();
      if (struct.requiredField != null) {
        oprot.writeFieldBegin(REQUIRED_FIELD_FIELD_DESC);
        oprot.writeString(struct.requiredField);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIMESTAMP_TWO_FIELD_DESC);
      oprot.writeI32(struct.timestampTwo);
      oprot.writeFieldEnd();
      if (struct.optionalField != null) {
        if (struct.isSetOptionalField()) {
          oprot.writeFieldBegin(OPTIONAL_FIELD_FIELD_DESC);
          oprot.writeString(struct.optionalField);
          oprot.writeFieldEnd();
        }
      }
      if (struct.enumField != null) {
        if (struct.isSetEnumField()) {
          oprot.writeFieldBegin(ENUM_FIELD_FIELD_DESC);
          oprot.writeI32(struct.enumField.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(TIMESTAMP_THREE_FIELD_DESC);
      oprot.writeI64(struct.timestampThree);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UnitTestMessageTupleSchemeFactory implements SchemeFactory {
    public UnitTestMessageTupleScheme getScheme() {
      return new UnitTestMessageTupleScheme();
    }
  }

  private static class UnitTestMessageTupleScheme extends TupleScheme<UnitTestMessage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UnitTestMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.timestamp);
      oprot.writeString(struct.requiredField);
      oprot.writeI32(struct.timestampTwo);
      oprot.writeI64(struct.timestampThree);
      BitSet optionals = new BitSet();
      if (struct.isSetOptionalField()) {
        optionals.set(0);
      }
      if (struct.isSetEnumField()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetOptionalField()) {
        oprot.writeString(struct.optionalField);
      }
      if (struct.isSetEnumField()) {
        oprot.writeI32(struct.enumField.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UnitTestMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.timestamp = iprot.readI64();
      struct.setTimestampIsSet(true);
      struct.requiredField = iprot.readString();
      struct.setRequiredFieldIsSet(true);
      struct.timestampTwo = iprot.readI32();
      struct.setTimestampTwoIsSet(true);
      struct.timestampThree = iprot.readI64();
      struct.setTimestampThreeIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.optionalField = iprot.readString();
        struct.setOptionalFieldIsSet(true);
      }
      if (incoming.get(1)) {
        struct.enumField = com.pinterest.secor.thrift.UnitTestEnum.findByValue(iprot.readI32());
        struct.setEnumFieldIsSet(true);
      }
    }
  }

}
