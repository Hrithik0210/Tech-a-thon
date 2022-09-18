package com.example.photofiltering

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)

        Handler().postDelayed(object : Runnable {
            public override fun run() {
                val i: Intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(i)
                finish()
            }
        }, 4000)
    }
}