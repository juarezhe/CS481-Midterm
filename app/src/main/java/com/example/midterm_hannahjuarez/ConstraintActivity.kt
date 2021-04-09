package com.example.midterm_hannahjuarez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class ConstraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)

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