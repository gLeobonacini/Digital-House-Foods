package com.kotlin.digitalhousefood

class Restaurante(val img: Int, val nome: String, val endereco: String, val horario: String) {

    override fun toString(): String {
        return "Restaurante(img = $img, nome = $nome, endereco = $endereco, horario = $horario)"
    }
}