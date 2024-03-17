package com.example.horoscopoapp.ui.horoscope

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.horoscopoapp.ui.domain.model.HoroscopoInfo
import com.example.horoscopoapp.ui.domain.model.HoroscopoInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor() : ViewModel() {

    private var _horoscope = MutableLiveData<List<HoroscopoInfo>>(emptyList())
    val horoscope : LiveData<List<HoroscopoInfo>> = _horoscope

    init {
        _horoscope.value = listOf(
            Aries,Taurus,Geminis,Cancer,Leo,Virgo,Libra,Scorpio,Sagittarius,Capricorn,Aquarius,Pisces
        )
    }
}