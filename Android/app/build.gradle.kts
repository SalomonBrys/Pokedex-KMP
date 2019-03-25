plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "org.kodein.sample.pokedex"
        minSdkVersion(15)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7")
    implementation("com.android.support:appcompat-v7:28.0.0")
    implementation("com.android.support.constraint:constraint-layout:1.1.3")
    implementation("com.github.bumptech.glide:glide:4.8.0")

    implementation("org.kodein.di:kodein-di-core-jvm:6.0.0")
    implementation("org.kodein.di:kodein-di-erased-jvm:6.0.0")
    implementation("org.kodein.di:kodein-di-framework-android-core:6.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:0.30.2-eap13")

    implementation("org.kodein.sample.pokedex:Pokedex-KMP-android:1.0")

    testImplementation("junit:junit:4.12")
    androidTestImplementation("com.android.support.test:runner:1.0.2")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2")
    implementation("com.android.support:recyclerview-v7:28.0.0")
}
