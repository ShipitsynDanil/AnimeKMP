package com.example.testmultiplatformapplication

actual class PreferencesManager (private val userDefaults: NSUserDerfaults) {
    actual suspend fun putString(key: String, value: String) {
    }

    actual suspend fun getString(key: String): String {
        TODO("Not yet implemented")
    }
}
