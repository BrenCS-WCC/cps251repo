package com.example.application11.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.application11.R

import com.example.application11.databinding.FragmentMainBinding
import androidx.databinding.DataBindingUtil
import com.example.application11.BR.myViewModel
//import androidx.lifecycle.Observer

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    lateinit var binding: FragmentMainBinding

//    private var _binding: FragmentMainBinding? = null
//    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        _binding = FragmentMainBinding.inflate(inflater, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.setVariable(myViewModel, viewModel)
        //binding.resultText.text = viewModel.getResult().toString()

//        val resultObserver = Observer<Float> {
//            result -> binding.resultText.text = result.toString()
//        }
//        viewModel.getResult().observe(viewLifecycleOwner,resultObserver)
//
//        binding.convertButton.setOnClickListener {
//            if (binding.dollarText.text.isNotEmpty()) {
//                viewModel.setAmount(binding.dollarText.text.toString())
//                //binding.resultText.text = viewModel.getResult().toString()
//            } else {
//                binding.resultText.text = resources.getString(R.string.noEntryCallout)
//            }
//        }
    }
}