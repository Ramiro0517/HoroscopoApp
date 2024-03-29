package com.example.horoscopoapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.horoscopoapp.R
import com.example.horoscopoapp.databinding.ActivityMainBinding
import com.example.horoscopoapp.ui.horoscope.HoroscopeFragment
import com.example.horoscopoapp.ui.luck.LuckFragment
import com.example.horoscopoapp.ui.palmistry.PalmistryFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // Inflate the layout
        setContentView(binding.root) // Set the content view
        initUI()
    }

    private fun initUI() {
       initNavigation()
    }

    private fun initNavigation() {
       val navHost =supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHost.navController
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}