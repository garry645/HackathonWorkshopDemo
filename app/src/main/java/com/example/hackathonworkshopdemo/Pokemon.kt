package com.example.hackathonworkshopdemo

import android.graphics.Color

data class Pokemon(
    val name: String,
    val healthPoints: Int,
    val imageResource: Int,
    val attackOneName: String,
    val attackOneDamage: Int?,
    val attackTwoName: String,
    val attackTwoDamage: Int?,
    val height: String,
    val weight: Double,
    val cardColor: Int
)
