package com.example.qolami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.qolami.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setItemClicked()
    }

    private fun setItemClicked() {
        binding.imageButton2.setOnClickListener {
            val intent = Intent(this@MainActivity, PracticeActivity::class.java)
            startActivity(intent)
        }
    }
}