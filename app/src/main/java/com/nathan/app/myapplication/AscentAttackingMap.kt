package com.nathan.app.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class AscentAttackingMap : AppCompatActivity() {
    private val ascentAttackingStrats = mutableMapOf(
        "The Catwalk" to """Before the start of the round everyone must say "meow" in all chat. 
                |After that, everyone must push catwalk while walking, everytime someone shoots they 
                |should also "meow" in voice comms.""".trimMargin(),

        "Sneaky Mid Control" to """Everyone buy shotguns. Then the smokers must smoke short and mid entrance. When mid is fully smoked everyone must slowly walk inside the mid entrance smoke. After everyone gathers there, everyone must jump out of the smoke all at the same time while going nuts with the shotguns. Then rush B""".trimMargin(),

        "Shedbang" to """Everyone must slowly push B. Then everyone should group up at B shed and close the door. After closing it everyone must wall bang the whole site from B shed. Then win the round""",

        "Main Hold" to """Everyone must go A main and hold it until there's 10 seconds left on the clock, on which the team must take A site like thunder. But if someone peeks then RUSH A immediately, without hesitations.""",

        "Fountain Strat" to """Everyone must run towards mid fountain and run around it in circles for the whole round. Everytime an enemy shows up you must kill them!""",

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ascent_attacking_map)

        val stratTitle: TextView = findViewById(R.id.stratTitle)
        val stratDesc: TextView = findViewById(R.id.stratDesc)
        val stratPicker: Button = findViewById(R.id.stratPicker)

        stratPicker.setOnClickListener{
            stratDisplayRoll(stratTitle, stratDesc)
        }
    }

    fun stratDisplayRoll(title: TextView, description: TextView){
        val stratObject = Strategies()
        val anyMapStrats = stratObject.anyMapStrats() + stratObject.anyMapAttackingStrats() + ascentAttackingStrats
        val randomStrat = anyMapStrats.entries.elementAt(Random().nextInt(anyMapStrats.size))

        title.text = randomStrat.key
        description.text = anyMapStrats[randomStrat.key]
    }
}