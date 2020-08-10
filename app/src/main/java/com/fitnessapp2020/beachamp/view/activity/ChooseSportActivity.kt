package com.fitnessapp2020.beachamp.view.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.fitnessapp2020.beachamp.R
import kotlinx.android.synthetic.main.choose_your_sport.*

class ChooseSportActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener, View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_your_sport)

        // add continue button
        continue_button_choose.setOnClickListener(this)

        val adapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(this, R.array.sports , android.R.layout.simple_spinner_item)
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