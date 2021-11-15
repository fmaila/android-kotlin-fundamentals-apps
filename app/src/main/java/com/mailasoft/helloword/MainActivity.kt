package com.mailasoft.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.math.log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.count_button)

        rollButton.setOnClickListener{rollDice(1)}
        countButton.setOnClickListener{rollDice(2)}

    }

    private fun rollDice(contador: Int){

        val resultText: TextView = findViewById(R.id.result_text)






        if(contador == 1)
        {
            val randomInt = (1..6).random()
            resultText.text = randomInt.toString()
            Log.i("TAG", randomInt.toString())
            print(randomInt)
        }else if(contador ==2){

            if(resultText.text == "Hello World!")
            {
                val number=1

                resultText.text =number.toString() ;


            }else{


                val number=resultText.text.toString().toInt()
                if(number< 6){
                    val sum = 1 + number
                    resultText.text =sum.toString() ;

                }



            }

        }









    }








}