package com.example.assignment7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.net.Uri
import android.util.Log

import com.example.assignment7.databinding.FragmentSecondBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {
    interface OnFragmentInteractionListener {
        fun onFragmentInteraction(uri: Uri)
    }

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onStart(){
        super.onStart()
        arguments?.let {
            val args = SecondFragmentArgs.fromBundle(it)
            var thisTitle = args.getTitle()
            binding.titleView.text = thisTitle

            when (thisTitle) {
                "image1" -> {
                    binding.titleView.text = "Image 1"
                    binding.imageView.setImageResource(R.drawable.android_image_1)
                }
                "image2" -> {
                    binding.titleView.text = "Image 2"
                    binding.imageView.setImageResource(R.drawable.android_image_2)
                }
                "image3" -> {
                    binding.titleView.text = "Image 3"
                    binding.imageView.setImageResource(R.drawable.android_image_3)
                }
            }

            Log.v("Log", "Received data:" + args.title)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SecondFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}