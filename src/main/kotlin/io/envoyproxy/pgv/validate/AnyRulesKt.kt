//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: validate/validate.proto

package io.envoyproxy.pgv.validate;

@kotlin.jvm.JvmSynthetic
public inline fun anyRules(block: io.envoyproxy.pgv.validate.AnyRulesKt.Dsl.() -> kotlin.Unit): io.envoyproxy.pgv.validate.Validate.AnyRules =
  io.envoyproxy.pgv.validate.AnyRulesKt.Dsl._create(io.envoyproxy.pgv.validate.Validate.AnyRules.newBuilder()).apply { block() }._build()
public object AnyRulesKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.envoyproxy.pgv.validate.Validate.AnyRules.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.envoyproxy.pgv.validate.Validate.AnyRules.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.envoyproxy.pgv.validate.Validate.AnyRules = _builder.build()

    /**
     * <pre>
     * Required specifies that this field must be set
     * </pre>
     *
     * <code>optional bool required = 1;</code>
     */
    public var required: kotlin.Boolean
      @JvmName("getRequired")
      get() = _builder.getRequired()
      @JvmName("setRequired")
      set(value) {
        _builder.setRequired(value)
      }
    /**
     * <pre>
     * Required specifies that this field must be set
     * </pre>
     *
     * <code>optional bool required = 1;</code>
     */
    public fun clearRequired() {
      _builder.clearRequired()
    }
    /**
     * <pre>
     * Required specifies that this field must be set
     * </pre>
     *
     * <code>optional bool required = 1;</code>
     * @return Whether the required field is set.
     */
    public fun hasRequired(): kotlin.Boolean {
      return _builder.hasRequired()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class In_Proxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * In specifies that this field's `type_url` must be equal to one of the
     * specified values.
     * </pre>
     *
     * <code>repeated string in = 2;</code>
     * @return A list containing the in.
     */
    public val in_: com.google.protobuf.kotlin.DslList<kotlin.String, In_Proxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getInList()
      )
    /**
     * <pre>
     * In specifies that this field's `type_url` must be equal to one of the
     * specified values.
     * </pre>
     *
     * <code>repeated string in = 2;</code>
     * @param value The in to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addIn_")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, In_Proxy>.add(value: kotlin.String) {
      _builder.addIn(value)
    }
    /**
     * <pre>
     * In specifies that this field's `type_url` must be equal to one of the
     * specified values.
     * </pre>
     *
     * <code>repeated string in = 2;</code>
     * @param value The in to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignIn_")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, In_Proxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <pre>
     * In specifies that this field's `type_url` must be equal to one of the
     * specified values.
     * </pre>
     *
     * <code>repeated string in = 2;</code>
     * @param values The in to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllIn_")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, In_Proxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllIn(values)
    }
    /**
     * <pre>
     * In specifies that this field's `type_url` must be equal to one of the
     * specified values.
     * </pre>
     *
     * <code>repeated string in = 2;</code>
     * @param values The in to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllIn_")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, In_Proxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <pre>
     * In specifies that this field's `type_url` must be equal to one of the
     * specified values.
     * </pre>
     *
     * <code>repeated string in = 2;</code>
     * @param index The index to set the value at.
     * @param value The in to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setIn_")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, In_Proxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setIn(index, value)
    }/**
     * <pre>
     * In specifies that this field's `type_url` must be equal to one of the
     * specified values.
     * </pre>
     *
     * <code>repeated string in = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearIn_")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, In_Proxy>.clear() {
      _builder.clearIn()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class NotInProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * NotIn specifies that this field's `type_url` must not be equal to any of
     * the specified values.
     * </pre>
     *
     * <code>repeated string not_in = 3;</code>
     * @return A list containing the notIn.
     */
    public val notIn: com.google.protobuf.kotlin.DslList<kotlin.String, NotInProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getNotInList()
      )
    /**
     * <pre>
     * NotIn specifies that this field's `type_url` must not be equal to any of
     * the specified values.
     * </pre>
     *
     * <code>repeated string not_in = 3;</code>
     * @param value The notIn to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addNotIn")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, NotInProxy>.add(value: kotlin.String) {
      _builder.addNotIn(value)
    }
    /**
     * <pre>
     * NotIn specifies that this field's `type_url` must not be equal to any of
     * the specified values.
     * </pre>
     *
     * <code>repeated string not_in = 3;</code>
     * @param value The notIn to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignNotIn")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, NotInProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <pre>
     * NotIn specifies that this field's `type_url` must not be equal to any of
     * the specified values.
     * </pre>
     *
     * <code>repeated string not_in = 3;</code>
     * @param values The notIn to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllNotIn")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, NotInProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllNotIn(values)
    }
    /**
     * <pre>
     * NotIn specifies that this field's `type_url` must not be equal to any of
     * the specified values.
     * </pre>
     *
     * <code>repeated string not_in = 3;</code>
     * @param values The notIn to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllNotIn")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, NotInProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <pre>
     * NotIn specifies that this field's `type_url` must not be equal to any of
     * the specified values.
     * </pre>
     *
     * <code>repeated string not_in = 3;</code>
     * @param index The index to set the value at.
     * @param value The notIn to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setNotIn")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, NotInProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setNotIn(index, value)
    }/**
     * <pre>
     * NotIn specifies that this field's `type_url` must not be equal to any of
     * the specified values.
     * </pre>
     *
     * <code>repeated string not_in = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearNotIn")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, NotInProxy>.clear() {
      _builder.clearNotIn()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun io.envoyproxy.pgv.validate.Validate.AnyRules.copy(block: io.envoyproxy.pgv.validate.AnyRulesKt.Dsl.() -> kotlin.Unit): io.envoyproxy.pgv.validate.Validate.AnyRules =
  io.envoyproxy.pgv.validate.AnyRulesKt.Dsl._create(this.toBuilder()).apply { block() }._build()