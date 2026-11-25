# LEVEL UP — Android MVP foundation

A native Android starter project using Kotlin and Jetpack Compose.

## Build compatibility

- JDK 17
- Android SDK Platform 36
- Android Gradle Plugin 8.13.2
- Kotlin 2.2.21
- Minimum Android version: Android 8.0 (API 26)

## Build an installable APK

### Option 1 — Android Studio

1. Open Android Studio and choose **Open**.
2. Select this `level-up-android` folder (the folder containing `settings.gradle.kts`).
3. Allow Gradle sync to finish and install any requested Android SDK components.
4. From the menu choose **Build → Build Bundle(s) / APK(s) → Build APK(s)**.
5. When the build completes, choose **Locate**. The APK is at:
   `app/build/outputs/apk/debug/app-debug.apk`

### Option 2 — GitHub Actions (build in the cloud)

1. Upload this project folder's contents to a GitHub repository.
2. Open the repository's **Actions** tab.
3. Select **Build Android APK** and press **Run workflow** (or push to `main`/`master`).
4. When the run finishes, open it and download the `LEVEL-UP-debug-apk` artifact.
5. Extract the artifact to get `app-debug.apk`.

## Install on your Android phone

Transfer `app-debug.apk` to the phone, open it, and approve **Install unknown apps** for the file manager if Android asks. Only install APKs you built yourself or trust.

## Current implementation boundary

This is an installable starter shell with the launcher identity and dark gaming visual system. The full quest, XP, skills, database, statistics, notification, and settings systems are not implemented yet. Building the APK does not add those unfinished features.
