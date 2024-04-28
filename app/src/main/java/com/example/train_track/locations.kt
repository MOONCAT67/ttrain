package com.example.train_track

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class locations : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_locations)
        WindowCompat.setDecorFitsSystemWindows(window,
            false
        )

        val prof = findViewById<ImageView>(R.id.ll)
        prof.setOnClickListener {
            // Handle click event
            val intent = Intent(this@locations, user_home_page::class.java)
            startActivity(intent)
        }
    }
}