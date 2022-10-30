package com.example.lifecycleawareness

import androidx.lifecycle.LifecycleObserver
import com.example.lifecycleawareness.ui.main.MainViewModel
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.LifecycleOwner

class Tracking: LifecycleObserver {

    private val LOG_TAG = "trackingObserver"
    var mv = MainViewModel

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        Log.i(LOG_TAG, "onResume")
        mv.aware("onResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(){
        Log.i(LOG_TAG, "onStart")
        mv.aware("onStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.i(LOG_TAG, "onCreate")
        mv.aware("onCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        Log.i(LOG_TAG, "onPause")
        mv.aware("onPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        Log.i(LOG_TAG, "onStop")
        mv.aware("onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(){
        Log.i(LOG_TAG, "onDestroy")
        mv.aware("onDestroy")
    }
}