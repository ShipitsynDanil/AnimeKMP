package com.example.testmultiplatformapplication

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class PreferencesStorage(private val preferencesManager: PreferencesManager) {
    suspend fun getToken(): String = withContext(Dispatchers.Default) {
        preferencesManager.getString(TOKEN_KEY)
    }

    suspend fun putToken(token: String) = withContext(Dispatchers.Default) {
        preferencesManager.putString(TOKEN_KEY, token)
    }
}

