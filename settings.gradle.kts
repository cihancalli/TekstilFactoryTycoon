pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven(url = "https://github.com/jitsi/jitsi-maven-repository/raw/master/releases")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
        maven(url = "https://github.com/jitsi/jitsi-maven-repository/raw/master/releases")
        maven(url = "https://maven.google.com")


    }
}

rootProject.name = "TekstilFactoryTycoon"
include(":app")
include(":core")
