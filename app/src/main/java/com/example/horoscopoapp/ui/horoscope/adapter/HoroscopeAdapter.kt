package com.example.horoscopoapp.ui.horoscope.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscopoapp.R
import com.example.horoscopoapp.domain.model.HoroscopoInfo

class HoroscopeAdapter(private var horoscopeList:List<HoroscopoInfo> = emptyList(), private val onItemSelected:(HoroscopoInfo)->Unit): RecyclerView.Adapter<HoroscopeViewHolder>() {

    fun updateList(list:List<HoroscopoInfo>){
        this.horoscopeList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        return HoroscopeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        holder.render(horoscopeList[position], onItemSelected)
    }

    override fun getItemCount() = horoscopeList.size
}

