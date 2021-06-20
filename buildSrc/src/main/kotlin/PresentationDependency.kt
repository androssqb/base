object PresentationVersions {
    const val CORE = "1.6.0-rc01"
    const val CORE_ANIMATION = "1.0.0-alpha02"
    const val APPCOMPAT = "1.4.0-alpha02"
    const val CONSTRAINT_LAYOUT = "2.1.0-beta02"
    const val LIFECYCLE = "2.4.0-alpha02"
    const val MATERIAL_UI = "1.4.0-rc01"
    const val ACTIVITY_KTX = "1.3.0-beta02"
    const val FRAGMENT_KTX = "1.4.0-alpha03"
    const val RMR_VIEW_BINDING = "4.1.2-2"
    const val RMR_LIVEDATA = "2.3.0-0"
    const val NAVIGATION = "2.4.0-alpha03"
    const val DATE_TIME = "0.2.1"
    const val EPOXY = "4.6.1"
    const val COIL = "1.2.2"
    const val GLIDE = "4.12.0"
}

object PresentationDependency {
    const val CORE = "androidx.core:core-ktx:${PresentationVersions.CORE}"
    const val CORE_ANIMATION = "androidx.core:core-animation:${PresentationVersions.CORE_ANIMATION}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${PresentationVersions.APPCOMPAT}"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${PresentationVersions.CONSTRAINT_LAYOUT}"
    const val MATERIAL_UI = "com.google.android.material:material:${PresentationVersions.MATERIAL_UI}"
    const val RMR_VIEW_BINDING = "com.redmadrobot.extensions:viewbinding-ktx:${PresentationVersions.RMR_VIEW_BINDING}"
    const val RMR_LIVEDATA = "com.redmadrobot.extensions:lifecycle-livedata-ktx:${PresentationVersions.RMR_LIVEDATA}"

    const val LIFECYCLE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${PresentationVersions.LIFECYCLE}"
    const val LIFECYCLE_RUNTIME = "androidx.lifecycle:lifecycle-runtime-ktx:${PresentationVersions.LIFECYCLE}"

    const val NAVIGATION_FRAGMENT_KTX = "androidx.navigation:navigation-fragment-ktx:${PresentationVersions.NAVIGATION}"
    const val NAVIGATION_UI_KTX = "androidx.navigation:navigation-ui-ktx:${PresentationVersions.NAVIGATION}"
    const val NAVIGATION_DYNAMIC_FEATURES =
        "androidx.navigation:navigation-dynamic-features-fragment:${PresentationVersions.NAVIGATION}"

    const val COMPOSE_UI = "androidx.compose.ui:ui:${CoreVersions.COMPOSE}"
    const val COMPOSE_ACTIVITY = "androidx.activity:activity-compose:${CoreVersions.COMPOSE}"
    const val COMPOSE_MATERIAL = "androidx.compose.material:material:${CoreVersions.COMPOSE}"
    const val COMPOSE_TOOLING = "androidx.compose.ui:ui-tooling:${CoreVersions.COMPOSE}"
    const val COMPOSE_ANIMATION = "androidx.compose.animation:animation:${CoreVersions.COMPOSE}"
    const val COMPOSE_COMPILER = "androidx.compose.compiler:compiler:${CoreVersions.COMPOSE}"
    const val COMPOSE_FOUNDATION= "androidx.compose.foundation:foundation:${CoreVersions.COMPOSE}"

    const val COMPOSE_RUNTIME = "androidx.compose.runtime:runtime:${CoreVersions.COMPOSE}"
    const val COMPOSE_RUNTIME_LIVEDATA = "androidx.compose.runtime:runtime-livedata:${CoreVersions.COMPOSE}"

    const val COMPOSE_NAVIGATION = "androidx.navigation:navigation-compose:${PresentationVersions.NAVIGATION}"

    const val KOTLIN_DATE_TIME = "org.jetbrains.kotlinx:kotlinx-datetime:${PresentationVersions.DATE_TIME}"

    const val EPOXY = "com.airbnb.android:epoxy:${PresentationVersions.EPOXY}"
    const val EPOXY_PROCESSOR = "com.airbnb.android:epoxy-processor:${PresentationVersions.EPOXY}"

    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${PresentationVersions.ACTIVITY_KTX}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${PresentationVersions.FRAGMENT_KTX}"

    const val COIL = "io.coil-kt:coil:${PresentationVersions.COIL}"
    const val GLIDE = "com.github.bumptech.glide:glide:${PresentationVersions.GLIDE}"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${PresentationVersions.GLIDE}"
}
