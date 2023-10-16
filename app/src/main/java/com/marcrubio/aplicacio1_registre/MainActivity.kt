package com.marcrubio.aplicacio1_registre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        val Text: EditText = findViewById(R.id.editTextText)
        val diceImage: ImageView = findViewById(R.id.imageView2)
        var contador: Int = 0

        rollButton.setOnClickListener {
            val textContingut = Text.text.toString()
            val toast = Toast.makeText(this, "Hola $textContingut", Toast.LENGTH_SHORT)
            toast.show()

            if (contador%2==0){
                diceImage.setImageResource(R.drawable.casta_a)
        }
            else{
                diceImage.setImageResource(R.drawable.proteinaaa)

            }
            contador++
        }
    }
}