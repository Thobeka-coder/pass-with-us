package com.innovativeminds.passwithus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val toCourses: Button = findViewById(R.id.to_courses)
        val toSettings: Button = findViewById(R.id.to_settings)
        val toHome: Button = findViewById(R.id.to_home)

        toHome.setOnClickListener {
            val intent = Intent(this@DashboardActivity,
                MainActivity::class.java)
            startActivity(intent)
        }
        toCourses.setOnClickListener {
            val intent = Intent(this@DashboardActivity,
                CourseActivity::class.java)
            startActivity(intent)
        }
        toSettings.setOnClickListener {
            val intent = Intent(this@DashboardActivity,
                SettingsActivity::class.java)
            startActivity(intent)
        }

    }

}