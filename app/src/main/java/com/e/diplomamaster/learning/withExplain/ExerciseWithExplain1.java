package com.e.diplomamaster.learning.withExplain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.e.diplomamaster.R;

public class ExerciseWithExplain1 extends AppCompatActivity {

    private Button solution, nextExp;
    private TextView solExplain, bigP, bigPexp, bigS, bigSexp, bigR, bigRexp, solExp11, p_S, s_R, p_R;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_with_explain1);

        solExp11 = findViewById(R.id.solExp11);
        p_S = findViewById(R.id.p_S);
        s_R = findViewById(R.id.s_R);
        p_R = findViewById(R.id.p_R);
        bigP = findViewById(R.id.bigP);
        bigPexp = findViewById(R.id.bigPexp);
        bigS = findViewById(R.id.bigS);
        bigSexp = findViewById(R.id.bigSexp);
        bigR = findViewById(R.id.bigR);
        bigRexp = findViewById(R.id.bigRexp);
        solExplain = findViewById(R.id.solExplain);
        solution = findViewById(R.id.solution);
        nextExp = findViewById(R.id.nextExp);

        solution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setVisibility(View.GONE);
                solExplain.setVisibility(View.VISIBLE);
                bigP.setVisibility(View.VISIBLE);
                bigPexp.setVisibility(View.VISIBLE);
                bigS.setVisibility(View.VISIBLE);
                bigSexp.setVisibility(View.VISIBLE);
                bigR.setVisibility(View.VISIBLE);
                bigRexp.setVisibility(View.VISIBLE);
                nextExp.setVisibility(View.VISIBLE);
                startAnimation();
                }
        });
        nextExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextExp.setVisibility(View.GONE);
                solExp11.setVisibility(View.VISIBLE);
                p_S.setVisibility(View.VISIBLE);
                s_R.setVisibility(View.VISIBLE);
                p_R.setVisibility(View.VISIBLE);
                startAnimation2();
            }
        });
    }

    private void startAnimation2(){
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.mytrans);
        p_S.startAnimation(animation2);
        s_R.startAnimation(animation2);
        p_R.startAnimation(animation2);
        Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.myalfa);
        solExp11.setAnimation(animation3);
    }

    private void startAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.myalfa);
        solExplain.startAnimation(animation);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.myrotate);
        bigP.startAnimation(animation1);
        bigPexp.setAnimation(animation);
        bigS.startAnimation(animation1);
        bigSexp.setAnimation(animation);
        bigR.startAnimation(animation1);
        bigRexp.setAnimation(animation);
    }
}
