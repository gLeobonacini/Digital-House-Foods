package com.kotlin.digitalhousefood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*

class ActivityHome : AppCompatActivity(),RestauranteAdapter.OnClickRestauranteListener {

    var listaRestaurante = getAllRestaurante()
    var adapter = RestauranteAdapter(listaRestaurante,this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvRestaurante.adapter = adapter
        rvRestaurante.layoutManager = LinearLayoutManager(this)
        rvRestaurante.setHasFixedSize(true)
    }

    override fun onClickAluno(position: Int) {
        
    }

    // Retorna uma lista de pokemons
    fun getAllRestaurante() = arrayListOf(
        Restaurante(R.drawable.image1, "Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00"),
        Restaurante(R.drawable.image4, "Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema", "Fecha às 00:00"),
        Restaurante(R.drawable.image5, "Outback - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo", "Fecha às 00:00"),
        Restaurante(R.drawable.image3, "Si señor!", "Alameda Jauaperi, 626 - Moema", "Fecha às 01:00"))

}