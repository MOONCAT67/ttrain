package com.example.train_track

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class login_user : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_user)
        WindowCompat.setDecorFitsSystemWindows(window,
            false
        )

        var btn=findViewById<Button>(R.id.rod)
        var btnreg=findViewById<Button>(R.id.reg)

        var log: EditText=findViewById(R.id.login)

        var pass: EditText =findViewById(R.id.pass)


        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage("wrong password or login check again ")
        alertDialogBuilder.setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss()}



            btn.setOnClickListener {
                val username = log.text.toString()
                val password = pass.text.toString()
                if(username =="mohamed"&&password=="mohamed"){
                    val intent = Intent(this, user_home_page::class.java)
                    startActivity(intent) }
                else{

                        val alertDialog: AlertDialog = alertDialogBuilder.create()
                        alertDialog.show()

                }
        }
        btnreg.setOnClickListener {
            val intent = Intent(this, inscription::class.java)
            startActivity(intent)
        }
    }
}