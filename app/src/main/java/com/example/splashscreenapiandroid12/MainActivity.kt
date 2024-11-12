package com.example.splashscreenapiandroid12

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat.postDelayed
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.splashscreenapiandroid12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var isDataLoaded = false
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen().apply {
            this.setKeepOnScreenCondition{
                 !isDataLoaded
            }
        }
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()

    }

    private fun loadData(){
        binding.root.postDelayed({
            isDataLoaded = true
        },2000)
    }
}