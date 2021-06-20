package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.create

class RootProjectPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.extensions.create<ProjectConfigExtension>("projectConfig")
    }
}
