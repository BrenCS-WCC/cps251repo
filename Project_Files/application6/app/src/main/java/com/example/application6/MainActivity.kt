package com.example.application6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.application6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myButton.setOnClickListener {
            binding.statusText.text = "Button clicked"
        }

        binding.myButton.setOnLongClickListener {
            binding.statusText.text = "Long button click"
            false
        }
    }
}