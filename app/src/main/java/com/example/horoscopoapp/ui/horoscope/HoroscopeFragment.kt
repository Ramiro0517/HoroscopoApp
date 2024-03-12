package com.example.horoscopoapp.ui.horoscope

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horoscopoapp.R
import com.example.horoscopoapp.databinding.FragmentHoroscopeBinding


class HoroscopeFragment : Fragment() {

    private var _binding: FragmentHoroscopeBinding? = null   //binding en fragment
    private val binding get() = _binding!! //binding en fragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false) //binding en fragment
        return binding.root                                                                       //binding en fragment
    }


}