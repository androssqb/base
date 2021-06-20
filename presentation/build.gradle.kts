plugins {
    id(GradlePluginId.ANDROID_LIBRARY)
    kotlin(GradlePluginId.KOTLIN_ANDROID)
    kotlin(GradlePluginId.KAPT)
    `android-kotlin-convention`
    id("base.sdk-version")
}

dependencies {
    implementation(project(":ui-kit"))
    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":utilities"))

    kapt(CoreDependency.DAGGER_COMPILER)
    kapt(CoreDependency.DAGGER_ANDROID_PROCESSOR)

    testImplementation(TestDependency.JUNIT)
    testImplementation(TestDependency.ANDROIDX)
}
