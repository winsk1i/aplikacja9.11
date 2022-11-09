package com.barstool.aplikacja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var swipe=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button2).setOnClickListener {
            if(swipe == true) {
                findViewById<ImageView>(R.id.kot1).setImageResource(R.drawable.kot2)

        }
        else {
                findViewById<ImageView>(R.id.kot1).setImageResource(R.drawable.kot1)
                swipe = true
            }
        }
    }
}