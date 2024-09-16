package com.example.myapplication

import android.app.IntentService
import android.content.Intent
import android.content.Context
import android.util.Log

class IntentTaskService : IntentService("IntentTaskService") {

    @Deprecated("Deprecated in Java")
    override fun onHandleIntent(intent: Intent?) {
        log("IntentTaskService is on a mission to conquer a task!")
        performLongTask()
    }

    private fun performLongTask() {
        // Imagine doing something that takes a long time here
        Thread.sleep(5000)
    }

    @Deprecated("Deprecated in Java")
    override fun onDestroy() {
        super.onDestroy()
        log("IntentTaskService says farewell!")
    }

    fun log(str:String){
        Log.d("TAG", "log: $str")
    }
}