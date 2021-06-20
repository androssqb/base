package plugins

import org.gradle.api.provider.Property

@Suppress("UnnecessaryAbstractClass", "MagicNumber")
abstract class ProjectConfigExtension {

    abstract val minSdk: Property<Int>
    abstract val targetSdk: Property<Int>
    abstract val compileSdk: Property<Int>

    init {
        minSdk.convention(21)
            .finalizeValueOnRead()
        targetSdk.convention(30)
            .finalizeValueOnRead()
        compileSdk.convention(targetSdk)
            .finalizeValueOnRead()
    }
}
