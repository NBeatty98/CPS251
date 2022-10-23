package com.example.nslivedata.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    var name: MutableLiveData<String> = MutableLiveData()
    var result: MutableLiveData<String> = MutableLiveData()
    var store: MutableLiveData<String> = MutableLiveData()

    fun convertName(){
        name.let{
            if(!it.value.isNullOrEmpty()){
                if(result.value == null){
                    store.value = it.value
                    result.value = store.value
                }
                else {
                    if (result.value == "Please enter a name") {
                        if(store.value.isNullOrEmpty()){
                            store.value = it.value
                        }else {
                            store.value = store.value + "\n" + it.value
                        }
                        result.value = store.value
                    } else {
                        store.value = store.value + "\n" + it.value
                        result.value = store.value
                    }
                }
            }else {
                result.value= "Please enter a name"
            }
        }
    }
}
