package com.innovativeminds.passwithus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val toHome: Button = findViewById(R.id.back_home)

        toHome.setOnClickListener {
            val intent = Intent(this@SettingsActivity,
                MainActivity::class.java)
            startActivity(intent)
        }
    }
}