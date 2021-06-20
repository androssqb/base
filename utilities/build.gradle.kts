plugins {
    id(GradlePluginId.ANDROID_LIBRARY)
    kotlin(GradlePluginId.KOTLIN_ANDROID)
    kotlin(GradlePluginId.KAPT)
    `android-kotlin-convention`
    id("base.sdk-version")
}

dependencies {
    implementation(project(":domain"))

    implementation(PresentationDependency.APPCOMPAT)
    implementation(PresentationDependency.LIFECYCLE_RUNTIME)

    kapt(CoreDependency.DAGGER_COMPILER)
}
