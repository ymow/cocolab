//package com.donzz.cocolab
//
//
//import android.content.Context
//import android.support.v7.widget.RecyclerView
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import kotlinx.android.synthetic.main.list_layout.view.*
//import java.util.*
///**
// * Created by ymow on 2017/8/16.
// */
//class ListAdapter(var c: Context, var lists: ArrayList<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder? {
//        var v = LayoutInflater.from(c).inflate(R.layout.list_layout, parent, false)
//        return Item(v)
//    }
//
//    override fun getItemCount(): Int {
//        return lists.size
//    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
//        (holder as Item).bindData(lists[position])
//    }
//
//    class Item(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        fun bindData(_list: String) {
//            itemView.textView.text = _list
//            itemView.imageButton.setImageResource(R.drawable.abc_btn_radio_material)
//        }
//    }
//}