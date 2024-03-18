package com.example.horoscopoapp.ui.horoscope

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.horoscopoapp.data.provider.HoroscopeProvider
import com.example.horoscopoapp.domain.model.HoroscopoInfo
import com.example.horoscopoapp.domain.model.HoroscopoInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(horoscopeProvider: HoroscopeProvider) : ViewModel() {

    private var _horoscope = MutableLiveData<List<HoroscopoInfo>>(emptyList())
    val horoscope : LiveData<List<HoroscopoInfo>> = _horoscope

    init {
        _horoscope.value =  horoscopeProvider.getHoroscopeInfo()
        Log.d("HoroscopeViewModel", "init: ${_horoscope.value}")
    }
}