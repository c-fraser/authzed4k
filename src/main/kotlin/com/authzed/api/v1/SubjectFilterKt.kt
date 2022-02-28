//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: authzed/api/v1/permission_service.proto

package com.authzed.api.v1;

@kotlin.jvm.JvmSynthetic
public inline fun subjectFilter(block: com.authzed.api.v1.SubjectFilterKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.SubjectFilter =
  com.authzed.api.v1.SubjectFilterKt.Dsl._create(com.authzed.api.v1.PermissionService.SubjectFilter.newBuilder()).apply { block() }._build()
public object SubjectFilterKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.authzed.api.v1.PermissionService.SubjectFilter.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.authzed.api.v1.PermissionService.SubjectFilter.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.authzed.api.v1.PermissionService.SubjectFilter = _builder.build()

    /**
     * <code>string subject_type = 1 [(.validate.rules) = { ... }</code>
     */
    public var subjectType: kotlin.String
      @JvmName("getSubjectType")
      get() = _builder.getSubjectType()
      @JvmName("setSubjectType")
      set(value) {
        _builder.setSubjectType(value)
      }
    /**
     * <code>string subject_type = 1 [(.validate.rules) = { ... }</code>
     */
    public fun clearSubjectType() {
      _builder.clearSubjectType()
    }

    /**
     * <code>string optional_subject_id = 2 [(.validate.rules) = { ... }</code>
     */
    public var optionalSubjectId: kotlin.String
      @JvmName("getOptionalSubjectId")
      get() = _builder.getOptionalSubjectId()
      @JvmName("setOptionalSubjectId")
      set(value) {
        _builder.setOptionalSubjectId(value)
      }
    /**
     * <code>string optional_subject_id = 2 [(.validate.rules) = { ... }</code>
     */
    public fun clearOptionalSubjectId() {
      _builder.clearOptionalSubjectId()
    }

    /**
     * <code>.authzed.api.v1.SubjectFilter.RelationFilter optional_relation = 3;</code>
     */
    public var optionalRelation: com.authzed.api.v1.PermissionService.SubjectFilter.RelationFilter
      @JvmName("getOptionalRelation")
      get() = _builder.getOptionalRelation()
      @JvmName("setOptionalRelation")
      set(value) {
        _builder.setOptionalRelation(value)
      }
    /**
     * <code>.authzed.api.v1.SubjectFilter.RelationFilter optional_relation = 3;</code>
     */
    public fun clearOptionalRelation() {
      _builder.clearOptionalRelation()
    }
    /**
     * <code>.authzed.api.v1.SubjectFilter.RelationFilter optional_relation = 3;</code>
     * @return Whether the optionalRelation field is set.
     */
    public fun hasOptionalRelation(): kotlin.Boolean {
      return _builder.hasOptionalRelation()
    }
  }
  @kotlin.jvm.JvmSynthetic
  public inline fun relationFilter(block: com.authzed.api.v1.SubjectFilterKt.RelationFilterKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.SubjectFilter.RelationFilter =
    com.authzed.api.v1.SubjectFilterKt.RelationFilterKt.Dsl._create(com.authzed.api.v1.PermissionService.SubjectFilter.RelationFilter.newBuilder()).apply { block() }._build()
  public object RelationFilterKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: com.authzed.api.v1.PermissionService.SubjectFilter.RelationFilter.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: com.authzed.api.v1.PermissionService.SubjectFilter.RelationFilter.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): com.authzed.api.v1.PermissionService.SubjectFilter.RelationFilter = _builder.build()

      /**
       * <code>string relation = 1 [(.validate.rules) = { ... }</code>
       */
      public var relation: kotlin.String
        @JvmName("getRelation")
        get() = _builder.getRelation()
        @JvmName("setRelation")
        set(value) {
          _builder.setRelation(value)
        }
      /**
       * <code>string relation = 1 [(.validate.rules) = { ... }</code>
       */
      public fun clearRelation() {
        _builder.clearRelation()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.authzed.api.v1.PermissionService.SubjectFilter.copy(block: com.authzed.api.v1.SubjectFilterKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.SubjectFilter =
  com.authzed.api.v1.SubjectFilterKt.Dsl._create(this.toBuilder()).apply { block() }._build()
@kotlin.jvm.JvmSynthetic
public inline fun com.authzed.api.v1.PermissionService.SubjectFilter.RelationFilter.copy(block: com.authzed.api.v1.SubjectFilterKt.RelationFilterKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.SubjectFilter.RelationFilter =
  com.authzed.api.v1.SubjectFilterKt.RelationFilterKt.Dsl._create(this.toBuilder()).apply { block() }._build()
