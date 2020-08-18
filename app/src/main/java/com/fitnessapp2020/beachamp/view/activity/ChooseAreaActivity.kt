package com.fitnessapp2020.beachamp.view.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.fitnessapp2020.beachamp.R
import kotlinx.android.synthetic.main.choose_areas.*

class ChooseAreaActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_areas)

        continue_button_choose_area.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, SpecializedAreaActivity::class.java)
        startActivity(intent)
    }
}