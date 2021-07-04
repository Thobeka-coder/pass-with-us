package com.innovativeminds.passwithus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CourseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        val toHome: Button = findViewById(R.id.go_home)

        toHome.setOnClickListener {
            val intent = Intent(this@CourseActivity,
                MainActivity::class.java)
            startActivity(intent)
        }
    }
}