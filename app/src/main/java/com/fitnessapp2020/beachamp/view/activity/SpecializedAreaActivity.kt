package com.fitnessapp2020.beachamp.view.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.fitnessapp2020.beachamp.R
import com.fitnessapp2020.beachamp.view.adapter.SpecializedAreaAdapter
import kotlinx.android.synthetic.main.activity_specialized_areas.*

class SpecializedAreaActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_specialized_areas)

        // Add recyclerView manager
        recyclerView_specialized.layoutManager = GridLayoutManager(this,2)
        recyclerView_specialized.adapter = SpecializedAreaAdapter {pos -> specialCheckbox(pos)}

        // Add ClickListener
        continue_button_specialized_area.setOnClickListener(this)
    }

    private fun specialCheckbox(pos: Int) {
        print(pos)
    }

    override fun onClick(view: View?) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}