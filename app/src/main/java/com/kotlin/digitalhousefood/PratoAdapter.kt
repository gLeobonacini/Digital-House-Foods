package com.kotlin.digitalhousefood

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class PratoAdapter(private val listaPrato: ArrayList<Prato>, val listener: OnClickPratoListener): RecyclerView.Adapter<PratoAdapter.PratoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratoViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_pratos, parent, false)
        return PratoViewHolder(itemView)
    }

    override fun getItemCount() = listaPrato.size

    override fun onBindViewHolder(holder: PratoViewHolder, position: Int) {
        var prato = listaPrato.get(position)
        holder.imgPrato.setImageResource(prato.img)
        holder.txtNomePrato.text = prato.nome
    }

    interface OnClickPratoListener{
        fun onClickPrato(position: Int)
    }

    inner class PratoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var imgPrato: ImageView = itemView.findViewById(R.id.imgPrato)
        var txtNomePrato: TextView = itemView.findViewById(R.id.txtNomePrato)

        init{
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if(position != RecyclerView.NO_POSITION)
                listener.onClickPrato(position)
        }
    }
}