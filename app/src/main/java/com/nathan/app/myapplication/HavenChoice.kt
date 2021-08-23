package com.nathan.app.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HavenChoice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_haven_choice)

        val attackingButton: Button = findViewById(R.id.attackingButton)
        val defendingButton: Button = findViewById(R.id.defendingButton)

        attackingButton.setOnClickListener{
            val intent = Intent(this,
                HavenAttackingMap::class.java)

                startActivity(intent)
        }

        defendingButton.setOnClickListener{
            val intent = Intent(this,
            HavenDefendingMap::class.java)

            startActivity(intent)
        }
    }
}