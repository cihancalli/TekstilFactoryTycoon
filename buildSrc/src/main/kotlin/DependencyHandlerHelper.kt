import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

fun DependencyHandler.core(){
    implementation(project(":core"))
}

fun DependencyHandler.androidSupport() {
    with(BuildDependencies.AndroidSupport){
        implementation(appCompat,coreKtx)
    }
}

fun DependencyHandler.constraintLayout(){
    with(BuildDependencies.Constraint){
        implementation(constraintLayout)
    }
}

fun DependencyHandler.material() {
    with(BuildDependencies.Google){
        implementation(material)
    }
}

fun DependencyHandler.tests() {
    with(BuildDependencies.Tests){
        testImplementation(jUnit)
        androidTestImplementation(testExtUnit)
        androidTestImplementation(espressoCore)
    }
}

fun DependencyHandler.navigation(){
    with(BuildDependencies.Navigation){
        implementation(fragmentKtx, uiKtx)
    }
}

fun DependencyHandler.retrofit(){
    with(BuildDependencies.Retrofit){
        implementation(retrofit, retrofitConverterGson, retrofitAdapterRxJava2, retrofitConverterScalars)
    }
}

fun DependencyHandler.coroutines(){
    with(BuildDependencies.Coroutines){
        implementation(coroutinesCore, coroutinesAndroid, coroutinesPlayServices)
    }
}

fun DependencyHandler.lifeCycle(){
    with(BuildDependencies.LifeCycle){
        implementation(lifeCycleViewModel, lifeCycleRuntime, lifeCycleLiveData)
    }
}

fun DependencyHandler.daggerHilt(){
    with(BuildDependencies.DaggerHilt) {
        implementation(daggerHilt)
        kapt(daggerHiltCompiler)
    }
}

fun DependencyHandler.glide(){
    implementation(BuildDependencies.Glide.glide)
}

fun DependencyHandler.room(){
    with(BuildDependencies.Room) {
        implementation(roomRunTime, roomKtx)
        ksp(roomCompiler)
    }
}

fun DependencyHandler.dataStore(){
    implementation(BuildDependencies.DataStore.dataStore)
}
fun DependencyHandler.lottie(){
    implementation(BuildDependencies.Lottie.lottie)
}

fun DependencyHandler.cameraX(){
    with(BuildDependencies.CameraX) {
        implementation(cameraCore, camera2, cameraView, cameraLifeCycle, cameraExtensions)
    }
}

fun DependencyHandler.inAppUpdate(){
    with(BuildDependencies.InAppUpdate) {
        implementation(appUpdate, appUpdateKtx)
    }
}

fun DependencyHandler.billingClient(){
    with(BuildDependencies.BillingClient) {
        implementation(billingClient, billingClientKtx)
    }
}

fun DependencyHandler.okHttp(){
    with(BuildDependencies.OkHttp) {
        implementation(platform(okHttpBom), okHttp, okHttpLogging)
    }
}

fun DependencyHandler.oneSignal(){
    implementation(BuildDependencies.OneSignal.oneSignal)
}

fun DependencyHandler.roundedImageView(){
    implementation(BuildDependencies.RoundedImageView.roundedImageView)
}

fun DependencyHandler.dotsIndicator(){
    implementation(BuildDependencies.DotsIndicator.dotsIndicator)
}

fun DependencyHandler.flexBox(){
    implementation(BuildDependencies.FlexBox.flexBox)
}

fun DependencyHandler.joda(){
    implementation(BuildDependencies.Joda.joda)
}
fun DependencyHandler.mlKit(){
    with(BuildDependencies.MlKit){
        implementation(textRecognition,languageId)
    }
}

fun DependencyHandler.imageCropper(){
    implementation(BuildDependencies.ImageCropper.imageCropper)
}

fun DependencyHandler.prettyTime(){
    implementation(BuildDependencies.PrettyTime.prettyTime)
}

fun DependencyHandler.rootBeer(){
    implementation(BuildDependencies.RootBeer.rootBeer)
}

fun DependencyHandler.firebase(){
    with(BuildDependencies.FireBase){
        implementation(platform(firebaseBom),crashlytics,analytics, fireStore)
    }
}

fun DependencyHandler.leakCanary(){
    debugImplementation(BuildDependencies.LeakCanary.leakCanary)
}

fun DependencyHandler.circleImageView(){
    implementation(BuildDependencies.CircleImageView.circleImageView)
}