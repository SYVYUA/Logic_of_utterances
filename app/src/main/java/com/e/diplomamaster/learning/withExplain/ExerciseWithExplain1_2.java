package com.e.diplomamaster.learning.withExplain;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.e.diplomamaster.R;

public class ExerciseWithExplain1_2 extends AppCompatActivity {

    TextView trueRow11, trueRow12, falseRow11, falseRow12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_with_explain1_2);

        trueRow11 = findViewById(R.id.trueRow11);
        trueRow12 = findViewById(R.id.trueRow12);
        falseRow11 = findViewById(R.id.falseRow11);
        falseRow12 = findViewById(R.id.falseRow12);

        View.OnClickListener forTrueFalse = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.trueRow11:
                        trueRow11.setBackgroundColor(Color.GREEN);
                        break;
                    case R.id.trueRow12:
                        trueRow12.setBackgroundColor(Color.GREEN);
                        break;
                    case R.id.falseRow11:
                        falseRow11.setBackgroundColor(Color.RED);
                        break;
                    case R.id.falseRow12:
                        falseRow12.setBackgroundColor(Color.RED);
                        break;
                }
            }
        };
        trueRow11.setOnClickListener(forTrueFalse);
        trueRow12.setOnClickListener(forTrueFalse);
        falseRow11.setOnClickListener(forTrueFalse);
        falseRow12.setOnClickListener(forTrueFalse);


    }
}
