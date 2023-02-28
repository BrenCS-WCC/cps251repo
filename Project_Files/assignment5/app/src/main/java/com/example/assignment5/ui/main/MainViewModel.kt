package com.example.assignment5.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
    private var newName = ""
    private var nameArray = arrayOf<String>()
    //private var summaryString = ""
    private var summaryString: MutableLiveData<String> = MutableLiveData()

    fun addName(value: String) {
        newName = value
        nameArray = nameArray.plus(newName)
    }

    fun parseNames() : MutableLiveData<String> {
        summaryString.value = ""

        for (name in nameArray) {
            summaryString.value = summaryString.value + name + "\n"
        }

        return if (summaryString.equals("")) {
            MutableLiveData<String>("No names to display.")
        } else {
            summaryString
        }
    }
}