package com.fitnessapp2020.beachamp.view.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fitnessapp2020.beachamp.model.ISport

class SportAdapter(
    private val items: List<ISport>,
    private val listener: (ISport, Int) -> Unit) : RecyclerView.Adapter<SportCustomViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportCustomViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: SportCustomViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}