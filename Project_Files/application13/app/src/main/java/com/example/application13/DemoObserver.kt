package com.example.application13

import androidx.lifecycle.*
import android.util.Log
import com.example.application13.ui.main.MainViewModel

class DemoObserver : LifecycleObserver {
    private val LOGTAG = "DemoObserver"

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        //Log.i(LOGTAG,"onResume")
        MainViewModel.logEvent(Lifecycle.Event.ON_RESUME)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        //Log.i(LOGTAG, "onPause")
        MainViewModel.logEvent(Lifecycle.Event.ON_PAUSE)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        //Log.i(LOGTAG,"onCreate")
        MainViewModel.logEvent(Lifecycle.Event.ON_CREATE)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        //Log.i(LOGTAG, "onStart")
        MainViewModel.logEvent(Lifecycle.Event.ON_START)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        //Log.i(LOGTAG, "onStop")
        MainViewModel.logEvent(Lifecycle.Event.ON_STOP)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        //Log.i(LOGTAG,"onDestroy")
        MainViewModel.logEvent(Lifecycle.Event.ON_DESTROY)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onAny(owner: LifecycleOwner, event: Lifecycle.Event){
        //Log.i(LOGTAG, owner.lifecycle.currentState.name)
    }
}