package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
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
                val  newbb=outputSuggestions.text.toString()+"You can eat Eggs and Toast";
                outputSuggestions.text="${outputSuggestions.text}\n-$newbb";
            }
            else if  (yy=="Mid-Morning"){
                val  newbb=outputSuggestions.text.toString()+"You can eat Apple or Banana";
                outputSuggestions.text="${outputSuggestions.text}\n-$newbb";

            }
            else if  (yy=="Afternoon") {
                val newbb = outputSuggestions.text.toString() + "You can eat Sandwich with juice";
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

            }else{
                // Log error for invalid input
                Log.e("MealSuggestion", "Invalid Input: $yy")
                // Show error if input is ivalid
                Toast.makeText(/* context = */this, /* text = */"Invalid Time e.g Morning,Afternoon", /* duration = */ Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }
        resetButton.setOnClickListener{
            outputSuggestions.text="";



        }

    }




}