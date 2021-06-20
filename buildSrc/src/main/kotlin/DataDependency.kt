object DataVersions {
    const val RETROFIT = "2.9.0"
    const val OKHTTP_LOGGING = "3.1.0"
    const val ROOM = "2.3.0"
    const val DATASTORE = "1.0.0-beta02"
}

object DataDependency {
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${DataVersions.RETROFIT}"
    const val RETROFIT_MOSHI = "com.squareup.retrofit2:converter-moshi:${DataVersions.RETROFIT}"

    const val OKHTTP_LOGGING = "com.github.ihsanbal:LoggingInterceptor:${DataVersions.OKHTTP_LOGGING}"

    const val ROOM = "androidx.room:room-runtime:${DataVersions.ROOM}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${DataVersions.ROOM}"
    const val ROOM_COROUTINES = "androidx.room:room-ktx:${DataVersions.ROOM}"

    const val DATASTORE = "androidx.datastore:datastore-preferences:${DataVersions.DATASTORE}"
}
