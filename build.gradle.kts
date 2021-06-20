plugins {
    id(GradlePluginId.ANDROID_APPLICATION) apply false
    id(GradlePluginId.SAFE_ARGS) version GradlePluginVersions.SAFE_ARGS apply false
    kotlin(GradlePluginId.KOTLIN_ANDROID) apply false

    id(GradlePluginId.GRADLE_VERSIONS) version GradlePluginVersions.GRADLE_VERSIONS
    id("base.root-project")
}

projectConfig {
    minSdk.set(AndroidConfigVersions.MIN_SDK_VERSION)
    targetSdk.set(AndroidConfigVersions.TARGET_SDK_VERSION)
}

subprojects {
    apply(plugin = "detekt-convention")

    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
    apply { from("$rootDir/gradle/version.gradle.kts") }

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
    }
}
