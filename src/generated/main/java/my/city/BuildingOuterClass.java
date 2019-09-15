// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Building.proto

package my.city;

public final class BuildingOuterClass {
  private BuildingOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BuildingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:my.city.Building)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string building_name = 1;</code>
     */
    java.lang.String getBuildingName();
    /**
     * <code>string building_name = 1;</code>
     */
    com.google.protobuf.ByteString
        getBuildingNameBytes();

    /**
     * <code>string building_number = 2;</code>
     */
    java.lang.String getBuildingNumber();
    /**
     * <code>string building_number = 2;</code>
     */
    com.google.protobuf.ByteString
        getBuildingNumberBytes();

    /**
     * <code>.my.city.Street street = 3;</code>
     */
    boolean hasStreet();
    /**
     * <code>.my.city.Street street = 3;</code>
     */
    my.city.StreetOuterClass.Street getStreet();
    /**
     * <code>.my.city.Street street = 3;</code>
     */
    my.city.StreetOuterClass.StreetOrBuilder getStreetOrBuilder();
  }
  /**
   * Protobuf type {@code my.city.Building}
   */
  public  static final class Building extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:my.city.Building)
      BuildingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Building.newBuilder() to construct.
    private Building(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Building() {
      buildingName_ = "";
      buildingNumber_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Building(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              buildingName_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              buildingNumber_ = s;
              break;
            }
            case 26: {
              my.city.StreetOuterClass.Street.Builder subBuilder = null;
              if (street_ != null) {
                subBuilder = street_.toBuilder();
              }
              street_ = input.readMessage(my.city.StreetOuterClass.Street.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(street_);
                street_ = subBuilder.buildPartial();
              }

              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return my.city.BuildingOuterClass.internal_static_my_city_Building_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return my.city.BuildingOuterClass.internal_static_my_city_Building_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              my.city.BuildingOuterClass.Building.class, my.city.BuildingOuterClass.Building.Builder.class);
    }

    public static final int BUILDING_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object buildingName_;
    /**
     * <code>string building_name = 1;</code>
     */
    public java.lang.String getBuildingName() {
      java.lang.Object ref = buildingName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        buildingName_ = s;
        return s;
      }
    }
    /**
     * <code>string building_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBuildingNameBytes() {
      java.lang.Object ref = buildingName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buildingName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BUILDING_NUMBER_FIELD_NUMBER = 2;
    private volatile java.lang.Object buildingNumber_;
    /**
     * <code>string building_number = 2;</code>
     */
    public java.lang.String getBuildingNumber() {
      java.lang.Object ref = buildingNumber_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        buildingNumber_ = s;
        return s;
      }
    }
    /**
     * <code>string building_number = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBuildingNumberBytes() {
      java.lang.Object ref = buildingNumber_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buildingNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STREET_FIELD_NUMBER = 3;
    private my.city.StreetOuterClass.Street street_;
    /**
     * <code>.my.city.Street street = 3;</code>
     */
    public boolean hasStreet() {
      return street_ != null;
    }
    /**
     * <code>.my.city.Street street = 3;</code>
     */
    public my.city.StreetOuterClass.Street getStreet() {
      return street_ == null ? my.city.StreetOuterClass.Street.getDefaultInstance() : street_;
    }
    /**
     * <code>.my.city.Street street = 3;</code>
     */
    public my.city.StreetOuterClass.StreetOrBuilder getStreetOrBuilder() {
      return getStreet();
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getBuildingNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, buildingName_);
      }
      if (!getBuildingNumberBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, buildingNumber_);
      }
      if (street_ != null) {
        output.writeMessage(3, getStreet());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getBuildingNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, buildingName_);
      }
      if (!getBuildingNumberBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, buildingNumber_);
      }
      if (street_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getStreet());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof my.city.BuildingOuterClass.Building)) {
        return super.equals(obj);
      }
      my.city.BuildingOuterClass.Building other = (my.city.BuildingOuterClass.Building) obj;

      boolean result = true;
      result = result && getBuildingName()
          .equals(other.getBuildingName());
      result = result && getBuildingNumber()
          .equals(other.getBuildingNumber());
      result = result && (hasStreet() == other.hasStreet());
      if (hasStreet()) {
        result = result && getStreet()
            .equals(other.getStreet());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + BUILDING_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getBuildingName().hashCode();
      hash = (37 * hash) + BUILDING_NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getBuildingNumber().hashCode();
      if (hasStreet()) {
        hash = (37 * hash) + STREET_FIELD_NUMBER;
        hash = (53 * hash) + getStreet().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static my.city.BuildingOuterClass.Building parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static my.city.BuildingOuterClass.Building parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static my.city.BuildingOuterClass.Building parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static my.city.BuildingOuterClass.Building parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static my.city.BuildingOuterClass.Building parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static my.city.BuildingOuterClass.Building parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static my.city.BuildingOuterClass.Building parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static my.city.BuildingOuterClass.Building parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static my.city.BuildingOuterClass.Building parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static my.city.BuildingOuterClass.Building parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static my.city.BuildingOuterClass.Building parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static my.city.BuildingOuterClass.Building parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(my.city.BuildingOuterClass.Building prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code my.city.Building}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:my.city.Building)
        my.city.BuildingOuterClass.BuildingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return my.city.BuildingOuterClass.internal_static_my_city_Building_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return my.city.BuildingOuterClass.internal_static_my_city_Building_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                my.city.BuildingOuterClass.Building.class, my.city.BuildingOuterClass.Building.Builder.class);
      }

      // Construct using my.city.BuildingOuterClass.Building.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        buildingName_ = "";

        buildingNumber_ = "";

        if (streetBuilder_ == null) {
          street_ = null;
        } else {
          street_ = null;
          streetBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return my.city.BuildingOuterClass.internal_static_my_city_Building_descriptor;
      }

      public my.city.BuildingOuterClass.Building getDefaultInstanceForType() {
        return my.city.BuildingOuterClass.Building.getDefaultInstance();
      }

      public my.city.BuildingOuterClass.Building build() {
        my.city.BuildingOuterClass.Building result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public my.city.BuildingOuterClass.Building buildPartial() {
        my.city.BuildingOuterClass.Building result = new my.city.BuildingOuterClass.Building(this);
        result.buildingName_ = buildingName_;
        result.buildingNumber_ = buildingNumber_;
        if (streetBuilder_ == null) {
          result.street_ = street_;
        } else {
          result.street_ = streetBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof my.city.BuildingOuterClass.Building) {
          return mergeFrom((my.city.BuildingOuterClass.Building)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(my.city.BuildingOuterClass.Building other) {
        if (other == my.city.BuildingOuterClass.Building.getDefaultInstance()) return this;
        if (!other.getBuildingName().isEmpty()) {
          buildingName_ = other.buildingName_;
          onChanged();
        }
        if (!other.getBuildingNumber().isEmpty()) {
          buildingNumber_ = other.buildingNumber_;
          onChanged();
        }
        if (other.hasStreet()) {
          mergeStreet(other.getStreet());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        my.city.BuildingOuterClass.Building parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (my.city.BuildingOuterClass.Building) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object buildingName_ = "";
      /**
       * <code>string building_name = 1;</code>
       */
      public java.lang.String getBuildingName() {
        java.lang.Object ref = buildingName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          buildingName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string building_name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getBuildingNameBytes() {
        java.lang.Object ref = buildingName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          buildingName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string building_name = 1;</code>
       */
      public Builder setBuildingName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        buildingName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string building_name = 1;</code>
       */
      public Builder clearBuildingName() {
        
        buildingName_ = getDefaultInstance().getBuildingName();
        onChanged();
        return this;
      }
      /**
       * <code>string building_name = 1;</code>
       */
      public Builder setBuildingNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        buildingName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object buildingNumber_ = "";
      /**
       * <code>string building_number = 2;</code>
       */
      public java.lang.String getBuildingNumber() {
        java.lang.Object ref = buildingNumber_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          buildingNumber_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string building_number = 2;</code>
       */
      public com.google.protobuf.ByteString
          getBuildingNumberBytes() {
        java.lang.Object ref = buildingNumber_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          buildingNumber_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string building_number = 2;</code>
       */
      public Builder setBuildingNumber(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        buildingNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string building_number = 2;</code>
       */
      public Builder clearBuildingNumber() {
        
        buildingNumber_ = getDefaultInstance().getBuildingNumber();
        onChanged();
        return this;
      }
      /**
       * <code>string building_number = 2;</code>
       */
      public Builder setBuildingNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        buildingNumber_ = value;
        onChanged();
        return this;
      }

      private my.city.StreetOuterClass.Street street_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          my.city.StreetOuterClass.Street, my.city.StreetOuterClass.Street.Builder, my.city.StreetOuterClass.StreetOrBuilder> streetBuilder_;
      /**
       * <code>.my.city.Street street = 3;</code>
       */
      public boolean hasStreet() {
        return streetBuilder_ != null || street_ != null;
      }
      /**
       * <code>.my.city.Street street = 3;</code>
       */
      public my.city.StreetOuterClass.Street getStreet() {
        if (streetBuilder_ == null) {
          return street_ == null ? my.city.StreetOuterClass.Street.getDefaultInstance() : street_;
        } else {
          return streetBuilder_.getMessage();
        }
      }
      /**
       * <code>.my.city.Street street = 3;</code>
       */
      public Builder setStreet(my.city.StreetOuterClass.Street value) {
        if (streetBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          street_ = value;
          onChanged();
        } else {
          streetBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.my.city.Street street = 3;</code>
       */
      public Builder setStreet(
          my.city.StreetOuterClass.Street.Builder builderForValue) {
        if (streetBuilder_ == null) {
          street_ = builderForValue.build();
          onChanged();
        } else {
          streetBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.my.city.Street street = 3;</code>
       */
      public Builder mergeStreet(my.city.StreetOuterClass.Street value) {
        if (streetBuilder_ == null) {
          if (street_ != null) {
            street_ =
              my.city.StreetOuterClass.Street.newBuilder(street_).mergeFrom(value).buildPartial();
          } else {
            street_ = value;
          }
          onChanged();
        } else {
          streetBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.my.city.Street street = 3;</code>
       */
      public Builder clearStreet() {
        if (streetBuilder_ == null) {
          street_ = null;
          onChanged();
        } else {
          street_ = null;
          streetBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.my.city.Street street = 3;</code>
       */
      public my.city.StreetOuterClass.Street.Builder getStreetBuilder() {
        
        onChanged();
        return getStreetFieldBuilder().getBuilder();
      }
      /**
       * <code>.my.city.Street street = 3;</code>
       */
      public my.city.StreetOuterClass.StreetOrBuilder getStreetOrBuilder() {
        if (streetBuilder_ != null) {
          return streetBuilder_.getMessageOrBuilder();
        } else {
          return street_ == null ?
              my.city.StreetOuterClass.Street.getDefaultInstance() : street_;
        }
      }
      /**
       * <code>.my.city.Street street = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          my.city.StreetOuterClass.Street, my.city.StreetOuterClass.Street.Builder, my.city.StreetOuterClass.StreetOrBuilder> 
          getStreetFieldBuilder() {
        if (streetBuilder_ == null) {
          streetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              my.city.StreetOuterClass.Street, my.city.StreetOuterClass.Street.Builder, my.city.StreetOuterClass.StreetOrBuilder>(
                  getStreet(),
                  getParentForChildren(),
                  isClean());
          street_ = null;
        }
        return streetBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:my.city.Building)
    }

    // @@protoc_insertion_point(class_scope:my.city.Building)
    private static final my.city.BuildingOuterClass.Building DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new my.city.BuildingOuterClass.Building();
    }

    public static my.city.BuildingOuterClass.Building getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Building>
        PARSER = new com.google.protobuf.AbstractParser<Building>() {
      public Building parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Building(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Building> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Building> getParserForType() {
      return PARSER;
    }

    public my.city.BuildingOuterClass.Building getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_my_city_Building_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_my_city_Building_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Building.proto\022\007my.city\032\014Street.proto\"" +
      "[\n\010Building\022\025\n\rbuilding_name\030\001 \001(\t\022\027\n\017bu" +
      "ilding_number\030\002 \001(\t\022\037\n\006street\030\003 \001(\0132\017.my" +
      ".city.Streetb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          my.city.StreetOuterClass.getDescriptor(),
        }, assigner);
    internal_static_my_city_Building_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_my_city_Building_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_my_city_Building_descriptor,
        new java.lang.String[] { "BuildingName", "BuildingNumber", "Street", });
    my.city.StreetOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
