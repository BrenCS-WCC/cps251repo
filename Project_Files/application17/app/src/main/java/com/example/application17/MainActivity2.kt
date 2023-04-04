package com.example.application17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.graphics.Bitmap

import com.example.application17.databinding.ActivityMain2Binding
class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main2)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras ?: return

        val title = extras.getString("title")
        val desc = extras.getString("desc")
        val image = extras.getInt("image")

        binding.textView.text = title
        binding.textView2.text = desc
        binding.imageView.setImageResource(image)
    }
}