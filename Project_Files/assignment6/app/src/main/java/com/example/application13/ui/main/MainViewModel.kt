package com.example.application13.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.Lifecycle.Event
import androidx.lifecycle.MutableLiveData
import java.time.LocalTime

class MainViewModel : ViewModel() {
    companion object {
        private var eventArray = arrayOf<String>()

        var historyString : MutableLiveData<String> = MutableLiveData("")

        private var eventFlags = arrayOf(
            Event.ON_RESUME,
            Event.ON_PAUSE,
            Event.ON_DESTROY)

        private fun generateReport() : MutableLiveData<String> {
            historyString.value = ""
            for (entry in eventArray){
                historyString.value = (historyString.value + entry)
            }
            return historyString
        }

        fun createLog(eventType: Enum<Event>) {
            eventArray = eventArray.plus(eventType.name + " was fired at " + LocalTime.now().toString() + "\n")
            if (eventType in eventFlags) {
                eventArray = eventArray.plus("********\n")
            }
            historyString = generateReport()
        }
    }
}