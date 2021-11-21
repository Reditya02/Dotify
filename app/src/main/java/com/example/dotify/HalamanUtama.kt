package com.example.dotify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class HalamanUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)

        findViewById<MaterialButton>(R.id.jadwal_saya).setOnClickListener {
            val intent = Intent(this, JadwalSaya::class.java)
            startActivity(intent)
        }
    }
}