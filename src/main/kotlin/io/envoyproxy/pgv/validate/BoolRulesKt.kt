//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: validate/validate.proto

package io.envoyproxy.pgv.validate;

@kotlin.jvm.JvmSynthetic
public inline fun boolRules(block: io.envoyproxy.pgv.validate.BoolRulesKt.Dsl.() -> kotlin.Unit): io.envoyproxy.pgv.validate.Validate.BoolRules =
  io.envoyproxy.pgv.validate.BoolRulesKt.Dsl._create(io.envoyproxy.pgv.validate.Validate.BoolRules.newBuilder()).apply { block() }._build()
public object BoolRulesKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.envoyproxy.pgv.validate.Validate.BoolRules.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.envoyproxy.pgv.validate.Validate.BoolRules.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.envoyproxy.pgv.validate.Validate.BoolRules = _builder.build()

    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional bool const = 1;</code>
     */
    public var const: kotlin.Boolean
      @JvmName("getConst")
      get() = _builder.getConst()
      @JvmName("setConst")
      set(value) {
        _builder.setConst(value)
      }
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional bool const = 1;</code>
     */
    public fun clearConst() {
      _builder.clearConst()
    }
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional bool const = 1;</code>
     * @return Whether the const field is set.
     */
    public fun hasConst(): kotlin.Boolean {
      return _builder.hasConst()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.envoyproxy.pgv.validate.Validate.BoolRules.copy(block: io.envoyproxy.pgv.validate.BoolRulesKt.Dsl.() -> kotlin.Unit): io.envoyproxy.pgv.validate.Validate.BoolRules =
  io.envoyproxy.pgv.validate.BoolRulesKt.Dsl._create(this.toBuilder()).apply { block() }._build()
