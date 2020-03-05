package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        diceImage = findViewById(R.id.dice_image)
        diceImage_2 = findViewById(R.id.dice_image_2)
    }

    private fun rollDice(){
        val randomInt = (1..6).random()

        //val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = randomInt.toString()
        //val diceImage: ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableRes)
        diceImage.setImageResource(imagerand())
        diceImage_2.setImageResource(imagerand())

        Toast.makeText(this,  "button clicked", Toast.LENGTH_SHORT).show()
    }

    private fun imagerand(): Int(
        val randomInt = (1..6).random()
        val drawableRes = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableRes
    )
}
