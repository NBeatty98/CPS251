package com.example.nslivedata.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nslivedata.databinding.FragmentMainBinding
import androidx.databinding.DataBindingUtil
import com.example.nslivedata.R
import com.example.nslivedata.BR.myViewModel

class MainFragment : Fragment() {

//    private var _binding: FragmentMainBinding? = null
//    private val binding get() = _binding!!

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        _binding = FragmentMainBinding.inflate(inflater, container, false)
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_main, container, false)
        binding.setLifecycleOwner(this)
        return binding.root
    }
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.setVariable(myViewModel, viewModel)
//        binding.names.text = viewModel.getNames().toString()
//
//        binding.button.setOnClickListener {
//            if (binding.typeBox.text.isNotEmpty()) {
//                viewModel.setNames(binding.typeBox.text.toString())
//                binding.names.text = viewModel.getNames().toString()
//            } else {
//                binding.names.text = "No Value"
//            }
//        }
        // TODO: Use the ViewModel
    }

}


