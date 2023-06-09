object BuildPlugins {
    val androidPlugin by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val kotlinPlugin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinPlugin}" }
    val hiltPlugin by lazy { "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt_version}" }
    val navSafeArgs by lazy { "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.nav_version}" }
}

object Dependencies {

    object Core {
        val legacySupport by lazy { "androidx.legacy:legacy-support-v4:${Versions.legacy_support}" }
        val coreKtx by lazy { "androidx.core:core-ktx:${Versions.core_ktx}" }
        val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appcompat}" }
    }

    object Coroutines {
        val androidCoroutines by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlin_coroutines}" }
        val coreCoroutines by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlin_coroutines}" }
    }

    object Navigation {
        val navigationFragment by lazy { "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}" }
        val navigationUi by lazy { "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}" }
    }

    object LifeCycle {
        val viewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_version}" }
        val viewModelSavedState by lazy { "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle_version}" }
    }

    object Hilt {
        val hilt by lazy { "com.google.dagger:hilt-android:${Versions.hilt_version}" }
        val hiltCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hilt_version}" }
        val hiltViewModel by lazy { "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hilt_viewModel}" }
        val hiltNavigation by lazy { "androidx.hilt:hilt-navigation-fragment:${Versions.hilt_navigation}" }
    }

    object RetrofitAndMoshi {
        val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}" }
        val retrofitMoshiConverter by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.retrofit_version}" }
        val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.logging_interceptor}" }
        val moshi by lazy { "com.squareup.moshi:moshi:${Versions.moshi_version}" }
        val moshiAdapters by lazy { "com.squareup.moshi:moshi-adapters:${Versions.moshi_version}" }
    }

    val material by lazy { "com.google.android.material:material:${Versions.material}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}" }
    val picasso by lazy { "com.squareup.picasso:picasso:${Versions.picasso}" }

    // Tests
    val junit by lazy { "junit:junit:${Versions.junit}" }
    val junitExt by lazy { "androidx.test.ext:junit:${Versions.ext_junit}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }
}






















