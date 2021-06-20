import com.android.build.gradle.internal.api.BaseVariantOutputImpl
import java.util.*

plugins {
    id(GradlePluginId.ANDROID_APPLICATION)
    id(GradlePluginId.SAFE_ARGS)
    kotlin(GradlePluginId.KOTLIN_ANDROID)
    kotlin(GradlePluginId.KAPT)
    id(GradlePluginId.KOTLIN_PARCELIZE)
    `android-kotlin-convention`
    id("base.sdk-version")
}

android {

    testBuildType = BuildTypes.DEBUG

    buildFeatures {
        viewBinding = true
    }

    defaultConfig {

        // FIXME - Переименовать на свое
        applicationId = "com.andross.baseproject"

        versionCode = extra.get("version_code") as Int
        versionName = extra.get("version_name") as String

        resConfigs("ru")

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    signingConfigs {
        getByName(BuildTypes.DEBUG) {
            val debugStoreFile = file("../cert/debug.keystore")
            val debugPropsFile = file("../cert/debug.properties")
            if (debugPropsFile.exists()) {
                val debugProps = Properties().apply {
                    load(debugPropsFile.inputStream())
                }

                storeFile = debugStoreFile
                keyAlias = debugProps.getProperty(SigningProperties.ALIAS_PROP)
                keyPassword = debugProps.getProperty(SigningProperties.KEY_PASSWORD_PROP)
                storePassword = debugProps.getProperty(SigningProperties.STORE_PASSWORD_PROP)
            }
        }

        register(BuildTypes.RELEASE) {
            val keystorePropertiesFile = rootProject.file("keystore.properties")
            val keystoreProperties = Properties()
            if (keystorePropertiesFile.exists()) {
                keystoreProperties.load(keystorePropertiesFile.inputStream())

                storeFile = file(keystoreProperties.getProperty(SigningProperties.STORE_FILE_PROP))
                storePassword = keystoreProperties.getProperty(
                    SigningProperties.STORE_PASSWORD_PROP
                )
                keyPassword = keystoreProperties.getProperty(SigningProperties.KEY_PASSWORD_PROP)
                keyAlias = keystoreProperties.getProperty(SigningProperties.ALIAS_PROP)
            }
        }
    }

    buildTypes {

        getByName(BuildTypes.DEBUG) {
            applicationIdSuffix = ".debug"

            isShrinkResources = false

            signingConfig = signingConfigs.findByName(BuildTypes.DEBUG)
        }

        getByName(BuildTypes.RELEASE) {
            applicationIdSuffix = ""

            isShrinkResources = true

            signingConfig = signingConfigs.findByName(BuildTypes.RELEASE)
        }
    }

    applicationVariants.all {
        val applicationId = applicationId
        val applicationIdSuffix = buildType.applicationIdSuffix

        outputs
            .map { it as BaseVariantOutputImpl }
            .forEach { output ->
                output.outputFileName =
                    "$applicationId$applicationIdSuffix-$versionName($versionCode).apk"
            }
    }

    kapt {
        correctErrorTypes = true
    }
}

dependencies {

    implementation(project(":data"))
    implementation(project(":domain"))
    implementation(project(":presentation"))
    implementation(project(":ui-kit"))

    kapt(CoreDependency.DAGGER_COMPILER)
    kapt(CoreDependency.DAGGER_ANDROID_PROCESSOR)

    testImplementation(TestDependency.JUNIT)
    testImplementation(TestDependency.ANDROIDX)
}
