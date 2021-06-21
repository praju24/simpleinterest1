package com.calculator.simpleinterestcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btncal: Button = findViewById(R.id.btnconvert)
        val textprincipal: EditText = findViewById(R.id.textprincipal)
        val textrate: EditText = findViewById(R.id.txrate)
        val texttime: EditText = findViewById(R.id.txtime)
        val ans: TextView = findViewById(R.id.tverror)

        btncal.setOnClickListener {
            val principal = textprincipal.text.toString().toInt()

            val rate = textrate.text.toString().toInt()

            val time = texttime.text.toString().toInt()

            val SI = (principal * rate * time)/100;
            ans.text = SI.toString()
        }


    }

}
