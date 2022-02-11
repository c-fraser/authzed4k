pluginManagement {
  val kotlinVersion: String by settings
  val protobufGradleVersion: String by settings
  val spotlessVersion: String by settings
  val nexusPublishVersion: String by settings
  val jreleaserVersion: String by settings
  val versionsVersion: String by settings
  val dokkaVersion: String by settings

  plugins {
    kotlin("jvm") version kotlinVersion
    id("com.google.protobuf") version protobufGradleVersion
    id("com.diffplug.spotless") version spotlessVersion
    id("io.github.gradle-nexus.publish-plugin") version nexusPublishVersion
    id("org.jreleaser") version jreleaserVersion
    id("com.github.ben-manes.versions") version versionsVersion
    id("org.jetbrains.dokka") version dokkaVersion
  }

  repositories {
    gradlePluginPortal()
    mavenCentral()
  }
}

rootProject.name = "authzed4k"
