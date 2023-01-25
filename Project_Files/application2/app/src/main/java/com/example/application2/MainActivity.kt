package com.example.application2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.application2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val TAG = "CONLOG" // Indicate log source as main project

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i(TAG,"Created new activity " + this.localClassName)
    }

    override fun onStart() {
        super.onStart() //Everything in the superclass still needs to be run
        Log.i(TAG,"Started activity")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"Activity resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"Activity paused")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"Stopped activity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"Activity restarted")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"Activity destroyed")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG,"Saving instance states")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG,"Restoring instance states")
    }
}