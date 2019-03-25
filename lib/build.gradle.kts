plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.multiplatform")
    id("org.jetbrains.kotlin.plugin.serialization")
    id("com.github.salomonbrys.gradle.kotlin.js.mpp-tests.node")
    `maven-publish`
}

repositories {
    jcenter()
    google()
    maven(url = "https://kotlin.bintray.com/kotlinx")
    maven(url = "https://dl.bintray.com/kodein-framework/Kodein-DI")
}

group = "org.kodein.sample.pokedex"
version = "1.0"

val kotlinxSerializationRuntimeVersion = "0.10.0"
val kotlinxCoroutinesVersion = "1.1.1"
val kodeinDIVersion = "6.1.0"

android {
    compileSdkVersion(27)

    defaultConfig {
        minSdkVersion(15)
    }
}

val devHost: String? by project

kotlin {

    jvm()

    android {
        publishLibraryVariants("debug")
    }

    js("nodejs") {
        compilations["main"].compileKotlinTask.kotlinOptions.moduleKind = "umd"
        kotlinJsNodeTests { thisTarget() }
    }

    js("webjs") {
        compilations["main"].compileKotlinTask.kotlinOptions.moduleKind = "umd"
    }

    linuxX64("linux")
    macosX64("macos")
    iosX64("iosSim") {
        compilations["main"].outputKinds("FRAMEWORK")
    }

    sourceSets {
       val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-common")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:$kotlinxSerializationRuntimeVersion")
                api("org.kodein.di:kodein-di-erased:$kodeinDIVersion")
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:$kotlinxCoroutinesVersion")
            }
            languageSettings.progressiveMode = true
        }

        val commonTest by getting {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test-common")
                implementation("org.jetbrains.kotlin:kotlin-test-annotations-common")
            }
        }

        val allJvmMain by creating {
            dependsOn(commonMain)
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:$kotlinxSerializationRuntimeVersion")
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutinesVersion")
            }
        }

        configure(listOf(get("jvmMain"), get("androidMain"))) {
            dependsOn(allJvmMain)
        }

        val allJvmTest by creating {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test")
            }
        }

        configure(listOf(get("jvmTest"), get("androidTest"))) {
            dependsOn(allJvmTest)
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test-junit")
            }
        }

        val allJsMain by creating {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-js")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:$kotlinxSerializationRuntimeVersion")
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:$kotlinxCoroutinesVersion")
            }
        }

        configure(listOf(get("nodejsMain"), get("webjsMain"))) {
            dependsOn(allJsMain)
        }

        val allJsTest by creating {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test-js")
            }
        }

        configure(listOf(get("nodejsTest"), get("webjsTest"))) {
            dependsOn(allJsTest)
        }

        val allNativeMain by creating {
            dependsOn(commonMain)
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:$kotlinxSerializationRuntimeVersion")
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core-native:$kotlinxCoroutinesVersion")
            }
        }

        get("iosSimMain").apply {
            dependsOn(allNativeMain)
        }

        val allNativeDesktopMain = get(devHost?.let { "${it}Main" } ?: "allNativeDesktopMain").apply {
            dependsOn(allNativeMain)
            kotlin.srcDir("src/allNativeDesktopMain/kotlin")
        }

        configure(listOf(get("linuxMain"), get("macosMain")) - allNativeDesktopMain) {
            dependsOn(allNativeDesktopMain)
        }

        val allNativeDesktopTest = get(devHost?.let { "${it}Test" } ?: "allNativeDesktopTest").apply {
            dependsOn(commonTest)
            kotlin.srcDir("src/allNativeDesktopTest/kotlin")
        }

        configure(listOf(get("linuxTest"), get("macosTest")) - allNativeDesktopTest) {
            dependsOn(allNativeDesktopTest)
        }
    }
}

afterEvaluate {
    (tasks["nodejsTestRunMocha"] as com.moowork.gradle.node.task.NodeTask).setEnvironment(mapOf("pokedex" to "$rootDir/src/main/res/raw/pokedex.json"))
    (tasks["linuxTest"] as Exec).environment("pokedex", "$rootDir/src/main/res/raw/pokedex.json")
    (tasks["macosTest"] as Exec).environment("pokedex", "$rootDir/src/main/res/raw/pokedex.json")

    tasks.withType<Test>().forEach {
        it.testLogging {
            events("passed", "skipped", "failed", "standardOut", "standardError")
        }
    }
}

//// Android :(
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:$kotlinxSerializationRuntimeVersion")
    api("org.kodein.di:kodein-di-erased-jvm:$kodeinDIVersion")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutinesVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    testImplementation("com.android.support.test:runner:1.0.2")
    testImplementation("com.android.support.test:rules:1.0.2")
}

afterEvaluate {
    tasks["testDebugUnitTest"].enabled = false
    tasks["testReleaseUnitTest"].enabled = false
}

//publishing {
//    println(publications.names.joinToString())
//    (publications.getByName("android") as MavenPublication).apply {
//        artifact("$buildDir/outputs/aar/Pokedex-KMP-release.aar") {
//            builtBy(tasks["assembleRelease"])
//            println(this.javaClass)
//        }
//
//        pom.withXml {
//            val dependenciesNode = asNode().appendNode("dependencies")
//
//            for ((scope, conf) in listOf("runtime" to configurations.implementation, "compile" to configurations.api))
//                conf.allDependencies.forEach {
//                    val dependencyNode = dependenciesNode.appendNode("dependency")
//                    dependencyNode.appendNode("groupId", it.group)
//                    dependencyNode.appendNode("artifactId", it.name)
//                    dependencyNode.appendNode("version", it.version)
//                    dependencyNode.appendNode("scope", scope)
//                }
//        }
//
//    }
//}
