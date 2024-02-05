package com.example.practica_ud3_0702practica_ud3_0702
import com.example.practica_ud3_0702practica_ud3_0702.databinding.ActivitySecondBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar Adapter y elementos para la vista avanzada (RecyclerView en este caso)
        // Aquí se usa un ejemplo con RecyclerView, pero puedes adaptarlo según la vista elegida
        val items = arrayOf("Elemento 1", "Elemento 2", /* ... hasta 10 elementos */)

        val adapter = MyAdapter(items)
        binding.recyclerView.adapter = adapter

        // Configurar clic en elementos para mostrar Snackbar
        adapter.setOnItemClickListener { position ->
            val selectedItem = items[position]
            Snackbar.make(binding.root, "Elemento seleccionado: $selectedItem", Snackbar.LENGTH_SHORT).show()
        }

        // Configurar botón de navegación de vuelta a la actividad principal
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}

