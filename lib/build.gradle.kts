import com.github.salomonbrys.gradle.kjs.jstests.addKotlinJSTest
import com.moowork.gradle.node.npm.NpmTask
import com.moowork.gradle.node.task.NodeTask
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinJsCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinOnlyTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeOutputKind
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeCompile
import org.jetbrains.kotlin.incremental.isJavaFile
import org.jetbrains.kotlin.konan.target.CompilerOutputKind

plugins {
    id("com.android.library")
    id("kotlin-multiplatform")
    id("kotlinx-serialization")
    id("com.github.salomonbrys.gradle.kjs.js-tests")
    `maven-publish`
}

repositories {
    mavenLocal()
    jcenter()
    google()
    maven(url = "http://dl.bintray.com/kotlin/kotlin-eap")
    maven(url = "https://kotlin.bintray.com/kotlinx")
}

group = "org.kodein.sample.pokedex"
version = "1.0"

val kotlinxSerializationRuntimeVersion = "0.8.2-rc13"
val kotlinxCoroutinesVersion = "0.30.2-eap13"
val kodeinDIVersion = "5.4.0"

android {
    compileSdkVersion(27)

    defaultConfig {
        minSdkVersion(15)
    }
}

val devHost: String? by project

kotlin {

    targets.add(presets.findByName("jvm")!!.createTarget("jvm"))
    targets.add(presets.findByName("android")!!.createTarget("android"))
    targets.add(presets.findByName("js")!!.createTarget("nodejs").apply {
        (tasks[compilations["main"].compileKotlinTaskName] as Kotlin2JsCompile).kotlinOptions.moduleKind = "umd"
        addKotlinJSTest()
    })
    targets.add(presets.findByName("js")!!.createTarget("webjs").apply {
        (tasks[compilations["main"].compileKotlinTaskName] as Kotlin2JsCompile).kotlinOptions.moduleKind = "umd"
    })
    targets.add(presets.findByName("linuxX64")!!.createTarget("linux"))
    targets.add(presets.findByName("macosX64")!!.createTarget("macos"))
    targets.add(presets.findByName("iosX64")!!.createTarget("iosSim").apply {
        (compilations["main"] as KotlinNativeCompilation).outputKind(NativeOutputKind.FRAMEWORK)
    })

    sourceSets.apply {
        val commonMain = getByName("commonMain") {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-common")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:$kotlinxSerializationRuntimeVersion")
                api("org.kodein.di:kodein-di-erased:$kodeinDIVersion")
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:$kotlinxCoroutinesVersion")
            }
            languageSettings.apply {
                progressiveMode = true
            }
        }

        val commonTest = getByName("commonTest") {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test-common")
                implementation("org.jetbrains.kotlin:kotlin-test-annotations-common")
            }
        }

        val allJvmMain = create("allJvmMain") {
            dependsOn(commonMain)
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:$kotlinxSerializationRuntimeVersion")
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutinesVersion")
            }
        }

        configure(listOf(getByName("jvmMain"), getByName("androidMain"))) {
            dependsOn(allJvmMain)
        }

        val allJvmTest = create("allJvmTest") {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test")
            }
        }

        configure(listOf(getByName("jvmTest"), getByName("androidTest"))) {
            dependsOn(allJvmTest)

            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test-junit")
            }
        }

        val allJsMain = create("allJsMain") {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-js")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:$kotlinxSerializationRuntimeVersion")
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:$kotlinxCoroutinesVersion")
            }
        }

        configure(listOf(getByName("nodejsMain"), getByName("webjsMain"))) {
            dependsOn(allJsMain)
        }

        val allJsTest = create("allJsTest") {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test-js")
            }
        }

        configure(listOf(getByName("nodejsTest"), getByName("webjsTest"))) {
            dependsOn(allJsTest)
        }

        val allNativeMain = create("allNativeMain") {
            dependsOn(commonMain)
            dependencies {
                val runtimeVersion = kotlinxSerializationRuntimeVersion + if (devHost != "macos") "-local" else ""
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:$runtimeVersion")
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core-native:$kotlinxCoroutinesVersion")
            }
        }

        getByName("iosSimMain") {
            dependsOn(allNativeMain)
        }

        val allNativeDesktopMain = (devHost?.let { getByName("${it}Main") } ?: create("allNativeDesktopMain")).apply {
            dependsOn(allNativeMain)
            kotlin.srcDir("src/allNativeDesktopMain/kotlin")
        }

        configure(listOf(getByName("linuxMain"), getByName("macosMain")) - allNativeDesktopMain) {
            dependsOn(allNativeDesktopMain)
        }

        val allNativeDesktopTest = (devHost?.let { getByName("${it}Test") } ?: create("allNativeDesktopTest")).apply {
            dependsOn(commonTest)
            kotlin.srcDir("src/allNativeDesktopTest/kotlin")
        }

        configure(listOf(getByName("linuxTest"), getByName("macosTest")) - allNativeDesktopTest) {
            dependsOn(allNativeDesktopTest)
        }
    }
}

afterEvaluate {
    (tasks["nodejsTestRunMocha"] as NodeTask).setEnvironment(mapOf("pokedex" to "$rootDir/src/main/res/raw/pokedex.json"))
    (tasks["linuxTest"] as RunTestExecutable).environment("pokedex", "$rootDir/src/main/res/raw/pokedex.json")
    (tasks["macosTest"] as RunTestExecutable).environment("pokedex", "$rootDir/src/main/res/raw/pokedex.json")

    tasks.withType<Test>().forEach {
        it.testLogging {
            events("passed", "skipped", "failed", "standardOut", "standardError")
        }
    }

}

// Android :(
dependencies {
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
}

afterEvaluate {
    tasks["testDebugUnitTest"].enabled = false
    tasks["testReleaseUnitTest"].enabled = false
}


publishing {
    publications.getByName("android").apply {
        this as MavenPublication

        artifact("$buildDir/outputs/aar/Pokedex-KMP-release.aar") {
            builtBy(tasks["assembleRelease"])
            println(this.javaClass)
        }

        pom.withXml {
            val dependenciesNode = asNode().appendNode("dependencies")

            for ((scope, conf) in listOf("runtime" to configurations.implementation, "compile" to configurations.api))
                conf.allDependencies.forEach {
                    val dependencyNode = dependenciesNode.appendNode("dependency")
                    dependencyNode.appendNode("groupId", it.group)
                    dependencyNode.appendNode("artifactId", it.name)
                    dependencyNode.appendNode("version", it.version)
                    dependencyNode.appendNode("scope", scope)
                }
        }

    }
}
