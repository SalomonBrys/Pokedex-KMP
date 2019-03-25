plugins {
    id("org.jetbrains.kotlin.platform.js")
    id("org.jetbrains.kotlin.frontend") version "0.0.37"
    id("com.github.salomonbrys.gradle.sass") version "1.2.0"
}

group = "org.kodein.sample.pokedex.pwa"
version = "1.0"

repositories {
    mavenLocal()
    maven(url = "https://kotlin.bintray.com/kotlinx")
    maven( url = "https://kotlin.bintray.com/kotlin-js-wrappers")
    maven(url = "https://dl.bintray.com/kodein-framework/Kodein-DI")
    jcenter()
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib-js")
    compile("org.jetbrains:kotlin-react-dom:16.6.0-pre.59-kotlin-1.3.0")
    compile("org.jetbrains:kotlin-react-router-dom:4.3.1-pre.59-kotlin-1.3.0")
    compile("org.kodein.sample.pokedex:Pokedex-KMP-webjs:1.0")
    compile("org.kodein.di:kodein-di-core:6.1.0")
    compile("org.kodein.di:kodein-di-erased:6.1.0")
}

val compileKotlin2Js: org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile by tasks
compileKotlin2Js.apply {
    kotlinOptions.moduleKind = "commonjs"
    kotlinOptions.sourceMap = true
    kotlinOptions.metaInfo = true
}


sassCompile {
    outputDir = file("$buildDir/web/css")
    style = compressed
}

sass {
    download()
}

kotlinFrontend {
    bundlesDirectory = "$buildDir/web/bundle"

    npm {
        dependency("react")
        dependency("react-dom")
        dependency("react-router")
        dependency("react-router-dom")
    }

    bundle<org.jetbrains.kotlin.gradle.frontend.webpack.WebPackExtension>("webpack") {
        this as org.jetbrains.kotlin.gradle.frontend.webpack.WebPackExtension
        bundleName = "pokedex"
        sourceMapEnabled = true
    }
}

val copyHtml = task<Sync>("copyHtml") {
    group = "build"
    from("src/main/html")
    into("$buildDir/web")
    preserve {
        include("bundle/**")
        include("css/**")
    }
}
tasks["build"].dependsOn(copyHtml)

tasks["build"].dependsOn("bundle")
