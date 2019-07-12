package com.example.andella

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        about_btn.setOnClickListener {
            val intent = Intent(this, About::class.java)
            // start your next activity
            startActivity(intent)
        }

        dev_btn.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            // start your next activity
            startActivity(intent)
        }

    }
}
