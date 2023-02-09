package com.example.pembahasansumatif1_nurazizah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter_Guru (private val dataset: ArrayList<DataGuru>):
    RecyclerView.Adapter<Adapter_Guru.ViewHolder>(){
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var gambar: ImageView = view.findViewById(R.id.TGGuru)
        var nama: TextView = view.findViewById(R.id.teksGuru)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter_Guru.ViewHolder {
        val inflate = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_adapter_guru,parent,false)
        return Adapter_Guru.ViewHolder(inflate)

    }

    override fun onBindViewHolder(holder: Adapter_Guru.ViewHolder, position: Int) {
        val DataGuru= dataset[position]
        holder.gambar.setImageResource(DataGuru.gambar)
        holder.nama.text = DataGuru.nama

    }

    override fun getItemCount(): Int {
        return dataset.size

    }


}
