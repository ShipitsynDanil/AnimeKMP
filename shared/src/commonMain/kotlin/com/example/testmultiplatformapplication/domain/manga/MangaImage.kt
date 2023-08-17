package com.example.testmultiplatformapplication.domain.manga

import kotlinx.serialization.Serializable

@Serializable
data class MangaImage(
    val original: String,
    val preview: String,
    val x96: String,
    val x48: String
)
