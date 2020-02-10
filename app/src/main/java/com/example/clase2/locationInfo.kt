package com.example.clase2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView
import org.w3c.dom.Text

class locationInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location_info)

        val location = intent.getStringExtra("location")
        val description = intent.getStringExtra("description")
        val path = intent.getStringExtra("path")

        val title_tw = findViewById<TextView>(R.id.title).apply {
            text = location
        }
        val descrip_tw = findViewById<TextView>(R.id.description).apply {
            text = description
        }
    }
}
