object DomainVersions {
    const val TIMBER = "4.7.1"
    const val LOGGER = "2.2.0"
}
object DomainDependency {
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${CoreVersions.KOTLIN}"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${CoreVersions.COROUTINES}"
    const val DAGGER = "com.google.dagger:dagger:${CoreVersions.DAGGER}"
    const val DAGGER_ANDROID = "com.google.dagger:dagger-android:${CoreVersions.DAGGER}"
    const val TIMBER = "com.jakewharton.timber:timber:${DomainVersions.TIMBER}"
    const val LOGGER = "com.orhanobut:logger:${DomainVersions.LOGGER}"
    const val MOSHI = "com.squareup.moshi:moshi:${CoreVersions.MOSHI}"
    const val MOSHI_ADAPTERS = "com.squareup.moshi:moshi-adapters:${CoreVersions.MOSHI}"
}
