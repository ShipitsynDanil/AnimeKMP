package com.example.testmultiplatformapplication.di

import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val mou = module {
    single {

    }
}

val sharedPreferencesModule = module {
    single {
        EncryptedSharedPreferences.create(
            "",
            "secret_shared_prefs",
            androidContext(),
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }

}
