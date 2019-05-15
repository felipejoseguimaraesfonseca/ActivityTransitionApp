package com.felipejose.activitytransitionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val botao2 = findViewById<Button>(R.id.botao2) as Button

        botao2.setOnClickListener {
            //Transição: Da Segunda Activity para a Primeira Activity.
            val transicao2 = Intent(this@Main2Activity,MainActivity::class.java)
            startActivity(transicao2)
        }
    }
}
