package com.ljs.and.threadtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ljs.and.threadtest.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // thread 객체
        var thread = WorkerThread()
        thread.start()

        // Runnable 인터페이스
        var thread1 = Thread(WorkerRunnable())
        thread1.start()

        Thread{// 람다식으로 Runnable 익명객체 구현
            var i = 0
            while(i < 10){
                i += 1
                Log.i("LambdaThread", "$i")
            }
        }.start()


        thread(start=true){
            var i = 0
            while(i < 10){
                i += 1
                Log.i("KotlinThread", "$i")
            }
        }



    }
}