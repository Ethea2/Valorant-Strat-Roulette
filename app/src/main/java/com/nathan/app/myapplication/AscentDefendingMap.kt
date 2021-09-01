package com.nathan.app.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class AscentDefendingMap : AppCompatActivity() {

    private val ascentDefendingStrats = mutableMapOf(
        "The Gen Hold" to """Before the round starts everyone must parkour towards the top of generator.
                |This will surely surprise the enemy if they push A. But if they don't, just keep staying at the top of generator.
            """.trimMargin(),

        "The Shorty Speedway" to """Everyone must buy a shorty and hold B speedway from below (inside site)
                |hiding by sticking to the wall of speedway.
            """.trimMargin(),

        "Anything for Alcohol" to """The smoker in the team must smoke the entrance of A main, so that everyone can go to winery safely. Everyone must hold the alcohols at the winery at all cost!""",

        "Odin Spam" to """Everyone must stack B speedway with Odins. At the start of the round everyone must spam the entrance of B main with Odins. If the enemy goes A, everyone must then go to Heaven and spam Hell with Odins.""",

        "In Heaven's Grace" to """Everyone (with full buy) must go to heaven with knives out. Dance around Heaven while the enemy tries shooting at the team. The last man standing should do his best to clutch the whole round.""",
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ascent_defending_map)

        val stratTitle: TextView = findViewById(R.id.stratTitle)
        val stratDesc: TextView = findViewById(R.id.stratDesc)
        val stratPicker: Button = findViewById(R.id.stratPicker)


        stratPicker.setOnClickListener{
            stratDisplayRoll(stratTitle, stratDesc)
        }
    }

    fun stratDisplayRoll(title: TextView, description: TextView){
        val stratObject = Strategies()
        val anyMapStrats = stratObject.anyMapStrats() + stratObject.anyMapDefendingStrats() + ascentDefendingStrats
        val randomStrat = anyMapStrats.entries.elementAt(Random().nextInt(anyMapStrats.size))

        title.setText(randomStrat.key)
        description.setText(anyMapStrats[randomStrat.key])
    }
}