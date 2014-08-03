// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osInfo.proto

package com.eolwral.osmonitor.core;

public final class OsInfo {
  private OsInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface osInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required uint64 uptime = 1;
    /**
     * <code>required uint64 uptime = 1;</code>
     *
     * <pre>
     **&lt; system uptime 
     * </pre>
     */
    boolean hasUptime();
    /**
     * <code>required uint64 uptime = 1;</code>
     *
     * <pre>
     **&lt; system uptime 
     * </pre>
     */
    long getUptime();

    // required uint64 totalMemory = 2;
    /**
     * <code>required uint64 totalMemory = 2;</code>
     *
     * <pre>
     **&lt; total memory 
     * </pre>
     */
    boolean hasTotalMemory();
    /**
     * <code>required uint64 totalMemory = 2;</code>
     *
     * <pre>
     **&lt; total memory 
     * </pre>
     */
    long getTotalMemory();

    // required uint64 freeMemory = 3;
    /**
     * <code>required uint64 freeMemory = 3;</code>
     *
     * <pre>
     **&lt; free memory 
     * </pre>
     */
    boolean hasFreeMemory();
    /**
     * <code>required uint64 freeMemory = 3;</code>
     *
     * <pre>
     **&lt; free memory 
     * </pre>
     */
    long getFreeMemory();

    // required uint64 sharedMemory = 4;
    /**
     * <code>required uint64 sharedMemory = 4;</code>
     *
     * <pre>
     **&lt; shared memory 
     * </pre>
     */
    boolean hasSharedMemory();
    /**
     * <code>required uint64 sharedMemory = 4;</code>
     *
     * <pre>
     **&lt; shared memory 
     * </pre>
     */
    long getSharedMemory();

    // required uint64 bufferedMemory = 5;
    /**
     * <code>required uint64 bufferedMemory = 5;</code>
     *
     * <pre>
     **&lt; buffered memory 
     * </pre>
     */
    boolean hasBufferedMemory();
    /**
     * <code>required uint64 bufferedMemory = 5;</code>
     *
     * <pre>
     **&lt; buffered memory 
     * </pre>
     */
    long getBufferedMemory();

    // required uint64 cachedMemory = 6;
    /**
     * <code>required uint64 cachedMemory = 6;</code>
     *
     * <pre>
     **&lt; shared memory 
     * </pre>
     */
    boolean hasCachedMemory();
    /**
     * <code>required uint64 cachedMemory = 6;</code>
     *
     * <pre>
     **&lt; shared memory 
     * </pre>
     */
    long getCachedMemory();

    // required uint64 totalSwap = 7;
    /**
     * <code>required uint64 totalSwap = 7;</code>
     *
     * <pre>
     **&lt; total swap size 
     * </pre>
     */
    boolean hasTotalSwap();
    /**
     * <code>required uint64 totalSwap = 7;</code>
     *
     * <pre>
     **&lt; total swap size 
     * </pre>
     */
    long getTotalSwap();

    // required uint64 freeSwap = 8;
    /**
     * <code>required uint64 freeSwap = 8;</code>
     *
     * <pre>
     **&lt; free swap size 
     * </pre>
     */
    boolean hasFreeSwap();
    /**
     * <code>required uint64 freeSwap = 8;</code>
     *
     * <pre>
     **&lt; free swap size 
     * </pre>
     */
    long getFreeSwap();
  }
  /**
   * Protobuf type {@code com.eolwral.osmonitor.core.osInfo}
   */
  public static final class osInfo extends
      com.google.protobuf.GeneratedMessage
      implements osInfoOrBuilder {
    // Use osInfo.newBuilder() to construct.
    private osInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private osInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final osInfo defaultInstance;
    public static osInfo getDefaultInstance() {
      return defaultInstance;
    }

    public osInfo getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private osInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              uptime_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              totalMemory_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              freeMemory_ = input.readUInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              sharedMemory_ = input.readUInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              bufferedMemory_ = input.readUInt64();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              cachedMemory_ = input.readUInt64();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              totalSwap_ = input.readUInt64();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              freeSwap_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.eolwral.osmonitor.core.OsInfo.internal_static_com_eolwral_osmonitor_core_osInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.eolwral.osmonitor.core.OsInfo.internal_static_com_eolwral_osmonitor_core_osInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.eolwral.osmonitor.core.OsInfo.osInfo.class, com.eolwral.osmonitor.core.OsInfo.osInfo.Builder.class);
    }

    public static com.google.protobuf.Parser<osInfo> PARSER =
        new com.google.protobuf.AbstractParser<osInfo>() {
      public osInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new osInfo(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<osInfo> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required uint64 uptime = 1;
    public static final int UPTIME_FIELD_NUMBER = 1;
    private long uptime_;
    /**
     * <code>required uint64 uptime = 1;</code>
     *
     * <pre>
     **&lt; system uptime 
     * </pre>
     */
    public boolean hasUptime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint64 uptime = 1;</code>
     *
     * <pre>
     **&lt; system uptime 
     * </pre>
     */
    public long getUptime() {
      return uptime_;
    }

    // required uint64 totalMemory = 2;
    public static final int TOTALMEMORY_FIELD_NUMBER = 2;
    private long totalMemory_;
    /**
     * <code>required uint64 totalMemory = 2;</code>
     *
     * <pre>
     **&lt; total memory 
     * </pre>
     */
    public boolean hasTotalMemory() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint64 totalMemory = 2;</code>
     *
     * <pre>
     **&lt; total memory 
     * </pre>
     */
    public long getTotalMemory() {
      return totalMemory_;
    }

    // required uint64 freeMemory = 3;
    public static final int FREEMEMORY_FIELD_NUMBER = 3;
    private long freeMemory_;
    /**
     * <code>required uint64 freeMemory = 3;</code>
     *
     * <pre>
     **&lt; free memory 
     * </pre>
     */
    public boolean hasFreeMemory() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required uint64 freeMemory = 3;</code>
     *
     * <pre>
     **&lt; free memory 
     * </pre>
     */
    public long getFreeMemory() {
      return freeMemory_;
    }

    // required uint64 sharedMemory = 4;
    public static final int SHAREDMEMORY_FIELD_NUMBER = 4;
    private long sharedMemory_;
    /**
     * <code>required uint64 sharedMemory = 4;</code>
     *
     * <pre>
     **&lt; shared memory 
     * </pre>
     */
    public boolean hasSharedMemory() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required uint64 sharedMemory = 4;</code>
     *
     * <pre>
     **&lt; shared memory 
     * </pre>
     */
    public long getSharedMemory() {
      return sharedMemory_;
    }

    // required uint64 bufferedMemory = 5;
    public static final int BUFFEREDMEMORY_FIELD_NUMBER = 5;
    private long bufferedMemory_;
    /**
     * <code>required uint64 bufferedMemory = 5;</code>
     *
     * <pre>
     **&lt; buffered memory 
     * </pre>
     */
    public boolean hasBufferedMemory() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required uint64 bufferedMemory = 5;</code>
     *
     * <pre>
     **&lt; buffered memory 
     * </pre>
     */
    public long getBufferedMemory() {
      return bufferedMemory_;
    }

    // required uint64 cachedMemory = 6;
    public static final int CACHEDMEMORY_FIELD_NUMBER = 6;
    private long cachedMemory_;
    /**
     * <code>required uint64 cachedMemory = 6;</code>
     *
     * <pre>
     **&lt; shared memory 
     * </pre>
     */
    public boolean hasCachedMemory() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required uint64 cachedMemory = 6;</code>
     *
     * <pre>
     **&lt; shared memory 
     * </pre>
     */
    public long getCachedMemory() {
      return cachedMemory_;
    }

    // required uint64 totalSwap = 7;
    public static final int TOTALSWAP_FIELD_NUMBER = 7;
    private long totalSwap_;
    /**
     * <code>required uint64 totalSwap = 7;</code>
     *
     * <pre>
     **&lt; total swap size 
     * </pre>
     */
    public boolean hasTotalSwap() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>required uint64 totalSwap = 7;</code>
     *
     * <pre>
     **&lt; total swap size 
     * </pre>
     */
    public long getTotalSwap() {
      return totalSwap_;
    }

    // required uint64 freeSwap = 8;
    public static final int FREESWAP_FIELD_NUMBER = 8;
    private long freeSwap_;
    /**
     * <code>required uint64 freeSwap = 8;</code>
     *
     * <pre>
     **&lt; free swap size 
     * </pre>
     */
    public boolean hasFreeSwap() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>required uint64 freeSwap = 8;</code>
     *
     * <pre>
     **&lt; free swap size 
     * </pre>
     */
    public long getFreeSwap() {
      return freeSwap_;
    }

    private void initFields() {
      uptime_ = 0L;
      totalMemory_ = 0L;
      freeMemory_ = 0L;
      sharedMemory_ = 0L;
      bufferedMemory_ = 0L;
      cachedMemory_ = 0L;
      totalSwap_ = 0L;
      freeSwap_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasUptime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTotalMemory()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFreeMemory()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSharedMemory()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBufferedMemory()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCachedMemory()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTotalSwap()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFreeSwap()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, uptime_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, totalMemory_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, freeMemory_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt64(4, sharedMemory_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt64(5, bufferedMemory_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeUInt64(6, cachedMemory_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeUInt64(7, totalSwap_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeUInt64(8, freeSwap_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, uptime_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, totalMemory_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, freeMemory_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, sharedMemory_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, bufferedMemory_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, cachedMemory_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, totalSwap_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, freeSwap_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.eolwral.osmonitor.core.OsInfo.osInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.eolwral.osmonitor.core.OsInfo.osInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.eolwral.osmonitor.core.OsInfo.osInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.eolwral.osmonitor.core.OsInfo.osInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.eolwral.osmonitor.core.OsInfo.osInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.eolwral.osmonitor.core.OsInfo.osInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.eolwral.osmonitor.core.OsInfo.osInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.eolwral.osmonitor.core.OsInfo.osInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.eolwral.osmonitor.core.OsInfo.osInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.eolwral.osmonitor.core.OsInfo.osInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.eolwral.osmonitor.core.OsInfo.osInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.eolwral.osmonitor.core.osInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.eolwral.osmonitor.core.OsInfo.osInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.eolwral.osmonitor.core.OsInfo.internal_static_com_eolwral_osmonitor_core_osInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.eolwral.osmonitor.core.OsInfo.internal_static_com_eolwral_osmonitor_core_osInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.eolwral.osmonitor.core.OsInfo.osInfo.class, com.eolwral.osmonitor.core.OsInfo.osInfo.Builder.class);
      }

      // Construct using com.eolwral.osmonitor.core.OsInfo.osInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        uptime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        totalMemory_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        freeMemory_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        sharedMemory_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        bufferedMemory_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        cachedMemory_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        totalSwap_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        freeSwap_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.eolwral.osmonitor.core.OsInfo.internal_static_com_eolwral_osmonitor_core_osInfo_descriptor;
      }

      public com.eolwral.osmonitor.core.OsInfo.osInfo getDefaultInstanceForType() {
        return com.eolwral.osmonitor.core.OsInfo.osInfo.getDefaultInstance();
      }

      public com.eolwral.osmonitor.core.OsInfo.osInfo build() {
        com.eolwral.osmonitor.core.OsInfo.osInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.eolwral.osmonitor.core.OsInfo.osInfo buildPartial() {
        com.eolwral.osmonitor.core.OsInfo.osInfo result = new com.eolwral.osmonitor.core.OsInfo.osInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.uptime_ = uptime_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.totalMemory_ = totalMemory_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.freeMemory_ = freeMemory_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.sharedMemory_ = sharedMemory_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.bufferedMemory_ = bufferedMemory_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.cachedMemory_ = cachedMemory_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.totalSwap_ = totalSwap_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.freeSwap_ = freeSwap_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.eolwral.osmonitor.core.OsInfo.osInfo) {
          return mergeFrom((com.eolwral.osmonitor.core.OsInfo.osInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.eolwral.osmonitor.core.OsInfo.osInfo other) {
        if (other == com.eolwral.osmonitor.core.OsInfo.osInfo.getDefaultInstance()) return this;
        if (other.hasUptime()) {
          setUptime(other.getUptime());
        }
        if (other.hasTotalMemory()) {
          setTotalMemory(other.getTotalMemory());
        }
        if (other.hasFreeMemory()) {
          setFreeMemory(other.getFreeMemory());
        }
        if (other.hasSharedMemory()) {
          setSharedMemory(other.getSharedMemory());
        }
        if (other.hasBufferedMemory()) {
          setBufferedMemory(other.getBufferedMemory());
        }
        if (other.hasCachedMemory()) {
          setCachedMemory(other.getCachedMemory());
        }
        if (other.hasTotalSwap()) {
          setTotalSwap(other.getTotalSwap());
        }
        if (other.hasFreeSwap()) {
          setFreeSwap(other.getFreeSwap());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasUptime()) {
          
          return false;
        }
        if (!hasTotalMemory()) {
          
          return false;
        }
        if (!hasFreeMemory()) {
          
          return false;
        }
        if (!hasSharedMemory()) {
          
          return false;
        }
        if (!hasBufferedMemory()) {
          
          return false;
        }
        if (!hasCachedMemory()) {
          
          return false;
        }
        if (!hasTotalSwap()) {
          
          return false;
        }
        if (!hasFreeSwap()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.eolwral.osmonitor.core.OsInfo.osInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.eolwral.osmonitor.core.OsInfo.osInfo) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required uint64 uptime = 1;
      private long uptime_ ;
      /**
       * <code>required uint64 uptime = 1;</code>
       *
       * <pre>
       **&lt; system uptime 
       * </pre>
       */
      public boolean hasUptime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required uint64 uptime = 1;</code>
       *
       * <pre>
       **&lt; system uptime 
       * </pre>
       */
      public long getUptime() {
        return uptime_;
      }
      /**
       * <code>required uint64 uptime = 1;</code>
       *
       * <pre>
       **&lt; system uptime 
       * </pre>
       */
      public Builder setUptime(long value) {
        bitField0_ |= 0x00000001;
        uptime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 uptime = 1;</code>
       *
       * <pre>
       **&lt; system uptime 
       * </pre>
       */
      public Builder clearUptime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uptime_ = 0L;
        onChanged();
        return this;
      }

      // required uint64 totalMemory = 2;
      private long totalMemory_ ;
      /**
       * <code>required uint64 totalMemory = 2;</code>
       *
       * <pre>
       **&lt; total memory 
       * </pre>
       */
      public boolean hasTotalMemory() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint64 totalMemory = 2;</code>
       *
       * <pre>
       **&lt; total memory 
       * </pre>
       */
      public long getTotalMemory() {
        return totalMemory_;
      }
      /**
       * <code>required uint64 totalMemory = 2;</code>
       *
       * <pre>
       **&lt; total memory 
       * </pre>
       */
      public Builder setTotalMemory(long value) {
        bitField0_ |= 0x00000002;
        totalMemory_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 totalMemory = 2;</code>
       *
       * <pre>
       **&lt; total memory 
       * </pre>
       */
      public Builder clearTotalMemory() {
        bitField0_ = (bitField0_ & ~0x00000002);
        totalMemory_ = 0L;
        onChanged();
        return this;
      }

      // required uint64 freeMemory = 3;
      private long freeMemory_ ;
      /**
       * <code>required uint64 freeMemory = 3;</code>
       *
       * <pre>
       **&lt; free memory 
       * </pre>
       */
      public boolean hasFreeMemory() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required uint64 freeMemory = 3;</code>
       *
       * <pre>
       **&lt; free memory 
       * </pre>
       */
      public long getFreeMemory() {
        return freeMemory_;
      }
      /**
       * <code>required uint64 freeMemory = 3;</code>
       *
       * <pre>
       **&lt; free memory 
       * </pre>
       */
      public Builder setFreeMemory(long value) {
        bitField0_ |= 0x00000004;
        freeMemory_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 freeMemory = 3;</code>
       *
       * <pre>
       **&lt; free memory 
       * </pre>
       */
      public Builder clearFreeMemory() {
        bitField0_ = (bitField0_ & ~0x00000004);
        freeMemory_ = 0L;
        onChanged();
        return this;
      }

      // required uint64 sharedMemory = 4;
      private long sharedMemory_ ;
      /**
       * <code>required uint64 sharedMemory = 4;</code>
       *
       * <pre>
       **&lt; shared memory 
       * </pre>
       */
      public boolean hasSharedMemory() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required uint64 sharedMemory = 4;</code>
       *
       * <pre>
       **&lt; shared memory 
       * </pre>
       */
      public long getSharedMemory() {
        return sharedMemory_;
      }
      /**
       * <code>required uint64 sharedMemory = 4;</code>
       *
       * <pre>
       **&lt; shared memory 
       * </pre>
       */
      public Builder setSharedMemory(long value) {
        bitField0_ |= 0x00000008;
        sharedMemory_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 sharedMemory = 4;</code>
       *
       * <pre>
       **&lt; shared memory 
       * </pre>
       */
      public Builder clearSharedMemory() {
        bitField0_ = (bitField0_ & ~0x00000008);
        sharedMemory_ = 0L;
        onChanged();
        return this;
      }

      // required uint64 bufferedMemory = 5;
      private long bufferedMemory_ ;
      /**
       * <code>required uint64 bufferedMemory = 5;</code>
       *
       * <pre>
       **&lt; buffered memory 
       * </pre>
       */
      public boolean hasBufferedMemory() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required uint64 bufferedMemory = 5;</code>
       *
       * <pre>
       **&lt; buffered memory 
       * </pre>
       */
      public long getBufferedMemory() {
        return bufferedMemory_;
      }
      /**
       * <code>required uint64 bufferedMemory = 5;</code>
       *
       * <pre>
       **&lt; buffered memory 
       * </pre>
       */
      public Builder setBufferedMemory(long value) {
        bitField0_ |= 0x00000010;
        bufferedMemory_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 bufferedMemory = 5;</code>
       *
       * <pre>
       **&lt; buffered memory 
       * </pre>
       */
      public Builder clearBufferedMemory() {
        bitField0_ = (bitField0_ & ~0x00000010);
        bufferedMemory_ = 0L;
        onChanged();
        return this;
      }

      // required uint64 cachedMemory = 6;
      private long cachedMemory_ ;
      /**
       * <code>required uint64 cachedMemory = 6;</code>
       *
       * <pre>
       **&lt; shared memory 
       * </pre>
       */
      public boolean hasCachedMemory() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required uint64 cachedMemory = 6;</code>
       *
       * <pre>
       **&lt; shared memory 
       * </pre>
       */
      public long getCachedMemory() {
        return cachedMemory_;
      }
      /**
       * <code>required uint64 cachedMemory = 6;</code>
       *
       * <pre>
       **&lt; shared memory 
       * </pre>
       */
      public Builder setCachedMemory(long value) {
        bitField0_ |= 0x00000020;
        cachedMemory_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 cachedMemory = 6;</code>
       *
       * <pre>
       **&lt; shared memory 
       * </pre>
       */
      public Builder clearCachedMemory() {
        bitField0_ = (bitField0_ & ~0x00000020);
        cachedMemory_ = 0L;
        onChanged();
        return this;
      }

      // required uint64 totalSwap = 7;
      private long totalSwap_ ;
      /**
       * <code>required uint64 totalSwap = 7;</code>
       *
       * <pre>
       **&lt; total swap size 
       * </pre>
       */
      public boolean hasTotalSwap() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>required uint64 totalSwap = 7;</code>
       *
       * <pre>
       **&lt; total swap size 
       * </pre>
       */
      public long getTotalSwap() {
        return totalSwap_;
      }
      /**
       * <code>required uint64 totalSwap = 7;</code>
       *
       * <pre>
       **&lt; total swap size 
       * </pre>
       */
      public Builder setTotalSwap(long value) {
        bitField0_ |= 0x00000040;
        totalSwap_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 totalSwap = 7;</code>
       *
       * <pre>
       **&lt; total swap size 
       * </pre>
       */
      public Builder clearTotalSwap() {
        bitField0_ = (bitField0_ & ~0x00000040);
        totalSwap_ = 0L;
        onChanged();
        return this;
      }

      // required uint64 freeSwap = 8;
      private long freeSwap_ ;
      /**
       * <code>required uint64 freeSwap = 8;</code>
       *
       * <pre>
       **&lt; free swap size 
       * </pre>
       */
      public boolean hasFreeSwap() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>required uint64 freeSwap = 8;</code>
       *
       * <pre>
       **&lt; free swap size 
       * </pre>
       */
      public long getFreeSwap() {
        return freeSwap_;
      }
      /**
       * <code>required uint64 freeSwap = 8;</code>
       *
       * <pre>
       **&lt; free swap size 
       * </pre>
       */
      public Builder setFreeSwap(long value) {
        bitField0_ |= 0x00000080;
        freeSwap_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 freeSwap = 8;</code>
       *
       * <pre>
       **&lt; free swap size 
       * </pre>
       */
      public Builder clearFreeSwap() {
        bitField0_ = (bitField0_ & ~0x00000080);
        freeSwap_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.eolwral.osmonitor.core.osInfo)
    }

    static {
      defaultInstance = new osInfo(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.eolwral.osmonitor.core.osInfo)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_eolwral_osmonitor_core_osInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_eolwral_osmonitor_core_osInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014osInfo.proto\022\032com.eolwral.osmonitor.co" +
      "re\"\252\001\n\006osInfo\022\016\n\006uptime\030\001 \002(\004\022\023\n\013totalMe" +
      "mory\030\002 \002(\004\022\022\n\nfreeMemory\030\003 \002(\004\022\024\n\014shared" +
      "Memory\030\004 \002(\004\022\026\n\016bufferedMemory\030\005 \002(\004\022\024\n\014" +
      "cachedMemory\030\006 \002(\004\022\021\n\ttotalSwap\030\007 \002(\004\022\020\n" +
      "\010freeSwap\030\010 \002(\004"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_eolwral_osmonitor_core_osInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_eolwral_osmonitor_core_osInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_eolwral_osmonitor_core_osInfo_descriptor,
              new java.lang.String[] { "Uptime", "TotalMemory", "FreeMemory", "SharedMemory", "BufferedMemory", "CachedMemory", "TotalSwap", "FreeSwap", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}