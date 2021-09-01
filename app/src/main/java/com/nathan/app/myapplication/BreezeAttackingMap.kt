package com.nathan.app.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class BreezeAttackingMap : AppCompatActivity() {
    private val breezeAttackingStrats = mutableMapOf(
        "The Battle in 1800s" to """Everyone can only buy guardians. Everytime you shoot 1 bullet you must reload, you cannot shoot 2 bullets from 1 clip.""",

        "Hall of Death" to """Everyone must buy a machine gun. At the start of the round try to secure A halls. After securing it open the door and push from there with your machine guns.""",

        "Paratroopers" to """Make a lot of noise on A halls. After making sure the enemy thinks you're all rushing a halls, everyone must jump out of mid chute and then rush A. You can thank me later ;)""",

        "Op Shop" to """Before the start of the round, convince your enemy that you're giving away free Operators at A shop. When the round starts drop an op or many op (depending on how much you can buy). If you hear an enemy get it, kill them and then take A site. Greed is bad.""",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breeze_attacking_map)

        val stratTitle: TextView = findViewById(R.id.stratTitle)
        val stratDesc: TextView = findViewById(R.id.stratDesc)
        val stratPicker: Button = findViewById(R.id.stratPicker)

        stratPicker.setOnClickListener{
            stratDisplayRoll(stratTitle, stratDesc)
        }
    }

    fun stratDisplayRoll(title: TextView, description: TextView){
        val stratObject = Strategies()
        val anyMapStrats = stratObject.anyMapStrats() + stratObject.anyMapAttackingStrats() + breezeAttackingStrats
        val randomStrat = anyMapStrats.entries.elementAt(Random().nextInt(anyMapStrats.size))

        title.setText(randomStrat.key)
        description.setText(anyMapStrats[randomStrat.key])
    }
}