//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: protoc-gen-openapiv2/options/openapiv2.proto

package grpc.gateway.protoc_gen_openapiv2.options;

@kotlin.jvm.JvmSynthetic
public inline fun securityRequirement(block: grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirementKt.Dsl.() -> kotlin.Unit): grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement =
  grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirementKt.Dsl._create(grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.newBuilder()).apply { block() }._build()
public object SecurityRequirementKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class SecurityRequirementProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * Each name must correspond to a security scheme which is declared in
     * the Security Definitions. If the security scheme is of type "oauth2",
     * then the value is a list of scope names required for the execution.
     * For other security scheme types, the array MUST be empty.
     * </pre>
     *
     * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement.SecurityRequirementValue&gt; security_requirement = 1;</code>
     */
     public val securityRequirement: com.google.protobuf.kotlin.DslMap<kotlin.String, grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue, SecurityRequirementProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getSecurityRequirementMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getSecurityRequirementMap()
      )
    /**
     * <pre>
     * Each name must correspond to a security scheme which is declared in
     * the Security Definitions. If the security scheme is of type "oauth2",
     * then the value is a list of scope names required for the execution.
     * For other security scheme types, the array MUST be empty.
     * </pre>
     *
     * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement.SecurityRequirementValue&gt; security_requirement = 1;</code>
     */
    @JvmName("putSecurityRequirement")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue, SecurityRequirementProxy>
      .put(key: kotlin.String, value: grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue) {
         _builder.putSecurityRequirement(key, value)
       }
    /**
     * <pre>
     * Each name must correspond to a security scheme which is declared in
     * the Security Definitions. If the security scheme is of type "oauth2",
     * then the value is a list of scope names required for the execution.
     * For other security scheme types, the array MUST be empty.
     * </pre>
     *
     * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement.SecurityRequirementValue&gt; security_requirement = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setSecurityRequirement")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue, SecurityRequirementProxy>
      .set(key: kotlin.String, value: grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue) {
         put(key, value)
       }
    /**
     * <pre>
     * Each name must correspond to a security scheme which is declared in
     * the Security Definitions. If the security scheme is of type "oauth2",
     * then the value is a list of scope names required for the execution.
     * For other security scheme types, the array MUST be empty.
     * </pre>
     *
     * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement.SecurityRequirementValue&gt; security_requirement = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeSecurityRequirement")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue, SecurityRequirementProxy>
      .remove(key: kotlin.String) {
         _builder.removeSecurityRequirement(key)
       }
    /**
     * <pre>
     * Each name must correspond to a security scheme which is declared in
     * the Security Definitions. If the security scheme is of type "oauth2",
     * then the value is a list of scope names required for the execution.
     * For other security scheme types, the array MUST be empty.
     * </pre>
     *
     * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement.SecurityRequirementValue&gt; security_requirement = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllSecurityRequirement")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue, SecurityRequirementProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue>) {
         _builder.putAllSecurityRequirement(map)
       }
    /**
     * <pre>
     * Each name must correspond to a security scheme which is declared in
     * the Security Definitions. If the security scheme is of type "oauth2",
     * then the value is a list of scope names required for the execution.
     * For other security scheme types, the array MUST be empty.
     * </pre>
     *
     * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement.SecurityRequirementValue&gt; security_requirement = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearSecurityRequirement")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue, SecurityRequirementProxy>
      .clear() {
         _builder.clearSecurityRequirement()
       }
  }
  @kotlin.jvm.JvmSynthetic
  public inline fun securityRequirementValue(block: grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirementKt.SecurityRequirementValueKt.Dsl.() -> kotlin.Unit): grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue =
    grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirementKt.SecurityRequirementValueKt.Dsl._create(grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue.newBuilder()).apply { block() }._build()
  public object SecurityRequirementValueKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue = _builder.build()

      /**
       * An uninstantiable, behaviorless type to represent the field in
       * generics.
       */
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      public class ScopeProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
      /**
       * <code>repeated string scope = 1;</code>
       * @return A list containing the scope.
       */
      public val scope: com.google.protobuf.kotlin.DslList<kotlin.String, ScopeProxy>
        @kotlin.jvm.JvmSynthetic
        get() = com.google.protobuf.kotlin.DslList(
          _builder.getScopeList()
        )
      /**
       * <code>repeated string scope = 1;</code>
       * @param value The scope to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addScope")
      public fun com.google.protobuf.kotlin.DslList<kotlin.String, ScopeProxy>.add(value: kotlin.String) {
        _builder.addScope(value)
      }
      /**
       * <code>repeated string scope = 1;</code>
       * @param value The scope to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignScope")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ScopeProxy>.plusAssign(value: kotlin.String) {
        add(value)
      }
      /**
       * <code>repeated string scope = 1;</code>
       * @param values The scope to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addAllScope")
      public fun com.google.protobuf.kotlin.DslList<kotlin.String, ScopeProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
        _builder.addAllScope(values)
      }
      /**
       * <code>repeated string scope = 1;</code>
       * @param values The scope to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignAllScope")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ScopeProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
        addAll(values)
      }
      /**
       * <code>repeated string scope = 1;</code>
       * @param index The index to set the value at.
       * @param value The scope to set.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("setScope")
      public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ScopeProxy>.set(index: kotlin.Int, value: kotlin.String) {
        _builder.setScope(index, value)
      }/**
       * <code>repeated string scope = 1;</code>
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("clearScope")
      public fun com.google.protobuf.kotlin.DslList<kotlin.String, ScopeProxy>.clear() {
        _builder.clearScope()
      }}
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.copy(block: grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirementKt.Dsl.() -> kotlin.Unit): grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement =
  grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirementKt.Dsl._create(this.toBuilder()).apply { block() }._build()
@kotlin.jvm.JvmSynthetic
public inline fun grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue.copy(block: grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirementKt.SecurityRequirementValueKt.Dsl.() -> kotlin.Unit): grpc.gateway.protoc_gen_openapiv2.options.Openapiv2.SecurityRequirement.SecurityRequirementValue =
  grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirementKt.SecurityRequirementValueKt.Dsl._create(this.toBuilder()).apply { block() }._build()
