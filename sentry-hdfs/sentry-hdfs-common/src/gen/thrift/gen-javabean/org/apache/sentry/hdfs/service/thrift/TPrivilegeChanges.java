/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.sentry.hdfs.service.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class TPrivilegeChanges implements org.apache.thrift.TBase<TPrivilegeChanges, TPrivilegeChanges._Fields>, java.io.Serializable, Cloneable, Comparable<TPrivilegeChanges> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPrivilegeChanges");

  private static final org.apache.thrift.protocol.TField AUTHZ_OBJ_FIELD_DESC = new org.apache.thrift.protocol.TField("authzObj", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ADD_PRIVILEGES_FIELD_DESC = new org.apache.thrift.protocol.TField("addPrivileges", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField DEL_PRIVILEGES_FIELD_DESC = new org.apache.thrift.protocol.TField("delPrivileges", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TPrivilegeChangesStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TPrivilegeChangesTupleSchemeFactory());
  }

  private String authzObj; // required
  private Map<TPrivilegePrincipal,String> addPrivileges; // required
  private Map<TPrivilegePrincipal,String> delPrivileges; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AUTHZ_OBJ((short)1, "authzObj"),
    ADD_PRIVILEGES((short)2, "addPrivileges"),
    DEL_PRIVILEGES((short)3, "delPrivileges");

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
        case 1: // AUTHZ_OBJ
          return AUTHZ_OBJ;
        case 2: // ADD_PRIVILEGES
          return ADD_PRIVILEGES;
        case 3: // DEL_PRIVILEGES
          return DEL_PRIVILEGES;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AUTHZ_OBJ, new org.apache.thrift.meta_data.FieldMetaData("authzObj", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ADD_PRIVILEGES, new org.apache.thrift.meta_data.FieldMetaData("addPrivileges", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPrivilegePrincipal.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.DEL_PRIVILEGES, new org.apache.thrift.meta_data.FieldMetaData("delPrivileges", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPrivilegePrincipal.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPrivilegeChanges.class, metaDataMap);
  }

  public TPrivilegeChanges() {
  }

  public TPrivilegeChanges(
    String authzObj,
    Map<TPrivilegePrincipal,String> addPrivileges,
    Map<TPrivilegePrincipal,String> delPrivileges)
  {
    this();
    this.authzObj = authzObj;
    this.addPrivileges = addPrivileges;
    this.delPrivileges = delPrivileges;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPrivilegeChanges(TPrivilegeChanges other) {
    if (other.isSetAuthzObj()) {
      this.authzObj = other.authzObj;
    }
    if (other.isSetAddPrivileges()) {
      Map<TPrivilegePrincipal,String> __this__addPrivileges = new HashMap<TPrivilegePrincipal,String>(other.addPrivileges.size());
      for (Map.Entry<TPrivilegePrincipal, String> other_element : other.addPrivileges.entrySet()) {

        TPrivilegePrincipal other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        TPrivilegePrincipal __this__addPrivileges_copy_key = new TPrivilegePrincipal(other_element_key);

        String __this__addPrivileges_copy_value = other_element_value;

        __this__addPrivileges.put(__this__addPrivileges_copy_key, __this__addPrivileges_copy_value);
      }
      this.addPrivileges = __this__addPrivileges;
    }
    if (other.isSetDelPrivileges()) {
      Map<TPrivilegePrincipal,String> __this__delPrivileges = new HashMap<TPrivilegePrincipal,String>(other.delPrivileges.size());
      for (Map.Entry<TPrivilegePrincipal, String> other_element : other.delPrivileges.entrySet()) {

        TPrivilegePrincipal other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        TPrivilegePrincipal __this__delPrivileges_copy_key = new TPrivilegePrincipal(other_element_key);

        String __this__delPrivileges_copy_value = other_element_value;

        __this__delPrivileges.put(__this__delPrivileges_copy_key, __this__delPrivileges_copy_value);
      }
      this.delPrivileges = __this__delPrivileges;
    }
  }

  public TPrivilegeChanges deepCopy() {
    return new TPrivilegeChanges(this);
  }

  @Override
  public void clear() {
    this.authzObj = null;
    this.addPrivileges = null;
    this.delPrivileges = null;
  }

  public String getAuthzObj() {
    return this.authzObj;
  }

  public void setAuthzObj(String authzObj) {
    this.authzObj = authzObj;
  }

  public void unsetAuthzObj() {
    this.authzObj = null;
  }

  /** Returns true if field authzObj is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthzObj() {
    return this.authzObj != null;
  }

  public void setAuthzObjIsSet(boolean value) {
    if (!value) {
      this.authzObj = null;
    }
  }

  public int getAddPrivilegesSize() {
    return (this.addPrivileges == null) ? 0 : this.addPrivileges.size();
  }

  public void putToAddPrivileges(TPrivilegePrincipal key, String val) {
    if (this.addPrivileges == null) {
      this.addPrivileges = new HashMap<TPrivilegePrincipal,String>();
    }
    this.addPrivileges.put(key, val);
  }

  public Map<TPrivilegePrincipal,String> getAddPrivileges() {
    return this.addPrivileges;
  }

  public void setAddPrivileges(Map<TPrivilegePrincipal,String> addPrivileges) {
    this.addPrivileges = addPrivileges;
  }

  public void unsetAddPrivileges() {
    this.addPrivileges = null;
  }

  /** Returns true if field addPrivileges is set (has been assigned a value) and false otherwise */
  public boolean isSetAddPrivileges() {
    return this.addPrivileges != null;
  }

  public void setAddPrivilegesIsSet(boolean value) {
    if (!value) {
      this.addPrivileges = null;
    }
  }

  public int getDelPrivilegesSize() {
    return (this.delPrivileges == null) ? 0 : this.delPrivileges.size();
  }

  public void putToDelPrivileges(TPrivilegePrincipal key, String val) {
    if (this.delPrivileges == null) {
      this.delPrivileges = new HashMap<TPrivilegePrincipal,String>();
    }
    this.delPrivileges.put(key, val);
  }

  public Map<TPrivilegePrincipal,String> getDelPrivileges() {
    return this.delPrivileges;
  }

  public void setDelPrivileges(Map<TPrivilegePrincipal,String> delPrivileges) {
    this.delPrivileges = delPrivileges;
  }

  public void unsetDelPrivileges() {
    this.delPrivileges = null;
  }

  /** Returns true if field delPrivileges is set (has been assigned a value) and false otherwise */
  public boolean isSetDelPrivileges() {
    return this.delPrivileges != null;
  }

  public void setDelPrivilegesIsSet(boolean value) {
    if (!value) {
      this.delPrivileges = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AUTHZ_OBJ:
      if (value == null) {
        unsetAuthzObj();
      } else {
        setAuthzObj((String)value);
      }
      break;

    case ADD_PRIVILEGES:
      if (value == null) {
        unsetAddPrivileges();
      } else {
        setAddPrivileges((Map<TPrivilegePrincipal,String>)value);
      }
      break;

    case DEL_PRIVILEGES:
      if (value == null) {
        unsetDelPrivileges();
      } else {
        setDelPrivileges((Map<TPrivilegePrincipal,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AUTHZ_OBJ:
      return getAuthzObj();

    case ADD_PRIVILEGES:
      return getAddPrivileges();

    case DEL_PRIVILEGES:
      return getDelPrivileges();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AUTHZ_OBJ:
      return isSetAuthzObj();
    case ADD_PRIVILEGES:
      return isSetAddPrivileges();
    case DEL_PRIVILEGES:
      return isSetDelPrivileges();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TPrivilegeChanges)
      return this.equals((TPrivilegeChanges)that);
    return false;
  }

  public boolean equals(TPrivilegeChanges that) {
    if (that == null)
      return false;

    boolean this_present_authzObj = true && this.isSetAuthzObj();
    boolean that_present_authzObj = true && that.isSetAuthzObj();
    if (this_present_authzObj || that_present_authzObj) {
      if (!(this_present_authzObj && that_present_authzObj))
        return false;
      if (!this.authzObj.equals(that.authzObj))
        return false;
    }

    boolean this_present_addPrivileges = true && this.isSetAddPrivileges();
    boolean that_present_addPrivileges = true && that.isSetAddPrivileges();
    if (this_present_addPrivileges || that_present_addPrivileges) {
      if (!(this_present_addPrivileges && that_present_addPrivileges))
        return false;
      if (!this.addPrivileges.equals(that.addPrivileges))
        return false;
    }

    boolean this_present_delPrivileges = true && this.isSetDelPrivileges();
    boolean that_present_delPrivileges = true && that.isSetDelPrivileges();
    if (this_present_delPrivileges || that_present_delPrivileges) {
      if (!(this_present_delPrivileges && that_present_delPrivileges))
        return false;
      if (!this.delPrivileges.equals(that.delPrivileges))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_authzObj = true && (isSetAuthzObj());
    list.add(present_authzObj);
    if (present_authzObj)
      list.add(authzObj);

    boolean present_addPrivileges = true && (isSetAddPrivileges());
    list.add(present_addPrivileges);
    if (present_addPrivileges)
      list.add(addPrivileges);

    boolean present_delPrivileges = true && (isSetDelPrivileges());
    list.add(present_delPrivileges);
    if (present_delPrivileges)
      list.add(delPrivileges);

    return list.hashCode();
  }

  @Override
  public int compareTo(TPrivilegeChanges other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAuthzObj()).compareTo(other.isSetAuthzObj());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthzObj()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authzObj, other.authzObj);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAddPrivileges()).compareTo(other.isSetAddPrivileges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddPrivileges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.addPrivileges, other.addPrivileges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDelPrivileges()).compareTo(other.isSetDelPrivileges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDelPrivileges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.delPrivileges, other.delPrivileges);
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
    StringBuilder sb = new StringBuilder("TPrivilegeChanges(");
    boolean first = true;

    sb.append("authzObj:");
    if (this.authzObj == null) {
      sb.append("null");
    } else {
      sb.append(this.authzObj);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("addPrivileges:");
    if (this.addPrivileges == null) {
      sb.append("null");
    } else {
      sb.append(this.addPrivileges);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("delPrivileges:");
    if (this.delPrivileges == null) {
      sb.append("null");
    } else {
      sb.append(this.delPrivileges);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetAuthzObj()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'authzObj' is unset! Struct:" + toString());
    }

    if (!isSetAddPrivileges()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'addPrivileges' is unset! Struct:" + toString());
    }

    if (!isSetDelPrivileges()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'delPrivileges' is unset! Struct:" + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TPrivilegeChangesStandardSchemeFactory implements SchemeFactory {
    public TPrivilegeChangesStandardScheme getScheme() {
      return new TPrivilegeChangesStandardScheme();
    }
  }

  private static class TPrivilegeChangesStandardScheme extends StandardScheme<TPrivilegeChanges> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPrivilegeChanges struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AUTHZ_OBJ
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.authzObj = iprot.readString();
              struct.setAuthzObjIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ADD_PRIVILEGES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map74 = iprot.readMapBegin();
                struct.addPrivileges = new HashMap<TPrivilegePrincipal,String>(2*_map74.size);
                TPrivilegePrincipal _key75;
                String _val76;
                for (int _i77 = 0; _i77 < _map74.size; ++_i77)
                {
                  _key75 = new TPrivilegePrincipal();
                  _key75.read(iprot);
                  _val76 = iprot.readString();
                  struct.addPrivileges.put(_key75, _val76);
                }
                iprot.readMapEnd();
              }
              struct.setAddPrivilegesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DEL_PRIVILEGES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map78 = iprot.readMapBegin();
                struct.delPrivileges = new HashMap<TPrivilegePrincipal,String>(2*_map78.size);
                TPrivilegePrincipal _key79;
                String _val80;
                for (int _i81 = 0; _i81 < _map78.size; ++_i81)
                {
                  _key79 = new TPrivilegePrincipal();
                  _key79.read(iprot);
                  _val80 = iprot.readString();
                  struct.delPrivileges.put(_key79, _val80);
                }
                iprot.readMapEnd();
              }
              struct.setDelPrivilegesIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPrivilegeChanges struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.authzObj != null) {
        oprot.writeFieldBegin(AUTHZ_OBJ_FIELD_DESC);
        oprot.writeString(struct.authzObj);
        oprot.writeFieldEnd();
      }
      if (struct.addPrivileges != null) {
        oprot.writeFieldBegin(ADD_PRIVILEGES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.STRING, struct.addPrivileges.size()));
          for (Map.Entry<TPrivilegePrincipal, String> _iter82 : struct.addPrivileges.entrySet())
          {
            _iter82.getKey().write(oprot);
            oprot.writeString(_iter82.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.delPrivileges != null) {
        oprot.writeFieldBegin(DEL_PRIVILEGES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.STRING, struct.delPrivileges.size()));
          for (Map.Entry<TPrivilegePrincipal, String> _iter83 : struct.delPrivileges.entrySet())
          {
            _iter83.getKey().write(oprot);
            oprot.writeString(_iter83.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPrivilegeChangesTupleSchemeFactory implements SchemeFactory {
    public TPrivilegeChangesTupleScheme getScheme() {
      return new TPrivilegeChangesTupleScheme();
    }
  }

  private static class TPrivilegeChangesTupleScheme extends TupleScheme<TPrivilegeChanges> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPrivilegeChanges struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.authzObj);
      {
        oprot.writeI32(struct.addPrivileges.size());
        for (Map.Entry<TPrivilegePrincipal, String> _iter84 : struct.addPrivileges.entrySet())
        {
          _iter84.getKey().write(oprot);
          oprot.writeString(_iter84.getValue());
        }
      }
      {
        oprot.writeI32(struct.delPrivileges.size());
        for (Map.Entry<TPrivilegePrincipal, String> _iter85 : struct.delPrivileges.entrySet())
        {
          _iter85.getKey().write(oprot);
          oprot.writeString(_iter85.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPrivilegeChanges struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.authzObj = iprot.readString();
      struct.setAuthzObjIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map86 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.addPrivileges = new HashMap<TPrivilegePrincipal,String>(2*_map86.size);
        TPrivilegePrincipal _key87;
        String _val88;
        for (int _i89 = 0; _i89 < _map86.size; ++_i89)
        {
          _key87 = new TPrivilegePrincipal();
          _key87.read(iprot);
          _val88 = iprot.readString();
          struct.addPrivileges.put(_key87, _val88);
        }
      }
      struct.setAddPrivilegesIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map90 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.delPrivileges = new HashMap<TPrivilegePrincipal,String>(2*_map90.size);
        TPrivilegePrincipal _key91;
        String _val92;
        for (int _i93 = 0; _i93 < _map90.size; ++_i93)
        {
          _key91 = new TPrivilegePrincipal();
          _key91.read(iprot);
          _val92 = iprot.readString();
          struct.delPrivileges.put(_key91, _val92);
        }
      }
      struct.setDelPrivilegesIsSet(true);
    }
  }

}

