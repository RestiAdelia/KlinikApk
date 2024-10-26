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

class AdapterListDoktor(
    private val itemMenuDoktor: List<ModelListDoctor>
) : RecyclerView.Adapter<AdapterListDoktor.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgdoktor: ImageView = itemView.findViewById(R.id.imgdoktor)
        var namadoktor: TextView = itemView.findViewById(R.id.namadoktor)
        var spesialis: TextView = itemView.findViewById(R.id.txtspesialis)
        var txtJumlahRating: TextView = itemView.findViewById(R.id.txtJumlahRating)
        var txtrating: TextView = itemView.findViewById(R.id.txtrating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_listdoktor, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemMenuDoktor.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemMenuDoktor[position]
        holder.imgdoktor.setImageResource(currentItem.imgDoctor)
        holder.namadoktor.text = currentItem.namaDoctor
        holder.spesialis.text = currentItem.spesiesDoctor
        holder.txtJumlahRating.text = currentItem.jumlahReting
        holder.txtrating.text = currentItem.angkarating
    }
}
