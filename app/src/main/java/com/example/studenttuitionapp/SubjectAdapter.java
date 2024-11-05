package com.example.studenttuitionapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder> {

    private List<Subject> subjects;
    private Context context;

    public SubjectAdapter(Context context, List<Subject> subjects) {
        this.context = context;
        this.subjects = subjects;
    }

    @NonNull
    @Override
    public SubjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_subject, parent, false);
        return new SubjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectViewHolder holder, int position) {
        Subject subject = subjects.get(position);

        holder.tvSubjectName.setText(subject.getName());
        holder.tvLectureCount.setText(context.getString(R.string.lecture_count, subject.getLectureCount()));

        holder.itemView.setOnClickListener(view -> {
            // Handle click event to open notes for the selected subject
            openNotesActivity(subject.getId());
        });
    }

    @Override
    public int getItemCount() {
        return subjects.size();
    }

    public static class SubjectViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSubjectName;
        public TextView tvLectureCount;

        public SubjectViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSubjectName = itemView.findViewById(R.id.tvSubjectName);
            tvLectureCount = itemView.findViewById(R.id.tvLectureCount);
        }
    }

    private void openNotesActivity(int subjectId) {
        Intent intent = new Intent(context, ActivityViewNotes.class);
        intent.putExtra("subject_id", subjectId);
        context.startActivity(intent);
    }
}

