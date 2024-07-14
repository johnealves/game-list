package com.example.gamenews.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gamenews.adapters.MyGameListAdapter
import com.example.gamenews.R
import com.example.gamenews.data.MyGameListDataBase

class MyGamesListFragment: Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_my_games_list, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.game_list_recicle)
        recyclerView.layoutManager = GridLayoutManager(context, 2)
    }

    override fun onStart() {
        super.onStart()

        val myGamesList = MyGameListDataBase.findAll()
        val myGamesListAdapter = MyGameListAdapter(myGamesList)
        recyclerView.adapter = myGamesListAdapter

    }

}