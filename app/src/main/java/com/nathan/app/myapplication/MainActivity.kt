package com.nathan.app.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val havenButton: ImageButton = findViewById(R.id.havenMapButton)

        havenButton.setOnClickListener{
            val havenIntent = Intent(this,
            HavenMap::class.java)

            startActivity(havenIntent)
        }
    }


}