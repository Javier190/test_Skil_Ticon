package com.example.test_skil_ticon

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var btn_getstarted: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_getstarted = findViewById(R.id.btn_start)
    }

    fun nextActivityy(view: View?) {
        println("Boton Presionado!")
        val next = Intent(this, Login_activity::class.java)
        startActivity(next)
    }
}