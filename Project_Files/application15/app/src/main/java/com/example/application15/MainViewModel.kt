package com.example.application15

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    companion object {
        private var itemTitle = ""
        private var itemDetail = ""
        private var itemImage = 0

        private var data = Data()
    }

    public fun shuffleCards() {
        data.shuffleData()
    }

    fun getItemTitle(index : Int) : String {
        return data.getItemTitle(index)
    }

    fun getItemDetail(index : Int) : String {
        return data.getItemDetail(index)
    }

    fun getItemImage(index : Int) : Int {
        return data.getItemImage(index)
    }

    fun getListSize() : Int {
        return data.getTitleSize()
    }
}