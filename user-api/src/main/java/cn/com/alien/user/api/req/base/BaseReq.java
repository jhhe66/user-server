/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.com.alien.user.api.req.base;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-07-16")
public class BaseReq implements org.apache.thrift.TBase<BaseReq, BaseReq._Fields>, java.io.Serializable, Cloneable, Comparable<BaseReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BaseReq");

  private static final org.apache.thrift.protocol.TField KEEP_FIELD_DESC = new org.apache.thrift.protocol.TField("keep", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IP_FIELD_DESC = new org.apache.thrift.protocol.TField("ip", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BaseReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BaseReqTupleSchemeFactory();

  public java.lang.String keep; // required
  public java.lang.String ip; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEEP((short)1, "keep"),
    IP((short)2, "ip");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // KEEP
          return KEEP;
        case 2: // IP
          return IP;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEEP, new org.apache.thrift.meta_data.FieldMetaData("keep", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IP, new org.apache.thrift.meta_data.FieldMetaData("ip", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BaseReq.class, metaDataMap);
  }

  public BaseReq() {
  }

  public BaseReq(
    java.lang.String keep,
    java.lang.String ip)
  {
    this();
    this.keep = keep;
    this.ip = ip;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BaseReq(BaseReq other) {
    if (other.isSetKeep()) {
      this.keep = other.keep;
    }
    if (other.isSetIp()) {
      this.ip = other.ip;
    }
  }

  public BaseReq deepCopy() {
    return new BaseReq(this);
  }

  @Override
  public void clear() {
    this.keep = null;
    this.ip = null;
  }

  public java.lang.String getKeep() {
    return this.keep;
  }

  public BaseReq setKeep(java.lang.String keep) {
    this.keep = keep;
    return this;
  }

  public void unsetKeep() {
    this.keep = null;
  }

  /** Returns true if field keep is set (has been assigned a value) and false otherwise */
  public boolean isSetKeep() {
    return this.keep != null;
  }

  public void setKeepIsSet(boolean value) {
    if (!value) {
      this.keep = null;
    }
  }

  public java.lang.String getIp() {
    return this.ip;
  }

  public BaseReq setIp(java.lang.String ip) {
    this.ip = ip;
    return this;
  }

  public void unsetIp() {
    this.ip = null;
  }

  /** Returns true if field ip is set (has been assigned a value) and false otherwise */
  public boolean isSetIp() {
    return this.ip != null;
  }

  public void setIpIsSet(boolean value) {
    if (!value) {
      this.ip = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case KEEP:
      if (value == null) {
        unsetKeep();
      } else {
        setKeep((java.lang.String)value);
      }
      break;

    case IP:
      if (value == null) {
        unsetIp();
      } else {
        setIp((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case KEEP:
      return getKeep();

    case IP:
      return getIp();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case KEEP:
      return isSetKeep();
    case IP:
      return isSetIp();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof BaseReq)
      return this.equals((BaseReq)that);
    return false;
  }

  public boolean equals(BaseReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_keep = true && this.isSetKeep();
    boolean that_present_keep = true && that.isSetKeep();
    if (this_present_keep || that_present_keep) {
      if (!(this_present_keep && that_present_keep))
        return false;
      if (!this.keep.equals(that.keep))
        return false;
    }

    boolean this_present_ip = true && this.isSetIp();
    boolean that_present_ip = true && that.isSetIp();
    if (this_present_ip || that_present_ip) {
      if (!(this_present_ip && that_present_ip))
        return false;
      if (!this.ip.equals(that.ip))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetKeep()) ? 131071 : 524287);
    if (isSetKeep())
      hashCode = hashCode * 8191 + keep.hashCode();

    hashCode = hashCode * 8191 + ((isSetIp()) ? 131071 : 524287);
    if (isSetIp())
      hashCode = hashCode * 8191 + ip.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(BaseReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetKeep()).compareTo(other.isSetKeep());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeep()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keep, other.keep);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIp()).compareTo(other.isSetIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ip, other.ip);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BaseReq(");
    boolean first = true;

    sb.append("keep:");
    if (this.keep == null) {
      sb.append("null");
    } else {
      sb.append(this.keep);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ip:");
    if (this.ip == null) {
      sb.append("null");
    } else {
      sb.append(this.ip);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (keep == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'keep' was not present! Struct: " + toString());
    }
    if (ip == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ip' was not present! Struct: " + toString());
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BaseReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BaseReqStandardScheme getScheme() {
      return new BaseReqStandardScheme();
    }
  }

  private static class BaseReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<BaseReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BaseReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEEP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.keep = iprot.readString();
              struct.setKeepIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ip = iprot.readString();
              struct.setIpIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BaseReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.keep != null) {
        oprot.writeFieldBegin(KEEP_FIELD_DESC);
        oprot.writeString(struct.keep);
        oprot.writeFieldEnd();
      }
      if (struct.ip != null) {
        oprot.writeFieldBegin(IP_FIELD_DESC);
        oprot.writeString(struct.ip);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BaseReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BaseReqTupleScheme getScheme() {
      return new BaseReqTupleScheme();
    }
  }

  private static class BaseReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<BaseReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BaseReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.keep);
      oprot.writeString(struct.ip);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BaseReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.keep = iprot.readString();
      struct.setKeepIsSet(true);
      struct.ip = iprot.readString();
      struct.setIpIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

