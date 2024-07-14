package com.example.gamenews.data

object MyGameListDataBase {

    private val myGameList = listOf<Game>(
        Game(
            1,
            "Indiana Jones: The great circle",
            "Fall/2024",
            listOf("Xbox Series X|S", "PC"),
            "Bethesda",
            "RPG"
        ),
        Game(
            2,
            "South of Midnight",
            "2025",
            listOf("To be announced"),
            "Moonlight Studios",
            "Adventure"
        ),
        Game(
            3,
            "Age of Mythology: Retold",
            "04/09/2024",
            listOf("PC"),
            "Ensemble Studios",
            "RTS"
        ),
        Game(
            4,
            "Avowed",
            "2024",
            listOf("Xbox Series X|S", "PC"),
            "Obsidian Entertainment",
            "RPG"
        ),
        Game(
            5,
            "Perfect Dark",
            "2025",
            listOf("Xbox Series X|S", "PC"),
            "The Initiative & Crystal Dynamics",
            "Action-Adventure"
        ),
    )

    fun findAll() = myGameList

    fun findById(id: Int) = myGameList.find { it.id == id }

}