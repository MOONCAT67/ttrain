package com.example.train_track

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class locations : AppCompatActivity() {

    private lateinit var progressBar: ProgressBar
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


        progressBar = findViewById(R.id.progressBar)

        val totalTimeMillis = 2000L // 20 seconds
        val intervalMillis = 100L // Update every second
        val totalSteps = 100 // Total steps (percentage)

        val timer = object : CountDownTimer(totalTimeMillis, intervalMillis) {
            override fun onTick(millisUntilFinished: Long) {
                val progress = ((totalTimeMillis - millisUntilFinished) / totalTimeMillis.toFloat() * totalSteps).toInt()
                progressBar.progress = progress
            }

            override fun onFinish() {
                // Progress completed
                progressBar.progress = totalSteps
            }
        }

        timer.start()

    }
}