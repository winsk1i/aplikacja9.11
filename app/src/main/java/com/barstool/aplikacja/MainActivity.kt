package com.barstool.aplikacja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var swipe=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button2).setOnClickListener {
            swipe = if (swipe) {
                findViewById<ImageView>(R.id.kot1).setImageResource(R.drawable.kot2)
                false
            } else {
                findViewById<ImageView>(R.id.kot1).setImageResource(R.drawable.kot3)
                true
            }
        }
        findViewById<Button>(R.id.button).setOnClickListener {
            swipe = if (swipe) {
                findViewById<ImageView>(R.id.kot1).setImageResource(R.drawable.kot3)
                false
            } else {
                findViewById<ImageView>(R.id.kot1).setImageResource(R.drawable.kot2)
                true
            }
        }
        val silniaRun=findViewById<Button>(R.id.button3)
        val silniaInput=findViewById<EditText>(R.id.wpisz)

        silniaRun.setOnClickListener {
            val inputInt = silniaInput.text.toString().toInt()
            var liczbaZSilni=1
            if(inputInt==0 || inputInt==1){
                liczbaZSilni=1
            }
            else{
                for(i in 2 .. inputInt)
                    liczbaZSilni*=i
            }
            val text = liczbaZSilni.toString()
            findViewById<TextView>(R.id.wynik).text=(text)
        }

    }
}