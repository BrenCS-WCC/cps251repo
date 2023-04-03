package com.example.application16

class Data {
    private val titles = arrayOf(
        "Chapter One",
        "Chapter Two",
        "Chapter Three",
        "Chapter Four",
        "Chapter Five",
        "Chapter Six",
        "Chapter Seven",
        "Chapter Eight"
    )

    private val details = arrayOf(
        "Item one details",
        "Item two details",
        "Item three details",
        "Item four details",
        "Item five details",
        "Item six details",
        "Item seven details",
        "Item eight details"
    )

    private val images = intArrayOf(
        R.drawable.android_image_1,
        R.drawable.android_image_2,
        R.drawable.android_image_3,
        R.drawable.android_image_4,
        R.drawable.android_image_5,
        R.drawable.android_image_6,
        R.drawable.android_image_7,
        R.drawable.android_image_8
    )

    fun shuffleData(){
        titles.shuffle()
        details.shuffle()
        images.shuffle()
    }

    fun getItemTitle(index : Int) : String {
        return titles[index] as String
    }

    fun getItemDetail(index : Int) : String {
        return details[index] as String
    }

    fun getItemImage(index : Int) : Int {
        return images[index] as Int
    }

    fun getTitleSize() : Int {
        return titles.size
    }
}