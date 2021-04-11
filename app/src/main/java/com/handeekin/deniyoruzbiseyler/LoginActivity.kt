package com.handeekin.deniyoruzbiseyler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        animation()
    }
    fun animation() {
        val icon: ImageView = findViewById(R.id.icon)
        val iconAnimation = AnimationUtils.loadAnimation(this, R.anim.image_animation)
        icon.startAnimation(iconAnimation)
    }
}

