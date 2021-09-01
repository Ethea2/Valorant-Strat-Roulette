package com.nathan.app.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class BindAttackingMap : AppCompatActivity() {
    private val bindAttackingStrats = mutableMapOf(
        "The Telestrat" to """Everyone must rush A- short telporter. After Teleporting there, they must hide until there's 20 seconds remaining on the clock. Once there's only 20 seconds left they should all simoultaneously leave the teleporter and rush B.""",

        "At Market Price" to """Everyone should buy all the guns they can and drop it at the entrances of market. When the team hears someone take a gun from the dropped gun. Shoot them with classics.""",

        "Snipers from Window" to """Everyone only buy snipers and must slowly push hookah/window, after clearing it they should fight off anyone with snipers only.""",

        "Ring Around the Rosie" to """Everyone must keep teleporting using teleporters throughout the round, if you see an enemy kill them. At the last 15 try to win the round.""",

        "Contain the Team" to """Everyone must clear and plant the bomb at B container. Once planted everyone should stay inside the container."""

        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bind_attacking_map)


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
        val anyMapStrats = stratObject.anyMapStrats() + stratObject.anyMapAttackingStrats() + bindAttackingStrats
        val randomStrat = anyMapStrats.entries.elementAt(Random().nextInt(anyMapStrats.size))

        title.setText(randomStrat.key)
        description.setText(anyMapStrats[randomStrat.key])
    }
}