package com.example.gamenews.data

object GamesDatabase {

    private val gameList = listOf(
        Game(
            1,
            "Call of Duty: Black Ops 6",
            "25/10/2024",
            listOf("Xbox Series X|S", "Xbox One", "PS5", "PS4", "PC"),
            "Activision",
            "FPS"
        ),
        Game(
            2,
            "State of Decay 3",
            "To be announced",
            listOf("Xbox Series X|S", "PC"),
            "Undead Labs",
            "Action"
        ),
        Game(
            3,
            "Dragon Age: The Veilguard",
            "Fall/2024",
            listOf("Xbox Series X|S", "PC"),
            "BioWare",
            "RPG"
        ),
        Game(
            4,
            "Starfield: Shattered Space (DLC)",
            "2024",
            listOf("Xbox Series X|S", "PC"),
            "Bethesda Game Studios",
            "FPS"
        ),
        Game(
            5,
            "Fallout 76: Skyline Valley",
            "12/06/2024",
            listOf("Xbox Series X|S", "Xbox One", "PS5", "PS4", "PC"),
            "Bethesda Game Studios",
            "RPG"
        ),
        Game(
            6,
            "Clair Obscur: Expedition 33",
            "2025",
            listOf("To be announced"),
            "Aurora Games",
            "Adventure"
        ),
        Game(
            7,
            "South of Midnight",
            "2025",
            listOf("To be announced"),
            "Moonlight Studios",
            "Adventure"
        ),
        Game(
            8,
            "World of Warcraft: The War Within",
            "26/08/2024",
            listOf("PC"),
            "Blizzard Entertainment",
            "MMORPG"
        ),
        Game(
            9,
            "Age of Mythology: Retold",
            "04/09/2024",
            listOf("PC"),
            "Ensemble Studios",
            "RTS"
        ),
        Game(
            10,
            "Avowed",
            "2024",
            listOf("Xbox Series X|S", "PC"),
            "Obsidian Entertainment",
            "RPG"
        ),
        Game(
            11,
            "Doom: The Dark Ages",
            "2025",
            listOf("Xbox Series X|S", "PC"),
            "id Software",
            "FPS"
        ),
        Game(
            12,
            "Metal Gear Solid Δ: Snake Eater",
            "To be announced",
            listOf("Xbox Series X|S", "PS5", "PC"),
            "Konami",
            "Stealth"
        ),
        Game(
            13,
            "Fable",
            "2025",
            listOf("Xbox Series X|S", "PC"),
            "Playground Games",
            "RPG"
        ),
        Game(
            14,
            "Perfect Dark",
            "2025",
            listOf("Xbox Series X|S", "PC"),
            "The Initiative & Crystal Dynamics",
            "Action-Adventure"
        ),
        Game(
            15,
            "Diablo 4: Vessel of Hatred",
            "08/10/2024",
            listOf("Xbox Series X|S", "PS5", "PC"),
            "Blizzard Entertainment",
            "ARPG"
        ),
        Game(
            16,
            "Flintlock: The Siege of Dawn",
            "18/07/2024",
            listOf("Xbox Series X|S", "PC"),
            "A44 Games",
            "Action-Adventure"
        ),
        Game(
            17,
            "Sea of Thieves - New World Event",
            "25/07/2024",
            listOf("Xbox Series X|S", "PC"),
            "Rare",
            "Action-Adventure"
        ),
        Game(
            18,
            "FragPunk",
            "2025",
            listOf("Xbox Series X|S", "PC"),
            "New Studio",
            "FPS"
        ),
        Game(
            19,
            "Winter Burrow",
            "2025",
            listOf("Xbox Series X|S", "PC"),
            "Indie Studio",
            "Adventure"
        )
    )

    fun findAll() = gameList
    fun getSize() = gameList.size
    fun findById(id: Int) = gameList.find { it.id == id }

}
