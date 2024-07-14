package com.example.gamenews

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gamenews.adapters.GamesAdapter
import com.example.gamenews.data.GamesDatabase

class GamesFragment : Fragment() {

    private lateinit var gameListRecycler: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_games, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gameListRecycler = view.findViewById(R.id.games_recicle)
        gameListRecycler.layoutManager = LinearLayoutManager(context)

    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onStart() {
        super.onStart()

        val gameList = GamesDatabase.findAll()
        val gamesAdapter = GamesAdapter(gameList)
        gameListRecycler.adapter = gamesAdapter
        gamesAdapter.notifyDataSetChanged()

    }

}
