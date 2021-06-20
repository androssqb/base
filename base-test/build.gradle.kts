plugins {
    kotlin(GradlePluginId.KOTLIN_JVM)
}

dependencies {
    implementation(DomainDependency.KOTLIN_STDLIB)

    api(TestDependency.KOTEST_RUNNER)
    api(TestDependency.KOTEST_ASSERTIONS_CORE)
    api(TestDependency.KOTEST_PROPERTY)
    api(TestDependency.KOTEST_DATATEST)
    api(TestDependency.MOCKK)
    api(TestDependency.COROUTINES)
}
