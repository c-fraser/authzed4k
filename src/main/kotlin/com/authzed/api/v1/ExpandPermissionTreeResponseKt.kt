//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: authzed/api/v1/permission_service.proto

package com.authzed.api.v1;

@kotlin.jvm.JvmSynthetic
public inline fun expandPermissionTreeResponse(block: com.authzed.api.v1.ExpandPermissionTreeResponseKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse =
  com.authzed.api.v1.ExpandPermissionTreeResponseKt.Dsl._create(com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse.newBuilder()).apply { block() }._build()
public object ExpandPermissionTreeResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse = _builder.build()

    /**
     * <code>.authzed.api.v1.ZedToken expanded_at = 1;</code>
     */
    public var expandedAt: com.authzed.api.v1.Core.ZedToken
      @JvmName("getExpandedAt")
      get() = _builder.getExpandedAt()
      @JvmName("setExpandedAt")
      set(value) {
        _builder.setExpandedAt(value)
      }
    /**
     * <code>.authzed.api.v1.ZedToken expanded_at = 1;</code>
     */
    public fun clearExpandedAt() {
      _builder.clearExpandedAt()
    }
    /**
     * <code>.authzed.api.v1.ZedToken expanded_at = 1;</code>
     * @return Whether the expandedAt field is set.
     */
    public fun hasExpandedAt(): kotlin.Boolean {
      return _builder.hasExpandedAt()
    }

    /**
     * <pre>
     * tree_root is a tree structure whose leaf nodes are subjects, and
     * intermediate nodes represent the various operations (union, intersection,
     * exclusion) to reach those subjects.
     * </pre>
     *
     * <code>.authzed.api.v1.PermissionRelationshipTree tree_root = 2;</code>
     */
    public var treeRoot: com.authzed.api.v1.Core.PermissionRelationshipTree
      @JvmName("getTreeRoot")
      get() = _builder.getTreeRoot()
      @JvmName("setTreeRoot")
      set(value) {
        _builder.setTreeRoot(value)
      }
    /**
     * <pre>
     * tree_root is a tree structure whose leaf nodes are subjects, and
     * intermediate nodes represent the various operations (union, intersection,
     * exclusion) to reach those subjects.
     * </pre>
     *
     * <code>.authzed.api.v1.PermissionRelationshipTree tree_root = 2;</code>
     */
    public fun clearTreeRoot() {
      _builder.clearTreeRoot()
    }
    /**
     * <pre>
     * tree_root is a tree structure whose leaf nodes are subjects, and
     * intermediate nodes represent the various operations (union, intersection,
     * exclusion) to reach those subjects.
     * </pre>
     *
     * <code>.authzed.api.v1.PermissionRelationshipTree tree_root = 2;</code>
     * @return Whether the treeRoot field is set.
     */
    public fun hasTreeRoot(): kotlin.Boolean {
      return _builder.hasTreeRoot()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse.copy(block: com.authzed.api.v1.ExpandPermissionTreeResponseKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse =
  com.authzed.api.v1.ExpandPermissionTreeResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()