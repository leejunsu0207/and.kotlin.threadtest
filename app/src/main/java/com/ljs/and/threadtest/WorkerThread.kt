package com.ljs.and.threadtest

import android.util.Log

class WorkerThread: Thread() {

    override fun run() {
        var i = 0
        while(i < 10){
            i += 1
            Log.i("WorkerThread", "$i")
        }
    }
}