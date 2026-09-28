package com.appweek05

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.etDan)
        val buttonCalculate = findViewById<Button>(R.id.btnCalculate)
        val textView = findViewById<TextView>(R.id.tvResult)

        buttonCalculate.setOnClickListener {
            val inputText = editText.text.toString()

            if (inputText.isBlank()) {
                Toast.makeText(
                    this,
                    "숫자를 입력하세요.",
                    Toast.LENGTH_LONG
                ).show()

                return@setOnClickListener
            }

            val dan = inputText.toInt()
            val result = StringBuilder()

            for (i in 1..9) {
                result.append("$dan × $i = ${dan * i}\n")
            }

            textView.text = result.toString()
        }
    }
}