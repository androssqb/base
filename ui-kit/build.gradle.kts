plugins {
    id(GradlePluginId.ANDROID_LIBRARY)
    kotlin(GradlePluginId.KOTLIN_ANDROID)
    kotlin(GradlePluginId.KAPT)
    `android-kotlin-convention`
    id("base.sdk-version")
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":utilities"))

    api(PresentationDependency.CORE)
    api(PresentationDependency.CORE_ANIMATION)
    api(PresentationDependency.APPCOMPAT)
    api(PresentationDependency.CONSTRAINT_LAYOUT)
    api(PresentationDependency.MATERIAL_UI)
    api(PresentationDependency.RMR_VIEW_BINDING)
    api(PresentationDependency.LIFECYCLE_VIEWMODEL)
    api(PresentationDependency.LIFECYCLE_RUNTIME)

    api(PresentationDependency.ACTIVITY_KTX)
    api(PresentationDependency.FRAGMENT_KTX)

    api(PresentationDependency.NAVIGATION_FRAGMENT_KTX)
    api(PresentationDependency.NAVIGATION_UI_KTX)
    api(PresentationDependency.NAVIGATION_DYNAMIC_FEATURES)

    kapt(CoreDependency.DAGGER_COMPILER)
    kapt(CoreDependency.DAGGER_ANDROID_PROCESSOR)
}
