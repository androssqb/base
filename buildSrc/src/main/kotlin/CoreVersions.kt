object CoreVersions {
    const val KOTLIN = "1.5.20-RC"
    const val DETEKT = "1.17.1"
    const val DAGGER = "2.37"
    const val COROUTINES = "1.5.0"
    const val MOSHI = "1.12.0"
    const val COMPOSE = "1.0.0-beta08"
}

object CoreDependency {
    // Dagger
    const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:${CoreVersions.DAGGER}"
    const val DAGGER_ANDROID_PROCESSOR = "com.google.dagger:dagger-android-processor:${CoreVersions.DAGGER}"

    // Moshi
    const val MOSHI_COMPILER = "com.squareup.moshi:moshi-kotlin-codegen:${CoreVersions.MOSHI}"
}
