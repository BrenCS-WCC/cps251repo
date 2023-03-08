package com.example.application13.ui.main

import androidx.lifecycle.ViewModel
import android.util.Log
import androidx.lifecycle.LifecycleRegistry

class MainViewModel : ViewModel() {
    fun test(string : String) {
        Log.i("ViewModel", string)
    }
}