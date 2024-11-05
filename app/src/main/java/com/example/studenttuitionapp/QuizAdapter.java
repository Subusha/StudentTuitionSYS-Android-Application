package com.example.studenttuitionapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.QuizViewHolder> {

    private List<Quiz> quizzes;
    private Context context;

    public QuizAdapter(Context context, List<Quiz> quizzes) {
        this.context = context;
        this.quizzes = quizzes;
    }

    @NonNull
    @Override
    public QuizViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_quiz, parent, false);
        return new QuizViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuizViewHolder holder, int position) {
        Quiz quiz = quizzes.get(position);

        holder.tvQuizName.setText(quiz.getName());

        holder.btnAttemptQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle quiz attempt button click
            }
        });
    }

    @Override
    public int getItemCount() {
        return quizzes.size();
    }

    public static class QuizViewHolder extends RecyclerView.ViewHolder {
        public TextView tvQuizName;
        public EditText etQuizPassword;
        public Button btnAttemptQuiz;

        public QuizViewHolder(@NonNull View itemView) {
            super(itemView);
            tvQuizName = itemView.findViewById(R.id.tvQuizName);
            etQuizPassword = itemView.findViewById(R.id.etQuizPassword);
            btnAttemptQuiz = itemView.findViewById(R.id.btnAttemptQuiz);
        }
    }
}
