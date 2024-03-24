package com.example.train_track

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class user_home_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_home_page)
        WindowCompat.setDecorFitsSystemWindows(window,
            false
        )
        val prof = findViewById<ImageView>(R.id.profile)
        prof.setOnClickListener {
            // Handle click event
            val intent = Intent(this@user_home_page, profile::class.java)
            startActivity(intent)
        }





    }
}