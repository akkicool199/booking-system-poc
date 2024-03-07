// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hotel.proto

// Protobuf Java Version: 3.25.1
package bookingSystem;

public final class HotelOuterClass {
  private HotelOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HotelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:bookingSystem.Hotel)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string hotel_name = 1;</code>
     * @return The hotelName.
     */
    java.lang.String getHotelName();
    /**
     * <code>string hotel_name = 1;</code>
     * @return The bytes for hotelName.
     */
    com.google.protobuf.ByteString
        getHotelNameBytes();

    /**
     * <code>string hotel_location = 2;</code>
     * @return The hotelLocation.
     */
    java.lang.String getHotelLocation();
    /**
     * <code>string hotel_location = 2;</code>
     * @return The bytes for hotelLocation.
     */
    com.google.protobuf.ByteString
        getHotelLocationBytes();

    /**
     * <code>string checkin_date = 3;</code>
     * @return The checkinDate.
     */
    java.lang.String getCheckinDate();
    /**
     * <code>string checkin_date = 3;</code>
     * @return The bytes for checkinDate.
     */
    com.google.protobuf.ByteString
        getCheckinDateBytes();

    /**
     * <code>string checkout_date = 4;</code>
     * @return The checkoutDate.
     */
    java.lang.String getCheckoutDate();
    /**
     * <code>string checkout_date = 4;</code>
     * @return The bytes for checkoutDate.
     */
    com.google.protobuf.ByteString
        getCheckoutDateBytes();
  }
  /**
   * Protobuf type {@code bookingSystem.Hotel}
   */
  public static final class Hotel extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:bookingSystem.Hotel)
      HotelOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Hotel.newBuilder() to construct.
    private Hotel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Hotel() {
      hotelName_ = "";
      hotelLocation_ = "";
      checkinDate_ = "";
      checkoutDate_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Hotel();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bookingSystem.HotelOuterClass.internal_static_bookingSystem_Hotel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bookingSystem.HotelOuterClass.internal_static_bookingSystem_Hotel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bookingSystem.HotelOuterClass.Hotel.class, bookingSystem.HotelOuterClass.Hotel.Builder.class);
    }

    public static final int HOTEL_NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object hotelName_ = "";
    /**
     * <code>string hotel_name = 1;</code>
     * @return The hotelName.
     */
    @java.lang.Override
    public java.lang.String getHotelName() {
      java.lang.Object ref = hotelName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hotelName_ = s;
        return s;
      }
    }
    /**
     * <code>string hotel_name = 1;</code>
     * @return The bytes for hotelName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHotelNameBytes() {
      java.lang.Object ref = hotelName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hotelName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HOTEL_LOCATION_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object hotelLocation_ = "";
    /**
     * <code>string hotel_location = 2;</code>
     * @return The hotelLocation.
     */
    @java.lang.Override
    public java.lang.String getHotelLocation() {
      java.lang.Object ref = hotelLocation_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hotelLocation_ = s;
        return s;
      }
    }
    /**
     * <code>string hotel_location = 2;</code>
     * @return The bytes for hotelLocation.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHotelLocationBytes() {
      java.lang.Object ref = hotelLocation_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hotelLocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CHECKIN_DATE_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object checkinDate_ = "";
    /**
     * <code>string checkin_date = 3;</code>
     * @return The checkinDate.
     */
    @java.lang.Override
    public java.lang.String getCheckinDate() {
      java.lang.Object ref = checkinDate_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        checkinDate_ = s;
        return s;
      }
    }
    /**
     * <code>string checkin_date = 3;</code>
     * @return The bytes for checkinDate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCheckinDateBytes() {
      java.lang.Object ref = checkinDate_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checkinDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CHECKOUT_DATE_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object checkoutDate_ = "";
    /**
     * <code>string checkout_date = 4;</code>
     * @return The checkoutDate.
     */
    @java.lang.Override
    public java.lang.String getCheckoutDate() {
      java.lang.Object ref = checkoutDate_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        checkoutDate_ = s;
        return s;
      }
    }
    /**
     * <code>string checkout_date = 4;</code>
     * @return The bytes for checkoutDate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCheckoutDateBytes() {
      java.lang.Object ref = checkoutDate_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checkoutDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hotelName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hotelName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hotelLocation_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hotelLocation_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(checkinDate_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, checkinDate_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(checkoutDate_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, checkoutDate_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hotelName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hotelName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hotelLocation_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, hotelLocation_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(checkinDate_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, checkinDate_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(checkoutDate_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, checkoutDate_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof bookingSystem.HotelOuterClass.Hotel)) {
        return super.equals(obj);
      }
      bookingSystem.HotelOuterClass.Hotel other = (bookingSystem.HotelOuterClass.Hotel) obj;

      if (!getHotelName()
          .equals(other.getHotelName())) return false;
      if (!getHotelLocation()
          .equals(other.getHotelLocation())) return false;
      if (!getCheckinDate()
          .equals(other.getCheckinDate())) return false;
      if (!getCheckoutDate()
          .equals(other.getCheckoutDate())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + HOTEL_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getHotelName().hashCode();
      hash = (37 * hash) + HOTEL_LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getHotelLocation().hashCode();
      hash = (37 * hash) + CHECKIN_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getCheckinDate().hashCode();
      hash = (37 * hash) + CHECKOUT_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getCheckoutDate().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static bookingSystem.HotelOuterClass.Hotel parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static bookingSystem.HotelOuterClass.Hotel parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static bookingSystem.HotelOuterClass.Hotel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static bookingSystem.HotelOuterClass.Hotel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static bookingSystem.HotelOuterClass.Hotel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static bookingSystem.HotelOuterClass.Hotel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static bookingSystem.HotelOuterClass.Hotel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static bookingSystem.HotelOuterClass.Hotel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static bookingSystem.HotelOuterClass.Hotel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static bookingSystem.HotelOuterClass.Hotel parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static bookingSystem.HotelOuterClass.Hotel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static bookingSystem.HotelOuterClass.Hotel parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(bookingSystem.HotelOuterClass.Hotel prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code bookingSystem.Hotel}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:bookingSystem.Hotel)
        bookingSystem.HotelOuterClass.HotelOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return bookingSystem.HotelOuterClass.internal_static_bookingSystem_Hotel_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return bookingSystem.HotelOuterClass.internal_static_bookingSystem_Hotel_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                bookingSystem.HotelOuterClass.Hotel.class, bookingSystem.HotelOuterClass.Hotel.Builder.class);
      }

      // Construct using bookingSystem.HotelOuterClass.Hotel.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        hotelName_ = "";
        hotelLocation_ = "";
        checkinDate_ = "";
        checkoutDate_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return bookingSystem.HotelOuterClass.internal_static_bookingSystem_Hotel_descriptor;
      }

      @java.lang.Override
      public bookingSystem.HotelOuterClass.Hotel getDefaultInstanceForType() {
        return bookingSystem.HotelOuterClass.Hotel.getDefaultInstance();
      }

      @java.lang.Override
      public bookingSystem.HotelOuterClass.Hotel build() {
        bookingSystem.HotelOuterClass.Hotel result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public bookingSystem.HotelOuterClass.Hotel buildPartial() {
        bookingSystem.HotelOuterClass.Hotel result = new bookingSystem.HotelOuterClass.Hotel(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(bookingSystem.HotelOuterClass.Hotel result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.hotelName_ = hotelName_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.hotelLocation_ = hotelLocation_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.checkinDate_ = checkinDate_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.checkoutDate_ = checkoutDate_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof bookingSystem.HotelOuterClass.Hotel) {
          return mergeFrom((bookingSystem.HotelOuterClass.Hotel)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(bookingSystem.HotelOuterClass.Hotel other) {
        if (other == bookingSystem.HotelOuterClass.Hotel.getDefaultInstance()) return this;
        if (!other.getHotelName().isEmpty()) {
          hotelName_ = other.hotelName_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getHotelLocation().isEmpty()) {
          hotelLocation_ = other.hotelLocation_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getCheckinDate().isEmpty()) {
          checkinDate_ = other.checkinDate_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (!other.getCheckoutDate().isEmpty()) {
          checkoutDate_ = other.checkoutDate_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                hotelName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                hotelLocation_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                checkinDate_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                checkoutDate_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object hotelName_ = "";
      /**
       * <code>string hotel_name = 1;</code>
       * @return The hotelName.
       */
      public java.lang.String getHotelName() {
        java.lang.Object ref = hotelName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          hotelName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string hotel_name = 1;</code>
       * @return The bytes for hotelName.
       */
      public com.google.protobuf.ByteString
          getHotelNameBytes() {
        java.lang.Object ref = hotelName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          hotelName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string hotel_name = 1;</code>
       * @param value The hotelName to set.
       * @return This builder for chaining.
       */
      public Builder setHotelName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        hotelName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string hotel_name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearHotelName() {
        hotelName_ = getDefaultInstance().getHotelName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string hotel_name = 1;</code>
       * @param value The bytes for hotelName to set.
       * @return This builder for chaining.
       */
      public Builder setHotelNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        hotelName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object hotelLocation_ = "";
      /**
       * <code>string hotel_location = 2;</code>
       * @return The hotelLocation.
       */
      public java.lang.String getHotelLocation() {
        java.lang.Object ref = hotelLocation_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          hotelLocation_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string hotel_location = 2;</code>
       * @return The bytes for hotelLocation.
       */
      public com.google.protobuf.ByteString
          getHotelLocationBytes() {
        java.lang.Object ref = hotelLocation_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          hotelLocation_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string hotel_location = 2;</code>
       * @param value The hotelLocation to set.
       * @return This builder for chaining.
       */
      public Builder setHotelLocation(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        hotelLocation_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string hotel_location = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearHotelLocation() {
        hotelLocation_ = getDefaultInstance().getHotelLocation();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string hotel_location = 2;</code>
       * @param value The bytes for hotelLocation to set.
       * @return This builder for chaining.
       */
      public Builder setHotelLocationBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        hotelLocation_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object checkinDate_ = "";
      /**
       * <code>string checkin_date = 3;</code>
       * @return The checkinDate.
       */
      public java.lang.String getCheckinDate() {
        java.lang.Object ref = checkinDate_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          checkinDate_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string checkin_date = 3;</code>
       * @return The bytes for checkinDate.
       */
      public com.google.protobuf.ByteString
          getCheckinDateBytes() {
        java.lang.Object ref = checkinDate_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          checkinDate_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string checkin_date = 3;</code>
       * @param value The checkinDate to set.
       * @return This builder for chaining.
       */
      public Builder setCheckinDate(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        checkinDate_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string checkin_date = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCheckinDate() {
        checkinDate_ = getDefaultInstance().getCheckinDate();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string checkin_date = 3;</code>
       * @param value The bytes for checkinDate to set.
       * @return This builder for chaining.
       */
      public Builder setCheckinDateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        checkinDate_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private java.lang.Object checkoutDate_ = "";
      /**
       * <code>string checkout_date = 4;</code>
       * @return The checkoutDate.
       */
      public java.lang.String getCheckoutDate() {
        java.lang.Object ref = checkoutDate_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          checkoutDate_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string checkout_date = 4;</code>
       * @return The bytes for checkoutDate.
       */
      public com.google.protobuf.ByteString
          getCheckoutDateBytes() {
        java.lang.Object ref = checkoutDate_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          checkoutDate_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string checkout_date = 4;</code>
       * @param value The checkoutDate to set.
       * @return This builder for chaining.
       */
      public Builder setCheckoutDate(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        checkoutDate_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>string checkout_date = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCheckoutDate() {
        checkoutDate_ = getDefaultInstance().getCheckoutDate();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>string checkout_date = 4;</code>
       * @param value The bytes for checkoutDate to set.
       * @return This builder for chaining.
       */
      public Builder setCheckoutDateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        checkoutDate_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:bookingSystem.Hotel)
    }

    // @@protoc_insertion_point(class_scope:bookingSystem.Hotel)
    private static final bookingSystem.HotelOuterClass.Hotel DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new bookingSystem.HotelOuterClass.Hotel();
    }

    public static bookingSystem.HotelOuterClass.Hotel getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Hotel>
        PARSER = new com.google.protobuf.AbstractParser<Hotel>() {
      @java.lang.Override
      public Hotel parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Hotel> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Hotel> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public bookingSystem.HotelOuterClass.Hotel getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookingSystem_Hotel_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookingSystem_Hotel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013hotel.proto\022\rbookingSystem\"`\n\005Hotel\022\022\n" +
      "\nhotel_name\030\001 \001(\t\022\026\n\016hotel_location\030\002 \001(" +
      "\t\022\024\n\014checkin_date\030\003 \001(\t\022\025\n\rcheckout_date" +
      "\030\004 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_bookingSystem_Hotel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bookingSystem_Hotel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookingSystem_Hotel_descriptor,
        new java.lang.String[] { "HotelName", "HotelLocation", "CheckinDate", "CheckoutDate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}