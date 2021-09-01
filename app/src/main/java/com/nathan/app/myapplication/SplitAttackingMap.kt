package com.nathan.app.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class SplitAttackingMap : AppCompatActivity() {
    private val splitAttackingStrat = mutableMapOf(
       "Sewer Baits" to """Make so much noise in sewers that the enemy team pushes you! Be ready for waves of defenders greedily pushing >:D""",

        "They always think it's B" to """Push Mid and rush vents. They always think it's B you're rushing from mid >:D"""
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_split_attacking_map)

        val stratTitle: TextView = findViewById(R.id.stratTitle)
        val stratDesc: TextView = findViewById(R.id.stratDesc)
        val stratPicker: Button = findViewById(R.id.stratPicker)

        stratPicker.setOnClickListener{
            stratDisplayRoll(stratTitle, stratDesc)
        }
    }

    fun stratDisplayRoll(title: TextView, description: TextView){
        val stratObject = Strategies()
        val anyMapStrats = stratObject.anyMapStrats() + stratObject.anyMapAttackingStrats() + splitAttackingStrat
        val randomStrat = anyMapStrats.entries.elementAt(Random().nextInt(anyMapStrats.size))

        title.setText(randomStrat.key)
        description.setText(anyMapStrats[randomStrat.key])
    }
}