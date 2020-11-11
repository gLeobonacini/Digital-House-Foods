package com.kotlin.digitalhousefood

class Prato(val img: Int, val nome: String, val descricao: String) {

    override fun toString(): String {
        return "Prato(img = $img, nome = $nome, descricao = $descricao)"
    }
}