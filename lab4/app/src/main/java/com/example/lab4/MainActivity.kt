package com.example.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnnombre: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnnombre =findViewById(R.id.button3)
        
        initListeners()
    }
    fun initListeners(){
        btnnombre.setOnClickListener{
            Toast.makeText(this,getString(R.string.MiNombre),Toast.LENGTH_LONG).show()

        }
    }
}