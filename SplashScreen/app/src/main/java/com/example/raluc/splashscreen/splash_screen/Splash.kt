package com.example.raluc.splashscreen.splash_screen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.raluc.splashscreen.MainActivity
import com.example.raluc.splashscreen.R

class Splash : AppCompatActivity() {

    private val SPLASH_TIME = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Handler().postDelayed({
            // intent to start main activity

            val intent = Intent(this@Splash, MainActivity::class.java)
            this@Splash.startActivity(intent)
            this@Splash.finish()
        }, SPLASH_TIME.toLong())
    }
}
