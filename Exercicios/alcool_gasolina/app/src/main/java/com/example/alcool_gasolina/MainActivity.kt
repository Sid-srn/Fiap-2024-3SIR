package com.example.alcool_gasolina

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.alcool_gasolina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        //val btnCalculat = findViewById<Button>(R.id.button)
        //val editAlcool = findViewById<EditText>(R.id.)

        bind.button.setOnClickListener {
            val calcAlcool = bind.editTextAlcool.text.toString().toFloat()
            val calcGas = bind.editTextAlcool.text.toString().toFloat()
            val result = calculoAG(calcGas,calcAlcool)
            if (result>0.7){
                bind.txtResultado.text = "Abasteça com alcool"
            }else{
                bind.txtResultado.text = "Abasteça com gasolina"
            }
        }
    }
    //fun calculoAG(gasolina:Int, alcool:Int) =  alccol/gasolina
    fun calculoAG(gasolina:Float, alccol:Float):Float{
        return alccol/gasolina
    }
}