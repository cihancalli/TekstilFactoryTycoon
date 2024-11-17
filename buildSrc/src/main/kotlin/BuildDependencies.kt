import org.gradle.api.artifacts.dsl.DependencyHandler

object BuildDependencies {

    object Tests {
        inline val jUnit get() = "junit:junit:${DependencyVersion.JUNIT.version}"
        inline val testExtUnit get() = "androidx.test.ext:junit:${DependencyVersion.ANDROID_TEST_EXT_JUNIT.version}"
        inline val espressoCore get() = "androidx.test.espresso:espresso-core:${DependencyVersion.ANDROID_TEST_ESPRESSO_CORE.version}"
    }

    object AndroidSupport {
        inline val appCompat get() = "androidx.appcompat:appcompat:${DependencyVersion.ANDROID_APPCOMPAT.version}"
        inline val coreKtx get() = "androidx.core:core-ktx:${DependencyVersion.ANDROID_CORE_KTX.version}"
    }

    object Navigation {
        inline val fragmentKtx get() = "androidx.navigation:navigation-fragment-ktx:${DependencyVersion.NAVIGATION_FRAGMENT_KTX.version}"
        inline val uiKtx get() = "androidx.navigation:navigation-ui-ktx:${DependencyVersion.NAVIGATION_UI_KTX.version}"

    }

    object Constraint {
        inline val constraintLayout get() = "androidx.constraintlayout:constraintlayout:${DependencyVersion.CONSTRAINT_LAYOUT.version}"
    }

    object Google {
        val material get() = "com.google.android.material:material:${DependencyVersion.GOOGLE_MATERIAL.version}"
    }

    object Retrofit {
        inline val retrofit get() = "com.squareup.retrofit2:retrofit:${DependencyVersion.RETROFIT.version}"
        inline val retrofitConverterGson get() = "com.squareup.retrofit2:converter-gson:${DependencyVersion.RETROFIT_CONVERTER_GSON.version}"
        inline val retrofitAdapterRxJava2 get() = "com.squareup.retrofit2:adapter-rxjava2:${DependencyVersion.RETROFIT_ADAPTER_RXJAVA2.version}"
        inline val retrofitConverterScalars get() = "com.squareup.retrofit2:converter-scalars:${DependencyVersion.RETROFIT_CONVERTER_SCALARS.version}"
    }

    object Coroutines {
        inline val coroutinesCore get() = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${DependencyVersion.COROUTINES.version}"
        inline val coroutinesAndroid get() = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${DependencyVersion.COROUTINES.version}"
        inline val coroutinesPlayServices
            get() = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${DependencyVersion.COROUTINES_PLAY_SERVICES.version}"
    }

    object LifeCycle {
        inline val lifeCycleViewModel get() = "androidx.lifecycle:lifecycle-viewmodel-ktx:${DependencyVersion.LIFECYCLE.version}"
        inline val lifeCycleRuntime get() = "androidx.lifecycle:lifecycle-runtime-ktx:${DependencyVersion.LIFECYCLE.version}"
        inline val lifeCycleLiveData get() = "androidx.lifecycle:lifecycle-livedata-ktx:${DependencyVersion.LIFECYCLE.version}"
    }

    object DaggerHilt {
        inline val daggerHilt get() = "com.google.dagger:hilt-android:${DependencyVersion.DAGGER_HILT.version}"
        inline val daggerHiltCompiler get() = "com.google.dagger:hilt-compiler:${DependencyVersion.DAGGER_HILT.version}"
        inline val daggerHiltAgp get() = "com.google.dagger:hilt-android-gradle-plugin:${DependencyVersion.DAGGER_HILT.version}"
    }

    object Glide {
        inline val glide get() = "com.github.bumptech.glide:glide:${DependencyVersion.GLIDE.version}"
    }

    object Room {
        inline val roomRunTime get() = "androidx.room:room-runtime:${DependencyVersion.ROOM.version}"
        inline val roomCompiler get() = "androidx.room:room-compiler:${DependencyVersion.ROOM.version}"
        inline val roomKtx get() = "androidx.room:room-ktx:${DependencyVersion.ROOM.version}"
    }

    object DataStore {
        inline val dataStore get() = "androidx.datastore:datastore-preferences:${DependencyVersion.DATA_STORE.version}"
    }

    object Lottie {
        inline val lottie get() = "com.airbnb.android:lottie:${DependencyVersion.LOTTIE.version}"
    }

    object CameraX {
        inline val cameraCore get() = "androidx.camera:camera-core:${DependencyVersion.CAMERAX.version}"
        inline val camera2 get() = "androidx.camera:camera-camera2:${DependencyVersion.CAMERAX.version}"
        inline val cameraView get() = "androidx.camera:camera-view:${DependencyVersion.CAMERAX.version}"
        inline val cameraLifeCycle get() = "androidx.camera:camera-lifecycle:${DependencyVersion.CAMERAX.version}"
        inline val cameraExtensions get() = "androidx.camera:camera-extensions:${DependencyVersion.CAMERAX.version}"
    }

    object BillingClient {
        inline val billingClient get() = "com.android.billingclient:billing:${DependencyVersion.BILLING_CLIENT.version}"
        inline val billingClientKtx get() = "com.android.billingclient:billing-ktx:${DependencyVersion.BILLING_CLIENT.version}"
    }

    object InAppUpdate {
        inline val appUpdate get() = "com.google.android.play:app-update:${DependencyVersion.IN_APP_UPDATE.version}"
        inline val appUpdateKtx get() = "com.google.android.play:app-update-ktx:${DependencyVersion.IN_APP_UPDATE.version}"
    }

    object OkHttp {
        inline val okHttpBom get() = "com.squareup.okhttp3:okhttp-bom:${DependencyVersion.OKHTTP.version}"
        inline val okHttp get() = "com.squareup.okhttp3:okhttp"
        inline val okHttpLogging get() = "com.squareup.okhttp3:logging-interceptor"
    }

    object OneSignal {
        inline val oneSignal get() = "com.onesignal:OneSignal:${DependencyVersion.ONE_SIGNAL.version}"
    }

    object FireBase {
        inline val firebaseBom get() = "com.google.firebase:firebase-bom:${DependencyVersion.FIREBASE_BOM.version}"
        inline val crashlytics get() = "com.google.firebase:firebase-crashlytics"
        inline val analytics get() = "com.google.firebase:firebase-analytics"
        inline val fireStore get() = "com.google.firebase:firebase-firestore"
    }

    object RoundedImageView {
        inline val roundedImageView get() = "com.makeramen:roundedimageview:${DependencyVersion.ROUNDED_IMAGEVIEW.version}"
    }

    object DotsIndicator {
        inline val dotsIndicator get() = "com.tbuonomo:dotsindicator:${DependencyVersion.DOTS_INDICATOR.version}"
    }

    object FlexBox {
        inline val flexBox get() = "com.google.android.flexbox:flexbox:${DependencyVersion.FLEXBOX.version}"
    }

    object Joda {
        inline val joda get() = "joda-time:joda-time:${DependencyVersion.JODA.version}"
    }

    object MlKit {
        inline val textRecognition
            get() = "com.google.android.gms:play-services-mlkit-text-recognition:${DependencyVersion.TEXT_RECOGNITION.version}"
        inline val languageId get() = "com.google.mlkit:language-id:${DependencyVersion.LANGUAGE_ID.version}"
    }

    object ImageCropper {
        inline val imageCropper get() = "com.vanniktech:android-image-cropper:${DependencyVersion.IMAGE_CROPPER.version}"
    }

    object PrettyTime {
        inline val prettyTime get() = "org.ocpsoft.prettytime:prettytime:${DependencyVersion.PRETTY_TIME.version}"
    }

    object RootBeer {
        inline val rootBeer get() = "com.scottyab:rootbeer-lib:${DependencyVersion.ROOT_BEER.version}"
    }

    object LeakCanary{
        inline val leakCanary get() = "com.squareup.leakcanary:leakcanary-android:${DependencyVersion.LEAK_CANARY.version}"
    }

    object CircleImageView{
        inline val circleImageView get() = "de.hdodenhof:circleimageview:${DependencyVersion.CIRCLE_IMAGEVIEW.version}"
    }

}