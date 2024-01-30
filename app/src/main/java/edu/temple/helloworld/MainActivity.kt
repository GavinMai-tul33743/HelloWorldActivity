package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)

        
        // Respond to button click event per specifications
        val button : Button = findViewById(R.id.clickMeButton)
        val editText : EditText = findViewById(R.id.nameEditText)
        button.setOnClickListener{v: View? ->
            displayTextView.text =  "Hello ${editText.text}"
        }

    }
}