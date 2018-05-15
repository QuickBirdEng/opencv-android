# OpenCV Android

Easy way to integrate OpenCV into your Android project via Gradle.  
**No NDK dependency needed** - just include this library and you are good to go.  

## 🚨 Breaking Changes
* OpenCV Contribution's package naming has been changed to make it as per the naming guideline.
  * **Old**: ```opencv:VERSION-contrib```
  * **New**: ```opencv-contrib:VERSION```

### 🚀 Releases
  Each versions is available in only OpenCV as well as OpenCV with contributions.

  ##### 4.x versions
  * **4.5.3.0** ‼️
  * 4.5.2
  * 4.5.1
  * 4.5.0
  * 4.4.0

  ‼️ Please use `4.5.3.0` instead of `4.5.3`. They are both the same versions, however, `4.5.3` has some runtime issues on some of the Android versions while `4.5.3.0` works fine.

  ##### 3.4.x versions
  * **3.4.15**
  * 3.4.14
  * 3.4.13
  * 3.4.12
  * 3.4.5
  * 3.4.1

## 👩‍💻 How to Integrate 🧑‍💻
* Add `mavenCentral` to your project's `build.gradle` file's **repositories** section if not already present.
```groovy
repositories {
  mavenCentral()
}
```

* Add either the normal or contributions version in the **dependencies** of your module.

``` groovy {
  // opencv
  implementation `com.quickbirdstudios:opencv:VERSION`

  // opencv with contributions
  implementation `com.quickbirdstudios:opencv-contrib:VERSION`
}
```
* Initialize OpenCV before using it.

```kotlin
if (!OpenCVLoader.initDebug())
   Log.e("OpenCV", "Unable to load OpenCV!");
else
   Log.d("OpenCV", "OpenCV loaded Successfully!");
```

## ‼️ Want to use OpenCV as source Dependency?
* Checkout the Repository. There will be an empty project with placeholder for the opencv source.
* Download the source from your desired release.
* Unzip the folder. The name of the folder will be `opencv_VERSION` or `opencv-contrib_VERSION`. Copy this folder to the project and keep it at the same level as the `app` folder.
* Open `settings.gradle` and replace the VERSION with the OpenCV version you have downloaded.
```groovy
// Remove/comment out the one you aren't going to need
include ":opencv_VERSION"
include ":opencv-contrib_VERSION"
```
* Open app/build.gradle and replace the VERSION with the OpenCV version you have downloaded

```groovy
// Remove/comment out the one you aren't going to need
implementation(project(":opencv_VERSION"))
implementation(project(":opencv-contrib_VERSION"))
```
* Sync and run the project. You should see the screen with the text `OpenCV Loaded Successfully`.

## 🛠 None of the released versions meet your requirements?
In progress 👷‍
