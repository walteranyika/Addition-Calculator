package com.walter.appbasiss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputOne: EditText = findViewById(R.id.inputOne)
        var inputTwo: EditText = findViewById(R.id.inputTwo)
        var myButton: Button = findViewById(R.id.buttonAdd)
        var myResult: TextView = findViewById(R.id.txtResult)

        //listener
        myButton.setOnClickListener {
            // var total = inputOne.text.toString().toDouble() + inputTwo.text.toString().toDouble()

            //get the text that the user has entered
            var firstText = inputOne.text.toString().trim()
            var secondText = inputTwo.text.toString().trim()

            if (firstText.isEmpty() || secondText.isEmpty()) {
                Toast.makeText(applicationContext, "Please enter all values", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            try {
                //convert to numbers
                var firstNumber = firstText.toDouble() //99
                var secondNumber = secondText.toDouble()

                //Add the numbers
                var sum = firstNumber + secondNumber

                //Display
                myResult.text = "Sum is $sum"
            }catch (e : Exception){
                Toast.makeText(applicationContext, "Enter valid input", Toast.LENGTH_SHORT).show()
            }

            //Create an app will calculate the compound interest
            //amount, rate, period
            //display the  total amount
        }

    }
}