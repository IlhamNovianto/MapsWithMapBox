// set SECRET API KEY from Local.Properties
val localProperties = java.util.Properties()
file("local.properties").inputStream().use { localProperties.load(it) }


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
                password = localProperties.getProperty("API_SECRET")
            }
        }


    }
}

rootProject.name = "MapsWithMapBox"

include(":app")
