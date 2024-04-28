package com.example.train_track

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.example.train_track.databinding.ActivityUserHomePageBinding


class user_home_page : AppCompatActivity() {

    private lateinit var binding: ActivityUserHomePageBinding
    private lateinit var triparraylist : ArrayList<Trip>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)








        binding = ActivityUserHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageid = intArrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f
        )
        val name = arrayOf(
            "S.Tabi",
            "M.Sadek",
            "A.Belgasem",
            "R.Fohamed",
            "A.Fahmi",
            "M.Nacir"
        )
        val dest = arrayOf(
            "train from SOUS to MAH",
            "train from MON to MAH",
            "train from SOUS to MON",
            "train from SOUS to MON",
            "train from MON to MAH",
            "train from MAH to SOUS"
        )
        val time = arrayOf(
            ":   09:30 AM",
            ":   07:45 PM",
            ":   04:34 AM",
            ":   05:10 PM",
            ":   08:55 AM",
            ":   01:20 PM"
        )
        val endtime = arrayOf(
            ":   010:30 AM",
            ":   09:45 PM",
            ":   06:34 AM",
            ":   07:10 PM",
            ":   10:55 AM",
            ":   03:20 PM"
        )



        triparraylist = ArrayList()
        for(i in name.indices){
            val trip =Trip(name[i],dest[i],imageid[i],time[i],endtime[i])
            triparraylist.add(trip)
        }

        binding.list.isClickable = true

        binding.list.adapter = adapter(this, triparraylist)
        binding.list.setOnItemClickListener { adapterView, view, i, l ->

            val namee = name[i]
            val imageide = imageid[i]
            val desten = dest[i]
            val depti = time[i]
            val edtime = endtime[i]

            val x = Intent(this@user_home_page, tripinf::class.java)
            x.putExtra("name",namee)
            x.putExtra("image_id",imageide)
            x.putExtra("sdestination",desten)
            x.putExtra("depart time",depti)
            x.putExtra("ending time",edtime)
            startActivity(x)

        }







        WindowCompat.setDecorFitsSystemWindows(window,
            false
        )





        val prof = findViewById<ImageView>(R.id.profile)
        prof.setOnClickListener {
            // Handle click event
            val intent = Intent(this@user_home_page, profile::class.java)
            startActivity(intent)
        }





    }
}