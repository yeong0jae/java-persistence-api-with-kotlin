plugins {
    kotlin("jvm") version "2.0.20"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.hibernate:hibernate-core:6.6.3.Final")

    implementation("mysql:mysql-connector-java:8.0.33")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
