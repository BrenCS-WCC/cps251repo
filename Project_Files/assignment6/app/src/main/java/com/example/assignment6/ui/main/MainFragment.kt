package com.example.assignment6.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignment6.R
import com.example.assignment6.DemoObserver
import com.example.assignment6.databinding.FragmentMainBinding
import androidx.databinding.DataBindingUtil

import com.example.assignment6.BR.mainViewModel

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_main,container,false)
        binding.lifecycleOwner = viewLifecycleOwner

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.setVariable(mainViewModel, viewModel)

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycle.addObserver(DemoObserver())
    }
}