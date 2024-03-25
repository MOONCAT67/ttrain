package com.example.train_track

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.train_track.databinding.ActivityTripinfBinding


class tripinf : AppCompatActivity() {

    private lateinit var binding: ActivityTripinfBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTripinfBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra("name")
        val image_id = intent.getIntExtra("image_id",R.drawable.a)
        val des = intent.getStringExtra("sdestination")
        val dept = intent.getStringExtra("depart time")
        val endt = intent.getStringExtra("ending time")


        binding.piname.text=name
        binding.prof.setImageResource(image_id)
        binding.destn.text=des
        binding.deptt.text=dept
        binding.endtt.text=endt

















        val of = findViewById<ImageView>(R.id.back)
        of.setOnClickListener {
            // Handle click event
            val intent = Intent(this, user_home_page::class.java)
            startActivity(intent)
    }

}




}