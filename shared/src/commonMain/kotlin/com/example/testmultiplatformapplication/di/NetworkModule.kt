package com.example.testmultiplatformapplication.di

import com.example.testmultiplatformapplication.PreferencesStorage
import com.example.testmultiplatformapplication.Providable
import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.plugins.HttpClientPlugin
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.header
import io.ktor.client.request.headers
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module



val networkModule = module {
    single {
        val preferencesStorage: PreferencesStorage = get()
        HttpClient {
            install(ContentNegotiation) {
                json()
            }
            defaultRequest {
                header("Authorization", "")
                url("") // TODO: Add here base url
            }
        }

    }
}