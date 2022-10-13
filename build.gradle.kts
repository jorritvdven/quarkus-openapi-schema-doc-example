plugins {
    kotlin("jvm") version "1.7.20"
    id("io.quarkus")
}

repositories {
    mavenLocal()
    mavenCentral()
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

dependencies {
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson")
    implementation("io.quarkus:quarkus-smallrye-openapi")
    implementation("io.quarkus:quarkus-arc")
    testImplementation("io.quarkus:quarkus-junit5")
}

group = "com.jdriven"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_18
    targetCompatibility = JavaVersion.VERSION_18
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}
