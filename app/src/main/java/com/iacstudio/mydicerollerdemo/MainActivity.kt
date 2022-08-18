package com.iacstudio.mydicerollerdemo

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDice: Button = findViewById(R.id.btnDice)
        btnDice.setOnClickListener {
//            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()
            rollDice()
        }

    }

    private fun rollDice() {
        val diceNumber = java.util.Random().nextInt(6) + 1

        val txtDice: TextView = findViewById(R.id.txtDice)
        txtDice.text = diceNumber.toString()
        txtDice.setTextColor(resources.getColor(R.color.colorOne))

        val diceImage = when (diceNumber) {
            1 -> R.drawable.ic_dice_1
            2 -> R.drawable.ic_dice_2
            3 -> R.drawable.ic_dice_3
            4 -> R.drawable.ic_dice_4
            5 -> R.drawable.ic_dice_5
            else -> R.drawable.ic_dice_6
        }

        val imgDice: ImageView = findViewById(R.id.imgDice)
        imgDice.setImageResource(diceImage)

    }
}