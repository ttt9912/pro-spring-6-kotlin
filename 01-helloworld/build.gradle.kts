plugins {
    kotlin("jvm")
}

group = "ch.ttt"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-core:6.2.12")
    implementation("org.springframework:spring-context:6.2.12")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}