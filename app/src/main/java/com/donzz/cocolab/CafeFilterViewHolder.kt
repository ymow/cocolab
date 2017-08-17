package com.donzz.cocolab

/**
 * Created by ymow on 2017/8/17.
 */
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class CafeFilterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    var filterIcon: ImageView

    init {
        itemView.setOnClickListener(this)
        filterIcon = itemView.findViewById<View>(R.id.filterIcon) as ImageView
    }

    override fun onClick(view: View) {
        Toast.makeText(view.context, "Clicked Position = " + position, Toast.LENGTH_SHORT).show()
    }
}