object TestVersions {
    const val JUNIT = "4.13.2"
    const val ANDROIDX = "2.1.0"
    const val KOTEST = "4.6.0"
    const val MOCKK = "1.11.0"
}

object TestDependency {
    const val JUNIT = "junit:junit:${TestVersions.JUNIT}"
    const val ANDROIDX = "androidx.arch.core:core-testing:${TestVersions.ANDROIDX}"

    // Kotest
    const val KOTEST_RUNNER = "io.kotest:kotest-runner-junit5-jvm:${TestVersions.KOTEST}"
    const val KOTEST_ASSERTIONS_CORE = "io.kotest:kotest-assertions-core-jvm:${TestVersions.KOTEST}"
    const val KOTEST_PROPERTY = "io.kotest:kotest-property-jvm:${TestVersions.KOTEST}"
    const val KOTEST_DATATEST = "io.kotest:kotest-framework-datatest-jvm:${TestVersions.KOTEST}"

    // Mockk
    const val MOCKK = "io.mockk:mockk:${TestVersions.MOCKK}"

    // Coroutines
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${CoreVersions.COROUTINES}"
}
