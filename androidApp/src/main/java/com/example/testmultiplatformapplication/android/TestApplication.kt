package com.example.testmultiplatformapplication.android

import android.app.Application
import com.example.testmultiplatformapplication.di.appModule

class TestApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        appModule()
    }
}
