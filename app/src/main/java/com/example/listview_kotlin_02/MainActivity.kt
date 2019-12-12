package com.example.listview_kotlin_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {




//Array-String

    val lang= arrayOf<String>("C","C++","Java",".Net","Kotlin","Ruby","Rails","Python","Java Script","Php","Ajax","Perl","Hadoop")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list:ListView=findViewById<ListView>(R.id.list)

        //Setting adapter in listview
       val arrayAdapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lang)
        list.adapter=arrayAdapter


         list.onItemClickListener= AdapterView.OnItemClickListener {adapterView, view, position, id ->

           val selectedItem= adapterView.getItemAtPosition(position)
           val  itemIdAtPos:Long =adapterView.getItemIdAtPosition(position)

            Toast.makeText(applicationContext,"click item $selectedItem its position $itemIdAtPos",
              Toast.LENGTH_SHORT).show()



      }



    }
}
