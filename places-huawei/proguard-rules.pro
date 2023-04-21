# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in F:\Android\sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}
#Model
# HMS Core classes
-ignorewarnings
-keepattributes Exceptions
-keep class com.huawei.agconnect.**{*;}
-keep class com.hianalytics.android.**{*;}
-keep class com.huawei.updatesdk.**{*;}
-keep class com.huawei.hms.**{*;}

# HMS Remote Config
-keep class com.huawei.agconnect.remoteconfig.*{*;}
-keepclassmembers class **{
    public <init>(android.content.Context,com.huawei.agconnect.AGConnectInstance);
}
-keepclassmembers class com.huawei.agconnect.remoteconfig.internal.server.**{*;}
-keep class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}