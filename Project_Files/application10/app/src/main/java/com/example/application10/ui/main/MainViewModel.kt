package com.example.application10.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
    private val rate = 0.74f
    private var dollarText = ""
    //private var result: Float = 0f
    private var result : MutableLiveData<Float> = MutableLiveData()

    fun setAmount(value: String) {
        this.dollarText = value
        //result = value.toFloat() * rate
        result.value = value.toFloat() * rate
    }

    fun getResult() : MutableLiveData<Float> {
        return result
    }
}