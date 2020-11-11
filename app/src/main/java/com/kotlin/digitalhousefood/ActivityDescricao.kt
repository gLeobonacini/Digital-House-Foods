package com.kotlin.digitalhousefood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_descricao.*
import kotlinx.android.synthetic.main.activity_restaurante.*

class ActivityDescricao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descricao)
        imgDescricaoPrato.setImageResource(intent.getIntExtra("imgPrato",0))
        txtDescricaoNomePrato.text = intent.getStringExtra("nomePrato")
        txtDescricaoDescricaoPrato.text = intent.getStringExtra("descricaoPrato")

        tbDescricao.setNavigationOnClickListener {
            finish()
        }
    }
}