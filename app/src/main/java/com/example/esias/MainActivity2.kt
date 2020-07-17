package com.example.esias

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online_class)
        val student = findViewById<Button>(R.id.studentBtn)
        student.setOnClickListener {
            val intent = Intent(this, mobilewebview::class.java)
            intent.putExtra("urltoload", "https://siaswebapp.herokuapp.com/")
            startActivity(intent)
        }

        val teacher = findViewById<Button>(R.id.techerBtn)
        teacher.setOnClickListener {
            val intent = Intent(this, mobilewebview::class.java)
            intent.putExtra("urltoload", "https://siaswebapp.herokuapp.com/login/")
            startActivity(intent)
        }
        val back = findViewById<ImageView>(R.id.drawer_icon)
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}