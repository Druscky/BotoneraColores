package com.example.botonescanva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.botonescanva.databinding.ActivityMainBinding
import com.example.botonescanva.databinding.ActivitySelectorBinding

class ActivitySelector : AppCompatActivity() {
    private lateinit var b: ActivitySelectorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySelectorBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnButton.setOnClickListener {
            val myIntent = Intent(this, SeekBarActivity::class.java)
            startActivity(myIntent)
        }
    }
}