package com.example.myapplication

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class BackgroundTaskService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate() {
        super.onCreate()
        log("BackgroundTaskService is ready to conquer!")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        log("BackgroundTaskService is performing a task! Don't disturb, please!")
        performLongTask()
        return START_STICKY // If the service is killed, it will be automatically restarted
    }

    private fun performLongTask() {
        // Imagine doing something that takes a long time here
        Thread.sleep(5000)
    }

    override fun onDestroy() {
        super.onDestroy()
        log("BackgroundTaskService says goodbye!")
    }

    fun log(str:String){
        Log.d("TAG", "log: $str")
    }
}