# opencv-android
Easy way to integrate OpenCv into your Android project via Gradle.  
**No NDK dependency needed** - just include this library and you are good to go.  
  
  
Include one of this depencencies in your module's build.gradle **dependencies** section

```groovy
dependencies {

  // opencv 3.4.1
  implementation 'com.quickbirdstudios:opencv:3.4.1'
  
  // opencv 3.4.4 with contribution packages
  implementation 'com.quickbirdstudios:opencv:3.4.4-contrib'
  
  // opencv 3.4.5
  implementation 'com.quickbirdstudios:opencv:3.4.5'
 
  // opencv 4.0.1
  implementation 'com.quickbirdstudios:opencv:4.0.1'
  
  // opencv 4.1.0
  implementation 'com.quickbirdstudios:opencv:4.1.0'
}
```

and this in your project's build.gradle **repositories** section
```groovy
repositories {
  jcenter()
}
```

Don't forget to also initializie OpenCV with a statement like this e.g. in your Application class:
```kotlin
if (!OpenCVLoader.initDebug())
   Log.d("ERROR", "Unable to load OpenCV");
else
   Log.d("SUCCESS", "OpenCV loaded");
```

