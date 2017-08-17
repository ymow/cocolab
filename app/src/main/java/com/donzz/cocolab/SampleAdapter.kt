//package com.donzz.cocolab
//
//import android.content.Context
//import android.util.Log
//import android.util.SparseArray
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ArrayAdapter
//import android.widget.Button
//import android.widget.Toast
//import com.etsy.android.grid.util.DynamicHeightTextView
//import java.util.*
//
///***
// * ADAPTER
// */
//
//class SampleAdapter(context: Context, textViewResourceId: Int) : ArrayAdapter<String>(context, textViewResourceId) {
//
//    internal class ViewHolder {
//        var txtLineOne: DynamicHeightTextView? = null
//        var btnGo: Button? = null
//    }
//
//    private val mLayoutInflater: LayoutInflater
//    private val mRandom: Random
//    private val mBackgroundColors: ArrayList<Int>
//
//    init {
//        mLayoutInflater = LayoutInflater.from(context)
//        mRandom = Random()
//        mBackgroundColors = ArrayList<Int>()
//        mBackgroundColors.add(R.color.orange)
//        mBackgroundColors.add(R.color.green)
//        mBackgroundColors.add(R.color.blue)
//        mBackgroundColors.add(R.color.yellow)
//        mBackgroundColors.add(R.color.grey)
//    }
//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        var convertView = convertView
//
//        val vh: ViewHolder
//        if (convertView == null) {
//            convertView = mLayoutInflater.inflate(R.layout.list_item_sample, parent, false)
//            vh = ViewHolder()
//            vh.txtLineOne = convertView!!.findViewById<View>(R.id.txt_line1) as DynamicHeightTextView
//            vh.btnGo = convertView.findViewById<View>(R.id.btn_go) as Button
//
//            convertView.tag = vh
//        } else {
//            vh = convertView.tag as ViewHolder
//        }
//
//        val positionHeight = getPositionRatio(position)
//        val backgroundIndex = if (position >= mBackgroundColors.size)
//            position % mBackgroundColors.size
//        else
//            position
//
//        convertView.setBackgroundResource(mBackgroundColors[backgroundIndex])
//
//        Log.d(TAG, "getView position:$position h:$positionHeight")
//
//        vh.txtLineOne!!.heightRatio = positionHeight
//        vh.txtLineOne!!.text = getItem(position)!! + position
//
//        vh.btnGo!!.setOnClickListener { Toast.makeText(context, "Button Clicked Position " + position, Toast.LENGTH_SHORT).show() }
//
//        return convertView
//    }
//
//    private fun getPositionRatio(position: Int): Double {
//        var ratio = sPositionHeightRatios.get(position, 0.0)
//        // if not yet done generate and stash the columns height
//        // in our real world scenario this will be determined by
//        // some match based on the known height and width of the image
//        // and maybe a helpful way to get the column height!
//        if (ratio == 0.0) {
//            ratio = randomHeightRatio
//            sPositionHeightRatios.append(position, ratio)
//            Log.d(TAG, "getPositionRatio:$position ratio:$ratio")
//        }
//        return ratio
//    }
//
//    private // height will be 1.0 - 1.5 the width
//    val randomHeightRatio: Double
//        get() = mRandom.nextDouble() / 2.0 + 1.0
//
//    companion object {
//
//        private val TAG = "SampleAdapter"
//
//        private val sPositionHeightRatios = SparseArray<Double>()
//    }
//}