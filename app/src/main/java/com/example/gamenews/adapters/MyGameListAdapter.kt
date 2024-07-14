package com.example.gamenews.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.gamenews.R
import com.example.gamenews.data.Game

class MyGameListAdapter(private val myGamesList: List<Game>) : Adapter<MyGameListAdapter.MyGamesViewHolder>() {

    class MyGamesViewHolder(view: View): ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.item_my_list_title)
        val publishare: TextView = view.findViewById(R.id.item_my_list_publishare)
        val gender: TextView = view.findViewById(R.id.item_my_list_gender)
        val release: TextView = view.findViewById(R.id.item_my_list_release)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyGamesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_my_list, parent, false)
        return MyGamesViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyGamesViewHolder, position: Int) {
        holder.title.text = myGamesList[position].name
        holder.publishare.text = myGamesList[position].developer
        holder.release.text = myGamesList[position].releaseDate
        holder.gender.text = myGamesList[position].gender
     }

    override fun getItemCount(): Int {
        return myGamesList.size
    }

}
