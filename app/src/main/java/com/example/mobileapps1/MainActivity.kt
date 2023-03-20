package com.example.mobileapps1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profilePhoto = findViewById<ImageView>(R.id.profilePhoto)
        val name = findViewById<TextView>(R.id.name)
        val course = findViewById<TextView>(R.id.course)
        val githubUser = findViewById<TextView>(R.id.githubUser)

        val education = findViewById<Button>(R.id.education)
        education.setOnClickListener {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

        val skills: Button = findViewById(R.id.skills)
            skills.setOnClickListener {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

        val achievements: Button = findViewById(R.id.achievements)
        achievements.setOnClickListener {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
        val exit: Button = findViewById(R.id.exit)
        exit.setOnClickListener {
        finish()
    }
    }
}