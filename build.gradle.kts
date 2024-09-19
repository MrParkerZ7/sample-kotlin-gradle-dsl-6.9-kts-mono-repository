import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val kotlinVersion = "1.5.21"
    id("org.springframework.boot") version "2.7.18" apply false
    id("com.github.johnrengelman.shadow") version "7.1.2" apply false

    kotlin("jvm") version kotlinVersion apply false
    kotlin("plugin.spring") version kotlinVersion apply false
    kotlin("plugin.serialization") version kotlinVersion apply false

    java
    jacoco
}

buildscript {
    repositories {
        mavenCentral()
        google()
        jcenter()
    }
    dependencies {
        classpath(kotlin("reflect"))
        classpath(kotlin("stdlib-jdk8"))
    }

}

allprojects {
    group = "com.puck.gradle.dsl"
    version = "v1"

    repositories {
        mavenCentral()
        google()
        jcenter()
    }
    dependencies {
    }

    tasks.withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
            incremental = false
        }
    }

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
        testLogging {
            events("failed")
        }
    }

    tasks.withType<ShadowJar>() {
        archiveBaseName.set("shadow")
        mergeServiceFiles()
    }

    val testCoverage by tasks.registering {
        group = "verification"
        description = "Runs project unit test coverage."
        dependsOn(":test", ":jacocoTestReport", ":jacocoTestCoverageVerification")

        val jacocoTestReport = tasks.findByName("jacocoTestReport")
        jacocoTestReport?.mustRunAfter(tasks.findByName("test"))
        tasks.findByName("jacocoTestCoverageVerification")?.mustRunAfter(jacocoTestReport)
    }

    testCoverage
}

subprojects {
    repositories {
        mavenCentral()
    }
}

jacoco {
    toolVersion = "0.8.6"
}