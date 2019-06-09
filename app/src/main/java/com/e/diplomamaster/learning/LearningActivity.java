package com.e.diplomamaster.learning;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.e.diplomamaster.R;
import com.e.diplomamaster.learning.lessons.FirstLesson;
import com.e.diplomamaster.learning.practice.PracticeLesson;
import com.e.diplomamaster.learning.practice.SecondPracticeLesson1;
import com.e.diplomamaster.learning.withExplain.ExerciseWithExplain1;
import com.e.diplomamaster.learning.withExplain.ExerciseWithExplain2;

public class LearningActivity extends AppCompatActivity {

    Intent intent = null;
    AlertDialog.Builder ad, ad1;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);

        context = LearningActivity.this;
        ad = new AlertDialog.Builder(context);
        ad.setTitle(R.string.practProblem);
        ad.setMessage(R.string.choiseProblem);

        ad1 = new AlertDialog.Builder(context);
        ad1.setTitle(R.string.practProblem2);
        ad1.setMessage(R.string.choiseProblem);

        ad.setPositiveButton(R.string.problem_2, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                intent = new Intent(LearningActivity.this, SecondPracticeLesson1.class);
                startActivity(intent);
            }
        });
        ad.setNegativeButton(R.string.problem_1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                intent = new Intent(LearningActivity.this, PracticeLesson.class);
                startActivity(intent);
            }
        });
        ad.setCancelable(true);

        Button firstLes = findViewById(R.id.lesson_1);
        firstLes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(LearningActivity.this, FirstLesson.class);
                startActivity(intent);
            }
        });

        Button secondLes = findViewById(R.id.lesson_2);
        secondLes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ad.show();
            }
        });

        ad1.setPositiveButton(R.string.problem_3, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                intent = new Intent(LearningActivity.this, ExerciseWithExplain2.class);
                startActivity(intent);
            }
        });
        ad1.setNegativeButton(R.string.problem_1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                intent = new Intent(LearningActivity.this, ExerciseWithExplain1.class);
                startActivity(intent);
            }
        });
        ad1.setCancelable(true);

        Button thirdLes3 = findViewById(R.id.lesson_3);
        thirdLes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ad1.show();
            }
        });
    }
}
