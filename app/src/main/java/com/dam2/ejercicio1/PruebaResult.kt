package com.dam2.ejercicio1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_prueba_result.*

class PruebaResult : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_prueba_result)

        val a=intent.getIntExtra("num1",0)
        val b=intent.getIntExtra("num2",0)

        val sum=a+b

        Resultados.setText(sum.toString())

        Volver.setOnClickListener{
            val data= Intent()
            data.putExtra("suma",sum)
            setResult(Activity.RESULT_OK,data)
            finish()
        }

    }
}
