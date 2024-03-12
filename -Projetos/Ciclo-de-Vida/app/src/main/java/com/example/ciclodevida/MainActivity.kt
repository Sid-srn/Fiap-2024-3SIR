package com.example.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

const val TAG = "Estado Ciclo de Vida"
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "onCreate : - ${this.lifecycle.currentState}")

        val btnClick = findViewById<Button>(R.id.btnClick)
        val editT = findViewById<EditText>(R.id.txtNome)
        val textHello = findViewById<TextView>(R.id.txtHello)

        btnClick.setOnClickListener { 
            textHello.text = "Olá ${editT.text}"
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart : - ${this.lifecycle.currentState}")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume : - ${this.lifecycle.currentState}")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause : - ${this.lifecycle.currentState}")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop : - ${this.lifecycle.currentState}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onStop : - ${this.lifecycle.currentState}")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart : - ${this.lifecycle.currentState}")
    }

}