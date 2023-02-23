package com.example.appaula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Variáveis de innicialização
        //Linhas de comentários no mesmo esquema(coment de linha)
        setContentView(R.layout.activity_main)
        val edtNumeroUm: EditText = findViewById(R.id.edtNumeroUm)
        val edtNumeroDois: EditText = findViewById(R.id.edtNumeroDois)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)

        /*Caluclo(coment de bloco)*/
        btnCalcular.setOnClickListener {
            val toast = Toast.makeText(this, "O botão foi clicado", Toast.LENGTH_SHORT)
            toast.show()

        }
    }
        private fun calcular( num1:Int,  num2:Int) {   //mesmo sem o "val" ele entede que é parâmetro, ou seja, vai funcionar normal
            val total: Int
            total = num1 + num2
            val toast = Toast.makeText(this, total.toString(), Toast.LENGTH_SHORT)
            toast.show()
        }
}