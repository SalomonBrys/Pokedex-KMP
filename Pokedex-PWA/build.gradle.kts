import com.github.salomonbrys.gradle.sass.SassExtension
import com.github.salomonbrys.gradle.sass.SassTask
import org.jetbrains.kotlin.gradle.frontend.webpack.WebPackBundler
import org.jetbrains.kotlin.gradle.frontend.webpack.WebPackExtension
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

plugins {
    id("kotlin-platform-js")
    id("org.jetbrains.kotlin.frontend") version "0.0.37"
//    id("com.github.salomonbrys.gradle.kjs.assemble-web") version "1.0.0"
    id("com.github.salomonbrys.gradle.sass") version "1.0.0"
}

group = "org.kodein.sample.pokedex.pwa"
version = "1.0"

repositories {
    mavenLocal()
    maven( url = "http://dl.bintray.com/kotlin/kotlin-eap")
    maven( url = "https://kotlin.bintray.com/kotlin-js-wrappers")
    jcenter()
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib-js")
    compile("org.jetbrains.kotlin:kotlin-test-js")
    compile("org.jetbrains:kotlin-react-dom:16.5.2-pre.55-kotlin-1.2.71")
    compile("org.jetbrains:kotlin-react-router-dom:4.3.1-pre.55-kotlin-1.2.71")
    compile("org.kodein.sample.pokedex:Pokedex-KMP-webjs:1.0")
    compile("org.kodein.di:kodein-di-core:5.3.0")
    compile("org.kodein.di:kodein-di-erased:5.3.0")
}

(tasks["compileKotlin2Js"] as Kotlin2JsCompile).apply {
    kotlinOptions.moduleKind = "commonjs"
    kotlinOptions.sourceMap = true
    kotlinOptions.metaInfo = true
}

(tasks["sassCompile"] as SassTask).apply {
    outputDir = file("$buildDir/web/css")
}

kotlinFrontend {
    bundlesDirectory = "$buildDir/web/bundle"

    npm {
        dependency("react")
        dependency("react-dom")
        dependency("react-router")
        dependency("react-router-dom")
    }

    bundle<WebPackExtension>("webpack") {
        this as WebPackExtension
        bundleName = "pokedex"
        sourceMapEnabled = true
    }
}

val copyHtml = task<Sync>("copyHtml") {
    group = "build"
    from("src/main/html")
    into("$buildDir/web")
}
tasks["build"].dependsOn(copyHtml)

tasks["build"].dependsOn("bundle")