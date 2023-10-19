pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://storage.zego.im/maven") }   // <- Update this line with '='.
        maven { url = uri("https://www.jitpack.io") } // <- Update this line with '='.
    }
}

rootProject.name = "Voip"
include(":app")
 