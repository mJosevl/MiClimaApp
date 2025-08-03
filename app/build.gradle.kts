<<<<<<< HEAD
import org.jetbrains.kotlin.gradle.plugin.ide.kotlinExtrasSerialization

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
   // id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.pincheappdeclima"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.pincheappdeclima"
        minSdk = 24
        targetSdk = 36
=======
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.miclimaapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.miclimaapp"
        minSdk = 24
        targetSdk = 35
>>>>>>> 6b7478a8298a850e3f40740a79e92efe51feb9bd
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
<<<<<<< HEAD

=======
>>>>>>> 6b7478a8298a850e3f40740a79e92efe51feb9bd
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
<<<<<<< HEAD
    buildFeatures {
        compose = true
    }
    buildFeatures{
        viewBinding = true
    }
=======
>>>>>>> 6b7478a8298a850e3f40740a79e92efe51feb9bd
}

dependencies {

<<<<<<< HEAD

    implementation(libs.androidx.core.ktx)
    //implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.room.common)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)



    // Retrofit para API calls
    implementation(libs.retrofit)
    implementation(libs.converter.gson)

    // Coroutines
    implementation(libs.kotlinx.coroutines.android)

    // Location Services
    implementation(libs.play.services.location)

    // Lifecycle
    implementation(libs.androidx.lifecycle.runtime.ktx)

    // RecyclerView
    implementation(libs.androidx.recyclerview)

    // ---- Room (Base de datos) ----
    implementation("androidx.room:room-runtime:2.7.2")
    // Para usar 'suspend' en los DAOs (Coroutines)
    implementation("androidx.room:room-ktx:2.7.2")
    // Procesador de anotaciones de Room (usando ksp)
    //ksp("androidx.room:room-compiler:2.7.2")


    // Location Services
    implementation("com.google.android.gms:play-services-location:21.3.0")

=======
    // Retrofit y JSON
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Corrutinas
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // Lifecycle y ViewModel (opcional pero recomendado)
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")

    // RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
>>>>>>> 6b7478a8298a850e3f40740a79e92efe51feb9bd
}