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

public class PracticeLesson2 extends AppCompatActivity {

    private RadioButton ch1P2, ch2P2, ch3P2;
    private Button check2, answQwest2;
    LinearLayout targetBox1, targetBox2, targetBox3, targetBox4;
    private TextView txt1,txt2,txt3,txt4;
    private TextView box1, box2, box3, box4;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_lesson2);

        final RadioGroup rGroup2 = findViewById(R.id.rGroup2);
        ch1P2 = findViewById(R.id.ch1P2);
        ch2P2 = findViewById(R.id.ch2P2);
        ch3P2 = findViewById(R.id.ch3P2);

        targetBox1 = findViewById(R.id.target1);
        targetBox2 = findViewById(R.id.target2);
        targetBox3 = findViewById(R.id.target3);
        targetBox4 = findViewById(R.id.target4);
        targetBox1.setOnDragListener(dragListener);
        targetBox2.setOnDragListener(dragListener);
        targetBox3.setOnDragListener(dragListener);
        targetBox4.setOnDragListener(dragListener);

        txt1 = findViewById(R.id.and);
        txt2 = findViewById(R.id.varQ);
        txt3 = findViewById(R.id.varR);
        txt4 = findViewById(R.id.notP);
        txt1.setOnTouchListener(touchClickListener);
        txt2.setOnTouchListener(touchClickListener);
        txt3.setOnTouchListener(touchClickListener);
        txt4.setOnTouchListener(touchClickListener);

        box1 = findViewById(R.id.box11);
        box2 = findViewById(R.id.box22);
        box3 = findViewById(R.id.box33);
        box4 = findViewById(R.id.box44);


        answQwest2 = findViewById(R.id.answTest2);
        answQwest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rGroup2.setVisibility(View.VISIBLE);
                answQwest2.setVisibility(View.GONE);
            }
        });

        check2 = findViewById(R.id.nextBut3);
        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch2P2.isChecked()){
                    intent = new Intent(PracticeLesson2.this, PracticeLesson3.class);
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

                    if (view.getId()==R.id.notP && v.getId()==R.id.target1){
                        LinearLayout oldPar = (LinearLayout) view.getParent();
                        oldPar.removeView(view);
                        LinearLayout newPar = (LinearLayout)v;
                        box1.setVisibility(View.GONE);
                        newPar.addView(view);

                    }else if(view.getId()==R.id.varQ && v.getId()==R.id.target2){
                        LinearLayout oldPar = (LinearLayout) view.getParent();
                        oldPar.removeView(view);
                        LinearLayout newPar = (LinearLayout)v;
                        box2.setVisibility(View.GONE);
                        newPar.addView(view);

                    }else if(view.getId()==R.id.and && v.getId()==R.id.target3){
                        LinearLayout oldPar = (LinearLayout) view.getParent();
                        oldPar.removeView(view);
                        LinearLayout newPar = (LinearLayout)v;
                        box3.setVisibility(View.GONE);
                        newPar.addView(view);

                    }else if(view.getId()==R.id.varR && v.getId()==R.id.target4) {
                        LinearLayout oldPar = (LinearLayout) view.getParent();
                        oldPar.removeView(view);
                        LinearLayout newPar = (LinearLayout) v;
                        box4.setVisibility(View.GONE);
                        newPar.addView(view);
                    }else {
                        Toast toast = Toast.makeText(getApplicationContext(), R.string.for_drag_elem, Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    break;
            }
            return true;
        }
    };
}