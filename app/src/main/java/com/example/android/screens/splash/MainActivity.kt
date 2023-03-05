package com.example.android.screens.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.R
import android.os.Handler
import com.example.android.screens.onboarding.Onboarding1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            val intent: Intent = Intent (this, Onboarding1::class.java)
            startActivity(intent)
        }, 2000)
    }
}