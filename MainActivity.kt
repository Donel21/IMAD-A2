package com.example.imada2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nxtButton = findViewById<Button>(R.id.nxtButton)
        nxtButton.setOnClickListener{
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
