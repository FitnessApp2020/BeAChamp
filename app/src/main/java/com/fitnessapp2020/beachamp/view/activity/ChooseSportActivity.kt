package com.fitnessapp2020.beachamp.view.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.fitnessapp2020.beachamp.R
import com.fitnessapp2020.beachamp.model.*
import kotlinx.android.synthetic.main.choose_your_sport.*

class ChooseSportActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener, View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_your_sport)

        // add continue button
        continue_button_choose.setOnClickListener(this)

        var sports = mutableListOf<ISport>()
        val soccer = Soccer()
        val handball = HandBall()
        val boxing = Boxing()
        val bodybuilding = Bodybuilding()
        val exerciser = Exerciser()

        sports.add(soccer)
        sports.add(handball)
        sports.add(boxing)
        sports.add(bodybuilding)
        sports.add(exerciser)

        val adapter: ArrayAdapter<ISport> = ArrayAdapter(this, android.R.layout.simple_spinner_item, sports)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_choose_sport.adapter = adapter
        spinner_choose_sport.onItemSelectedListener = this
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