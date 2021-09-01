package com.nathan.app.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class HavenDefendingMap : AppCompatActivity() {
    private val havenDefendingStrats = mutableMapOf(
        "SCREW 3 SITES!!" to """Just pick one site and defend it. 3 sites is just too much!""",

        "Courtyard Explosion" to """HUNT THE ENEMY! Push mid courtyard and from there on you have access to the backstab of where the enemy is pushing.""",

        "Shortgun" to """Everyone can only play on Garage and A short. Oh and everyone must have shotguns! Even your pistol must be a shotgun.""",

        "Box Defense" to """Everyone can only pick one box to hide behind. They must hide behind this box until the round ends! Commitment is key.""",

        "Cardboard Walls" to """Everyone must buy Odins. You can only shoot behind walls in Haven to get the kills. You can take a peek but every kill must be a wallbang!"""
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_haven_defending_map)
        val stratTitle: TextView = findViewById(R.id.stratTitle)
        val stratDesc: TextView = findViewById(R.id.stratDesc)
        val stratPicker: Button = findViewById(R.id.stratPicker)
        val mapName: TextView = findViewById(R.id.mapName)

        mapName.setText("Haven")
        stratPicker.setOnClickListener{
            stratDisplayRoll(stratTitle, stratDesc)
        }
    }

    fun stratDisplayRoll(title: TextView, description: TextView){
        val stratObject = Strategies()
        val anyMapStrats = stratObject.anyMapStrats() + stratObject.anyMapDefendingStrats() + havenDefendingStrats
        val randomStrat = anyMapStrats.entries.elementAt(Random().nextInt(anyMapStrats.size))

        title.setText(randomStrat.key)
        description.setText(anyMapStrats[randomStrat.key])
    }

}