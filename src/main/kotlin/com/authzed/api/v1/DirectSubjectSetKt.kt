//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: authzed/api/v1/core.proto

package com.authzed.api.v1;

@kotlin.jvm.JvmSynthetic
public inline fun directSubjectSet(block: com.authzed.api.v1.DirectSubjectSetKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.Core.DirectSubjectSet =
  com.authzed.api.v1.DirectSubjectSetKt.Dsl._create(com.authzed.api.v1.Core.DirectSubjectSet.newBuilder()).apply { block() }._build()
public object DirectSubjectSetKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.authzed.api.v1.Core.DirectSubjectSet.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.authzed.api.v1.Core.DirectSubjectSet.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.authzed.api.v1.Core.DirectSubjectSet = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class SubjectsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .authzed.api.v1.SubjectReference subjects = 1;</code>
     */
     public val subjects: com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.SubjectReference, SubjectsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getSubjectsList()
      )
    /**
     * <code>repeated .authzed.api.v1.SubjectReference subjects = 1;</code>
     * @param value The subjects to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSubjects")
    public fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.SubjectReference, SubjectsProxy>.add(value: com.authzed.api.v1.Core.SubjectReference) {
      _builder.addSubjects(value)
    }/**
     * <code>repeated .authzed.api.v1.SubjectReference subjects = 1;</code>
     * @param value The subjects to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSubjects")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.SubjectReference, SubjectsProxy>.plusAssign(value: com.authzed.api.v1.Core.SubjectReference) {
      add(value)
    }/**
     * <code>repeated .authzed.api.v1.SubjectReference subjects = 1;</code>
     * @param values The subjects to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSubjects")
    public fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.SubjectReference, SubjectsProxy>.addAll(values: kotlin.collections.Iterable<com.authzed.api.v1.Core.SubjectReference>) {
      _builder.addAllSubjects(values)
    }/**
     * <code>repeated .authzed.api.v1.SubjectReference subjects = 1;</code>
     * @param values The subjects to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSubjects")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.SubjectReference, SubjectsProxy>.plusAssign(values: kotlin.collections.Iterable<com.authzed.api.v1.Core.SubjectReference>) {
      addAll(values)
    }/**
     * <code>repeated .authzed.api.v1.SubjectReference subjects = 1;</code>
     * @param index The index to set the value at.
     * @param value The subjects to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSubjects")
    public operator fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.SubjectReference, SubjectsProxy>.set(index: kotlin.Int, value: com.authzed.api.v1.Core.SubjectReference) {
      _builder.setSubjects(index, value)
    }/**
     * <code>repeated .authzed.api.v1.SubjectReference subjects = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSubjects")
    public fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.SubjectReference, SubjectsProxy>.clear() {
      _builder.clearSubjects()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun com.authzed.api.v1.Core.DirectSubjectSet.copy(block: com.authzed.api.v1.DirectSubjectSetKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.Core.DirectSubjectSet =
  com.authzed.api.v1.DirectSubjectSetKt.Dsl._create(this.toBuilder()).apply { block() }._build()
