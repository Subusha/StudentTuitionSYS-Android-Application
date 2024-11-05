package com.example.studenttuitionapp;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Subject {
    private String name;
    private int lectureCount;

    private int id;

    public Subject(String name, int lectureCount) {
        this.name = name;
        this.lectureCount = lectureCount;
    }

    public String getName() {
        return name;
    }

    public int getLectureCount() {
        return lectureCount;
    }

    public int getId() {
        return id;
    }

    public static class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder> {

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
    }
}