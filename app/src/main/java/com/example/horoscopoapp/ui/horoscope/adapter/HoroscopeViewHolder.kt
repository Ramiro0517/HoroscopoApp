package com.example.horoscopoapp.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscopoapp.databinding.ItemHoroscopeBinding
import com.example.horoscopoapp.domain.model.HoroscopoInfo

class HoroscopeViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)
    fun render(horoscopeInfo:HoroscopoInfo) {
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvHoroscopeName.text = binding.tvHoroscopeName.context.getString(horoscopeInfo.name)
    }
}