package com.example.train_track

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.github.dhaval2404.imagepicker.ImagePicker
import com.google.android.material.floatingactionbutton.FloatingActionButton

class inscription : AppCompatActivity() {
    private lateinit var imgView: ImageView
    private lateinit var button: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription)
        WindowCompat.setDecorFitsSystemWindows(window,
            false)


        imgView=findViewById(R.id.shapeableImageView)
        button=findViewById(R.id.cam)


        button.setOnClickListener {
            ImagePicker.with(this)
                .crop()	    			//Crop image(Optional), Check Customization for more option
                .compress(1024)			//Final image size will be less than 1 MB(Optional)
                .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
                .start()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        imgView.setImageURI(data?.data)
    }
}