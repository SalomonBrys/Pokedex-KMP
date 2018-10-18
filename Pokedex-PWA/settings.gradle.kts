val kotlinVersion = "1.3.0-rc-146"

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "kotlin-platform-js" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
                "org.jetbrains.kotlin.frontend" -> useModule("org.jetbrains.kotlin:kotlin-frontend-plugin:${requested.version}")
                "kotlin-dce-js" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
                "com.github.salomonbrys.gradle.kjs.assemble-web" -> useModule("com.github.salomonbrys.gradle.kjs:kotlin-js-gradle-utils:${requested.version}")
                "com.github.salomonbrys.gradle.sass" -> useModule("com.github.salomonbrys.gradle.sass:gradle-sass:${requested.version}")
            }
        }
    }

    repositories {
        mavenLocal()
        maven(url = "http://dl.bintray.com/kotlin/kotlin-eap")
        jcenter()
        maven(url = "https://plugins.gradle.org/m2/")
    }
}

rootProject.name = "Pokedex-PWA"

enableFeaturePreview("GRADLE_METADATA")
