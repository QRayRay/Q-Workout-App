package com.example.qworkoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

val btnClickMe = findViewByID<Button>()

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
    }
}

