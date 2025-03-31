package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputTime = findViewById<EditText>(R.id.Time_Of_Day)
        val submitButton = findViewById<Button>(R.id.Show_button)
        val resetButton = findViewById<Button>(R.id.Reset_button)
        val outputSuggestions = findViewById<TextView>(R.id.Output_Result)


        submitButton.setOnClickListener{
            val yy= inputTime.text.toString();

            if (yy=="Morning"){
                val  newbb=outputSuggestions.text.toString()+"You can eat Egg";
                outputSuggestions.text="${outputSuggestions.text}\n-$newbb";
            }
            else if  (yy=="Mid-Morning"){
                val  newbb=outputSuggestions.text.toString()+"You can eat Apple or Banana";
                outputSuggestions.text="${outputSuggestions.text}\n-$newbb";
            }
            else if  (yy=="Afternoon") {
                val newbb = outputSuggestions.text.toString() + "You can eat Sandwich";
                outputSuggestions.text = "${outputSuggestions.text}\n-$newbb";
            }
            else if  (yy=="Mid-Afternoon"){
                    val  newbb=outputSuggestions.text.toString()+"You can eat Cake";
                    outputSuggestions.text="${outputSuggestions.text}\n-$newbb";
            }
            else if  (yy=="Dinner"){
                val  newbb=outputSuggestions.text.toString()+"You can eat Patsa";
                outputSuggestions.text="${outputSuggestions.text}\n-$newbb";

            }
            else if  (yy=="After-Dinner"){
                val  newbb=outputSuggestions.text.toString()+"You can eat Ice Cream";
                outputSuggestions.text="${outputSuggestions.text}\n-$newbb";

            }
        }
        resetButton.setOnClickListener{
            outputSuggestions.text="";
        }

    }




}