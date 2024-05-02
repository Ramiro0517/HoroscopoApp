package com.example.horoscopoapp.ui.horoscope

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.horoscopoapp.R
import com.example.horoscopoapp.databinding.FragmentHoroscopeBinding
import com.example.horoscopoapp.domain.model.HoroscopeModel
import com.example.horoscopoapp.domain.model.HoroscopoInfo.*
import com.example.horoscopoapp.ui.horoscope.adapter.HoroscopeAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HoroscopeFragment : Fragment() {

    private val horoscopeViewModel by viewModels<HoroscopeViewModel>() //ViewModel en fragment

    private lateinit var horoscopeAdapter: HoroscopeAdapter

    private var _binding: FragmentHoroscopeBinding? = null   //binding en fragment
    private val binding get() = _binding!! //binding en fragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initRecyclerView()
        initUIState()
    }

    private fun initRecyclerView() {
        horoscopeAdapter = HoroscopeAdapter(onItemSelected ={
           // Toast.makeText(context, it.name, Toast.LENGTH_SHORT).show()
           val type = when(it){
               Aquarius -> HoroscopeModel.Aquarius
               Aries -> HoroscopeModel.Aries
               Cancer ->HoroscopeModel.Cancer
               Capricorn ->HoroscopeModel.Capricorn
               Geminis -> HoroscopeModel.Geminis
               Leo -> HoroscopeModel.Leo
               Libra -> HoroscopeModel.Libra
               Pisces ->HoroscopeModel.Pisces
               Sagittarius -> HoroscopeModel.Sagittarius
               Scorpio -> HoroscopeModel.Scorpio
               Taurus -> HoroscopeModel.Tauro
               Virgo -> HoroscopeModel.Virgo
            }
            findNavController().navigate(
                HoroscopeFragmentDirections.actionHoroscopeFragmentToHoroscopeDetailActivity(type)
            )
        } )
        binding.rvHoroscope.apply {
            layoutManager = GridLayoutManager(requireContext(),2)
            adapter = horoscopeAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            horoscopeViewModel.horoscope.observe(viewLifecycleOwner) {
              //cambios en horoscope
                horoscopeAdapter.updateList(it)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //binding en fragment
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}