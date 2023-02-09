package com.example.pembahasansumatif1_nurazizah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter_Siswa (private val dataset: ArrayList<DataSiswa>):
        RecyclerView.Adapter<Adapter_Siswa.ViewHolder>(){
        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            var gambar: ImageView = view.findViewById(R.id.TGSiswa)
            var nama: TextView = view.findViewById(R.id.teksSiswa)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter_Siswa.ViewHolder {
            val inflate = LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_adapter_siswa,parent,false)
            return Adapter_Siswa.ViewHolder(inflate)

        }

        override fun onBindViewHolder(holder: Adapter_Siswa.ViewHolder, position: Int) {
            val DataSiswa= dataset[position]
            holder.gambar.setImageResource(DataSiswa.gambar)
            holder.nama.text = DataSiswa.nama

        }

        override fun getItemCount(): Int {
            return dataset.size
    }
}