package com.donzz.cocolab

/**
 * Created by ymow on 2017/8/17.
 */
import java.util.*

object SampleData {

    val SAMPLE_DATA_ITEM_COUNT = 100

    fun generateSampleData(): ArrayList<String> {
        val data = ArrayList<String>(SAMPLE_DATA_ITEM_COUNT)

        for (i in 0..SAMPLE_DATA_ITEM_COUNT - 1) {
            data.add("SAMPLE #")
        }

        return data
    }

}