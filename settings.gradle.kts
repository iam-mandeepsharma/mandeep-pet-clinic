pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}
// this is domain script lanuage
dependencyResolutionManagement {
    repositories {
        mavenCentral()

    }
}


rootProject.name = "mandeep-pet-clinic"
include(":pet-clinic-data")
include(":pet-clinic-web")
