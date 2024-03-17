package com.example.horoscopoapp.ui.data.provider

import com.example.horoscopoapp.ui.domain.model.HoroscopoInfo
import com.example.horoscopoapp.ui.domain.model.HoroscopoInfo.*

class HoroscopeProvider {
    fun getHoroscope():List<HoroscopoInfo>{
        return listOf(
           Aries,
           Taurus,
           Geminis,
           Cancer,
           Leo,
           Virgo,
           Libra,
           Scorpio,
           Sagittarius,
           Capricorn,
           Aquarius,
           Pisces
        )
    }

}