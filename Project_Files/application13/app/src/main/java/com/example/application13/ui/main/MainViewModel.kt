package com.example.application13.ui.main

import androidx.lifecycle.ViewModel
import android.util.Log
import androidx.lifecycle.Lifecycle.Event
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleRegistry
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
    private var historyString: MutableLiveData<String> = MutableLiveData()

    fun msFormat(milliseconds : Long) : String {
        return milliseconds.toString()
    }
    companion object {
        private var eventArray = arrayOf<String>()

        fun logEvent(eventType: Enum<Event>) {
            Log.i("ViewModel", eventType.name)
            eventArray.plus(eventType.name + "\n" + msFormat(System.currentTimeMillis()))
            if (eventType == Lifecycle.Event.ON_PAUSE) {
                eventArray.plus("********\n")
            }
        }
    }
    fun test(string : String) {
        Log.i("ViewModel", string)
    }
}