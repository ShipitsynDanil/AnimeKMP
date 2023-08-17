package com.example.testmultiplatformapplication.domain.forum

import kotlinx.serialization.Serializable

@Serializable
data class Forum(
    val id: Int,
    val position: Int,
    val name: String,
    val permalink: String,
    val url: String
)
