import com.moowork.gradle.node.npm.NpmTask
import com.moowork.gradle.node.task.NodeTask
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinJsCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinOnlyTarget
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import org.jetbrains.kotlin.incremental.isJavaFile

plugins {
    id("com.android.library")
    id("kotlin-multiplatform")
    id("kotlinx-serialization")
    id("com.moowork.node")
    `maven-publish`
}

repositories {
    jcenter()
    google()
    maven(url = "http://dl.bintray.com/kotlin/kotlin-eap")
    maven(url = "https://kotlin.bintray.com/kotlinx")
    mavenLocal()
}

group = "org.kodein.sample.pokedex"
version = "1.0"

val kotlinxSerializationRuntimeVersion = "0.8.2-rc13"
val kotlinxCoroutinesVersion = "0.30.2-eap13"
val kodeinDIVersion = "5.3.0"

android {
    compileSdkVersion(27)
    buildToolsVersion("27.0.3")

    defaultConfig {
        minSdkVersion(15)
    }
}


kotlin {

//    println("====")
//    println(presets.names.joinToString())
//    println("====")

    targets.add(presets.findByName("jvm")!!.createTarget("jvm"))
    targets.add(presets.findByName("android")!!.createTarget("android"))
    targets.add(presets.findByName("js")!!.createTarget("nodejs").apply {
        val mainCompile = tasks[compilations["main"].compileKotlinTaskName] as Kotlin2JsCompile
        val testCompile = tasks[compilations["test"].compileKotlinTaskName] as Kotlin2JsCompile
        mainCompile.kotlinOptions.moduleKind = "umd"
        testCompile.kotlinOptions.moduleKind = "commonjs"

        val testDir = "$buildDir/test-js/$name"

        val nodeModules = task<Copy>("${name}TestNodeModules") {
            dependsOn(testCompile)
            into("$testDir/node_modules")
        }

        afterEvaluate {
            val classPath = testCompile.classpath + testCompile.outputFile.parentFile

            classPath
                .filter { !it.isFile }
                .forEach {
                    nodeModules.from(fileTree(it.absolutePath).matching {
                        include {
                            !it.path.startsWith("META-INF/") || it.path.startsWith("META-INF/resources/")
                        }
                    })
                }

            classPath
                .filter { it.isFile }
                .forEach {
                    nodeModules.from(zipTree(it.absolutePath).matching {
                        include {
                            !it.path.startsWith("META-INF/") || it.path.startsWith("META-INF/resources/")
                        }
                    })
                }
        }

        val installRunner = task<NpmTask>("${name}TestInstallRunner") {
            setArgs(listOf("install", "mocha"))
            setWorkingDir(file(testDir))
        }

        val runTests = task<NodeTask>("${name}RunTests") {
            dependsOn(testCompile, nodeModules, installRunner)
            setWorkingDir(file(testDir))
            setScript(file("$testDir/node_modules/mocha/bin/mocha"))
            setArgs(listOf("node_modules/" + file(testCompile.outputFile).name))
        }

        tasks["${name}Test"].dependsOn(runTests)
    })
    targets.add(presets.findByName("linuxX64")!!.createTarget("linux"))
//    targets.add(presets.findByName("macosX64")!!.createTarget("macos"))

    sourceSets.apply {
        val commonMain = getByName("commonMain") {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-common")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:$kotlinxSerializationRuntimeVersion")
                api("org.kodein.di:kodein-di-erased-common:$kodeinDIVersion")
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
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:$kotlinxSerializationRuntimeVersion")
                api("org.kodein.di:kodein-di-erased-jvm:$kodeinDIVersion")
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutinesVersion")
            }
        }

        getByName("jvmMain") {
            dependsOn(allJvmMain)
        }

        getByName("androidMain") {
            dependsOn(allJvmMain)
        }

        val allJvmTest = create("allJvmTest") {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test")
            }
        }

        getByName("jvmTest") {
            dependsOn(allJvmTest)
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test-junit")
            }
        }

        getByName("androidTest") {
            dependsOn(allJvmTest)
        }

        val allJsMain = create("allJsMain") {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-js")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:$kotlinxSerializationRuntimeVersion")
                api("org.kodein.di:kodein-di-erased-js:$kodeinDIVersion")
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:$kotlinxCoroutinesVersion")
            }
        }

        getByName("nodejsMain") {
            dependsOn(allJsMain)
        }

        getByName("nodejsTest") {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test-js")
            }
        }

        val allNativeMain = create("allNativeMain") {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:$kotlinxSerializationRuntimeVersion-local")
                api("org.kodein.di:kodein-di-erased-native:$kodeinDIVersion")
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core-native:$kotlinxCoroutinesVersion")
            }
        }

        getByName("linuxMain") {
            dependsOn(allNativeMain)
        }

        val allNativeTest = create("allNativeTest") {
            dependsOn(commonTest)
        }

        getByName("linuxTest") {
            dependsOn(allNativeTest)
        }

//        val allNativeMain = create("allNativeMain") {
//            dependsOn(allJvm)
//        }
//
//        configure(listOf("linuxMain", "macosMain", "mingwMain").map { getByName(it) }) {
//            dependsOn(allNativeMain)
//        }

//        val allDesktopTest = create("allDesktopTest") {
//            dependencies {
//                api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutinesVersion")
//            }
//        }

//        configure(listOf("linuxTest", "macosTest", "mingwTest").map { getByName(it) }) {
//            dependsOn(allDesktopTest)
//        }
    }
}

node {
    version = "10.1.0"
    download = true
}

repositories.whenObjectAdded {
    (this as? IvyArtifactRepository)?.metadataSources { artifact() }
}

afterEvaluate {
    (tasks["nodejsRunTests"] as NodeTask).setEnvironment(mapOf("pokedex" to "$rootDir/src/main/res/raw/pokedex.json"))
    (tasks["linuxTest"] as RunTestExecutable).environment("pokedex", "$rootDir/src/main/res/raw/pokedex.json")

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
    (publications) {
        "AAR"(MavenPublication::class) {
            artifact("$buildDir/outputs/aar/Pokedex-KMP-release.aar")
            artifactId = "Pokedex-KMP-android-lib"

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
}
