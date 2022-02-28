//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: authzed/api/v1/schema_service.proto

package com.authzed.api.v1;

@kotlin.jvm.JvmSynthetic
public inline fun readSchemaResponse(block: com.authzed.api.v1.ReadSchemaResponseKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.SchemaServiceOuterClass.ReadSchemaResponse =
  com.authzed.api.v1.ReadSchemaResponseKt.Dsl._create(com.authzed.api.v1.SchemaServiceOuterClass.ReadSchemaResponse.newBuilder()).apply { block() }._build()
public object ReadSchemaResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.authzed.api.v1.SchemaServiceOuterClass.ReadSchemaResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.authzed.api.v1.SchemaServiceOuterClass.ReadSchemaResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.authzed.api.v1.SchemaServiceOuterClass.ReadSchemaResponse = _builder.build()

    /**
     * <pre>
     * schema_text is the textual form of the current schema in the system
     * </pre>
     *
     * <code>string schema_text = 1;</code>
     */
    public var schemaText: kotlin.String
      @JvmName("getSchemaText")
      get() = _builder.getSchemaText()
      @JvmName("setSchemaText")
      set(value) {
        _builder.setSchemaText(value)
      }
    /**
     * <pre>
     * schema_text is the textual form of the current schema in the system
     * </pre>
     *
     * <code>string schema_text = 1;</code>
     */
    public fun clearSchemaText() {
      _builder.clearSchemaText()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.authzed.api.v1.SchemaServiceOuterClass.ReadSchemaResponse.copy(block: com.authzed.api.v1.ReadSchemaResponseKt.Dsl.() -> kotlin.Unit): com.authzed.api.v1.SchemaServiceOuterClass.ReadSchemaResponse =
  com.authzed.api.v1.ReadSchemaResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
