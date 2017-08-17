package com.donzz.cocolab

/**
 * Created by ymow on 2017/8/17.
 */
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class CafeFilterRecyclerViewAdapter(private val context: Context, private val itemList: List<FilterObjects>) : RecyclerView.Adapter<CafeFilterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CafeFilterViewHolder {

        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.cafefilter_item, null)
        val rcv = CafeFilterViewHolder(layoutView)
        return rcv
    }

    override fun onBindViewHolder(holder: CafeFilterViewHolder, position: Int) {
        holder.filterIcon.setImageResource(itemList[position].photo)
    }

    override fun getItemCount(): Int {
        return this.itemList.size
    }
}