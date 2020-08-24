package com.fitnessapp2020.beachamp.view.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.fitnessapp2020.beachamp.R
import com.fitnessapp2020.beachamp.model.*
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.toObject
import kotlinx.android.synthetic.main.choose_your_sport.*

class ChooseSportActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener,
    View.OnClickListener {

    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
    private val sportReference = firestore.document("Sports/Bodybuilding")
    private val TAG: String = "TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_your_sport)

        // add continue button
        continue_button_choose.setOnClickListener(this)

        // add sport classes to the spinner
        var sports = mutableListOf<Sport>()

        firestore.collection("Sports")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    val sport = document.toObject<Sport>()
                    sports.add(sport)
                }
                val adapter: ArrayAdapter<Sport> =
                    ArrayAdapter(this, android.R.layout.simple_spinner_item, sports)
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner_choose_sport.adapter = adapter
                spinner_choose_sport.onItemSelectedListener = this
            }
            .addOnFailureListener { exception ->
                Log.d(TAG, "Error getting documents: ", exception)
            }
    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, PlayerInfoActivity::class.java)
        startActivity(intent)
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        println("ho")
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        println("hi")
    }
}