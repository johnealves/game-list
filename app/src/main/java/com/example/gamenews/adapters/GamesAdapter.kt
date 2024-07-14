package com.example.gamenews.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.gamenews.R
import com.example.gamenews.data.Game

class GamesAdapter(private val gameList: List<Game>): Adapter<GamesAdapter.GamesViewHolder>() {

    class GamesViewHolder(view: View): ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.card_tv_title)
        var releaseDate: TextView = view.findViewById(R.id.card_tv_date)
        var developer: TextView = view.findViewById(R.id.card_tv_developer)
        var gender: TextView = view.findViewById(R.id.card_tv_gender)
    }

    override fun getItemCount(): Int {
        return gameList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_detail, parent, false)
        return GamesViewHolder(view)
    }

    override fun onBindViewHolder(holder: GamesViewHolder, position: Int) {
        holder.title.text = gameList[position].name
        holder.releaseDate.text = gameList[position].releaseDate
        holder.developer.text = gameList[position].developer
        holder.gender.text = gameList[position].gender
    }

}