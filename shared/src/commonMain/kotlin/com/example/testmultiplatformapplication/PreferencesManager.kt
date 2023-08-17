package com.example.testmultiplatformapplication

expect class PreferencesManager {

    suspend fun putString(key: String, value: String)
    suspend fun getString(key: String): String
}
