package com.e.diplomamaster.learning.withExplain;

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

    TextView trueRow23, falseRow23, trueRow33, falseRow33, trueRow43, falseRow43, trueRow53, falseRow53;
    Button solution, nextStep;
    LinearLayout layWithTable2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_with_explain1_2);

        solution = findViewById(R.id.butForTable2);
        layWithTable2 = findViewById(R.id.layForTable2);
        solution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layWithTable2.setVisibility(View.VISIBLE);
                solution.setVisibility(View.GONE);
                startAnimation();
            }
        });
    }
    private void startAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.sample_anim);
        layWithTable2.startAnimation(animation);

    }

}
