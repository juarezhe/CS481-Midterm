package com.example.midterm_hannahjuarez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class RelativeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)

        val windowWidth =
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
                windowManager.maximumWindowMetrics.bounds.width() - 32
            } else {
                TODO("VERSION.SDK_INT < R")
            }
        findViewById<EditText>(R.id.input_first_name).layoutParams.width = (windowWidth - 40) / 2
        findViewById<EditText>(R.id.input_last_name).layoutParams.width = (windowWidth - 40) / 2

        findViewById<Spinner>(R.id.spinner_month).layoutParams.width = (windowWidth - 60) / 3
        findViewById<Spinner>(R.id.spinner_year).layoutParams.width = (windowWidth - 60) / 3
        findViewById<EditText>(R.id.input_cvv).layoutParams.width = (windowWidth - 60) / 3

        findViewById<EditText>(R.id.input_city).layoutParams.width = (windowWidth - 60) / 3
        findViewById<Spinner>(R.id.spinner_state).layoutParams.width = (windowWidth - 60) / 3
        findViewById<EditText>(R.id.input_zip).layoutParams.width = (windowWidth - 60) / 3

        findViewById<Spinner>(R.id.spinner_state).adapter = ArrayAdapter.createFromResource(
            this,
            R.array.state,
            android.R.layout.simple_spinner_item
        )
        findViewById<Spinner>(R.id.spinner_month).adapter = ArrayAdapter.createFromResource(
            this,
            R.array.month,
            android.R.layout.simple_spinner_item
        )
        findViewById<Spinner>(R.id.spinner_year).adapter = ArrayAdapter.createFromResource(
            this,
            R.array.year,
            android.R.layout.simple_spinner_item
        )

        findViewById<Button>(R.id.button_back).setOnClickListener { this.finish() }
    }
}