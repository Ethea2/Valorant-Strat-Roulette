package com.nathan.app.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class BindDefendingMap : AppCompatActivity() {
    private val bindDefendingStrats = mutableMapOf(
        "Light up the Lamps" to """Everyone must buy odin and hold lamps. Prepare to wallbang A short from lamps when you hear the enemy push.""",

        "Fast Backstab" to """Everyone must rush the teleporter at B long. Then rush A short and Baths to surprise the enemy!""",

        "Snipers from Heaven" to """Everyone must buy snipers and go to heaven. They must defend A as a sniper squad from heaven!""",

        "Elbow Strike" to """Everyone must hide in elbow and let them plant B. After planting push and retake B from elbow as a full squad.""",

        "Garden Shotguns" to """Everyone must buy shotguns and camp Garden. Make sure to jump everytime you shoot your shot!"""
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bind_defending_map)

        val stratTitle: TextView = findViewById(R.id.stratTitle)
        val stratDesc: TextView = findViewById(R.id.stratDesc)
        val stratPicker: Button = findViewById(R.id.stratPicker)
        val mapName: TextView = findViewById(R.id.mapName)

        mapName.setText("Bind")
        stratPicker.setOnClickListener{
            stratDisplayRoll(stratTitle, stratDesc)
        }
    }

    fun stratDisplayRoll(title: TextView, description: TextView){
        val stratObject = Strategies()
        val anyMapStrats = stratObject.anyMapStrats() + stratObject.anyMapDefendingStrats() + bindDefendingStrats
        val randomStrat = anyMapStrats.entries.elementAt(Random().nextInt(anyMapStrats.size))

        title.setText(randomStrat.key)
        description.setText(anyMapStrats[randomStrat.key])
    }
}