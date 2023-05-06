package com.example.unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputkgvalue =findViewById<EditText>(R.id.et_kg)
        val lbsvalue = findViewById<TextView>(R.id.tv_lbs)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val kg = inputkgvalue.text.toString().toFloat()
            val lbs = kg * 2.20462
            lbsvalue.setText(lbs.toString())
        }
    }
}