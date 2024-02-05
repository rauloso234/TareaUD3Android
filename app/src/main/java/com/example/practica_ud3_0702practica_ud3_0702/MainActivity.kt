package com.example.practica_ud3_0702practica_ud3_0702

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practica_ud3_0702practica_ud3_0702.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar botones y acciones de navegación
        binding.btnActivity2.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        binding.btnAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        binding.btnExit.setOnClickListener {
            finish()
        }
    }
}
