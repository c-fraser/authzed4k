//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: authzed/api/v1/core.proto

package com.authzed.api.v1;

@kotlin.jvm.JvmSynthetic
public inline fun subjectReference(block: com.authzed.api.v1.SubjectReferenceKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.Core.SubjectReference =
  com.authzed.api.v1.SubjectReferenceKt.Dsl._create(com.authzed.api.v1.Core.SubjectReference.newBuilder()).apply { block() }._build()
public object SubjectReferenceKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.authzed.api.v1.Core.SubjectReference.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.authzed.api.v1.Core.SubjectReference.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.authzed.api.v1.Core.SubjectReference = _builder.build()

    /**
     * <code>.authzed.api.v1.ObjectReference object = 1 [(.validate.rules) = { ... }</code>
     */
    public var object_: com.authzed.api.v1.Core.ObjectReference
      @JvmName("getObject_")
      get() = _builder.getObject()
      @JvmName("setObject_")
      set(value) {
        _builder.setObject(value)
      }
    /**
     * <code>.authzed.api.v1.ObjectReference object = 1 [(.validate.rules) = { ... }</code>
     */
    public fun clearObject_() {
      _builder.clearObject()
    }
    /**
     * <code>.authzed.api.v1.ObjectReference object = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the object field is set.
     */
    public fun hasObject_(): kotlin.Boolean {
      return _builder.hasObject()
    }

    /**
     * <code>string optional_relation = 2 [(.validate.rules) = { ... }</code>
     */
    public var optionalRelation: kotlin.String
      @JvmName("getOptionalRelation")
      get() = _builder.getOptionalRelation()
      @JvmName("setOptionalRelation")
      set(value) {
        _builder.setOptionalRelation(value)
      }
    /**
     * <code>string optional_relation = 2 [(.validate.rules) = { ... }</code>
     */
    public fun clearOptionalRelation() {
      _builder.clearOptionalRelation()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.authzed.api.v1.Core.SubjectReference.copy(block: com.authzed.api.v1.SubjectReferenceKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.Core.SubjectReference =
  com.authzed.api.v1.SubjectReferenceKt.Dsl._create(this.toBuilder()).apply { block() }._build()