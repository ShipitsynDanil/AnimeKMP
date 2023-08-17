package com.example.testmultiplatformapplication

import android.content.SharedPreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

actual class PreferencesManager(private val sharedPreferences: SharedPreferences) {
    actual suspend fun putString(key: String, value: String) = withContext(Dispatchers.IO) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    actual suspend fun getString(key: String) = withContext(Dispatchers.IO) {
        sharedPreferences.getString(key, null) ?: throw Exception("Token not saved")
    }
}
