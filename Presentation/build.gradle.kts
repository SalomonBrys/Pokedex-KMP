import com.github.salomonbrys.gradle.sass.SassTask
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

plugins {
    id("kotlin-platform-js")
    id("com.github.salomonbrys.gradle.kjs.assemble-web") version "1.0.0"
    id("com.github.salomonbrys.gradle.sass") version "1.0.0"
}

repositories {
    mavenLocal()
    jcenter()
    maven(url = "http://dl.bintray.com/kotlin/kotlin-eap")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-js")
    implementation("org.webjars.bower:reveal.js:3.5.0")
    implementation("org.webjars.bower:highlightjs:9.12.0")
    implementation("com.github.salomonbrys.revealkt:revealkt:1.0")
}

(tasks["compileKotlin2Js"] as Kotlin2JsCompile).apply {
//    kotlinOptions.outputFile = "${projectDir}/web/out/${project.name}.js"
    kotlinOptions.sourceMap = true
    kotlinOptions.sourceMapEmbedSources = "always"
}

(tasks["sassCompile"] as SassTask).apply {
    outputDir = file("$buildDir/web/css")
}

val copyHtml = task<Sync>("copyHtml") {
    group = "build"
    from("src/main/html")
    into("$buildDir/web")
    preserve {
        include("kjs/**")
        include("css/**")
    }
}
tasks["assemble"].dependsOn(copyHtml)

