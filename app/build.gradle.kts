plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
}

android {
    namespace = "vn.edu.tlu.sv2051060680"
    compileSdk = 34

    defaultConfig {
        applicationId = "vn.edu.tlu.sv2051060680"
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
        sourceCompatibility = JavaVersion.VERSION_17 // Đặt ở đây
        targetCompatibility = JavaVersion.VERSION_17 // Đặt ở đây
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    testImplementation(libs.junit)
    implementation("androidx.room:room-runtime:2.5.2")
    kapt("androidx.room:room-compiler:2.5.2")

    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17)) // Đảm bảo phiên bản này là 17
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17" // Đặt ở đây
    }
}

tasks.withType<JavaCompile> {
    sourceCompatibility = "17" // Đặt ở đây
    targetCompatibility = "17" // Đặt ở đây
}
