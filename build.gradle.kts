plugins {
    id("java")
}

group = "nl.gamehugo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.minestom:minestom-snapshots:1_21_4-6490538291")
    implementation("ch.qos.logback:logback-classic:1.5.6")
}
