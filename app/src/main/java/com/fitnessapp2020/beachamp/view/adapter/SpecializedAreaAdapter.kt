package com.fitnessapp2020.beachamp.view.adapter

import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fitnessapp2020.beachamp.R
import com.fitnessapp2020.beachamp.model.Athlete
import com.fitnessapp2020.beachamp.model.Sport
import com.fitnessapp2020.beachamp.view.activity.ChooseSportActivity
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.specialezed_area_row.view.*

class SpecializedAreaAdapter: RecyclerView.Adapter<SportCustomViewHolder>() {

    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
    val specialAreasSoccer = mutableListOf<String>()
    var athlete = Athlete
    lateinit var path: String

    init {
        when {
            athlete.getSport() == "Bodybuilding" -> {
                path = "Sports/Bodybuilding/SpecialAreas"
            }
            athlete.getSport() == "Boxing" -> {
                path = "Sports/Boxing/SpecialAreas"
            }
            athlete.getSport() == "Handball" -> {
                path = "Sports/Handball/SpecialAreas"
            }
            athlete.getSport() == "Soccer" -> {
                path = "Sports/Soccer/SpecialAreas"
            }
        }
        firestore.collection(path)
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    specialAreasSoccer.add(document.data.toString())
                }
            }
            .addOnFailureListener { exception ->
                Log.d(TAG, "Error getting documents: ", exception)
            }
    }

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