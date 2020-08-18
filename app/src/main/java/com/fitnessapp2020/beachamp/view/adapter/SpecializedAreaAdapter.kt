package com.fitnessapp2020.beachamp.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fitnessapp2020.beachamp.R
import kotlinx.android.synthetic.main.specialezed_area_row.view.*

class SpecializedAreaAdapter: RecyclerView.Adapter<SportCustomViewHolder>() {

    val specialAreasSoccer = listOf("Ball control exercises", "Ball take-down exercises", "Shooting exercises")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportCustomViewHolder {
        val layoutinflater = LayoutInflater.from(parent.context)
        val specialCheckbox = layoutinflater.inflate(R.layout.specialezed_area_row, parent, false)
        return SportCustomViewHolder(specialCheckbox)
    }

    override fun getItemCount(): Int {
        return specialAreasSoccer.size
    }

    override fun onBindViewHolder(holder: SportCustomViewHolder, position: Int) {
        val specialArea = specialAreasSoccer.get(position)
        holder.view.checkBox_row.text = specialArea
    }
}