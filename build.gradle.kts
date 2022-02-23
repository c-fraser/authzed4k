import com.bmuschko.gradle.docker.tasks.container.DockerCreateContainer
import com.bmuschko.gradle.docker.tasks.container.DockerStartContainer
import com.bmuschko.gradle.docker.tasks.container.DockerStopContainer
import com.bmuschko.gradle.docker.tasks.image.DockerPullImage
import com.diffplug.gradle.spotless.SpotlessExtension
import com.google.protobuf.gradle.GenerateProtoTask
import com.google.protobuf.gradle.generateProtoTasks
import com.google.protobuf.gradle.id
import com.google.protobuf.gradle.ofSourceSet
import com.google.protobuf.gradle.plugins
import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc
import java.net.URL
import java.util.jar.Attributes
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import org.jetbrains.dokka.Platform
import org.jetbrains.dokka.gradle.AbstractDokkaTask
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jreleaser.model.Active

if (JavaVersion.current() < JavaVersion.VERSION_11)
    throw GradleException("Java 11+ is required for this project")

plugins {
  kotlin("jvm")
  `java-library`
  `maven-publish`
  signing
  idea
  id("org.jetbrains.dokka")
  id("com.google.protobuf")
  id("com.diffplug.spotless")
  id("io.github.gradle-nexus.publish-plugin")
  id("org.jreleaser")
  id("com.github.ben-manes.versions")
  id("com.bmuschko.docker-remote-api")
}

repositories { mavenCentral() }

val protobufVersion: String by rootProject
val grpcKotlinVersion: String by rootProject
val grpcVersion: String by rootProject
val bufDir = project.buildDir.resolve("buf")

dependencies {
  val kotlinxCoroutinesVersion: String by rootProject
  val annotationsApiVersion: String by rootProject

  api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutinesVersion")
  api("com.google.protobuf:protobuf-kotlin:$protobufVersion")
  api("io.grpc:grpc-kotlin-stub:$grpcKotlinVersion")
  api("io.grpc:grpc-okhttp:$grpcVersion")
  api("io.grpc:grpc-protobuf:$grpcVersion")
  api("io.grpc:grpc-stub:$grpcVersion")
  compileOnly("org.apache.tomcat:annotations-api:$annotationsApiVersion")
  protobuf(files(bufDir))

  val junitVersion: String by rootProject

  testImplementation(kotlin("test"))
  testImplementation(kotlin("test-junit5"))
  testImplementation(platform("org.junit:junit-bom:$junitVersion"))
  testImplementation("org.junit.jupiter:junit-jupiter")
}

java {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11

  withSourcesJar()
}

tasks {
  withType<Jar>().configureEach {
    manifest {
      attributes(
          "${Attributes.Name.IMPLEMENTATION_TITLE}" to project.name,
          "${Attributes.Name.IMPLEMENTATION_VERSION}" to project.version,
          "Automatic-Module-Name" to "${project.group}.${project.name}")
    }
  }

  withType<KotlinCompile>().configureEach {
    kotlinOptions {
      jvmTarget = "${JavaVersion.VERSION_11}"
      freeCompilerArgs = listOf("-Xjsr305=strict", "-Xopt-in=kotlin.RequiresOptIn")
    }
  }

  withType<DokkaTask>().configureEach {
    dokkaSourceSets {
      named("main") {
        moduleName.set(project.name)
        includes.from(project.file("MODULE.md"))
        platform.set(Platform.jvm)
        jdkVersion.set(JavaVersion.VERSION_11.ordinal)
        noStdlibLink.set(false)
        noJdkLink.set(false)
        sourceLink {
          localDirectory.set(project.file("src/main/kotlin"))
          remoteUrl.set(URL("https://github.com/c-fraser/authzed4k/tree/main/src/main/kotlin"))
          remoteLineSuffix.set("#L")
        }
        externalDocumentationLink(url = URL("https://docs.authzed.com/reference/api"))
        externalDocumentationLink(
            url = URL("https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/"))
      }
    }
  }

  val exportBufs by
      creating(Task::class) {
        val authzedBuf: String by rootProject
        val grpcGatewayBuf: String by rootProject
        val protocGenValidateBuf: String by rootProject

        doLast {
          arrayOf(authzedBuf, grpcGatewayBuf, protocGenValidateBuf).forEach { buf ->
            val pathArgs =
                if (buf == authzedBuf) arrayOf("--path", "authzed/api/v1") else emptyArray()
            exec { commandLine("buf", "export", "--exclude-imports", *pathArgs, "-o", bufDir, buf) }
          }
        }
      }

  withType<GenerateProtoTask>() { dependsOn(exportBufs) }

  val spicedbDocker: String by rootProject

  val pullSpicedbImage by creating(DockerPullImage::class) { image.set(spicedbDocker) }

  val createSpicedbContainer by
      creating(DockerCreateContainer::class) {
        dependsOn(pullSpicedbImage)
        targetImageId(spicedbDocker)
        entrypoint.set(listOf("spicedb", "serve-testing"))
        val spicedbPort = 50051
        exposePorts("TCP", listOf(spicedbPort))
        hostConfig.portBindings.set(listOf("$spicedbPort:$spicedbPort"))
      }

  val startSpicedbContainer by
      creating(DockerStartContainer::class) {
        dependsOn(createSpicedbContainer)
        targetContainerId(createSpicedbContainer.containerId)
      }

  val stopSpicedbContainer by
      creating(DockerStopContainer::class) { targetContainerId(createSpicedbContainer.containerId) }

  withType<Test> {
    useJUnitPlatform()
    dependsOn(startSpicedbContainer)
    finalizedBy(stopSpicedbContainer)
  }
}

protobuf {
  protoc { artifact = "com.google.protobuf:protoc:$protobufVersion" }
  plugins {
    id("grpc") {
      artifact =
          "io.grpc:protoc-gen-grpc-java:$grpcVersion${
          // Use amd64 native library until M1 support is released
          DefaultNativePlatform.getCurrentOperatingSystem()
          .takeIf { it.isMacOsX }
          ?.let { ":osx-x86_64" }
          .orEmpty()}"
    }
    id("grpckt") { artifact = "io.grpc:protoc-gen-grpc-kotlin:$grpcKotlinVersion:jdk7@jar" }
  }
  generateProtoTasks {
    ofSourceSet("main").forEach { task ->
      task.plugins {
        id("grpc")
        id("grpckt")
      }
      task.builtins { id("kotlin") }
    }
  }
}

configure<SpotlessExtension> {
  val ktfmtVersion: String by rootProject

  kotlin {
    ktfmt(ktfmtVersion)
    licenseHeader(
        """
        /*
        Copyright 2022 c-fraser
  
        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at
  
            https://www.apache.org/licenses/LICENSE-2.0
  
        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
        */
        """.trimIndent())
  }

  kotlinGradle { ktfmt(ktfmtVersion) }
}

publishing {
  val dokkaJavadocJar by
      tasks.creating(Jar::class) {
        val dokkaJavadoc by tasks.getting(AbstractDokkaTask::class)
        dependsOn(dokkaJavadoc)
        archiveClassifier.set("javadoc")
        from(dokkaJavadoc.outputDirectory.get())
      }

  publications {
    create<MavenPublication>("maven") {
      from(project.components["java"])
      artifact(dokkaJavadocJar)
      pom {
        name.set(project.name)
        description.set("${project.name}-${project.version}")
        url.set("https://github.com/c-fraser/authzed4k")
        inceptionYear.set("2022")

        issueManagement {
          system.set("GitHub")
          url.set("https://github.com/c-fraser/authzed4k/issues")
        }

        licenses {
          license {
            name.set("The Apache Software License, Version 2.0")
            url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
            distribution.set("repo")
          }
        }

        developers {
          developer {
            id.set("c-fraser")
            name.set("Chris Fraser")
          }
        }

        scm {
          url.set("https://github.com/c-fraser/authzed4k")
          connection.set("scm:git:git://github.com/c-fraser/authzed4k.git")
          developerConnection.set("scm:git:ssh://git@github.com/c-fraser/authzed4k.git")
        }
      }
    }
  }

  signing {
    publications.withType<MavenPublication>().all mavenPublication@{
      useInMemoryPgpKeys(System.getenv("GPG_SIGNING_KEY"), System.getenv("GPG_PASSWORD"))
      sign(this@mavenPublication)
    }
  }
}

nexusPublishing {
  repositories {
    sonatype {
      nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
      snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
      username.set(System.getenv("SONATYPE_USERNAME"))
      password.set(System.getenv("SONATYPE_PASSWORD"))
    }
  }
}

jreleaser {
  project {
    website.set("https://github.com/c-fraser/authzed4k")
    authors.set(listOf("c-fraser"))
    license.set("Apache-2.0")
    extraProperties.put("inceptionYear", "2022")
  }

  release {
    github {
      owner.set("c-fraser")
      overwrite.set(true)
      token.set(System.getenv("GITHUB_TOKEN").orEmpty())
      changelog {
        formatted.set(Active.ALWAYS)
        format.set("- {{commitShortHash}} {{commitTitle}}")
        contributors.enabled.set(false)
        for (status in listOf("added", "changed", "fixed", "removed")) {
          labeler {
            label.set(status)
            title.set(status)
          }
          category {
            title.set(status.capitalize())
            labels.set(listOf(status))
          }
        }
      }
    }
  }
}
