//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: authzed/api/v1/permission_service.proto

package com.authzed.api.v1;

@kotlin.jvm.JvmSynthetic
public inline fun writeRelationshipsResponse(block: com.authzed.api.v1.WriteRelationshipsResponseKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.WriteRelationshipsResponse =
  com.authzed.api.v1.WriteRelationshipsResponseKt.Dsl._create(com.authzed.api.v1.PermissionService.WriteRelationshipsResponse.newBuilder()).apply { block() }._build()
public object WriteRelationshipsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.authzed.api.v1.PermissionService.WriteRelationshipsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.authzed.api.v1.PermissionService.WriteRelationshipsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.authzed.api.v1.PermissionService.WriteRelationshipsResponse = _builder.build()

    /**
     * <code>.authzed.api.v1.ZedToken written_at = 1;</code>
     */
    public var writtenAt: com.authzed.api.v1.Core.ZedToken
      @JvmName("getWrittenAt")
      get() = _builder.getWrittenAt()
      @JvmName("setWrittenAt")
      set(value) {
        _builder.setWrittenAt(value)
      }
    /**
     * <code>.authzed.api.v1.ZedToken written_at = 1;</code>
     */
    public fun clearWrittenAt() {
      _builder.clearWrittenAt()
    }
    /**
     * <code>.authzed.api.v1.ZedToken written_at = 1;</code>
     * @return Whether the writtenAt field is set.
     */
    public fun hasWrittenAt(): kotlin.Boolean {
      return _builder.hasWrittenAt()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.authzed.api.v1.PermissionService.WriteRelationshipsResponse.copy(block: com.authzed.api.v1.WriteRelationshipsResponseKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.WriteRelationshipsResponse =
  com.authzed.api.v1.WriteRelationshipsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()