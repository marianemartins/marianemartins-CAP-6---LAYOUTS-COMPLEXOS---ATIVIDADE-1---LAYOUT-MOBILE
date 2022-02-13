package com.example.primeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt_colaboradoe_entrar = findViewById<Button>(R.id.bt_colaborador_entrar)
        bt_colaboradoe_entrar.setOnClickListener {

            IrLoginColaborador()
        }

    }

    private fun IrLoginColaborador(){
        val loginColaborador = Intent (this,TelaDeLoginColaborador::class.java)
        startActivity(loginColaborador)

    }

}