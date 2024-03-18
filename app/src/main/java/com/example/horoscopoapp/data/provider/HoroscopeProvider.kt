package com.example.horoscopoapp.data.provider

import com.example.horoscopoapp.domain.model.HoroscopoInfo
import com.example.horoscopoapp.domain.model.HoroscopoInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {

    fun getHoroscopeInfo():List<HoroscopoInfo>{
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