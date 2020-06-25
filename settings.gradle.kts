rootProject.name="quarkus-simple-rest"

pluginManagement {
    val quarkusPluginVersion: String by settings
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
      id("io.quarkus") version "${quarkusPluginVersion}"
    }
}
