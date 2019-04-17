package com.e.diplomamaster.learning.lessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.e.diplomamaster.R;

public class FifthLesson extends AppCompatActivity {

    private RadioButton ch1, ch2, ch3 ,ch4;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_lesson);

        Button check = findViewById(R.id.nextBut5);
        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        ch4 = findViewById(R.id.ch4);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch3.isChecked()){
                    intent = new Intent(FifthLesson.this, SixthLesson.class);
                    startActivity(intent);
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.promt_5, Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}
