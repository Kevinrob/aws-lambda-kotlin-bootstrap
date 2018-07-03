import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.2.50"

    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", kotlin_version))
    }
}

group = "com.github.kevinrob"
version = "0.1"

plugins {
    `kotlin-dsl`
    id("com.github.johnrengelman.shadow") version "2.0.4"
}

val kotlin_version: String by extra

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8", kotlin_version))
    compile("com.amazonaws:aws-lambda-java-core:1.1.0")
    compile("com.amazonaws:aws-lambda-java-events:2.1.0")
    compile("org.json:json:20180130")

    testCompile("org.junit.jupiter:junit-jupiter-api:5.0.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}