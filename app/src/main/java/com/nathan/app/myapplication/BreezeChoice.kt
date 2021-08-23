package com.nathan.app.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BreezeChoice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breeze_choice)


        val attackingMapButton: Button = findViewById(R.id.attackingButton)
        val defendingMapButton: Button = findViewById(R.id.defendingButton)

        attackingMapButton.setOnClickListener{
            val intent = Intent(this,
                BreezeAttackingMap::class.java)

            startActivity(intent)
        }

        defendingMapButton.setOnClickListener {
            val intent = Intent(this,
                BreezeDefendingMap::class.java)

            startActivity(intent)
        }
    }
}