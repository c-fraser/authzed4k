//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: authzed/api/v1/permission_service.proto

package com.authzed.api.v1;

@kotlin.jvm.JvmSynthetic
public inline fun deleteRelationshipsRequest(block: com.authzed.api.v1.DeleteRelationshipsRequestKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest =
  com.authzed.api.v1.DeleteRelationshipsRequestKt.Dsl._create(com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest.newBuilder()).apply { block() }._build()
public object DeleteRelationshipsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest = _builder.build()

    /**
     * <code>.authzed.api.v1.RelationshipFilter relationship_filter = 1 [(.validate.rules) = { ... }</code>
     */
    public var relationshipFilter: com.authzed.api.v1.PermissionService.RelationshipFilter
      @JvmName("getRelationshipFilter")
      get() = _builder.getRelationshipFilter()
      @JvmName("setRelationshipFilter")
      set(value) {
        _builder.setRelationshipFilter(value)
      }
    /**
     * <code>.authzed.api.v1.RelationshipFilter relationship_filter = 1 [(.validate.rules) = { ... }</code>
     */
    public fun clearRelationshipFilter() {
      _builder.clearRelationshipFilter()
    }
    /**
     * <code>.authzed.api.v1.RelationshipFilter relationship_filter = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the relationshipFilter field is set.
     */
    public fun hasRelationshipFilter(): kotlin.Boolean {
      return _builder.hasRelationshipFilter()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class OptionalPreconditionsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * To be bounded by configuration
     * </pre>
     *
     * <code>repeated .authzed.api.v1.Precondition optional_preconditions = 2 [(.validate.rules) = { ... }</code>
     */
     public val optionalPreconditions: com.google.protobuf.kotlin.DslList<com.authzed.api.v1.PermissionService.Precondition, OptionalPreconditionsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getOptionalPreconditionsList()
      )
    /**
     * <pre>
     * To be bounded by configuration
     * </pre>
     *
     * <code>repeated .authzed.api.v1.Precondition optional_preconditions = 2 [(.validate.rules) = { ... }</code>
     * @param value The optionalPreconditions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addOptionalPreconditions")
    public fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.PermissionService.Precondition, OptionalPreconditionsProxy>.add(value: com.authzed.api.v1.PermissionService.Precondition) {
      _builder.addOptionalPreconditions(value)
    }/**
     * <pre>
     * To be bounded by configuration
     * </pre>
     *
     * <code>repeated .authzed.api.v1.Precondition optional_preconditions = 2 [(.validate.rules) = { ... }</code>
     * @param value The optionalPreconditions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignOptionalPreconditions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.PermissionService.Precondition, OptionalPreconditionsProxy>.plusAssign(value: com.authzed.api.v1.PermissionService.Precondition) {
      add(value)
    }/**
     * <pre>
     * To be bounded by configuration
     * </pre>
     *
     * <code>repeated .authzed.api.v1.Precondition optional_preconditions = 2 [(.validate.rules) = { ... }</code>
     * @param values The optionalPreconditions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllOptionalPreconditions")
    public fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.PermissionService.Precondition, OptionalPreconditionsProxy>.addAll(values: kotlin.collections.Iterable<com.authzed.api.v1.PermissionService.Precondition>) {
      _builder.addAllOptionalPreconditions(values)
    }/**
     * <pre>
     * To be bounded by configuration
     * </pre>
     *
     * <code>repeated .authzed.api.v1.Precondition optional_preconditions = 2 [(.validate.rules) = { ... }</code>
     * @param values The optionalPreconditions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllOptionalPreconditions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.PermissionService.Precondition, OptionalPreconditionsProxy>.plusAssign(values: kotlin.collections.Iterable<com.authzed.api.v1.PermissionService.Precondition>) {
      addAll(values)
    }/**
     * <pre>
     * To be bounded by configuration
     * </pre>
     *
     * <code>repeated .authzed.api.v1.Precondition optional_preconditions = 2 [(.validate.rules) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The optionalPreconditions to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setOptionalPreconditions")
    public operator fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.PermissionService.Precondition, OptionalPreconditionsProxy>.set(index: kotlin.Int, value: com.authzed.api.v1.PermissionService.Precondition) {
      _builder.setOptionalPreconditions(index, value)
    }/**
     * <pre>
     * To be bounded by configuration
     * </pre>
     *
     * <code>repeated .authzed.api.v1.Precondition optional_preconditions = 2 [(.validate.rules) = { ... }</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearOptionalPreconditions")
    public fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.PermissionService.Precondition, OptionalPreconditionsProxy>.clear() {
      _builder.clearOptionalPreconditions()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest.copy(block: com.authzed.api.v1.DeleteRelationshipsRequestKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest =
  com.authzed.api.v1.DeleteRelationshipsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()