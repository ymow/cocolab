package com.donzz.cocolab

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener(View.OnClickListener {
            cafeFilterRecycleView.visibility = View.INVISIBLE
        })

        val CafeMainRecycleView = findViewById<View>(R.id.cafeMainRecycyleView) as RecyclerView
        CafeMainRecycleView.setHasFixedSize(true)

        var gaggeredGridLayoutManager = StaggeredGridLayoutManager(3, 1)
        CafeMainRecycleView.layoutManager = gaggeredGridLayoutManager

        val gaggeredList = getListItemData()

        val rcAdapter = CafeMainRecyclerViewAdapter(this@MainActivity, gaggeredList)
        CafeMainRecycleView.adapter = rcAdapter

        val CafeFilterRecycleView = findViewById<View>(R.id.cafeFilterRecycleView) as RecyclerView
        CafeMainRecycleView.setHasFixedSize(true)

        CafeFilterRecycleView.layoutManager =  LinearLayoutManager(this ,LinearLayoutManager.HORIZONTAL ,false)


        val toolList = getListItemData()

        val filterAdapter = CafeMainRecyclerViewAdapter(this@MainActivity, toolList)
        CafeFilterRecycleView.adapter = filterAdapter

    }

    fun getLists(): ArrayList<String> {
        var lists = ArrayList<String>()
        lists.add("JAVA")
        lists.add("KOTLIN")
        lists.add("PHP")
        lists.add("SWIFT")
        lists.add("JAVA Script")
        lists.add("MYSQL")
        return lists;
    }

    private fun getListItemData(): List<ItemObjects> {
        val listViewItems = ArrayList<ItemObjects>()
        listViewItems.add(ItemObjects("Alkane", R.drawable.one))
        listViewItems.add(ItemObjects("Ethane", R.drawable.two))
        listViewItems.add(ItemObjects("Alkyne", R.drawable.three))
        listViewItems.add(ItemObjects("Benzene", R.drawable.four))
        listViewItems.add(ItemObjects("Amide", R.drawable.one))
        listViewItems.add(ItemObjects("Amino Acid", R.drawable.two))
        listViewItems.add(ItemObjects("Phenol", R.drawable.three))
        listViewItems.add(ItemObjects("Carbonxylic", R.drawable.four))
        listViewItems.add(ItemObjects("Nitril", R.drawable.one))
        listViewItems.add(ItemObjects("Ether", R.drawable.two))
        listViewItems.add(ItemObjects("Ester", R.drawable.three))
        listViewItems.add(ItemObjects("Alcohol", R.drawable.four))

        return listViewItems
    }
}
