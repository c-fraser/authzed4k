//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: authzed/api/v1/permission_service.proto

package com.authzed.api.v1;

@kotlin.jvm.JvmSynthetic
public inline fun checkPermissionResponse(block: com.authzed.api.v1.CheckPermissionResponseKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.CheckPermissionResponse =
  com.authzed.api.v1.CheckPermissionResponseKt.Dsl._create(com.authzed.api.v1.PermissionService.CheckPermissionResponse.newBuilder()).apply { block() }._build()
public object CheckPermissionResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.authzed.api.v1.PermissionService.CheckPermissionResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.authzed.api.v1.PermissionService.CheckPermissionResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.authzed.api.v1.PermissionService.CheckPermissionResponse = _builder.build()

    /**
     * <code>.authzed.api.v1.ZedToken checked_at = 1;</code>
     */
    public var checkedAt: com.authzed.api.v1.Core.ZedToken
      @JvmName("getCheckedAt")
      get() = _builder.getCheckedAt()
      @JvmName("setCheckedAt")
      set(value) {
        _builder.setCheckedAt(value)
      }
    /**
     * <code>.authzed.api.v1.ZedToken checked_at = 1;</code>
     */
    public fun clearCheckedAt() {
      _builder.clearCheckedAt()
    }
    /**
     * <code>.authzed.api.v1.ZedToken checked_at = 1;</code>
     * @return Whether the checkedAt field is set.
     */
    public fun hasCheckedAt(): kotlin.Boolean {
      return _builder.hasCheckedAt()
    }

    /**
     * <pre>
     * Permissionship communicates whether or not the subject has the requested
     * permission or has a relationship with the given resource, over the given
     * relation.
     * This value will be authzed.api.v1.PERMISSIONSHIP_HAS_PERMISSION if the
     * requested subject is a member of the computed permission set or there
     * exists a relationship with the requested relation from the given resource
     * to the given subject.
     * </pre>
     *
     * <code>.authzed.api.v1.CheckPermissionResponse.Permissionship permissionship = 2;</code>
     */
    public var permissionship: com.authzed.api.v1.PermissionService.CheckPermissionResponse.Permissionship
      @JvmName("getPermissionship")
      get() = _builder.getPermissionship()
      @JvmName("setPermissionship")
      set(value) {
        _builder.setPermissionship(value)
      }
    /**
     * <pre>
     * Permissionship communicates whether or not the subject has the requested
     * permission or has a relationship with the given resource, over the given
     * relation.
     * This value will be authzed.api.v1.PERMISSIONSHIP_HAS_PERMISSION if the
     * requested subject is a member of the computed permission set or there
     * exists a relationship with the requested relation from the given resource
     * to the given subject.
     * </pre>
     *
     * <code>.authzed.api.v1.CheckPermissionResponse.Permissionship permissionship = 2;</code>
     */
    public fun clearPermissionship() {
      _builder.clearPermissionship()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.authzed.api.v1.PermissionService.CheckPermissionResponse.copy(block: com.authzed.api.v1.CheckPermissionResponseKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.PermissionService.CheckPermissionResponse =
  com.authzed.api.v1.CheckPermissionResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
