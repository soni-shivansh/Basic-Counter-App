package com.example.day2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var incrementButton: Button
    private lateinit var decrementButton: Button
    private lateinit var counter: TextView
    private lateinit var resetButton: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        incrementButton = findViewById(R.id.increment_btn)
        decrementButton = findViewById(R.id.decrement_btn)
        counter = findViewById(R.id.counter)
        resetButton = findViewById(R.id.reset_btn)

        incrementButton.setOnClickListener {
            var value = Integer.parseInt(counter.text.toString())
            value++
            counter.text = value.toString()
        }

        decrementButton.setOnClickListener {
            var value = Integer.parseInt(counter.text.toString())
            value--
            counter.text = value.toString()
        }
        resetButton.setOnClickListener {
            counter.text = "0"
        }
    }
}