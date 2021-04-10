package com.example.hackathonworkshopdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class PokemonAdapter(private val pokemonCards: List<Pokemon>): RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    class PokemonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val pokemonCard: CardView = itemView.findViewById(R.id.pokemonCard)
        val nameTV: TextView = itemView.findViewById(R.id.nameTV)
        val healthPoints: TextView = itemView.findViewById(R.id.healthPointsTV)
        val pokemonImage: ImageView = itemView.findViewById(R.id.pokemonIV)
        val attackOneTV: TextView = itemView.findViewById(R.id.attackOneTV)
        val attackOneDamageTV: TextView = itemView.findViewById(R.id.attackOneDamageTV)
        val attackTwoTV: TextView = itemView.findViewById(R.id.attackTwoTV)
        val attackTwoDamageTV: TextView = itemView.findViewById(R.id.attackTwoDamageTV)
        val heightTV: TextView = itemView.findViewById(R.id.heightTV)
        val weightTV: TextView = itemView.findViewById(R.id.weightTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.card_pokemon, parent, false)
        return PokemonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        pokemonCards[position].let { cardData ->
            holder.pokemonCard.setCardBackgroundColor(cardData.cardColor)
            holder.healthPoints.text = cardData.healthPoints.toString()
            holder.attackOneTV.text = cardData.attackOneName
            cardData.attackOneDamage?.let {
                holder.attackOneDamageTV.text = it.toString()
            }
            holder.attackTwoTV.text = cardData.attackTwoName
            cardData.attackTwoDamage?.let {
                holder.attackTwoDamageTV.text = it.toString()
            }
            holder.heightTV.text = cardData.height
            holder.weightTV.text = cardData.weight.toString()
            Glide.with(holder.itemView)
                .load(cardData.imageResource)
                .into(holder.pokemonImage)
        }
    }

    override fun getItemCount(): Int {
        return pokemonCards.size
    }
}