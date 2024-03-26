package com.example.alcool_gasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculat = findViewById<Button>(R.id.button)
        val editAlcool = findViewById<EditText>(R.id.)
    }
    //fun calculoAG(gasolina:Int, alccol:Int) =  alccol/gasolina
    fun calculoAG(gasolina:Int, alccol:Int):Int{
        return alccol/gasolina
    }
}