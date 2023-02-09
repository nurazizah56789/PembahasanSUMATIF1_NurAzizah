package com.example.pembahasansumatif1_nurazizah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Hal_Guru : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_guru)

        recyclerView = findViewById(R.id.TGGuru)
        var data = ArrayList<DataGuru>()
        data.add(DataGuru(R.drawable.guru01,"al sini"))
        data.add(DataGuru(R.drawable.guru02,"Abdullah"))
        data.add(DataGuru(R.drawable.guru03,"sinta"))


        recyclerAdapter = Adapter_Guru (data)
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