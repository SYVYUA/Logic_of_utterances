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

public class ExerciseWithExplain1 extends AppCompatActivity {

    private Button solution;
    private TextView solExplain, nextScreen, trueRow23, falseRow24, falseRow25, falseRow26, falseRow33, trueRow34, falseRow35, falseRow36, trueRow43, falseRow44, falseRow45, trueRow46, trueRow53, trueRow54, trueRow55, trueRow56;
    LinearLayout layForTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_with_explain1);

        trueRow23 = findViewById(R.id.trueRow23);
        falseRow24 = findViewById(R.id.falseRow24);
        falseRow25 = findViewById(R.id.falseRow25);
        falseRow26 = findViewById(R.id.falseRow26);
        falseRow33 = findViewById(R.id.falseRow33);
        trueRow34 = findViewById(R.id.trueRow34);
        falseRow35 = findViewById(R.id.falseRow35);
        falseRow36 = findViewById(R.id.falseRow36);
        trueRow43 = findViewById(R.id.trueRow43);
        falseRow44 = findViewById(R.id.falseRow44);
        falseRow45 = findViewById(R.id.falseRow45);
        trueRow46 = findViewById(R.id.trueRow46);
        trueRow53 = findViewById(R.id.trueRow53);
        trueRow54 = findViewById(R.id.trueRow54);
        trueRow55 = findViewById(R.id.trueRow55);
        trueRow56 = findViewById(R.id.trueRow56);
        nextScreen = findViewById(R.id.nextStepExp1);
        layForTable = findViewById(R.id.layForTable);

        solExplain = findViewById(R.id.solExplain);
        solution = findViewById(R.id.solution);


        solution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setVisibility(View.GONE);
                solExplain.setVisibility(View.VISIBLE);
                nextScreen.setVisibility(View.VISIBLE);
                layForTable.setVisibility(View.VISIBLE);
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
        int[] txtView = new int[]{R.id.trueRow23, R.id.falseRow24, R.id.falseRow25, R.id.falseRow26, R.id.falseRow33, R.id.trueRow34, R.id.falseRow35, R.id.falseRow36, R.id.trueRow43, R.id.falseRow44, R.id.falseRow45, R.id.trueRow46, R.id.trueRow53, R.id.trueRow54, R.id.trueRow55, R.id.trueRow56};
        for(int i = 0; i<txtView.length; i++){
            TextView txtVW = findViewById(txtView[i]);
            txtVW.setBackgroundColor(Color.GREEN);
        }
        solExplain.startAnimation(animation);
        layForTable.startAnimation(animation);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.myrotate);

    }
}
