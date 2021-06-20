@file:Suppress("SpreadOperator")

import com.android.build.gradle.BaseExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

android {

    defaultConfig {
        val proguardFiles = rootProject.fileTree("proguard").files +
            getDefaultProguardFile("proguard-android-optimize.txt")
        proguardFiles(*proguardFiles.toTypedArray())
    }

    buildTypes {
        getByName(BuildTypes.DEBUG) {
            isDebuggable = true
            isMinifyEnabled = false
        }

        getByName(BuildTypes.RELEASE) {
            isDebuggable = false
            isMinifyEnabled = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    sourceSets.forEach { it.java.srcDir("src/${it.name}/kotlin") }
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

fun Project.android(configure: BaseExtension.() -> Unit) {
    extensions.configure("android", configure)
}
