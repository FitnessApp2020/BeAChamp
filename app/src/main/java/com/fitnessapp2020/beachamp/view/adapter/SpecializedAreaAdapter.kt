package com.fitnessapp2020.beachamp.view.adapter

import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fitnessapp2020.beachamp.R
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.specialezed_area_row.view.*

class SpecializedAreaAdapter: RecyclerView.Adapter<SportCustomViewHolder>() {

    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()

//    val specialAreasSoccer = listOf("Ball control exercises", "Ball take-down exercises", "Shooting exercises")
    val specialAreasSoccer = mutableListOf<String>()

//    fun getDocuments() {
//        firestore.collection("Sports/Soccer/SpecialAreas")
//            .get()
//            .addOnSuccessListener { result ->
//                for (document in result) {
//                    Log.d(TAG, "${document.id} => ${document.data}")
//                    specialAreasSoccer.add(document.toString())
//                }
//            }
//            .addOnFailureListener { exception ->
//                Log.d(TAG, "Error getting documents: ", exception)
//            }
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportCustomViewHolder {
        val layoutinflater = LayoutInflater.from(parent.context)
        val specialCheckbox = layoutinflater.inflate(R.layout.specialezed_area_row, parent, false)
        return SportCustomViewHolder(specialCheckbox)
    }

    override fun getItemCount(): Int {
        fun getDocuments() {
            firestore.collection("Sports/Soccer/SpecialAreas")
                .get()
                .addOnSuccessListener { result ->
                    for (document in result) {
                        Log.d(TAG, "${document.id} => ${document.data}")
                        specialAreasSoccer.add(document.toString())
                    }
                }
                .addOnFailureListener { exception ->
                    Log.d(TAG, "Error getting documents: ", exception)
                }
        }
        return specialAreasSoccer.size

    }

    override fun onBindViewHolder(holder: SportCustomViewHolder, position: Int) {
        val specialArea = specialAreasSoccer.get(position)
        holder.view.checkBox_row.text = specialArea
    }
}