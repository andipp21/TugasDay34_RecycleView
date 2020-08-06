package com.example.tugasday34_recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import kotlinx.android.synthetic.main.app_item.view.*

class AppAdapter(val listApp: ArrayList<Aplikasi>): RecyclerView.Adapter<AppAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.app_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listApp.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var img = holder.itemView.ivImg

        Glide.with(holder.itemView.context)
            .load(listApp[position].logo)
            .transform(RoundedCorners(8))
            .into(img)

        holder.itemView.tvNamaAPP.setText(listApp[position].nama)
        holder.itemView.tvSizeAPP.setText(listApp[position].size.toString())
    }
}