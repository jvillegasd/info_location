package com.example.clase2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val atlantico_bt = findViewById<Button>(R.id.button3)
        atlantico_bt.setOnClickListener {
            println("Hello Atlantico")
            val intent = Intent(this, locationInfo::class.java).apply {
                putExtra("location", "Atlantico")
                putExtra("description", "Lorem Ipsum")
                putExtra("path", "/lorem/ipsum")
            }
            startActivity(intent)
        }

        val colombia_bt = findViewById<Button>(R.id.button)
        colombia_bt.setOnClickListener {
            println("Hello Colombia")
            val intent = Intent(this, locationInfo::class.java).apply {
                putExtra("location", "Colombia")
                putExtra("description", "Lorem Ipsum Polombia, con P")
                putExtra("path", "/lorem/best_president")
            }
            startActivity(intent)
        }

        val mundo_bt = findViewById<Button>(R.id.button2)
        mundo_bt.setOnClickListener {
            println("Hello Mundo")
            val intent = Intent(this, locationInfo::class.java).apply {
                putExtra("location", "Mundo")
                putExtra("description", "Hate living here")
                putExtra("path", "/hate/this/planet")
            }
            startActivity(intent)
        }
    }
}
