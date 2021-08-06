package com.innovativeminds.passwithus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
        },2500)
    }
}