package com.e.diplomamaster.learning.practice;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.e.diplomamaster.R;

public class SecondPracticeLesson1 extends AppCompatActivity {

    LinearLayout targetBox1, targetBox2, targetBox3;
    private TextView txt1,txt2,txt3,txt4;
    private TextView box1, box2, box3;
    private Button check, secAnswQwest;
    private Intent intent;
    private RadioButton ch1P, ch2P,ch3P;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_practice_lesson1);
        final RadioGroup secrGroup1 = findViewById(R.id.secrGroup1);
        ch1P = findViewById(R.id.secch1P);
        ch2P = findViewById(R.id.secch2P3);
        ch3P = findViewById(R.id.secch3P3);

        targetBox1 = findViewById(R.id.target1);
        targetBox2 = findViewById(R.id.target2);
        targetBox3 = findViewById(R.id.target3);
        targetBox1.setOnDragListener(dragListener);
        targetBox2.setOnDragListener(dragListener);
        targetBox3.setOnDragListener(dragListener);

        txt1 = findViewById(R.id.and);
        txt2 = findViewById(R.id.oR);
        txt3 = findViewById(R.id.equaL);
        txt4 = findViewById(R.id.ifl);
        txt1.setOnTouchListener(touchClickListener);
        txt2.setOnTouchListener(touchClickListener);
        txt3.setOnTouchListener(touchClickListener);
        txt4.setOnTouchListener(touchClickListener);

        box1 = findViewById(R.id.box11);
        box2 = findViewById(R.id.box22);
        box3 = findViewById(R.id.box33);

        secAnswQwest = findViewById(R.id.secanswTest1);
        secAnswQwest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secrGroup1.setVisibility(View.VISIBLE);
                secAnswQwest.setVisibility(View.GONE);
            }
        });

        check = findViewById(R.id.secnextBut1);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch1P.isChecked()){
                    intent = new Intent(SecondPracticeLesson1.this, SecondPracticeLesson2.class);
                    startActivity(intent);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.for_drag_elem2, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }

    View.OnTouchListener touchClickListener = new View.OnTouchListener() {

        @Override
        public boolean onTouch(View v, MotionEvent event) {

            ClipData data = ClipData.newPlainText("","");
            View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(v);
            v.startDrag(data, myShadowBuilder,v,0);
            return true;
        }
    };
    View.OnDragListener dragListener = new View.OnDragListener(){
        @Override
        public boolean onDrag(View v, DragEvent event) {

            int dragEvent = event.getAction();
            final View view = (View) event.getLocalState();

            switch (dragEvent){
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    if (view.getId()==R.id.ifl && v.getId()==R.id.target1){
                        LinearLayout oldPar = (LinearLayout) view.getParent();
                        oldPar.removeView(view);
                        LinearLayout newPar = (LinearLayout)v;
                        box1.setVisibility(View.GONE);
                        newPar.addView(view);
                    }else if(view.getId()==R.id.equaL && v.getId()==R.id.target2){
                        LinearLayout oldPar = (LinearLayout) view.getParent();
                        oldPar.removeView(view);
                        LinearLayout newPar = (LinearLayout)v;
                        box2.setVisibility(View.GONE);
                        newPar.addView(view);
                    }else if(view.getId()==R.id.oR && v.getId()==R.id.target3){
                        LinearLayout oldPar = (LinearLayout) view.getParent();
                        oldPar.removeView(view);
                        LinearLayout newPar = (LinearLayout)v;
                        box3.setVisibility(View.GONE);
                        newPar.addView(view);
                    } else {
                        Toast toast = Toast.makeText(getApplicationContext(), R.string.for_drag_elem, Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    break;
            }
            return true;
        }
    };
}