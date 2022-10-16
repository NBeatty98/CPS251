package com.example.namesave.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private var name = ""

    fun setNames(value: String){
        if(name=="") {
            name = value
        } else
            name = name + "\n" + value
    }

    fun getNames(): String{
        return name
    }
}
