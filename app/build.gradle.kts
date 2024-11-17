plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
    id("com.google.devtools.ksp")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = BuildAndroidConfig.applicationId
    compileSdk = BuildAndroidConfig.compileSdk

    defaultConfig {
        applicationId = BuildAndroidConfig.applicationId
        minSdk = BuildAndroidConfig.minSdk
        targetSdk = BuildAndroidConfig.targetSdk
        versionCode = BuildAndroidConfig.versionCode
        versionName = BuildAndroidConfig.versionName

        testInstrumentationRunner = BuildAndroidConfig.testInstrumentationRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            isDebuggable = true
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    viewBinding {
        enable = true
    }
    buildFeatures {
        buildConfig = true
    }
    kapt {
        correctErrorTypes = true
    }
}

dependencies {

    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")
    androidSupport()
    tests()
    material()
    constraintLayout()
    navigation()
    retrofit()
    coroutines()
    lifeCycle()
    daggerHilt()
    room()
    okHttp()
    glide()
    dataStore()
    lottie()
    dotsIndicator()
    firebase()
    circleImageView()

    /** Jitsi */
    implementation("org.jitsi.react:jitsi-meet-sdk:+") {
        isTransitive = true
    }


    /** Module */
    core()
}