package com.ljs.and.threadtest

import android.util.Log

class WorkerRunnable: Runnable {
    override fun run() {
        var i = 0
        while (i < 10){
            i += 1
            Log.i("WorkerRunnable", "$i")
        }
    }
}