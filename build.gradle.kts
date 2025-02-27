/*
 * Copyright 2025 Amix.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
  alias(libs.plugins.kotlin)
  alias(libs.plugins.kotlin.serialization)
  `maven-publish`
  `java-library`
}

group = "org.amix"
version = libs.versions.lib.version.get()

java {
  sourceCompatibility = JavaVersion.VERSION_17
  targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
  compilerOptions {
    jvmTarget.set(JvmTarget.JVM_17)
  }
}

afterEvaluate {
  publishing {
    publications {
      register("mavenRelease", MavenPublication::class) {
        groupId = "org.amix"
        artifactId = "amix"
        version = libs.versions.lib.version.get()
        from(components["java"])
      }
    }
  }
}

dependencies {
  implementation(libs.antlr4)
  implementation(libs.antlr4.runtime)
  implementation(libs.ktx.serialization.json)
}