//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: validate/validate.proto

package io.envoyproxy.pgv.validate;

@kotlin.jvm.JvmSynthetic
public inline fun mapRules(block: io.envoyproxy.pgv.validate.MapRulesKt.Dsl.() -> kotlin.Unit): io.envoyproxy.pgv.validate.Validate.MapRules =
  io.envoyproxy.pgv.validate.MapRulesKt.Dsl._create(io.envoyproxy.pgv.validate.Validate.MapRules.newBuilder()).apply { block() }._build()
public object MapRulesKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.envoyproxy.pgv.validate.Validate.MapRules.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.envoyproxy.pgv.validate.Validate.MapRules.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.envoyproxy.pgv.validate.Validate.MapRules = _builder.build()

    /**
     * <pre>
     * MinPairs specifies that this field must have the specified number of
     * KVs at a minimum
     * </pre>
     *
     * <code>optional uint64 min_pairs = 1;</code>
     */
    public var minPairs: kotlin.Long
      @JvmName("getMinPairs")
      get() = _builder.getMinPairs()
      @JvmName("setMinPairs")
      set(value) {
        _builder.setMinPairs(value)
      }
    /**
     * <pre>
     * MinPairs specifies that this field must have the specified number of
     * KVs at a minimum
     * </pre>
     *
     * <code>optional uint64 min_pairs = 1;</code>
     */
    public fun clearMinPairs() {
      _builder.clearMinPairs()
    }
    /**
     * <pre>
     * MinPairs specifies that this field must have the specified number of
     * KVs at a minimum
     * </pre>
     *
     * <code>optional uint64 min_pairs = 1;</code>
     * @return Whether the minPairs field is set.
     */
    public fun hasMinPairs(): kotlin.Boolean {
      return _builder.hasMinPairs()
    }

    /**
     * <pre>
     * MaxPairs specifies that this field must have the specified number of
     * KVs at a maximum
     * </pre>
     *
     * <code>optional uint64 max_pairs = 2;</code>
     */
    public var maxPairs: kotlin.Long
      @JvmName("getMaxPairs")
      get() = _builder.getMaxPairs()
      @JvmName("setMaxPairs")
      set(value) {
        _builder.setMaxPairs(value)
      }
    /**
     * <pre>
     * MaxPairs specifies that this field must have the specified number of
     * KVs at a maximum
     * </pre>
     *
     * <code>optional uint64 max_pairs = 2;</code>
     */
    public fun clearMaxPairs() {
      _builder.clearMaxPairs()
    }
    /**
     * <pre>
     * MaxPairs specifies that this field must have the specified number of
     * KVs at a maximum
     * </pre>
     *
     * <code>optional uint64 max_pairs = 2;</code>
     * @return Whether the maxPairs field is set.
     */
    public fun hasMaxPairs(): kotlin.Boolean {
      return _builder.hasMaxPairs()
    }

    /**
     * <pre>
     * NoSparse specifies values in this field cannot be unset. This only
     * applies to map's with message value types.
     * </pre>
     *
     * <code>optional bool no_sparse = 3;</code>
     */
    public var noSparse: kotlin.Boolean
      @JvmName("getNoSparse")
      get() = _builder.getNoSparse()
      @JvmName("setNoSparse")
      set(value) {
        _builder.setNoSparse(value)
      }
    /**
     * <pre>
     * NoSparse specifies values in this field cannot be unset. This only
     * applies to map's with message value types.
     * </pre>
     *
     * <code>optional bool no_sparse = 3;</code>
     */
    public fun clearNoSparse() {
      _builder.clearNoSparse()
    }
    /**
     * <pre>
     * NoSparse specifies values in this field cannot be unset. This only
     * applies to map's with message value types.
     * </pre>
     *
     * <code>optional bool no_sparse = 3;</code>
     * @return Whether the noSparse field is set.
     */
    public fun hasNoSparse(): kotlin.Boolean {
      return _builder.hasNoSparse()
    }

    /**
     * <pre>
     * Keys specifies the constraints to be applied to each key in the field.
     * </pre>
     *
     * <code>optional .validate.FieldRules keys = 4;</code>
     */
    public var keys: io.envoyproxy.pgv.validate.Validate.FieldRules
      @JvmName("getKeys")
      get() = _builder.getKeys()
      @JvmName("setKeys")
      set(value) {
        _builder.setKeys(value)
      }
    /**
     * <pre>
     * Keys specifies the constraints to be applied to each key in the field.
     * </pre>
     *
     * <code>optional .validate.FieldRules keys = 4;</code>
     */
    public fun clearKeys() {
      _builder.clearKeys()
    }
    /**
     * <pre>
     * Keys specifies the constraints to be applied to each key in the field.
     * </pre>
     *
     * <code>optional .validate.FieldRules keys = 4;</code>
     * @return Whether the keys field is set.
     */
    public fun hasKeys(): kotlin.Boolean {
      return _builder.hasKeys()
    }

    /**
     * <pre>
     * Values specifies the constraints to be applied to the value of each key
     * in the field. Message values will still have their validations evaluated
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules values = 5;</code>
     */
    public var values: io.envoyproxy.pgv.validate.Validate.FieldRules
      @JvmName("getValues")
      get() = _builder.getValues()
      @JvmName("setValues")
      set(value) {
        _builder.setValues(value)
      }
    /**
     * <pre>
     * Values specifies the constraints to be applied to the value of each key
     * in the field. Message values will still have their validations evaluated
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules values = 5;</code>
     */
    public fun clearValues() {
      _builder.clearValues()
    }
    /**
     * <pre>
     * Values specifies the constraints to be applied to the value of each key
     * in the field. Message values will still have their validations evaluated
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules values = 5;</code>
     * @return Whether the values field is set.
     */
    public fun hasValues(): kotlin.Boolean {
      return _builder.hasValues()
    }

    /**
     * <pre>
     * IgnoreEmpty specifies that the validation rules of this field should be
     * evaluated only if the field is not empty
     * </pre>
     *
     * <code>optional bool ignore_empty = 6;</code>
     */
    public var ignoreEmpty: kotlin.Boolean
      @JvmName("getIgnoreEmpty")
      get() = _builder.getIgnoreEmpty()
      @JvmName("setIgnoreEmpty")
      set(value) {
        _builder.setIgnoreEmpty(value)
      }
    /**
     * <pre>
     * IgnoreEmpty specifies that the validation rules of this field should be
     * evaluated only if the field is not empty
     * </pre>
     *
     * <code>optional bool ignore_empty = 6;</code>
     */
    public fun clearIgnoreEmpty() {
      _builder.clearIgnoreEmpty()
    }
    /**
     * <pre>
     * IgnoreEmpty specifies that the validation rules of this field should be
     * evaluated only if the field is not empty
     * </pre>
     *
     * <code>optional bool ignore_empty = 6;</code>
     * @return Whether the ignoreEmpty field is set.
     */
    public fun hasIgnoreEmpty(): kotlin.Boolean {
      return _builder.hasIgnoreEmpty()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.envoyproxy.pgv.validate.Validate.MapRules.copy(block: io.envoyproxy.pgv.validate.MapRulesKt.Dsl.() -> kotlin.Unit): io.envoyproxy.pgv.validate.Validate.MapRules =
  io.envoyproxy.pgv.validate.MapRulesKt.Dsl._create(this.toBuilder()).apply { block() }._build()
