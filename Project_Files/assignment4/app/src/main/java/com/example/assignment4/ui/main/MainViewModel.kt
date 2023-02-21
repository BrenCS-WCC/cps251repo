package com.example.assignment4.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var newName = ""
    private var nameArray = arrayOf<String>()

    fun addName(value: String) {
        newName = value
        nameArray = nameArray.plus(newName)
    }

    fun parseNames() : String {
        var summaryString = ""
        for (name in nameArray) {
            summaryString = summaryString + name + "\n"
        }

        return if (summaryString == "") {
            "No names to display."
        } else {
            summaryString
        }
    }
}