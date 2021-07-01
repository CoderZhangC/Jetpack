package config

import config.Version.kotlin_version

/**
 * @author ZC
 * @date 2021/7/1
 * desc:
 */
object AndroidDependencies {

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    const val core_ktx = "androidx.core:core-ktx:1.3.1"
    const val appcompat = "androidx.appcompat:appcompat:1.2.0"
    const val material = "com.google.android.material:material:1.2.1"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.1"
}