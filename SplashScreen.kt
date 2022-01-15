package com.example.qworkoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// @splash image to start screen. The image has to be a gif image from slash 
// when the activity opens. After that, please go ahead and select a gym icon to press to enter the next activity.
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
    }
}
