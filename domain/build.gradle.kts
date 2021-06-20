plugins {
    id(GradlePluginId.ANDROID_LIBRARY)
    kotlin(GradlePluginId.KOTLIN_ANDROID)
    kotlin(GradlePluginId.KAPT)
    `android-kotlin-convention`
    id("base.sdk-version")
}

dependencies {
    api(DomainDependency.KOTLIN_STDLIB)
    api(DomainDependency.COROUTINES)
    api(DomainDependency.DAGGER)
    api(DomainDependency.DAGGER_ANDROID)
    api(DomainDependency.TIMBER)
    api(DomainDependency.LOGGER)
    api(DomainDependency.MOSHI)
    api(DomainDependency.MOSHI_ADAPTERS)
    kapt(CoreDependency.MOSHI_COMPILER)
}
