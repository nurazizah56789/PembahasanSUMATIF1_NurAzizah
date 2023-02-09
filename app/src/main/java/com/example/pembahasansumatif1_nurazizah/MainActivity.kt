package com.example.pembahasansumatif1_nurazizah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Jurusan(view: View){
        val pindah = Intent(this,Hal_Jurusan::class.java)
        startActivity(pindah)
    }

    fun Guru(view: View){
        val pindah = Intent(this,Hal_Guru::class.java)
        startActivity(pindah)
    }
    fun Siswa(view: View){
        val pindah = Intent(this,Hal_Siswa::class.java)
        startActivity(pindah)
    }
    fun Visimisi(view: View){
        val pindah = Intent(this,Hal_VISIMISI::class.java)
        startActivity(pindah)
    }
}