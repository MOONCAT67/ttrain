package com.example.train_track

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {



         super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.apply {
            systemUiVisibility = (
                    View.SYSTEM_UI_FLAG_IMMERSIVE
                            // Set the content to appear under the system bars so that the content
                            // doesn't resize when the system bars hide and show.
                            or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            // Hide the nav bar and status bar
                            or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            or View.SYSTEM_UI_FLAG_FULLSCREEN
                    )
            val backgrdi : ImageView = findViewById(R.id.imageView)
            val caption : TextView = findViewById(R.id.textView)
            val caption1 : TextView = findViewById(R.id.textView2)
            val animation = AnimationUtils.loadAnimation(context, R.anim.slidetop)
            val animation1 = AnimationUtils.loadAnimation(context, R.anim.slidebot)
            backgrdi.startAnimation(animation)
            caption.startAnimation(animation1)
            caption1.startAnimation(animation1)


            Handler().postDelayed({
                intent = Intent(this@MainActivity, home::class.java)

                startActivity(intent)
                finish()
            }, 3500)

        }
    }
}