package com.restiadelia.klinikapp.screen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.restiadelia.klinikapp.R
import com.restiadelia.klinikapp.adapter.AdapterListDoktor
import com.restiadelia.klinikapp.model.ModelListDoctor

class HomeDoctorActivity : AppCompatActivity() {
    private var rv_list_doctor : RecyclerView? = null
    private var homeDoctorAdapter : AdapterListDoktor? = null

    private var doctorlist = mutableListOf<ModelListDoctor>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_doctor)
        rv_list_doctor = findViewById(R.id.rv_doctor)

        doctorlist = ArrayList()
        homeDoctorAdapter = AdapterListDoktor(doctorlist)

        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 1)
        rv_list_doctor!!.layoutManager = layoutManager
        rv_list_doctor!!.adapter = homeDoctorAdapter

        prepareDataDoctor()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun prepareDataDoctor() {
        var itemDoctors = ModelListDoctor(
            R.drawable.dokterr1,
            "Rizki Syaputra",
            "Dentist",
            "123",
            "5.0"
        )
        doctorlist.add(itemDoctors)
        itemDoctors = ModelListDoctor(
            R.drawable.dokterr3,
            "Rizki Bambang",
            "Dokter Umum",
            "100",
            "5.0",
        )
        doctorlist.add(itemDoctors)
        itemDoctors = ModelListDoctor(
            R.drawable.dokterr1,
            "Junaidi",
            "Dokter Gigi",
            "88",
            "5.0",
        )
        doctorlist.add(itemDoctors)

}
}