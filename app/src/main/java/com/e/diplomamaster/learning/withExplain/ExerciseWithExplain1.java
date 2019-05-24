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
    private TextView explainForTable, solExplain, nextScreen, trueRow23, falseRow24, falseRow25, falseRow26, falseRow33, trueRow34, falseRow35, falseRow36, trueRow43, falseRow44, falseRow45, trueRow46, trueRow53, trueRow54, trueRow55, trueRow56;
    LinearLayout layForTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_with_explain1);

        nextScreen = findViewById(R.id.nextStepExp1);
        layForTable = findViewById(R.id.layForTable);

        explainForTable = findViewById(R.id.explainForTable);
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
        int[] txtViewGreen = new int[]{R.id.trueRow23, R.id.falseRow24, R.id.falseRow25, R.id.falseRow26, R.id.falseRow33, R.id.trueRow34, R.id.falseRow35, R.id.falseRow36, R.id.trueRow43, R.id.falseRow44, R.id.falseRow45, R.id.trueRow46, R.id.trueRow53, R.id.trueRow54, R.id.trueRow55, R.id.trueRow56};
        for(int i = 0; i<txtViewGreen.length; i++){
            TextView txtVWGreen = findViewById(txtViewGreen[i]);
            txtVWGreen.setBackgroundColor(Color.GREEN);
        }
        int[] txtViewRed = new int[]{R.id.falseRow23, R.id.trueRow24, R.id.trueRow25, R.id.trueRow26, R.id.trueRow33, R.id.falseRow34, R.id.trueRow35, R.id.trueRow36, R.id.falseRow43, R.id.trueRow44, R.id.trueRow45, R.id.falseRow46, R.id.falseRow53, R.id.falseRow54, R.id.falseRow55, R.id.falseRow56};
        for(int i =0; i<txtViewRed.length; i++){
            TextView txtVWRed = findViewById(txtViewRed[i]);
            txtVWRed.setBackgroundColor(Color.RED);
        }
        solExplain.startAnimation(animation);
        layForTable.startAnimation(animation);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        explainForTable.startAnimation(animation1);

    }
}
