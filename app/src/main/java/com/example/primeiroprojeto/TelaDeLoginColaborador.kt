package com.example.primeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaDeLoginColaborador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_de_login_colaborador)

        val logarcolaborador = findViewById<Button>(R.id.logarcolaborador)
        logarcolaborador.setOnClickListener {

            IrHome()
        }

    }

    private fun IrHome(){
        val homePage = Intent (this,HomeColaborador::class.java)
        startActivity(homePage)


    }
}