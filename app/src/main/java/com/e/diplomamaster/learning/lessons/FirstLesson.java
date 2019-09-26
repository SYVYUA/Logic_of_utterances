package com.e.diplomamaster.learning.lessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.e.diplomamaster.R;

public class FirstLesson extends AppCompatActivity {

    private Button check;
    private TextView changeExp, Title;
    private CheckBox ch1, ch2, ch3, ch4;
    Intent intent = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_lesson);

        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        ch4 = findViewById(R.id.ch4);
        Title = findViewById(R.id.textlogic);
        changeExp = findViewById(R.id.eplain1);
        check = findViewById(R.id.nextBut1);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(ch1.isChecked() && ch2.isChecked()){
                intent = new Intent(FirstLesson.this, SecondLesson.class);
                startActivity(intent);
            }
            if(ch3.isChecked()&&ch4.isChecked()) {
                Toast toast = Toast.makeText(getApplicationContext(),R.string.promt_1, Toast.LENGTH_LONG);
                toast.show();
            }
                if(ch3.isChecked()) {
                    Toast toast = Toast.makeText(getApplicationContext(),R.string.promt_1, Toast.LENGTH_LONG);
                    toast.show();
                }
                if(ch4.isChecked()) {
                    Toast toast = Toast.makeText(getApplicationContext(),R.string.promt_1, Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}
