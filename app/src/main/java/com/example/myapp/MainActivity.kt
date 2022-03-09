package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.goToNextActivity)
            .setOnClickListener {
                startActivity(
                    Intent(this, SecondActivity::class.java)
                        .putExtra(
                            "user_message",
                            findViewById<TextView>(R.id.userInputMessage).text.toString()
                        )
                )
            }

        findViewById<Button>(R.id.goToRecyclerViewBtn)
            .setOnClickListener {
                startActivity(Intent(this, HobbiesActivity::class.java))
            }
    }
}