package com.restiadelia.klinikapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageDokterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_dokter)
        // Ambil data dari Intent
        val imageResId = intent.getIntExtra("imageResId", 0)
        val namaDokter = intent.getStringExtra("namaDokter")
        val spesialis = intent.getStringExtra("spesialis")
        val jumlahRating = intent.getStringExtra("jumlahRating")
        val rating = intent.getStringExtra("rating")

        // Tampilkan data pada komponen UI
        findViewById<ImageView>(R.id.imgdoktor).setImageResource(imageResId)
        findViewById<TextView>(R.id.namadoktor).text = namaDokter
        findViewById<TextView>(R.id.txtspesialis).text = spesialis
        findViewById<TextView>(R.id.txtJumlahRating).text = jumlahRating
        findViewById<TextView>(R.id.txtrating).text = rating
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}