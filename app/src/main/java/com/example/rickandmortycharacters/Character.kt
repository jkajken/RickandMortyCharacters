package com.example.rickandmortycharacters

import java.io.Serializable


data class Character(
    val characterName: String,
    val characterImage: Int,
    val characterAliveOrDead : String,

) : Serializable
