package com.example.myapplication

import android.graphics.Color
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    private lateinit var activityScenario: ActivityScenario<MainActivity>

    @Before
    fun setup() {
// Launch the activity before each test
        activityScenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun testButtonClickUpdatesTextView() {
        activityScenario.onActivity { activity ->
// Set up references to UI elements
            val button: Button = activity.findViewById(R.id.Show_button)
            val textView: TextView = activity.findViewById(R.id.Output_Result)
            val editText: EditText = activity.findViewById(R.id.Time_Of_Day)
// Simulate user input
            editText.setText("Mid-Afternoon")
// Perform button click
            button.performClick()
// Check if the TextView's text was updated
            assertEquals("You can eat Cake", textView.text)
            assertEquals(Color.RED, textView.currentTextColor)
        }
    }
}