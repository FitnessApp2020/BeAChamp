package com.fitnessapp2020.beachamp.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.fitnessapp2020.beachamp.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add choose sport button
        button1_1.setOnClickListener(this)
        // Der er sket et problem her fordi jeg ændrede knappens navn
        // Jeg prøver at ændre den tilbage men bedst du kigger på den

    }

    override fun onClick(p0: View?) {

    }
}