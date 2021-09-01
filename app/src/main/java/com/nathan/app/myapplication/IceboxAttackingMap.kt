package com.nathan.app.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class IceboxAttackingMap : AppCompatActivity() {
    private val iceboxAttackingStrats = mutableMapOf(
        "Never Done Before" to """Rush A and take it fast. Once you take A site silently go to B from the enemy spawn, if you're seen then rush B fast (from the enemy spawn) and win the round.""",

        "AFK strat" to """Everyone at chat must type "lmao afk throwing xd" and camp spawn. Waves of enemies are coming. Make sure you're all prepared.""",

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_icebox_attacking_map)

        val stratTitle: TextView = findViewById(R.id.stratTitle)
        val stratDesc: TextView = findViewById(R.id.stratDesc)
        val stratPicker: Button = findViewById(R.id.stratPicker)

        stratPicker.setOnClickListener{
            stratDisplayRoll(stratTitle, stratDesc)
        }
    }

    fun stratDisplayRoll(title: TextView, description: TextView){
        val stratObject = Strategies()
        val anyMapStrats = stratObject.anyMapStrats() + stratObject.anyMapAttackingStrats() + iceboxAttackingStrats
        val randomStrat = anyMapStrats.entries.elementAt(Random().nextInt(anyMapStrats.size))

        title.setText(randomStrat.key)
        description.setText(anyMapStrats[randomStrat.key])
    }
}