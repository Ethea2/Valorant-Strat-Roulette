package com.nathan.app.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class SplitDefendingMap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_split_defending_map)

        val stratTitle: TextView = findViewById(R.id.stratTitle)
        val stratDesc: TextView = findViewById(R.id.stratDesc)
        val stratPicker: Button = findViewById(R.id.stratPicker)

        stratPicker.setOnClickListener{
            stratDisplayRoll(stratTitle, stratDesc)
        }
    }

    fun stratDisplayRoll(title: TextView, description: TextView){
        val stratObject = Strategies()
        val anyMapStrats = stratObject.anyMapStrats() + stratObject.anyMapDefendingStrats()
        val randomStrat = anyMapStrats.entries.elementAt(Random().nextInt(anyMapStrats.size))

        title.setText(randomStrat.key)
        description.setText(anyMapStrats[randomStrat.key])
    }
}