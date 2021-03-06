//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: authzed/api/v1/watch_service.proto

package com.authzed.api.v1;

@kotlin.jvm.JvmSynthetic
public inline fun watchResponse(block: com.authzed.api.v1.WatchResponseKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.WatchServiceOuterClass.WatchResponse =
  com.authzed.api.v1.WatchResponseKt.Dsl._create(com.authzed.api.v1.WatchServiceOuterClass.WatchResponse.newBuilder()).apply { block() }._build()
public object WatchResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.authzed.api.v1.WatchServiceOuterClass.WatchResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.authzed.api.v1.WatchServiceOuterClass.WatchResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.authzed.api.v1.WatchServiceOuterClass.WatchResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class UpdatesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .authzed.api.v1.RelationshipUpdate updates = 1;</code>
     */
     public val updates: com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.RelationshipUpdate, UpdatesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getUpdatesList()
      )
    /**
     * <code>repeated .authzed.api.v1.RelationshipUpdate updates = 1;</code>
     * @param value The updates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addUpdates")
    public fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.RelationshipUpdate, UpdatesProxy>.add(value: com.authzed.api.v1.Core.RelationshipUpdate) {
      _builder.addUpdates(value)
    }/**
     * <code>repeated .authzed.api.v1.RelationshipUpdate updates = 1;</code>
     * @param value The updates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignUpdates")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.RelationshipUpdate, UpdatesProxy>.plusAssign(value: com.authzed.api.v1.Core.RelationshipUpdate) {
      add(value)
    }/**
     * <code>repeated .authzed.api.v1.RelationshipUpdate updates = 1;</code>
     * @param values The updates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllUpdates")
    public fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.RelationshipUpdate, UpdatesProxy>.addAll(values: kotlin.collections.Iterable<com.authzed.api.v1.Core.RelationshipUpdate>) {
      _builder.addAllUpdates(values)
    }/**
     * <code>repeated .authzed.api.v1.RelationshipUpdate updates = 1;</code>
     * @param values The updates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllUpdates")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.RelationshipUpdate, UpdatesProxy>.plusAssign(values: kotlin.collections.Iterable<com.authzed.api.v1.Core.RelationshipUpdate>) {
      addAll(values)
    }/**
     * <code>repeated .authzed.api.v1.RelationshipUpdate updates = 1;</code>
     * @param index The index to set the value at.
     * @param value The updates to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setUpdates")
    public operator fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.RelationshipUpdate, UpdatesProxy>.set(index: kotlin.Int, value: com.authzed.api.v1.Core.RelationshipUpdate) {
      _builder.setUpdates(index, value)
    }/**
     * <code>repeated .authzed.api.v1.RelationshipUpdate updates = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearUpdates")
    public fun com.google.protobuf.kotlin.DslList<com.authzed.api.v1.Core.RelationshipUpdate, UpdatesProxy>.clear() {
      _builder.clearUpdates()
    }
    /**
     * <code>.authzed.api.v1.ZedToken changes_through = 2;</code>
     */
    public var changesThrough: com.authzed.api.v1.Core.ZedToken
      @JvmName("getChangesThrough")
      get() = _builder.getChangesThrough()
      @JvmName("setChangesThrough")
      set(value) {
        _builder.setChangesThrough(value)
      }
    /**
     * <code>.authzed.api.v1.ZedToken changes_through = 2;</code>
     */
    public fun clearChangesThrough() {
      _builder.clearChangesThrough()
    }
    /**
     * <code>.authzed.api.v1.ZedToken changes_through = 2;</code>
     * @return Whether the changesThrough field is set.
     */
    public fun hasChangesThrough(): kotlin.Boolean {
      return _builder.hasChangesThrough()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.authzed.api.v1.WatchServiceOuterClass.WatchResponse.copy(block: com.authzed.api.v1.WatchResponseKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.WatchServiceOuterClass.WatchResponse =
  com.authzed.api.v1.WatchResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
