val kotlinVersion = "1.3.20"

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            val id = requested.id.id
            when {
                id.startsWith("org.jetbrains.kotlin.platform.") || id == "kotlin-dce-js" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
                id == "org.jetbrains.kotlin.frontend" -> useModule("org.jetbrains.kotlin:kotlin-frontend-plugin:${requested.version}")
                id == "com.github.salomonbrys.gradle.sass" -> useModule("com.github.salomonbrys.gradle.sass:Gradle-Sass:${requested.version}")
            }
        }
    }

    repositories {
        maven(url = "http://dl.bintray.com/kotlin/kotlin-eap")
        jcenter()
        maven(url = "https://plugins.gradle.org/m2/")
        mavenLocal()
    }
}

rootProject.name = "Pokedex-PWA"

enableFeaturePreview("GRADLE_METADATA")
