// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        mavenCentral()
        maven (url = "http://dl.bintray.com/kotlin/kotlin-eap")
        maven (url = "https://kotlin.bintray.com/kotlinx")
        mavenLocal()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.10")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(url = "http://dl.bintray.com/kotlin/kotlin-eap")
        maven(url = "https://kotlin.bintray.com/kotlinx")
        mavenLocal()
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
