# ORM-APK-Size-Example

Simple apps + ORM libraries with proguard dead-code-elimination.

```
 ./gradlew assembleRelease -q
Total APK Size in app-release-unsigned.apk in bytes: 894466 # 874kb
Total APK Size in ormaapp-release-unsigned.apk in bytes: 1014550 # diff from app-release-unsigned.apk: 117kb
Total APK Size in realmapp-release-unsigned.apk in bytes: 4876247 # diff from app-release-unsigned.apk: 3888kb
```

* Orma v2.4.1
* Realm v0.88.3