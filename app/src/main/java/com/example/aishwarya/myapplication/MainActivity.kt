package com.example.aishwarya.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var photo:ImageView?=null
    var button1: Button?=null
    var button2: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        photo=findViewById(R.id.photo)
        photo?.setOnClickListener {
          val clickIntent=Intent(this@MainActivity,ProfilePhoto::class.java)
            startActivity(clickIntent)
        }
        button1=findViewById(R.id.button1)
        button1?.setOnClickListener {
            val clickIntent=Intent(this@MainActivity,Education::class.java)
            startActivity(clickIntent)
        }
        button2=findViewById(R.id.button2)
        button2?.setOnClickListener {
            val clickIntent = Intent(this@MainActivity, WorkExperience::class.java)
            startActivity(clickIntent)
        }
    }
}
