package com.felipejose.activitytransitionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao1 = findViewById<Button>(R.id.botao1) as Button

        botao1.setOnClickListener {
            // Transição: Primeira Activity para a Segunda Activity.
            val transicao1 = Intent(this@MainActivity,Main2Activity::class.java)
            startActivity(transicao1)
        }
    }
}
