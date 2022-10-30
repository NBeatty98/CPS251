package com.example.lifecycleawareness.ui.main

import android.os.SystemClock
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {

    companion object {
        private var input: MutableLiveData<String> = MutableLiveData()
        private var save: MutableLiveData<String> = MutableLiveData()

        fun aware(value: String) {
            input.value = "*******************" + "\n" + value + " was fired at " + java.time.LocalTime.now()
            if (save.value != null) {
                save.value = save.value + input.value + "\n"
            } else {
                save.value = input.value + "\n"
            }
        }
        }
        fun getPrint(): MutableLiveData<String> {
            return save
        }
    }