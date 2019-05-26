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

import com.e.diplomamaster.MainActivity;
import com.e.diplomamaster.R;
import com.e.diplomamaster.learning.LearningActivity;

public class ExerciseWithExplain1_3 extends AppCompatActivity {

    private TextView explainForTable3;
    Button butForTabl3, toMainMenu;
    LinearLayout layForTable3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_with_explain1_3);

        toMainMenu = findViewById(R.id.toMainMenu);
        explainForTable3 = findViewById(R.id.explainForTable3);
        butForTabl3 = findViewById(R.id.butForTabl3);
        layForTable3 = findViewById(R.id.layForTable3);
        butForTabl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layForTable3.setVisibility(View.VISIBLE);
                explainForTable3.setVisibility(View.VISIBLE);
                butForTabl3.setVisibility(View.GONE);
                toMainMenu.setVisibility(View.VISIBLE);
                startAnimation();
            }
        });
        toMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExerciseWithExplain1_3.this, LearningActivity.class);
                startActivity(intent);
            }
        });
    }

    private void startAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.lefttoright);
        layForTable3.startAnimation(animation);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        int [] txtVG = new int[]{R.id.trueRow23, R.id.falseRow24, R.id.falseRow25, R.id.falseRow26, R.id.falseRow33, R.id.trueRow34, R.id.falseRow35, R.id.falseRow36, R.id.trueRow43, R.id.falseRow44, R.id.falseRow45, R.id.falseRow46, R.id.trueRow53, R.id.trueRow54, R.id.trueRow55, R.id.falseRow56};
        for (int i1:txtVG){
            TextView txtVGreen = findViewById(i1);
            txtVGreen.startAnimation(animation1);
            txtVGreen.setBackgroundColor(Color.GREEN);

        }
        int [] txtVR = new int[]{R.id.falseRow23, R.id.trueRow24, R.id.trueRow25, R.id.trueRow26, R.id.trueRow33, R.id.falseRow34, R.id.trueRow35, R.id.trueRow36, R.id.falseRow43, R.id.trueRow44, R.id.trueRow45, R.id.trueRow46, R.id.falseRow53, R.id.falseRow54, R.id.falseRow55, R.id.trueRow56};
        for (int i1:txtVR){
            TextView txtVRed = findViewById(i1);
            txtVRed.startAnimation(animation1);
            txtVRed.setBackgroundColor(Color.RED);

        }
    }
}
