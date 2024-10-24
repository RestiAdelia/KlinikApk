package com.restiadelia.klinikapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.restiadelia.klinikapp.R
import com.restiadelia.klinikapp.model.ModelListDoctor


class AdapterListDoktor (
    val itemMenuDoktor:  List<ModelListDoctor>
): RecyclerView.Adapter<AdapterMenuIcon.MyviewHolder>() {
    class MyviewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var imgdoktor: ImageView = itemView.findViewById(R.id.imgdoktor)
        var namadoktor : TextView = itemView.findViewById(R.id.namadoktor)
        var spesialis :TextView=itemView.findViewById(R.id.txtspesialis)
        var txtreview : RatingBar=itemView.findViewById(R.id.txtreview)
        var txtrating : TextView=itemView.findViewById(R.id.txtrating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MyviewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_listdoktor,parent,false)
        return MyviewHolder(nView)
    }

    override fun onBindViewHolder(holder: AdapterMenuIcon.MyviewHolder, position: Int) {
        val currentItem = itemMenuDoktor[position]
        holder.imgdoktor.setImageResource(currentItem.imgDoctor)
        holder.namadoktor.text=currentItem.namaDoctor
        holder.spesialis.text=currentItem.spesiesDoctor
        holder.txtreview.text =currentItem.jumlahReting
        holder.txtrating.text=currentItem.angkarating
    }

    override fun getItemCount(): Int {
        return itemMenuDoktor.size
    }



}