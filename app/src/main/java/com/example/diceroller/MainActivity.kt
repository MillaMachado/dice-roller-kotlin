package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /** Esta function instancia um Dice com 6 numSides,
     *  chama o método roll do Dice,
     *  seleciona a TextView no layout
     *  e atribui a ele o resultado do método.
     */
    private fun rollDice() {
        val dice1 = Dice(6)
        val dice2 = Dice(6)

        val diceRoll1 = dice1.roll()
        val diceRoll2 = dice2.roll()

        val resultTextView1: TextView = findViewById(R.id.textView)
        val resultTextView2: TextView = findViewById(R.id.textView2)

        resultTextView1.text = diceRoll1.toString()
        resultTextView2.text = diceRoll2.toString()
    }
}


class Dice(val numSides: Int) {

    /** Este método permite jogar o dado
     * e obter um número randomico
     * de 1 até numSIdes que é recebido por parâmetro.
     */
    fun roll(): Int {
        return (1..numSides).random()
    }
}