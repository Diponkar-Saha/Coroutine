package com.example.wation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {

            val xx=net()
            Log.d(TAG,xx)
        }


//        val job= GlobalScope.launch (Dispatchers.Default) {
//            repeat(5){
//                Log.d(TAG,"couroutine")
//                delay(5000L)
//            }
//        }
//        runBlocking {
//            job.join()
//            Log.d(TAG,"Main thread")
//
//        }
    }
    suspend fun net():String{
        delay(3000)
        return "tttttt"
    }
}