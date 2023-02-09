package com.example.pembahasansumatif1_nurazizah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Hal_Jurusan : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_jurusan)

        recyclerView = findViewById(R.id.TGJurusan)
        var data = ArrayList<DataJurusan>()
        data.add(DataJurusan(R.drawable.rpl,"Rekayasa Perangkat Lunak"))
        data.add(DataJurusan(R.drawable.tkj,"Teknik Komputer dan Jaringan"))
        data.add(DataJurusan(R.drawable.tb,"Tata Busana"))
        data.add(DataJurusan(R.drawable.tkr,"Teknik Kendaraan Ringan"))
        data.add(DataJurusan(R.drawable.tsm,"Teknik Sepeda Motor"))

        recyclerAdapter = Adapter_Jurusan (data)
        layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = layoutManager

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


    }
