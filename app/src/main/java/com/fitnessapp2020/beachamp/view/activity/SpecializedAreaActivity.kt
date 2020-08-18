package com.fitnessapp2020.beachamp.view.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.fitnessapp2020.beachamp.R
import com.fitnessapp2020.beachamp.view.adapter.SpecializedAreaAdapter
import kotlinx.android.synthetic.main.activity_specialized_areas.*

class SpecializedAreaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_specialized_areas)

        // Add recyclerView manager
        recyclerView_specialized.layoutManager = GridLayoutManager(this,2)
        recyclerView_specialized.adapter = SpecializedAreaAdapter()
    }
}