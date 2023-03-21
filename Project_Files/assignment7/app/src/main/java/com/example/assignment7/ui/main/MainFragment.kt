package com.example.assignment7.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.assignment7.R
import android.util.Log

import com.example.assignment7.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.imageButton1.setOnClickListener {
            val action: MainFragmentDirections.MainToSecond = MainFragmentDirections.mainToSecond()
            action.setTitle("image1")
            Log.v("Log", "Sent data: " + action.title)

            Navigation.findNavController(it).navigate(action)
        }
        binding.imageButton2.setOnClickListener {
            val action: MainFragmentDirections.MainToSecond = MainFragmentDirections.mainToSecond()
            action.setTitle("image2")
            Log.v("Log", "Sent data: " + action.title)

            Navigation.findNavController(it).navigate(action)
        }
        binding.imageButton3.setOnClickListener {
            val action: MainFragmentDirections.MainToSecond = MainFragmentDirections.mainToSecond()
            action.setTitle("image3")
            Log.v("Log", "Sent data: " + action.title)

            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}