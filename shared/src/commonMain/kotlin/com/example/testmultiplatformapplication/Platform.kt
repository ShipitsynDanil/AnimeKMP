package com.example.testmultiplatformapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform