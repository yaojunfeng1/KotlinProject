package com.yao.kotlinlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CoroutineActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("AA", "协程初始化开始，时间: " + System.currentTimeMillis())
        GlobalScope.launch(Dispatchers.IO) {
            Log.d("AA", "协程初始化完成，时间: " + System.currentTimeMillis())
            for (i in 1..3) {
                Log.d("AA", "协程任务1打印第$i 次，时间: " + System.currentTimeMillis())
            }
            delay(500);
            for (i in 1..3) {
                Log.d("AA", "协程任务1打印第$i 次，时间: " + System.currentTimeMillis())
            }
        }
        Log.d("AA", "主线程 sleep ，时间: " + System.currentTimeMillis())
        Thread.sleep(1000)
        Log.d("AA", "主线程运行，时间: " + System.currentTimeMillis())

        for (i in 1..3) {
            Log.d("AA", "主线程打印第$i 次，时间: " + System.currentTimeMillis())
        }


        val printMsg = {msg:String->
            Log.d("AA", "2222")
        }

        fun doPrint(msg:String){
            printMsg.invoke(msg)
        }

        doPrint("444444444")

        tv.setOnClickListener{
            Log.d("AA", "2222")
        }
    }
}
