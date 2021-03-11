plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.2")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2")

    androidTestImplementation ("androidx.test:runner:1.3.0")
    androidTestImplementation ("androidx.test.espresso:espresso-intents:3.3.0")

    androidTestImplementation ("androidx.test:core:1.3.0")

    androidTestImplementation ("androidx.test.ext:junit:1.1.2")

    androidTestImplementation ("androidx.test:rules:1.3.0")
    androidTestImplementation ("org.mockito:mockito-core:2.28.2")

    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("com.schibsted.spain:barista:3.9.0")
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "de.jensklingenberg.basickmm.androidApp"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}