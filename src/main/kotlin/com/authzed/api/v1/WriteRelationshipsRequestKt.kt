//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: authzed/api/v1/permission_service.proto

package com.authzed.api.v1;

@kotlin.jvm.JvmSynthetic
public inline fun writeRelationshipsRequest(block: com.authzed.api.v1.WriteRelationshipsRequestKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.WriteRelationshipsRequest =
  com.authzed.api.v1.WriteRelationshipsRequestKt.Dsl._create(com.authzed.api.v1.PermissionService.WriteRelationshipsRequest.newBuilder()).apply { block() }._build()
public object WriteRelationshipsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.authzed.api.v1.PermissionService.WriteRelationshipsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.authzed.api.v1.PermissionService.WriteRelationshipsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.authzed.api.v1.PermissionService.WriteRelationshipsRequest = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class UpdatesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .authzed.api.v1.RelationshipUpdate updates = 1 [(.validate.rules) = { ... }</code>
     */
     public val updates: com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.RelationshipUpdate, UpdatesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getUpdatesList()
      )
    /**
     * <code>repeated .authzed.api.v1.RelationshipUpdate updates = 1 [(.validate.rules) = { ... }</code>
     * @param value The updates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addUpdates")
    public fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.RelationshipUpdate, UpdatesProxy>.add(value: com.authzed.api.v1.Core.RelationshipUpdate) {
      _builder.addUpdates(value)
    }/**
     * <code>repeated .authzed.api.v1.RelationshipUpdate updates = 1 [(.validate.rules) = { ... }</code>
     * @param value The updates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignUpdates")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.RelationshipUpdate, UpdatesProxy>.plusAssign(value: com.authzed.api.v1.Core.RelationshipUpdate) {
      add(value)
    }/**
     * <code>repeated .authzed.api.v1.RelationshipUpdate updates = 1 [(.validate.rules) = { ... }</code>
     * @param values The updates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllUpdates")
    public fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.RelationshipUpdate, UpdatesProxy>.addAll(values: kotlin.collections.Iterable<com.authzed.api.v1.Core.RelationshipUpdate>) {
      _builder.addAllUpdates(values)
    }/**
     * <code>repeated .authzed.api.v1.RelationshipUpdate updates = 1 [(.validate.rules) = { ... }</code>
     * @param values The updates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllUpdates")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.RelationshipUpdate, UpdatesProxy>.plusAssign(values: kotlin.collections.Iterable<com.authzed.api.v1.Core.RelationshipUpdate>) {
      addAll(values)
    }/**
     * <code>repeated .authzed.api.v1.RelationshipUpdate updates = 1 [(.validate.rules) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The updates to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setUpdates")
    public operator fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.RelationshipUpdate, UpdatesProxy>.set(index: kotlin.Int, value: com.authzed.api.v1.Core.RelationshipUpdate) {
      _builder.setUpdates(index, value)
    }/**
     * <code>repeated .authzed.api.v1.RelationshipUpdate updates = 1 [(.validate.rules) = { ... }</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearUpdates")
    public fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.RelationshipUpdate, UpdatesProxy>.clear() {
      _builder.clearUpdates()
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
public inline fun com.authzed.api.v1.PermissionService.WriteRelationshipsRequest.copy(block: com.authzed.api.v1.WriteRelationshipsRequestKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.WriteRelationshipsRequest =
  com.authzed.api.v1.WriteRelationshipsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
