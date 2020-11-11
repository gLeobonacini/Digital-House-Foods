package com.kotlin.digitalhousefood

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class RestauranteAdapter(private val listaRestaurante: ArrayList<Restaurante>, val listener: OnClickRestauranteListener): RecyclerView.Adapter<RestauranteAdapter.RestauranteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_restaurante, parent, false)
        return RestauranteViewHolder(itemView)
    }

    override fun getItemCount() = listaRestaurante.size

    override fun onBindViewHolder(holder: RestauranteViewHolder, position: Int) {
        var restaurante = listaRestaurante.get(position)
        holder.imgRestauranteImagem.setImageResource(restaurante.img)
        holder.txtRestauranteNome.text = restaurante.nome
        holder.txtRestauranteEndereco.text = restaurante.endereco
        holder.txtRestauranteHorario.text = restaurante.horario
    }

    interface OnClickRestauranteListener{
        fun onClickRestaurante(position: Int)
    }

    inner class RestauranteViewHolder(itemView: View):RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var imgRestauranteImagem: ImageView = itemView.findViewById(R.id.imgRestauranteImagem)
        var txtRestauranteNome: TextView = itemView.findViewById(R.id.txtRestauranteNome)
        var txtRestauranteEndereco: TextView = itemView.findViewById(R.id.txtRestauranteEndereco)
        var txtRestauranteHorario: TextView = itemView.findViewById(R.id.txtRestauranteHorario)

        init{
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if(position != RecyclerView.NO_POSITION)
                listener.onClickRestaurante(position)
        }
    }
}