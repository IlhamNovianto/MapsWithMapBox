

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
        maven{
            setUrl("https://api.mapbox.com/downloads/v2/releases/maven")
            authentication {

            }
            credentials{
                username = "mapbox"
                password = "sk.eyJ1IjoiaWxoYW05NSIsImEiOiJjbG9zcG9kZGgwMm0wMmtxMDljNmdpaGgwIn0.0nE2ObpY7eyDBNCFVorTWw"
            }
        }

    }
}

rootProject.name = "MapsWithMapBox"
include(":app")
