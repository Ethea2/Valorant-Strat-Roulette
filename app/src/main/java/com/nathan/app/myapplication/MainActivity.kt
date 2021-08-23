package com.nathan.app.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bindButton: Button = findViewById(R.id.bindMapButton)
        val havenButton: Button = findViewById(R.id.havenMapButton)
        val iceboxButton: Button = findViewById(R.id.iceboxMapButton)
        val breezeButton: Button = findViewById(R.id.breezeMapButton)
        val splitButton: Button = findViewById(R.id.splitMapButton)
        val ascentButton: Button = findViewById(R.id.ascentButtonMap)

        havenButton.setOnClickListener{
            val havenIntent = Intent(this,
            HavenChoice::class.java)

            startActivity(havenIntent)
        }

        bindButton.setOnClickListener {
            val bindIntent = Intent(this,
            BindChoice::class.java)

            startActivity(bindIntent)
        }

        iceboxButton.setOnClickListener {
            val iceboxIntent = Intent(this,
            IceboxChoice::class.java)

            startActivity(iceboxIntent)
        }

        breezeButton.setOnClickListener {
            val breezeIntent = Intent(this,
            BreezeChoice::class.java)

            startActivity(breezeIntent)
        }

        ascentButton.setOnClickListener {
            val ascentIntent = Intent(this,
            AscentChoice::class.java)

            startActivity(ascentIntent)
        }

        splitButton.setOnClickListener {
            val splitIntent = Intent(this,
            SplitChoice::class.java)

            startActivity(splitIntent)
        }
    }


}