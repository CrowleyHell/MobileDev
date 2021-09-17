package com.example.lab_01

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goButton = findViewById<Button>(R.id.goBut)
        val label = findViewById<TextView>(R.id.label)
        val resButton = findViewById<TextView>(R.id.resBut)
        val mode = findViewById<Switch>(R.id.mode)
        label.setTextSize(20F)
        label.setTextColor(Color.GRAY)
        goButton.setBackgroundColor(Color.GRAY)
        resButton.setBackgroundColor(Color.GRAY)
        goButton.setOnClickListener {
            val txt = findViewById<EditText>(R.id.revField)
            val str = txt.text.toString()
            val strRev = str.reversed()
            val img = findViewById<ImageView>(R.id.catImg)
            txt.setText(strRev)
            img.setImageResource(R.drawable.cat2)

        }
        resButton.setOnClickListener {
            val txt = findViewById<EditText>(R.id.revField)
            txt.setText("")
            val img = findViewById<ImageView>(R.id.catImg)
            img.setImageResource(R.drawable.cat1)
        }

        mode.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
        }
    }
}