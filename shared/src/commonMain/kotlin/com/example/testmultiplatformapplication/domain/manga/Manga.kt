package com.example.testmultiplatformapplication.domain.manga

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Manga(
    val id: Int,
    val name: String,
    val russian: String,
    val image: MangaImage,
    val url: String,
    val kind: String,
    val score: String,
    val status: String,
    val volumes: String,
    val chapters: String,
    @SerialName("aired_on")
    val airedOn: String,
    @SerialName("released_on")
    val releasedOn: String?
)
