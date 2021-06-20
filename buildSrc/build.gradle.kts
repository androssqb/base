plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

gradlePlugin {
    plugins {
        create("root-project") {
            id = "base.root-project"
            implementationClass = "plugins.RootProjectPlugin"
        }
        create("sdk-version") {
            id = "base.sdk-version"
            implementationClass = "plugins.SdkVersionPlugin"
        }
    }
}

dependencies {
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.17.1")
    implementation("com.android.tools.build:gradle:4.2.1")
    implementation(kotlin("gradle-plugin", version = "1.5.10"))
}
