package com.example.test_skil_ticon

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login_activity : AppCompatActivity() {
    private var et_user: EditText? = null
    private var et_pass: EditText? = null
    lateinit var btn_logIn: Button
    lateinit var btn_goBack: Button
    var user: String? = null
    var password: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activity)


        et_user = findViewById(R.id.et_user)
        et_pass = findViewById(R.id.et_pass)
        btn_logIn = findViewById(R.id.btn_logIn)
        btn_goBack = findViewById(R.id.btn_goBack)

        btn_goBack.setOnClickListener(){
            goback()
        }

        btn_logIn.setOnClickListener(){
            simplevalidation()
        }
    }


    fun simplevalidation() {

        user = et_user?.text.toString()
        password = et_pass?.text.toString()

        if (user == null || password == null) {
            println(user + "is user**")
            Toast.makeText(this, "No Empty fields to Log In ! ", Toast.LENGTH_SHORT).show()
        } else {
            //User user = new User();
            Toast.makeText(this, "Welcome User ! ", Toast.LENGTH_SHORT).show()
            println("User Valid !")
            goToHome()
        }
    }

    fun goToHome() {
        val next = Intent(this, Camera_activity::class.java)
        startActivity(next)
    }

    fun goback(){
        val next = Intent(this, MainActivity::class.java)
        startActivity(next)
    }
}