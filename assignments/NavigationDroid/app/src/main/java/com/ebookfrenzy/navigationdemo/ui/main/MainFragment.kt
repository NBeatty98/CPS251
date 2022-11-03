package com.ebookfrenzy.navigationdemo.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ebookfrenzy.navigationdemo.R
import androidx.navigation.Navigation

import com.ebookfrenzy.navigationdemo.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    private var _binding: MainFragmentBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.button.setOnClickListener {
            val action: MainFragmentDirections.MainToSecond  =  MainFragmentDirections.mainToSecond()

            action.setMessage("Image1")
            action.setPicture(R.mipmap.droid1)
            Navigation.findNavController(it).navigate(action)

        }

        binding.button2.setOnClickListener{
            val action: MainFragmentDirections.MainToSecond = MainFragmentDirections.mainToSecond()

            action.setMessage("Image2")
            action.setPicture(R.mipmap.droid2)
            Navigation.findNavController(it).navigate(action)
        }

        binding.button3.setOnClickListener{
            val action: MainFragmentDirections.MainToSecond = MainFragmentDirections.mainToSecond()

            action.setMessage("Image3")
            action.setPicture(R.mipmap.droid3)
            Navigation.findNavController(it).navigate(action)
        }
    }

}