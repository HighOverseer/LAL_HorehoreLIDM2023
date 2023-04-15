package com.example.horehorelidm.ui.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.horehorelidm.R
import com.example.horehorelidm.ui.login.LoginActivity

class Splash : AppCompatActivity() {
    companion object{
        private const val SPLASH_DELAY_MILLIS = 1500L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this@Splash, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DELAY_MILLIS)
    }
}