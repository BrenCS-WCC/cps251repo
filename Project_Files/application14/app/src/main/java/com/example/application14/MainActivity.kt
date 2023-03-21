package com.example.application14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import com.example.application14.ui.main.MainFragment

class MainActivity : AppCompatActivity(), secondFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onFragmentInteraction(uri: Uri) {

    }
}