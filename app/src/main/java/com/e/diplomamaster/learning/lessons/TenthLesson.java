package com.e.diplomamaster.learning.lessons;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.e.diplomamaster.MainActivity;
import com.e.diplomamaster.R;
import com.e.diplomamaster.learning.practice.PracticeLesson3;
import com.e.diplomamaster.learning.practice.SecondPracticeLesson1;

public class TenthLesson extends AppCompatActivity {

    private RadioButton ch1, ch2, ch3 ,ch4;
    private Intent intent;
    AlertDialog.Builder ad;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth_lesson);

        context = TenthLesson.this;

        ad = new AlertDialog.Builder(context);
        ad.setTitle(R.string.title_test);//заголовок віконця
        ad.setMessage(R.string.what_do);//текс повідомлення

        ad.setPositiveButton(R.string.return_to_menu, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                intent = new Intent(TenthLesson.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ad.setCancelable(true);
        ad.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                Toast.makeText(context, R.string.not_choise, Toast.LENGTH_LONG).show();
            }
        });

        Button check = findViewById(R.id.nextBut10);
        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        ch4 = findViewById(R.id.ch4);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch1.isChecked()){
                    ad.show();
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.promt_10, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }
}
