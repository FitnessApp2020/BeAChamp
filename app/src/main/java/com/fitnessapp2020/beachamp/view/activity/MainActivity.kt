package com.fitnessapp2020.beachamp.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.fitnessapp2020.beachamp.R
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    // Access a Cloud Firestore instance from your Activity
    val db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add choose sport button
        choose_sport_main_button.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, ChooseSportActivity::class.java)
        startActivity(intent)
    }
}