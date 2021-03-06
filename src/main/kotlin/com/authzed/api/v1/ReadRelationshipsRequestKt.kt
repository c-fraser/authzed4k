//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: authzed/api/v1/permission_service.proto

package com.authzed.api.v1;

@kotlin.jvm.JvmSynthetic
public inline fun readRelationshipsRequest(block: com.authzed.api.v1.ReadRelationshipsRequestKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.ReadRelationshipsRequest =
  com.authzed.api.v1.ReadRelationshipsRequestKt.Dsl._create(com.authzed.api.v1.PermissionService.ReadRelationshipsRequest.newBuilder()).apply { block() }._build()
public object ReadRelationshipsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.authzed.api.v1.PermissionService.ReadRelationshipsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.authzed.api.v1.PermissionService.ReadRelationshipsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.authzed.api.v1.PermissionService.ReadRelationshipsRequest = _builder.build()

    /**
     * <code>.authzed.api.v1.Consistency consistency = 1;</code>
     */
    public var consistency: com.authzed.api.v1.PermissionService.Consistency
      @JvmName("getConsistency")
      get() = _builder.getConsistency()
      @JvmName("setConsistency")
      set(value) {
        _builder.setConsistency(value)
      }
    /**
     * <code>.authzed.api.v1.Consistency consistency = 1;</code>
     */
    public fun clearConsistency() {
      _builder.clearConsistency()
    }
    /**
     * <code>.authzed.api.v1.Consistency consistency = 1;</code>
     * @return Whether the consistency field is set.
     */
    public fun hasConsistency(): kotlin.Boolean {
      return _builder.hasConsistency()
    }

    /**
     * <code>.authzed.api.v1.RelationshipFilter relationship_filter = 2 [(.validate.rules) = { ... }</code>
     */
    public var relationshipFilter: com.authzed.api.v1.PermissionService.RelationshipFilter
      @JvmName("getRelationshipFilter")
      get() = _builder.getRelationshipFilter()
      @JvmName("setRelationshipFilter")
      set(value) {
        _builder.setRelationshipFilter(value)
      }
    /**
     * <code>.authzed.api.v1.RelationshipFilter relationship_filter = 2 [(.validate.rules) = { ... }</code>
     */
    public fun clearRelationshipFilter() {
      _builder.clearRelationshipFilter()
    }
    /**
     * <code>.authzed.api.v1.RelationshipFilter relationship_filter = 2 [(.validate.rules) = { ... }</code>
     * @return Whether the relationshipFilter field is set.
     */
    public fun hasRelationshipFilter(): kotlin.Boolean {
      return _builder.hasRelationshipFilter()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.authzed.api.v1.PermissionService.ReadRelationshipsRequest.copy(block: com.authzed.api.v1.ReadRelationshipsRequestKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.ReadRelationshipsRequest =
  com.authzed.api.v1.ReadRelationshipsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
