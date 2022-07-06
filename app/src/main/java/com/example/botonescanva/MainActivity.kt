package com.example.botonescanva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.botonescanva.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

//        b.btnGo.setOnClickListener {
//            val myIntent = Intent(this, ActivitySelector::class.java)
//            startActivity(myIntent)
//        }

    }
}


