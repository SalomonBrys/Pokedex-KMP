val kotlinVersion = "1.3.21"

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            val id = requested.id.id
            when {
                id == "org.jetbrains.kotlin.multiplatform" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
                id == "org.jetbrains.kotlin.plugin.serialization" -> useModule("org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion")
                id == "kotlinx-serialization" -> useModule("org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion")
                id == "com.android.library" -> useModule("com.android.tools.build:gradle:3.2.0")
                id.startsWith("com.github.salomonbrys.gradle.kotlin.js.") -> useModule("com.github.salomonbrys.gradle.kotlin.js:kotlin-js-gradle-utils:1.2.0")
            }
        }
    }

    repositories {
        jcenter()
        google()
        maven(url = "https://dl.bintray.com/salomonbrys/gradle-plugins")
        maven(url = "https://plugins.gradle.org/m2/")
        mavenLocal()
    }
}

rootProject.name = "Pokedex-KMP"

enableFeaturePreview("GRADLE_METADATA")
