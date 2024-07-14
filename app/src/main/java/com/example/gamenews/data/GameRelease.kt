package com.example.gamenews.data

data class Game(
    val id: Int,
    val name: String,
    val releaseDate: String,
    val platforms: List<String>,
    val developer: String,
    val gender: String
)
