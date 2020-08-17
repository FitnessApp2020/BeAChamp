package com.fitnessapp2020.beachamp.view.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.fitnessapp2020.beachamp.R
import kotlinx.android.synthetic.main.player_info.*

class PlayerInfoActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.player_info)

        // Add continue button
        choose_sport_main_button3.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, ChooseAreaActivity::class.java)
        startActivity(intent)
    }
}