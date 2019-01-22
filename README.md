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
  
  // opencv 4.0.1
  implementation 'com.quickbirdstudios:opencv:4.0.1'
}
```

and this in your project's build.gradle **repositories** section
```
repositories {
  jcenter()
}
```

