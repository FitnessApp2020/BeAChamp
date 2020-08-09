package com.fitnessapp2020.beachamp.view.adapter

import androidx.recyclerview.widget.RecyclerView
import com.fitnessapp2020.beachamp.model.Sport

class SportAdapter(
    private val items: List<Sport>,
    private val listener: (Sport, Int) -> Unit) : RecyclerView.Adapter<SportCustomViewHolder> {
}