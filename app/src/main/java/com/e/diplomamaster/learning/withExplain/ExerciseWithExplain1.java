package com.e.diplomamaster.learning.withExplain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.e.diplomamaster.R;

public class ExerciseWithExplain1 extends AppCompatActivity {

    private Button solution;
    private TextView solExplain, nextScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_with_explain1);

        nextScreen = findViewById(R.id.nextStepExp1);


        solExplain = findViewById(R.id.solExplain);
        solution = findViewById(R.id.solution);


        solution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setVisibility(View.GONE);
                solExplain.setVisibility(View.VISIBLE);
                nextScreen.setVisibility(View.VISIBLE);
                startAnimation();
                }
        });

        nextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExerciseWithExplain1.this, ExerciseWithExplain1_2.class);
                startActivity(intent);
            }
        });
    }



    private void startAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.myalfa);
        solExplain.startAnimation(animation);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.myrotate);
    }
}
