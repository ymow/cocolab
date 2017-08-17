package com.donzz.cocolab

/**
 * Created by ymow on 2017/8/17.
 */
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class CafeMainRecyclerViewAdapter(private val context: Context, private val itemList: List<ItemObjects>) : RecyclerView.Adapter<CafeMainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CafeMainViewHolder {

        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.cafemain_item, null)
        val rcv = CafeMainViewHolder(layoutView)
        return rcv
    }

    override fun onBindViewHolder(holder: CafeMainViewHolder, position: Int) {
        holder.countryName.setText(itemList[position].name)
        holder.countryPhoto.setImageResource(itemList[position].photo)
    }

    override fun getItemCount(): Int {
        return this.itemList.size
    }
}