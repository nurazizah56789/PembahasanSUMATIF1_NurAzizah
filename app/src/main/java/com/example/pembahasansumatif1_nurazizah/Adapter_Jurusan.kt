package com.example.pembahasansumatif1_nurazizah

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter_Jurusan (private val dataset: ArrayList<DataJurusan>):
    RecyclerView.Adapter<Adapter_Jurusan.ViewHolder>(){
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var gambar: ImageView = view.findViewById(R.id.TGJurusan)
        var nama: TextView = view.findViewById(R.id.teksjurusan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter_Jurusan.ViewHolder {
        val inflate = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_adapter_jurusan,parent,false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: Adapter_Jurusan.ViewHolder, position: Int) {
        val DataJurusan = dataset[position]
        holder.gambar.setImageResource(DataJurusan.gambar)
        holder.nama.text = DataJurusan.namaJurusan
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}
