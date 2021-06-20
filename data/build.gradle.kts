plugins {
    id(GradlePluginId.ANDROID_LIBRARY)
    kotlin(GradlePluginId.KOTLIN_ANDROID)
    kotlin(GradlePluginId.KAPT)
    `android-kotlin-convention`
    id("base.sdk-version")
}

android {
    testOptions {
        unitTests.isReturnDefaultValues = true
    }
}

dependencies {
    implementation(project(":domain"))

    implementation(DataDependency.RETROFIT)
    implementation(DataDependency.RETROFIT_MOSHI)
    implementation(DataDependency.OKHTTP_LOGGING) {
        exclude("org.json", "json")
    }
    implementation(DataDependency.ROOM)
    implementation(DataDependency.ROOM_COROUTINES)
    implementation(DataDependency.DATASTORE)

    kapt(CoreDependency.DAGGER_COMPILER)
    kapt(CoreDependency.MOSHI_COMPILER)
    kapt(DataDependency.ROOM_COMPILER)

    testImplementation(TestDependency.JUNIT)
    kaptTest(CoreDependency.MOSHI_COMPILER)
}
