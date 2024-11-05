package com.example.studenttuitionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ActivityViewNotes extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NoteAdapter noteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_notes);

        recyclerView = findViewById(R.id.rvNotes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Get the subject ID from the intent
        int subjectId = getIntent().getIntExtra("subject_id", -1);

        if (subjectId != -1) {
            // Make API call to get notes for the selected subject
            fetchNotes(subjectId);
        } else {
            // Handle invalid subject ID
            Toast.makeText(this, "Invalid subject ID", Toast.LENGTH_SHORT).show();
        }
    }

    private void fetchNotes(int subjectId) {
        // Implement Retrofit API call to fetch notes based on the subject ID
        // Adjust the NoteService interface and API endpoint accordingly
        // Update noteAdapter with the fetched notes
    }
}
