package com.example.tugasday34_recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gameAppList = arrayListOf(
            Aplikasi("FM20", 20,"game",R.drawable.img_avatar),
            Aplikasi("Arknight", 50,"game",R.drawable.img_avatar_dua),
            Aplikasi("PUBG Mobile", 200,"game",R.drawable.img_avatar),
            Aplikasi("One Punch Man", 100,"game",R.drawable.img_avatar_dua)
        )

        val perpesananAppList = arrayListOf(
            Aplikasi("Whatsapp", 20,"perpesanan",R.drawable.img_avatar),
            Aplikasi("Line", 30,"perpesanan",R.drawable.img_avatar_dua),
            Aplikasi("Telegram", 20,"perpesanan",R.drawable.img_avatar)
        )

        val perjalanAppList = arrayListOf(
            Aplikasi("Traveloka", 25,"perjalanan",R.drawable.img_avatar_dua),
            Aplikasi("Tiket.Com", 15,"perjalanan",R.drawable.img_avatar),
            Aplikasi("PegiPegi", 30,"perjalanan",R.drawable.img_avatar_dua),
            Aplikasi("Lion Air Mobile", 25,"perjalanan",R.drawable.img_avatar)
        )

        val mediaAppList = arrayListOf(
            Aplikasi("VLC", 25,"media",R.drawable.img_avatar),
            Aplikasi("Media Player", 50,"media",R.drawable.img_avatar_dua),
            Aplikasi("iRadio", 50,"media",R.drawable.img_avatar),
            Aplikasi("Netflix", 200,"media",R.drawable.img_avatar_dua)
        )

        val financeAppList = arrayListOf(
            Aplikasi("BCA Mobile", 30,"finance",R.drawable.img_avatar),
            Aplikasi("Mandiri Mobile", 50,"finance",R.drawable.img_avatar_dua),
            Aplikasi("BNI Mobile", 70,"finance",R.drawable.img_avatar),
            Aplikasi("BRI Mobile", 10,"finance",R.drawable.img_avatar_dua),
            Aplikasi("Jenius", 40,"finance",R.drawable.img_avatar)
        )

        gameRecycleView.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)
        mediaRecycleView.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)
        perjalananRecycleView.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)
        financeRecycleView.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)
        perpesananRecycleView.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)

        gameRecycleView.adapter = AppAdapter(gameAppList)
        mediaRecycleView.adapter = AppAdapter(mediaAppList)
        perjalananRecycleView.adapter = AppAdapter(perjalanAppList)
        financeRecycleView.adapter = AppAdapter(financeAppList)
        perpesananRecycleView.adapter = AppAdapter(perpesananAppList)
    }
}