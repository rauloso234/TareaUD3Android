package com.example.practica_ud3_0702practica_ud3_0702



import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practica_ud3_0702practica_ud3_0702.databinding.ActivityAboutBinding


class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mostrar datos de la empresa o desarrollador (nombre, foto, logotipo, etc.)
        // Puedes personalizar según tus necesidades
    }
}
