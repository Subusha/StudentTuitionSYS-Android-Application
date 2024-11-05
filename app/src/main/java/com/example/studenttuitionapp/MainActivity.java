package com.example.studenttuitionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnViewNotes = findViewById(R.id.btnViewNotes);
        Button btnViewCalendar = findViewById(R.id.btnViewCalendar);
        Button btnAttemptQuiz = findViewById(R.id.btnAttemptQuiz);

        btnViewNotes.setOnClickListener(v -> openViewNotesActivity());
        btnViewCalendar.setOnClickListener(v -> openViewCalendarActivity());
        btnAttemptQuiz.setOnClickListener(v -> openAttemptQuizActivity());

    }

    private void openViewNotesActivity() {
        Intent intent = new Intent(this, ActivityViewNotes.class);
        startActivity(intent);
    }

    private void openViewCalendarActivity() {
        Intent intent = new Intent(this, ActivityViewCalendar.class);
        startActivity(intent);
    }

    private void openAttemptQuizActivity() {
        Intent intent = new Intent(this, ActivityAttemptQuiz.class);
        startActivity(intent);
    }
}