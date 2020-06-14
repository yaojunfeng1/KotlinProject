package com.yao.kotlinlearn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*

class MyAdapter(data:List<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    private var data:List<String>? = null;

    init {
        this.data = data
    }

    override fun getItemCount(): Int {
        return data?.size?:0
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.itemView?.text?.text = position.toString()+data?.get(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent?.context).inflate(R.layout.item_view, parent, false)
        return ViewHolder(view)
    }
}