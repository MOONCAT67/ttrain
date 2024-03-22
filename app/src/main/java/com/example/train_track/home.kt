package com.example.train_track

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        WindowCompat.setDecorFitsSystemWindows(window,
            false
        )
        var button =findViewById<Button>(R.id.passen_button)
        var g_btn=findViewById<Button>(R.id.guest)
        button.setOnClickListener {
            val intent = Intent(this, login_user::class.java)
            startActivity(intent)
        }
        g_btn.setOnClickListener {
            startActivity(Intent(this,user_home_page::class.java))
        }






    }
}


