package com.nathan.app.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class HavenAttackingMap : AppCompatActivity() {
    private val havenAttackingStrats = mutableListOf(
        "3 Site Abuse" to """The goal is to fakeout every site in the map. Fake A, B, and C site. After faking it you can choose the most convenient site to take for the team! Make sure this all happens fast or else the enemy might be able to keep up >:D""",

        "Defend the Garden" to """Defend everything in spawn. Seriously screw the game just defend the beautiful grass, plants, and trees!""",

        "B2C" to """RUSH B AND CLEAR IT FAST! After this everyone must run towards C and plant the bomb there.""",

        "Cubbie" to """Smoke C long so that you can safely go to cubby. Everyone must stay in C cubby until there's only 20 seconds left on the clock, if you are discovered before the time goal you must go to A as a punishment.""",

        "Easy Garage" to """Garage is actually the easiest place to take control in Haven, and it opens up the map to for C or B take. Take Garage decisively and then decide what to do next!"""
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_haven_attacking_map)

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
        val anyMapStrats = stratObject.anyMapStrats() + stratObject.anyMapAttackingStrats() + havenAttackingStrats
        val randomStrat = anyMapStrats.entries.elementAt(Random().nextInt(anyMapStrats.size))

        title.setText(randomStrat.key)
        description.setText(anyMapStrats[randomStrat.key])
    }
}