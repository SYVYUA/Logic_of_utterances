package com.e.diplomamaster.learning.lessons;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.e.diplomamaster.R;

public class SecondLesson extends AppCompatActivity {
    LinearLayout targetBox1, targetBox2, targetBox3;
    TextView txt1,txt2,txt3;
    TextView box1, box2, box3;
    Button check;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_lesson);
        targetBox1 = findViewById(R.id.targetBox1);
        targetBox2 = findViewById(R.id.targetBox2);
        targetBox3 = findViewById(R.id.targetBox3);
        targetBox1.setOnDragListener(dragListener);
        targetBox2.setOnDragListener(dragListener);
        targetBox3.setOnDragListener(dragListener);


        txt1 = findViewById(R.id.and);
        txt2 = findViewById(R.id.or);
        txt3 = findViewById(R.id.ifl);
        txt1.setOnTouchListener(touchClickListener);
        txt2.setOnTouchListener(touchClickListener);
        txt3.setOnTouchListener(touchClickListener);

        box1 = findViewById(R.id.box1);
        box2 = findViewById(R.id.box2);
        box3 = findViewById(R.id.box3);


        check = findViewById(R.id.nextBut2);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(SecondLesson.this, ThirdLesson.class);
                startActivity(intent);

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

                    if (view.getId()==R.id.and && v.getId()==R.id.targetBox1){
                        LinearLayout oldPar = (LinearLayout) view.getParent();
                        oldPar.removeView(view);
                        LinearLayout newPar = (LinearLayout)v;
                        box1.setVisibility(View.GONE);
                        newPar.addView(view);

                    }else if(view.getId()==R.id.or && v.getId()==R.id.targetBox2){
                        LinearLayout oldPar = (LinearLayout) view.getParent();
                        oldPar.removeView(view);
                        LinearLayout newPar = (LinearLayout)v;
                        box2.setVisibility(View.GONE);
                        newPar.addView(view);
                    }
                    else if(view.getId()==R.id.ifl && v.getId()==R.id.targetBox3){
                        LinearLayout oldPar = (LinearLayout) view.getParent();
                        oldPar.removeView(view);
                        LinearLayout newPar = (LinearLayout)v;
                        box3.setVisibility(View.GONE);
                        newPar.addView(view);
                    }
                    else {
                        Toast toast = Toast.makeText(getApplicationContext(), R.string.promt_2, Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    break;
            }
            return true;
        }
    };


}
