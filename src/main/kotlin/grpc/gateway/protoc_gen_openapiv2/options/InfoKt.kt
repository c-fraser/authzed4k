//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: protoc-gen-openapiv2/options/openapiv2.proto

package grpc.gateway.protoc_gen_openapiv2.options;

@kotlin.jvm.JvmSynthetic
public inline fun info(block: grpc.gateway.protoc_gen_openapiv2.options.InfoKt.Dsl.() -> kotlin.Unit): grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.Info =
  grpc.gateway.protoc_gen_openapiv2.options.InfoKt.Dsl._create(grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.Info.newBuilder()).apply { block() }._build()
public object InfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.Info.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.Info.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.Info = _builder.build()

    /**
     * <pre>
     * The title of the application.
     * </pre>
     *
     * <code>string title = 1;</code>
     */
    public var title: kotlin.String
      @JvmName("getTitle")
      get() = _builder.getTitle()
      @JvmName("setTitle")
      set(value) {
        _builder.setTitle(value)
      }
    /**
     * <pre>
     * The title of the application.
     * </pre>
     *
     * <code>string title = 1;</code>
     */
    public fun clearTitle() {
      _builder.clearTitle()
    }

    /**
     * <pre>
     * A short description of the application. GFM syntax can be used for rich
     * text representation.
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public var description: kotlin.String
      @JvmName("getDescription")
      get() = _builder.getDescription()
      @JvmName("setDescription")
      set(value) {
        _builder.setDescription(value)
      }
    /**
     * <pre>
     * A short description of the application. GFM syntax can be used for rich
     * text representation.
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public fun clearDescription() {
      _builder.clearDescription()
    }

    /**
     * <pre>
     * The Terms of Service for the API.
     * </pre>
     *
     * <code>string terms_of_service = 3;</code>
     */
    public var termsOfService: kotlin.String
      @JvmName("getTermsOfService")
      get() = _builder.getTermsOfService()
      @JvmName("setTermsOfService")
      set(value) {
        _builder.setTermsOfService(value)
      }
    /**
     * <pre>
     * The Terms of Service for the API.
     * </pre>
     *
     * <code>string terms_of_service = 3;</code>
     */
    public fun clearTermsOfService() {
      _builder.clearTermsOfService()
    }

    /**
     * <pre>
     * The contact information for the exposed API.
     * </pre>
     *
     * <code>.grpc.gateway.protoc_gen_openapiv2.options.Contact contact = 4;</code>
     */
    public var contact: grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.Contact
      @JvmName("getContact")
      get() = _builder.getContact()
      @JvmName("setContact")
      set(value) {
        _builder.setContact(value)
      }
    /**
     * <pre>
     * The contact information for the exposed API.
     * </pre>
     *
     * <code>.grpc.gateway.protoc_gen_openapiv2.options.Contact contact = 4;</code>
     */
    public fun clearContact() {
      _builder.clearContact()
    }
    /**
     * <pre>
     * The contact information for the exposed API.
     * </pre>
     *
     * <code>.grpc.gateway.protoc_gen_openapiv2.options.Contact contact = 4;</code>
     * @return Whether the contact field is set.
     */
    public fun hasContact(): kotlin.Boolean {
      return _builder.hasContact()
    }

    /**
     * <pre>
     * The license information for the exposed API.
     * </pre>
     *
     * <code>.grpc.gateway.protoc_gen_openapiv2.options.License license = 5;</code>
     */
    public var license: grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.License
      @JvmName("getLicense")
      get() = _builder.getLicense()
      @JvmName("setLicense")
      set(value) {
        _builder.setLicense(value)
      }
    /**
     * <pre>
     * The license information for the exposed API.
     * </pre>
     *
     * <code>.grpc.gateway.protoc_gen_openapiv2.options.License license = 5;</code>
     */
    public fun clearLicense() {
      _builder.clearLicense()
    }
    /**
     * <pre>
     * The license information for the exposed API.
     * </pre>
     *
     * <code>.grpc.gateway.protoc_gen_openapiv2.options.License license = 5;</code>
     * @return Whether the license field is set.
     */
    public fun hasLicense(): kotlin.Boolean {
      return _builder.hasLicense()
    }

    /**
     * <pre>
     * Provides the version of the application API (not to be confused
     * with the specification version).
     * </pre>
     *
     * <code>string version = 6;</code>
     */
    public var version: kotlin.String
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <pre>
     * Provides the version of the application API (not to be confused
     * with the specification version).
     * </pre>
     *
     * <code>string version = 6;</code>
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ExtensionsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 7;</code>
     */
     public val extensions: com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.Value, ExtensionsProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getExtensionsMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getExtensionsMap()
      )
    /**
     * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 7;</code>
     */
    @JvmName("putExtensions")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.Value, ExtensionsProxy>
      .put(key: kotlin.String, value: com.google.protobuf.Value) {
         _builder.putExtensions(key, value)
       }
    /**
     * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 7;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setExtensions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.Value, ExtensionsProxy>
      .set(key: kotlin.String, value: com.google.protobuf.Value) {
         put(key, value)
       }
    /**
     * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 7;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeExtensions")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.Value, ExtensionsProxy>
      .remove(key: kotlin.String) {
         _builder.removeExtensions(key)
       }
    /**
     * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 7;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllExtensions")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.Value, ExtensionsProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, com.google.protobuf.Value>) {
         _builder.putAllExtensions(map)
       }
    /**
     * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 7;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearExtensions")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.Value, ExtensionsProxy>
      .clear() {
         _builder.clearExtensions()
       }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.Info.copy(block: grpc.gateway.protoc_gen_openapiv2.options.InfoKt.Dsl.() -> kotlin.Unit): grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.Info =
  grpc.gateway.protoc_gen_openapiv2.options.InfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()