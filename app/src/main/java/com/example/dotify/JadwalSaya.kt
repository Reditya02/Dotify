package com.example.dotify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class JadwalSaya : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var list: ArrayList<Jadwal> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jadwal_saya)

        list.addAll(CeritanyaDataBase.listJadwal)
        list.sortWith(compareBy({it.tanggal.reversed()}, {it.jam}))
        for (i in list.indices) {
            if (i < list.size-1) {
                if (list[i].tanggal == list[i+1].tanggal)
                    list[i+1].isFirst = false
            }
        }

        Log.i("list", list.size.toString())

        recyclerView = findViewById(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = AdapterJadwal(list)
        recyclerView.adapter = adapter
    }
}