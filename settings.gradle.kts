pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
<<<<<<< HEAD
    plugins {
        id("com.google.devtools.ksp") version "1.9.22-1.0.17"
    }
=======
>>>>>>> 6b7478a8298a850e3f40740a79e92efe51feb9bd
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

<<<<<<< HEAD
rootProject.name = "pincheappdeclima"
=======
rootProject.name = "MiClimaApp"
>>>>>>> 6b7478a8298a850e3f40740a79e92efe51feb9bd
include(":app")
 