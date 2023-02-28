package com.example.assignment5.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer

import com.example.assignment5.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState:Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val addNameButton = binding.addNameButton
        val textEntryField = binding.enterNameField
        val nameDisplay = binding.nameList

        //Grab value on recreation

        //nameDisplay.text = viewModel.parseNames() - Deprecate previous code
        val resultObserver = Observer<String> {
            result -> nameDisplay.text = result.toString()
        }
        viewModel.parseNames().observe(viewLifecycleOwner, resultObserver)

        addNameButton.setOnClickListener {
            if (textEntryField.text.isNotEmpty()) {
                val newName : String = textEntryField.text.toString()
                viewModel.addName(newName)

                //nameDisplay.text = viewModel.parseNames() - Deprecate previous code
                viewModel.parseNames().observe(viewLifecycleOwner, resultObserver)
            } else {
                textEntryField.hint = "Please enter a name."
            }
        }
    }
}