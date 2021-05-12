import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.4.5"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm")
    kotlin("plugin.spring") version "1.4.32"
    kotlin("plugin.jpa") version "1.4.32"
}

group = "tech.arnav.conduit"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_14

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}


repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":domain"))

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    runtimeOnly("com.h2database:h2")
    runtimeOnly("org.postgresql:postgresql")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "14"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}