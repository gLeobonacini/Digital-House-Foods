package com.kotlin.digitalhousefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.rvRestaurante
import kotlinx.android.synthetic.main.activity_restaurante.*

class ActivityRestaurante : AppCompatActivity(), PratoAdapter.OnClickPratoListener {

    var listaPrato = getAllPrato()
    var adapter = PratoAdapter(listaPrato,this)

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurante)

        imgRestaurante.setImageResource(intent.getIntExtra("imgRestaurante",0))
        txtNomeRestaurante.text = intent.getStringExtra("nomeRestaurante")

        rvRestaurante.adapter = adapter
        rvRestaurante.layoutManager = GridLayoutManager(this,2)


        btRestauranteBack.setOnClickListener {
            finish()
        }


    }

    override fun onClickPrato(position: Int) {
        val prato = listaPrato[position]
        val intent = Intent(this, ActivityDescricao::class.java)
        intent.putExtra("imgPrato", prato.img)
        intent.putExtra("nomePrato", prato.nome)
        intent.putExtra("descricaoPrato", prato.descricao)
        startActivity(intent)
    }

    fun getAllPrato() = arrayListOf(
        Prato(R.drawable.image7, "Salada com molho Gengibre","Descrição do prato"),
        Prato(R.drawable.image7, "Salada com molho Gengibre","Descrição do prato"),
        Prato(R.drawable.image7, "Salada com molho Gengibre","Descrição do prato"),
        Prato(R.drawable.image7, "Salada com molho Gengibre","Descrição do prato"),
        Prato(R.drawable.image7, "Salada com molho Gengibre","Descrição do prato"),
        Prato(R.drawable.image7, "Salada com molho Gengibre","Descrição do prato"),
        Prato(R.drawable.image7, "Salada com molho Gengibre","Descrição do prato"),
        Prato(R.drawable.image7, "Salada com molho Gengibre","Descrição do prato"),
        Prato(R.drawable.image7, "Salada com molho Gengibre","Descrição do prato"),
        Prato(R.drawable.image7, "Salada com molho Gengibre","Descrição do prato"))
}