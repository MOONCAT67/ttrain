package com.example.train_track

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class adapter(private val context: Activity,private val arrayList: ArrayList<Trip>):ArrayAdapter<Trip>(context,
    R.layout.single_item,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.single_item,null)

        val imageview = view.findViewById<ImageView>(R.id.trainlist)
        val title = view.findViewById<TextView>(R.id.tiitle)
        val pilotname = view.findViewById<TextView>(R.id.info)
        val time =view.findViewById<TextView>(R.id.time)


        title.text=arrayList[position].distination
        pilotname.text=arrayList[position].pilotname
        time.text=arrayList[position].stratingtime




        return view
    }

}