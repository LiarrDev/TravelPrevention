object Versions {
    const val compileSdkVersion = 32
    const val minSdkVersion = 23
    const val targetSdkVersion = 32

    const val coreKtxVersion = "1.7.0"
    const val appcompatVersion = "1.4.2"
    const val materialVersion = "1.5.0"

    const val lifecycleVersion = "2.3.1"
    const val savestateVersion = "2.5.1"
    const val fragmentKtxVersion = "1.5.3"
    const val picassoVersion = "2.8"
    const val retrofitVersion = "2.9.0"
    const val loggingInterceptorVersion = "4.10.0"
    const val coroutinesVersion = "1.6.4"

    const val arouterVersion = "1.5.2"
}

object Libs {

    const val core_ktx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompatVersion}"
    const val material = "com.google.android.material:material:${Versions.materialVersion}"

    const val livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
    const val viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
    const val viewmodel_savedstate = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.savestateVersion}"
    const val fragment_ktx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtxVersion}"
    const val picasso = "com.squareup.picasso:picasso:${Versions.picassoVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val converter_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
    const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptorVersion}"
    const val coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"

    const val arouter_api = "com.alibaba:arouter-api:${Versions.arouterVersion}"
    const val arouter_compiler = "com.alibaba:arouter-compiler:${Versions.arouterVersion}"
}
