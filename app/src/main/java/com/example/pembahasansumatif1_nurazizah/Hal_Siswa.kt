package com.example.pembahasansumatif1_nurazizah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Hal_Siswa : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_siswa)

        recyclerView = findViewById(R.id.TGGuru)
        var data = ArrayList<DataSiswa>()
        data.add(DataSiswa(R.drawable.siswa01,"alif"))
        data.add(DataSiswa(R.drawable.siswa02,"sinta"))
        data.add(DataSiswa(R.drawable.siswa03,"alana"))
        data.add(DataSiswa(R.drawable.siswa04,"toni"))
        data.add(DataSiswa(R.drawable.siswa05,"lama"))


        recyclerAdapter = Adapter_Siswa (data)
        layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = layoutManager

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}