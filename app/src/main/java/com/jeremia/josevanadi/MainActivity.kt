package com.jeremia.josevanadi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun hasil(view: View){
        val jumlahPinjaman = findViewById<EditText>(R.id.jumlah_pinjaman)
        val tenggatWaktu = findViewById<EditText>(R.id.tenggat_waktu)
        val hasil = findViewById<TextView>(R.id.textView4)
        val syarat = findViewById<TextView>(R.id.textView3)

        val ketentuan = jumlahPinjaman.text.toString().toDouble()*0.05
        val bunga = jumlahPinjaman.text.toString().toDouble()*0.0375


        val uangCair = jumlahPinjaman.text.toString().toDouble() - ketentuan
        val lunas = jumlahPinjaman.text.toString().toDouble() + bunga*tenggatWaktu.text.toString().toDouble()

        syarat.text = uangCair.toString()
        hasil.text = lunas.toString()

    }
}