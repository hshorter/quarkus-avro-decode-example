/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.acme.avro;

import java.util.concurrent.atomic.AtomicReference;

import org.apache.avro.io.DatumReader;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
@io.quarkus.runtime.annotations.RegisterForReflection
public class exampleHeaderFields extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2784319687660593971L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"exampleHeaderFields\",\"namespace\":\"org.acme.avro\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"time\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final AtomicReference<BinaryMessageEncoder<exampleHeaderFields>> ENCODER =
          new AtomicReference<>(null);

  private static final AtomicReference<BinaryMessageDecoder<exampleHeaderFields>> DECODER =
          new AtomicReference<>(null);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<exampleHeaderFields> getEncoder() {
    BinaryMessageEncoder<exampleHeaderFields> result = ENCODER.get();
    if (result == null) {
      result = new BinaryMessageEncoder<>(MODEL$, SCHEMA$);
      if (ENCODER.compareAndSet(null, result)) {
        return result;
      } else {
        return ENCODER.get();
      }
    } else {
      return result;
    }
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<exampleHeaderFields> getDecoder() {
    BinaryMessageDecoder<exampleHeaderFields> result = DECODER.get();
    if (result == null) {
      result = new BinaryMessageDecoder<>(MODEL$, SCHEMA$);
      if (DECODER.compareAndSet(null, result)) {
        return result;
      } else {
        return DECODER.get();
      }
    } else {
      return result;
    }
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<exampleHeaderFields> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<exampleHeaderFields>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this exampleHeaderFields to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return getEncoder().encode(this);
  }

  /**
   * Deserializes a exampleHeaderFields from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a exampleHeaderFields instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static exampleHeaderFields fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return getDecoder().decode(b);
  }

  @Deprecated public CharSequence name;
  @Deprecated public long time;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public exampleHeaderFields() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param time The new value for time
   */
  public exampleHeaderFields(CharSequence name, Long time) {
    this.name = name;
    this.time = time;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return time;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: name = (CharSequence)value$; break;
    case 1: time = (Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'time' field.
   * @return The value of the 'time' field.
   */
  public long getTime() {
    return time;
  }


  /**
   * Sets the value of the 'time' field.
   * @param value the value to set.
   */
  public void setTime(long value) {
    this.time = value;
  }

  /**
   * Creates a new exampleHeaderFields RecordBuilder.
   * @return A new exampleHeaderFields RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new exampleHeaderFields RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new exampleHeaderFields RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    if (other == null) {
      return new Builder();
    } else {
      return new Builder(other);
    }
  }

  /**
   * Creates a new exampleHeaderFields RecordBuilder by copying an existing exampleHeaderFields instance.
   * @param other The existing instance to copy.
   * @return A new exampleHeaderFields RecordBuilder
   */
  public static Builder newBuilder(exampleHeaderFields other) {
    if (other == null) {
      return new Builder();
    } else {
      return new Builder(other);
    }
  }

  /**
   * RecordBuilder for exampleHeaderFields instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<exampleHeaderFields>
    implements org.apache.avro.data.RecordBuilder<exampleHeaderFields> {

    private CharSequence name;
    private long time;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.time)) {
        this.time = data().deepCopy(fields()[1].schema(), other.time);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing exampleHeaderFields instance
     * @param other The existing instance to copy.
     */
    private Builder(exampleHeaderFields other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.time)) {
        this.time = data().deepCopy(fields()[1].schema(), other.time);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public Builder setName(CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'time' field.
      * @return The value.
      */
    public long getTime() {
      return time;
    }


    /**
      * Sets the value of the 'time' field.
      * @param value The value of 'time'.
      * @return This builder.
      */
    public Builder setTime(long value) {
      validate(fields()[1], value);
      this.time = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'time' field has been set.
      * @return True if the 'time' field has been set, false otherwise.
      */
    public boolean hasTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'time' field.
      * @return This builder.
      */
    public Builder clearTime() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public exampleHeaderFields build() {
      try {
        exampleHeaderFields record = new exampleHeaderFields();
        record.name = fieldSetFlags()[0] ? this.name : (CharSequence) defaultValue(fields()[0]);
        record.time = fieldSetFlags()[1] ? this.time : (Long) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<exampleHeaderFields>
    WRITER$ = (org.apache.avro.io.DatumWriter<exampleHeaderFields>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final AtomicReference<org.apache.avro.io.DatumReader<exampleHeaderFields>>
    READER$ = new AtomicReference<>(null);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    DatumReader<exampleHeaderFields> result = READER$.get();
    if (result == null) {
      result = (DatumReader<exampleHeaderFields>)MODEL$.createDatumReader(SCHEMA$);
      if (READER$.compareAndSet(null, result)) {
        result.read(this, SpecificData.getDecoder(in));
      } else {
        READER$.get().read(this, SpecificData.getDecoder(in));
      }
    } else {
      result.read(this, SpecificData.getDecoder(in));
    }
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    out.writeLong(this.time);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.time = in.readLong();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 1:
          this.time = in.readLong();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










