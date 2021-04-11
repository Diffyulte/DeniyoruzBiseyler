package com.handeekin.deniyoruzbiseyler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.denemelayout)
        val button:ImageView = findViewById(R.id.devamButton)
        button.setOnClickListener {
           // Toast.makeText(this,"oldu",Toast.LENGTH_SHORT).show()

            val intent = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent)
        }




        animation()
    }
    fun animation() {
        val text:TextView = findViewById(R.id.caner)
        val textAnimation = AnimationUtils.loadAnimation(this, R.anim.text_animation)
        text.startAnimation(textAnimation)
    }
}

