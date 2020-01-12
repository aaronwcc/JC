package com.example.compa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import android.R.attr.data
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener




class MainActivity : AppCompatActivity() {

    private lateinit var itemsAdapter: ItemsRecyclerAdapter

    val list = ArrayList<Items>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //addDataSet()

        btnTest.setOnClickListener({
            initRecyclerView()

            list.add(
                Items(
                    "CPU",
                    R.drawable.ryzen5cpu,
                    "AMD Ryzen 5 3600 3.6 GHz 6-Core Processor",
                    859.00
                )
            )

            itemsAdapter.submitList(list)



        })

        btnTest2.setOnClickListener {

            if (list.size != 0){
                list.removeAt(0)
            initRecyclerView()
            itemsAdapter.submitList(list)
        }else{
                Toast.makeText(this, "No Component Found!", Toast.LENGTH_SHORT).show()
            }
        }


    }



    /*private fun addDataSet(){ // 32:15
        //val data = DataSource.createDataSet()
        itemsAdapter.submitList(list)
    }*/

    private fun initRecyclerView(){
        rv.layoutManager = LinearLayoutManager(this@MainActivity)
        itemsAdapter = ItemsRecyclerAdapter()
        rv.adapter = itemsAdapter
        }

fun test123(del:View){
    Toast.makeText(this, "hello",Toast.LENGTH_SHORT).show()
}



    }

