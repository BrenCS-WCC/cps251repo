package com.example.application17

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var entries = arrayOf<String>()

    fun getEntry(i : Int) : String {
        return entries[i]
    }

    fun addEntry(str : String) {
        entries = entries.plus(str)
        for (value in entries) {
            Log.i("Log", value)
        }
    }

    fun getEntryCount() : Int {
        return entries.size
    }
}