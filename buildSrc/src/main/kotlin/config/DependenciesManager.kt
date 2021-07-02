package config

import config.VersionManager.kotlin_version

/**
 * @author ZC
 * @date 2021/7/1
 * desc:
 */
object DependenciesManager {

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    const val core_ktx = "androidx.core:core-ktx:1.3.1"
    const val appcompat = "androidx.appcompat:appcompat:1.2.0"
    const val material = "com.google.android.material:material:1.2.1"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.0-alpha3"

    const val okhttp = "com.squareup.okhttp3:okhttp:4.9.0"
    const val rxjava = "io.reactivex.rxjava2:rxjava:2.2.14"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
    const val cookieJar = "com.github.franmontiel:PersistentCookieJar:v1.0.1"
    const val baseQuickAdapter = "com.github.CymChad:BaseRecyclerViewAdapterHelper:2.9.50"
    const val eventBus = "org.greenrobot:eventbus:3.2.0"

    const val aviUi = "com.wang.avi:library:2.1.3"
    const val banner = "cn.bingoogolapple:bga-banner:2.2.7"
    const val magic = "com.github.hackware1993:MagicIndicator:1.6.0"
    const val easypermissions = "pub.devrel:easypermissions:3.0.0"
    const val labelsView = "com.github.donkingliang:LabelsView:1.6.1"
    const val rxPermission = "com.github.tbruyelle:rxpermissions:0.12"
    const val shadow = "com.github.lihangleo2:ShadowLayout:3.1.3"

    val retrofit = Retrofit
    object Retrofit {
        private const val retrofit_version = "2.9.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofit_version"
        const val scalars = "com.squareup.retrofit2:converter-scalars:$retrofit_version"
        const val gson = "com.squareup.retrofit2:converter-gson:$retrofit_version"
    }

    val glide = Glide
    object Glide {
        const val glide = "com.github.bumptech.glide:glide:4.11.0"
        const val transformations = "jp.wasabeef:glide-transformations:4.1.0"
    }

    val smart = Smart
    object Smart {
        private const val smart_version = "1.1.2"
        const val smart = "com.scwang.smartrefresh:SmartRefreshLayout:$smart_version"
        const val head = "com.scwang.smartrefresh:SmartRefreshHeader:$smart_version"
    }

    const val kotlinVersion = "1.5.0"
    const val jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"

    val coroutines = Coroutines
    object Coroutines {
        private const val coroutines_version = "1.3.7"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_version"
    }

    const val coreKtx           = "androidx.core:core-ktx:1.3.1"
    const val legacy            = "androidx.legacy:legacy-support-v4:1.0.0"
    const val paging            = "androidx.paging:paging-runtime:2.1.2"
    const val viewpager2        = "androidx.viewpager2:viewpager2:1.1.0-alpha01"
    const val multidex          = "com.android.support:multidex:1.0.3"

    val lifecycle = Lifecycle
    object Lifecycle {
        private const val lifecycle_version = "2.2.0"
        const val extensions    = "androidx.lifecycle:lifecycle-extensions:$lifecycle_version"
        const val liveDataKtx   = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
        const val commonJava8   = "androidx.lifecycle:lifecycle-common-java8:$lifecycle_version"
        const val viewModelKtx  = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    }

    val navigation = Navigation
    object Navigation {
        private const val navigation_version = "2.3.0"
        const val fragmentKtx   = "androidx.navigation:navigation-fragment-ktx:$navigation_version"
        const val uiKtx         = "androidx.navigation:navigation-ui-ktx:$navigation_version"
    }

    val room = Room
    object Room {
        private const val room_version = "2.2.3"
        const val roomRuntime   = "androidx.room:room-runtime:$room_version"
        const val roomCompiler  = "androidx.room:room-compiler:$room_version"
        const val roomKtx       = "androidx.room:room-ktx:$room_version"
    }
}