
enum class DependencyVersion(val version: String) {

    /** Android Support */
    ANDROID_CORE_KTX("1.9.0"),
    ANDROID_APPCOMPAT("1.6.1"),
    GOOGLE_MATERIAL("1.10.0"),
    CONSTRAINT_LAYOUT("2.1.4"),

    /** Test */
    JUNIT("4.13.2"),
    ANDROID_TEST_EXT_JUNIT("1.1.5"),
    ANDROID_TEST_ESPRESSO_CORE("3.5.1"),

    /** Navigation */
    NAVIGATION_FRAGMENT_KTX("2.7.3"),
    NAVIGATION_UI_KTX("2.7.3"),

    /** Retrofit */
    RETROFIT("2.9.0"),
    RETROFIT_CONVERTER_GSON("2.9.0"),
    RETROFIT_ADAPTER_RXJAVA2("2.9.0"),
    RETROFIT_CONVERTER_SCALARS("2.9.0"),

    /** Coroutines */
    COROUTINES("1.6.4"),

    /** Coroutines Play Services */
    COROUTINES_PLAY_SERVICES("1.7.3"),

    /** LifeCycle */
    LIFECYCLE("2.5.1"),

    /** Dagger-Hilt */
    DAGGER_HILT("2.48.1"),

    /** OkHttp */
    OKHTTP("4.11.0"),

    /** Room */
    ROOM("2.5.0"),

    /** Glide */
    GLIDE("4.15.0"),

    /** DataStore */
    DATA_STORE("1.0.0"),

    /** Lottie */
    LOTTIE("6.2.0"),

    /** CameraX */
    CAMERAX("1.2.0-rc01"),

    /** In App Update*/
    IN_APP_UPDATE("2.1.0"),

    /** Billing Client */
    BILLING_CLIENT("6.1.0"),

    /** One Signal */
    ONE_SIGNAL("[4.0.0, 4.99.99]"),

    /** Firebase Bom */
    FIREBASE_BOM("32.7.0"),

    /** Rounded ImageView */
    ROUNDED_IMAGEVIEW("2.3.0"),

    /** Dots Indicator */
    DOTS_INDICATOR("4.3"),

    /** Flex Box */
    FLEXBOX("3.0.0"),

    /** Joda Time */
    JODA("2.10.10"),

    /** Text Recognition */
    TEXT_RECOGNITION("19.0.0"),

    /** Language Id */
    LANGUAGE_ID("17.0.4"),

    /** Image Cropper */
    IMAGE_CROPPER("4.5.0"),

    /** Pretty Time */
    PRETTY_TIME("5.0.4.Final"),

    /** Root Beer */
    ROOT_BEER("0.1.0"),

    /** Leak Canary */
    LEAK_CANARY("2.12"),

    /** Circle ImageView*/
    CIRCLE_IMAGEVIEW("3.1.0")
}