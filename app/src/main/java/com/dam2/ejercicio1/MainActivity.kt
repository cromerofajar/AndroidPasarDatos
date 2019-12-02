package com.dam2.ejercicio1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.intentFor

const val sumaRequest=1

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ResultBotton.setOnClickListener{
            val intent = Intent(this, PruebaResult::class.java)
            var num1 = Numero1.text
            var num2 = Numero2.text
            intent.putExtra("num1",Integer.parseInt(num1.toString()))
            intent.putExtra("num2",Integer.parseInt(num2.toString()))
            startActivityForResult(intent,sumaRequest)
        }
    }
    fun cambiarRojo(y: View){
        startActivity(intentFor<CambiaColor>("color" to "rojo"))
    }
    fun cambiarAmarillo(y: View){
        startActivity(intentFor<CambiaColor>("color" to "amarillo"))
    }
    fun buscador(y:View) {
        browse("https://manga.honkaiimpact3.com/")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        if(requestCode==1){
            if(resultCode== Activity.RESULT_OK){
                    Resultado.setText(data.getIntExtra("suma",0).toString())
            }
            else{
                Resultado.setText("Error al pasar los datos")
            }
        }
    }
}

