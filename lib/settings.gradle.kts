val kotlinVersion = "1.3.0-rc-146"

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "kotlin-multiplatform" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
                "kotlinx-serialization" -> useModule("org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion")
                "com.moowork.node" -> useModule("com.moowork.gradle:gradle-node-plugin:1.2.0")
                "com.android.library" -> useModule("com.android.tools.build:gradle:3.2.0")
                "com.github.salomonbrys.gradle.kjs.js-tests" -> useModule("com.github.salomonbrys.gradle.kjs:js-tests:1.0.0")
            }
        }
    }

    repositories {
        mavenLocal()
        jcenter()
        google()
        maven(url = "http://dl.bintray.com/kotlin/kotlin-eap")
        maven(url = "https://plugins.gradle.org/m2/")
        maven(url = "https://dl.bintray.com/salomonbrys/wup-digital-maven")
    }
}
rootProject.name = "Pokedex-KMP"

enableFeaturePreview("GRADLE_METADATA")
