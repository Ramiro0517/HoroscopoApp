package com.example.horoscopoapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscopoapp.databinding.ItemHoroscopeBinding
import com.example.horoscopoapp.domain.model.HoroscopoInfo

class HoroscopeViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)
    fun render(horoscopeInfo: HoroscopoInfo, onItemSelected: (HoroscopoInfo) -> Unit) {
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvHoroscopeName.text = binding.tvHoroscopeName.context.getString(horoscopeInfo.name)

        binding.parent.setOnClickListener {
           // onItemSelected(horoscopeInfo)
            animateImage(binding.ivHoroscope, newLambda = {onItemSelected(horoscopeInfo)})
        }
    }
    private fun animateImage(view:View, newLambda:()->Unit){
        view.animate().apply {
            duration = 500
            interpolator= LinearInterpolator()
            rotationBy(360f)
            withEndAction { newLambda() }
            start()
        }
    }
}