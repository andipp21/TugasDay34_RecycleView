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
            Aplikasi("FM20", 20,"game",R.drawable.fm20),
            Aplikasi("Arknight", 50,"game",R.drawable.arknight),
            Aplikasi("PUBG Mobile", 200,"game",R.drawable.pubgm),
            Aplikasi("One Punch Man", 100,"game",R.drawable.one_punch)
        )

        val perpesananAppList = arrayListOf(
            Aplikasi("Whatsapp", 20,"perpesanan",R.drawable.whatsapp),
            Aplikasi("Line", 30,"perpesanan",R.drawable.line),
            Aplikasi("Telegram", 20,"perpesanan",R.drawable.telegram)
        )

        val perjalanAppList = arrayListOf(
            Aplikasi("Traveloka", 25,"perjalanan",R.drawable.taveloka),
            Aplikasi("Tiket.Com", 15,"perjalanan",R.drawable.tiket),
            Aplikasi("PegiPegi", 30,"perjalanan",R.drawable.pegipegi),
            Aplikasi("Lion Air Mobile", 25,"perjalanan",R.drawable.lion_air)
        )

        val mediaAppList = arrayListOf(
            Aplikasi("VLC", 25,"media",R.drawable.vlc),
            Aplikasi("MX Player", 50,"media",R.drawable.mx_player),
            Aplikasi("i Heart Radio", 50,"media",R.drawable.i_heart_radio),
            Aplikasi("Netflix", 200,"media",R.drawable.netflix)
        )

        val financeAppList = arrayListOf(
            Aplikasi("BCA Mobile", 30,"finance",R.drawable.bca_mobile),
            Aplikasi("Mandiri Mobile", 50,"finance",R.drawable.mandiri_mobile),
            Aplikasi("BNI Mobile", 70,"finance",R.drawable.bni_mobile),
            Aplikasi("BRI Mobile", 10,"finance",R.drawable.bri_mobile),
            Aplikasi("Jenius", 40,"finance",R.drawable.jenius)
        )

        gameRecycleView.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)
        gameRecycleView.adapter = AppAdapter(gameAppList)

        mediaRecycleView.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)
        mediaRecycleView.adapter = AppAdapter(mediaAppList)

        perjalananRecycleView.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)
        perjalananRecycleView.adapter = AppAdapter(perjalanAppList)

        financeRecycleView.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)
        financeRecycleView.adapter = AppAdapter(financeAppList)

        perpesananRecycleView.layoutManager = GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false)
        perpesananRecycleView.adapter = AppAdapter(perpesananAppList)






    }
}