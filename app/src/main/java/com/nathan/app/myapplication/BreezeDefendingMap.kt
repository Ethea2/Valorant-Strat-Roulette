package com.nathan.app.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class BreezeDefendingMap : AppCompatActivity() {
    private val breezeDefendingStrats = mutableMapOf(
        "Defenders of the Pyramid" to """Everyone must stack and defend the Pyramids. No one is allowed to leave the water on the Pyramids.""",

        "Exchange gift" to """All team members will exchange with other team members any gun of the buyer's choice. The dropped guns MUST be used by the member who received the gift until the round ends""",

        "Pillar Defense" to """Everyone can only hide behind B pillar while defending it. Goodluck!""",

        "The Battle for Cannons" to """Everyone can only buy guardians and rush Mid Cannon. SECURE THE CANNON TO WIN THE ROUND!""",

        "Marshall's Nest" to """Everyone should buy marshalls and camp at mid nest!"""
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breeze_defending_map)

        val stratTitle: TextView = findViewById(R.id.stratTitle)
        val stratDesc: TextView = findViewById(R.id.stratDesc)
        val stratPicker: Button = findViewById(R.id.stratPicker)

        stratPicker.setOnClickListener{
            stratDisplayRoll(stratTitle, stratDesc)
        }
    }

    fun stratDisplayRoll(title: TextView, description: TextView){
        val stratObject = Strategies()
        val anyMapStrats = stratObject.anyMapStrats() + stratObject.anyMapDefendingStrats() + breezeDefendingStrats
        val randomStrat = anyMapStrats.entries.elementAt(Random().nextInt(anyMapStrats.size))

        title.setText(randomStrat.key)
        description.setText(anyMapStrats[randomStrat.key])
    }
}