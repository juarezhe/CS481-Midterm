package com.example.midterm_hannahjuarez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_relative).setOnClickListener {
            startActivity(
                    Intent(this, RelativeActivity::class.java)
            )
        }
        findViewById<Button>(R.id.button_constraint).setOnClickListener {
            startActivity(
                    Intent(this, ConstraintActivity::class.java)
            )
        }
        findViewById<Button>(R.id.button_linear).setOnClickListener {
            startActivity(
                    Intent(this, LinearActivity::class.java)
            )
        }
    }
}