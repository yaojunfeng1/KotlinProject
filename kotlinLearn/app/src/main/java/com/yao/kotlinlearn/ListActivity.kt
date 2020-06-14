package com.yao.kotlinlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.SimpleAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*


class ListActivity : AppCompatActivity() {


    private var adapter: MyAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        initList();
    }

    private fun initList(){
        var data : Array<String> = Array(10) {""}
        for (i in data.indices){
            data[i] = "test$i"
        }

        listview.layoutManager = LinearLayoutManager(this)
        adapter = MyAdapter(data.asList())
        listview.adapter = adapter
    }


}
