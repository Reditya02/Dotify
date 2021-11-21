package com.example.dotify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.halaman_utama).setOnClickListener {
            var intent: Intent = Intent(this, HalamanUtama::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.jadwal_saya).setOnClickListener {
            var intent: Intent = Intent(this, JadwalSaya::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.tambah_jadwal).setOnClickListener {
            var intent: Intent = Intent(this, TambahJadwal::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.ubah_jadwal).setOnClickListener {
            var intent: Intent = Intent(this, UbahJadwal::class.java)
            startActivity(intent)
        }
    }
}