package com.e.diplomamaster.learning.withExplain;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.e.diplomamaster.R;

public class ExerciseWithExplain1_2 extends AppCompatActivity {
    TextView expForTable2;
    Button solution, nextStep;
    LinearLayout layWithTable2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_with_explain1_2);

        nextStep = findViewById(R.id.nextStepExp2);
        expForTable2 = findViewById(R.id.expForTable2);
        solution = findViewById(R.id.butForTable2);
        layWithTable2 = findViewById(R.id.layForTable2);
        solution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layWithTable2.setVisibility(View.VISIBLE);
                solution.setVisibility(View.GONE);
                expForTable2.setVisibility(View.VISIBLE);
                nextStep.setVisibility(View.VISIBLE);
                startAnimation();
            }
        });

        nextStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExerciseWithExplain1_2.this, ExerciseWithExplain1_3.class);
                startActivity(intent);
            }
        });
    }
    private void startAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.sample_anim);
        layWithTable2.startAnimation(animation);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        int [] textVG = new int[]{R.id.trueRow23, R.id.falseRow23, R.id.trueRow33, R.id.falseRow33, R.id.trueRow43, R.id.falseRow43, R.id.trueRow53, R.id.falseRow53};
        for (int i1:textVG) {
            TextView txtVGreen = findViewById(i1);
            txtVGreen.startAnimation(animation2);
            txtVGreen.setBackgroundColor(Color.GREEN);
        }
        int [] textVR = new int[]{R.id.falseRow23, R.id.falseRow33, R.id.falseRow43, R.id.falseRow53};
        for (int i1:textVR) {
            TextView txtVGreen = findViewById(i1);
            txtVGreen.startAnimation(animation2);
            txtVGreen.setBackgroundColor(Color.RED);
        }

        Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.righttoleft);
        expForTable2.startAnimation(animation3);
    }

}
