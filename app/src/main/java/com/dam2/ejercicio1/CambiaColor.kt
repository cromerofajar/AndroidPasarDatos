package com.dam2.ejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cambia_color.*

class CambiaColor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambia_color)
        val valor=intent.getStringExtra("color")
        TColor.setText(valor)
    }
}
