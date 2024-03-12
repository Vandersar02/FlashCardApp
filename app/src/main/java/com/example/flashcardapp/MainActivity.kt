package com.example.flashcardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val flashcardAnswer1 = findViewById<TextView>(R.id.flashcard_answer1)
        val flashcardAnswer2 = findViewById<TextView>(R.id.flashcard_answer2)
        val flashcardAnswer3 = findViewById<TextView>(R.id.flashcard_answer3)


        flashcardAnswer1.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer1).setBackgroundColor(getResources().getColor(R.color.red, null))
            findViewById<View>(R.id.flashcard_answer3).setBackgroundColor(getResources().getColor(R.color.green, null))
        }

        flashcardAnswer2.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(getResources().getColor(R.color.red, null))
            findViewById<View>(R.id.flashcard_answer3).setBackgroundColor(getResources().getColor(R.color.green, null))
        }

        flashcardAnswer3.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer3).setBackgroundColor(getResources().getColor(R.color.green, null))
        }
    }
}