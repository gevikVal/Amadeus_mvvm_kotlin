/*
 * Copyright (c) 2018. Faraday&Future
 * All rights reserved.
 * PROPRIETARY AND CONFIDENTIAL.
 * NOTICE: All information contained herein is, and remains the property of Faraday&Future Inc.
 * The intellectual and technical concepts contained herein are proprietary to Faraday&Future Inc.
 * and may be covered by U.S. and Foreign Patents, patents in process, and are protected
 * by trade secret and copyright law. Dissemination of this code or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained from Faraday&Future Inc.
 * Access to the source code contained herein is hereby forbidden to anyone except current
 * Faraday&Future Inc. employees or others who have executed Confidentiality and
 * Non-disclosure agreements covering such access.
 */

object Modules {
    const val domain = ":com.example.gevikvalijani.domain"
    const val data = ":com.example.gevikvalijani.data"
    const val iovcloud = ":iovcloud"
}

object Releases {
    const val version_code = 1
    const val version_name = "1.0"
}

object Versions {
    const val gradle = "3.1.3"
    const val compile_sdk = 28
    const val min_sdk = 21
    const val target_sdk = 28

    const val kotlin = "1.2.51"
    const val ktx = "0.1"
    const val inject = "1"
    const val support = "27.1.0"
    const val auth = "12.0.0"
    const val timber = "4.7.0"
    const val rxJava = "2.2.0"
    const val rxandroid = "2.0.2"
    const val rxkotlin = "2.2.0"
    const val retrofit = "2.2.0"
    const val okhttp3 = "3.9.0"
    const val okio = "1.13.0"
    const val logging_interceptor = "3.10.0"
    const val dagger = "2.15"
    const val glide = "4.6.1"
    const val moshi = "1.5.0"
    const val gson = "2.8.5"
    const val lifecycle = "1.1.1"
    const val ktlint = "0.25.1"
    const val facebook = "[4,5)"

    const val ibphonenumber = "8.8.1"
    const val parceler= "1.1.9"

    const val junit = "4.12"
    const val android_test_runner = "1.0.2"
    const val android_test_espresso = "3.0.2"
    const val mockito_kotlin = "1.5.0"
    const val protobuf = "2.6.1"
    const val event_bus = "3.1.1"
    const val layer_cache = "0.2.0"
    const val serialization = "0.6.0"
    const val fabric = "1.25.3"
    const val play_service = "12.0.1"
    const val constraint_layout = "1.1.3"
    const val smart_location = "3.3.3"
    const val smart_location_rx = "3.3.1"
    const val maven_gradle_plugin = "2.0"
    const val rx_keyboard_detector = "0.1.2"
    const val threetenabp = "1.1.0"
    const val iovcloud_vehicle_properties = "0.21.0"
    const val rx_permission = "0.10.2"
}

object Libraries {
    const val inject = "javax.inject:javax.inject:${Versions.inject}"

    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"
    const val ktlint = "com.github.shyiko:ktlint:${Versions.ktlint}"
    const val auth = "com.google.android.gms:play-services-auth:${Versions.auth}"
    const val facebook = "com.facebook.android:facebook-android-sdk:${Versions.facebook}"
    const val ibphonenumber = "com.googlecode.libphonenumber:libphonenumber:${Versions.ibphonenumber}"
    const val parceler = "org.parceler:parceler:${Versions.parceler}"
    const val parceler_api = "org.parceler:parceler-api:${Versions.parceler}"

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val rxandroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxandroid}"
    const val rxkotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxkotlin}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val rxjava_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val gson_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val moshi_converter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val okhttp3 = "com.squareup.okhttp3:okhttp:${Versions.okhttp3}"
    const val okio =  "com.squareup.okio:okio:${Versions.okio}"
    const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.logging_interceptor}"


    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val dagger_android_processor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    const val dagger_android_support = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val dagger_android = "com.google.dagger:dagger-android:${Versions.dagger}"


    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val moshi_kotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val protobuf = "com.google.protobuf:protobuf-java:${Versions.protobuf}"

    const val event_bus = "org.greenrobot:eventbus:${Versions.event_bus}"
    const val event_bus_annotation_processor = "org.greenrobot:eventbus-annotation-processor:${Versions.event_bus}"
    const val layer_cache = "com.appmattus:layercache:${Versions.layer_cache}"
    const val layer_cache_android = "com.appmattus:layercache-android:${Versions.layer_cache}"
    const val layer_cache_serializer = "com.appmattus:layercache-serializer:${Versions.layer_cache}"
    const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.serialization}"
    const val databinding_compiler = "com.android.databinding:compiler:${Versions.gradle}"
    const val play_service_location = "com.google.android.gms:play-services-location:${Versions.play_service}"
    const val smart_location = "io.nlopez.smartlocation:library:${Versions.smart_location}"
    const val smart_location_rx = "io.nlopez.smartlocation:rx:${Versions.smart_location_rx}"
    const val rx_keyboard_detector = "com.github.Kyash:rx-keyboard-detector:${Versions.rx_keyboard_detector}"
    const val threetenabp = "com.jakewharton.threetenabp:threetenabp:${Versions.threetenabp}"
    const val iovcloud_vehicle_properties = "com.ff.iovcloud:vehicle-properties:${Versions.iovcloud_vehicle_properties}"
    const val rx_permission = "com.github.tbruyelle:rxpermissions:${Versions.rx_permission}"
}

object Architectures {
    const val lifecycle_runtime = "android.arch.lifecycle:runtime:$${Versions.lifecycle}"
    const val lifecycle_extensions = "android.arch.lifecycle:extensions:${Versions.lifecycle}"
    const val lifecycle_compiler = "android.arch.lifecycle:compiler:${Versions.lifecycle}"
}

object SupportLibraries {
    const val support_annotation = "com.android.support:support-annotations:${Versions.support}"
    const val appcompat_v7 = "com.android.support:appcompat-v7:${Versions.support}"
    const val design = "com.android.support:design:${Versions.support}"
    const val cardview_v7 = "com.android.support:cardview-v7:${Versions.support}"
    const val recyclerview_v7 = "com.android.support:recyclerview-v7:${Versions.support}"
    const val constraint_layout = "com.android.support.constraint:constraint-layout:${Versions.constraint_layout}"

}

object TestLibraries {
    const val instrumentation_runner = "android.support.test.runner.AndroidJUnitRunner"
    const val junit = "junit:junit:${Versions.junit}"

    const val android_test_runner = "com.android.support.test:runner:${Versions.android_test_runner}"
    const val android_test_espresso = "com.android.support.test.espresso:espresso-core:${Versions.android_test_espresso}"
    const val mockito_kotlin = "com.nhaarman:mockito-kotlin:${Versions.mockito_kotlin}"
    const val lifecycle_testing = "android.arch.core:core-testing:${Versions.lifecycle}"
}