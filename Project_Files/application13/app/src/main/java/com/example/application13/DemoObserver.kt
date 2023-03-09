package com.example.application13

import androidx.lifecycle.*
import com.example.application13.ui.main.MainViewModel

class DemoObserver : LifecycleObserver {
    private val LOGTAG = "DemoObserver"

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        MainViewModel.createLog(Lifecycle.Event.ON_RESUME)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        MainViewModel.createLog(Lifecycle.Event.ON_PAUSE)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        MainViewModel.createLog(Lifecycle.Event.ON_CREATE)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        MainViewModel.createLog(Lifecycle.Event.ON_START)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        MainViewModel.createLog(Lifecycle.Event.ON_STOP)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        MainViewModel.createLog(Lifecycle.Event.ON_DESTROY)
    }

//    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
//    fun onAny(owner: LifecycleOwner, event: Lifecycle.Event){
//        //Log.i(LOGTAG, owner.lifecycle.currentState.name)
//    }
}