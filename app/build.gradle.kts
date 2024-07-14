plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("org.jlleitschuh.gradle.ktlint") version "11.5.1"
}

android {
    namespace = "com.example.gamenews"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.gamenews"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    ktlint {
        version.set("0.45.2")
//        debug.set(true)
//        verbose.set(true)
        android.set(false)
        outputToConsole.set(true)
        ignoreFailures.set(false)
//        enableExperimentalRules.set(false)
//        additionalEditorconfigFile.set(file("path/to/.editorconfig"))
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
