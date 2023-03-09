package com.example.application13.ui.main

import androidx.lifecycle.ViewModel
import android.util.Log
import androidx.lifecycle.Lifecycle.Event
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleRegistry
import androidx.lifecycle.MutableLiveData
import java.time.LocalTime

class MainViewModel : ViewModel() {
    private var historyString: MutableLiveData<String> = MutableLiveData()

    companion object {
        private var eventArray = arrayOf<String>()

        private var eventFlags = arrayOf(
            Event.ON_RESUME,
            Event.ON_PAUSE,
            Event.ON_DESTROY)

        fun logEvent(eventType: Enum<Event>) {
            eventArray = eventArray.plus(eventType.name + " was fired at " + LocalTime.now().toString() + "\n")
            if (eventType in eventFlags) {
                eventArray = eventArray.plus("********\n")
            }
            if (eventArray.isNotEmpty()) {
                Log.i("ViewModel", eventArray.last())
            }
        }
    }


}