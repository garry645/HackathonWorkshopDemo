package com.example.hackathonworkshopdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pokemonList = mutableListOf<Pokemon>()
        pokemonList.add(
            Pokemon("Bulbasaur",
            60,
            R.drawable.bulbasaur,
            "Tackle",
            10,
            "Razor Leaf",
            30,
            "2'4\"",
            35.2,
            Color.GREEN
            )
        )

        pokemonList.add(
            Pokemon("Pikachu",
                70,
                R.drawable.pikachu,
                "Quick Attack",
                10,
                "Electro Ball",
                60,
                "1'04\"",
                13.2,
                Color.YELLOW
            )
        )

        val pokemonAdapter = PokemonAdapter(pokemonList)
        val recyclerView: RecyclerView = findViewById(R.id.pokemonRecyclerView)
        recyclerView.adapter = pokemonAdapter
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
    }
}