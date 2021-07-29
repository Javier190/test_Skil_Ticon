package com.example.test_skil_ticon

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Camera_activity : AppCompatActivity() {

    lateinit var btn_camera: Button
    lateinit var btn_backlogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera_activity)
        btn_camera = findViewById(R.id.btn_camera)



        btn_camera.setOnClickListener(){
            startCam()
        }

        btn_backlogin.setOnClickListener(){
            goback()
        }
    }

    fun startCam() {
        //val i = Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA)
        //startActivity(i)
        val i = Intent(this, LaunchCamera::class.java)
        startActivity(i)
    }

    fun goback() {
        //val i = Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA)
        //startActivity(i)
        val i = Intent(this, Login_activity::class.java)
        startActivity(i)
    }
}