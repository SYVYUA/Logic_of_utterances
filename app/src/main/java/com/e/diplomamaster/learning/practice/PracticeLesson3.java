package com.e.diplomamaster.learning.practice;

import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.e.diplomamaster.MainActivity;
import com.e.diplomamaster.R;
import com.e.diplomamaster.learning.LearningActivity;

public class PracticeLesson3 extends AppCompatActivity {

    private RadioButton ch1P3, ch2P3, ch3P3;
    private Button check3, answQwest2;
    LinearLayout targetBox1, targetBox2, targetBox3;
    private TextView txt1,txt2,txt3,txt4;
    private TextView box1, box2, box3, box4;
    private Intent intent;

    AlertDialog.Builder ad;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_lesson3);

        context = PracticeLesson3.this;
        String title = "Вітаю. Ви розв'язали задачу!";
        final String button1String = "Повернутися до головного меню.";
        final String button2String = "Вирішити ще одну задачу.";

        ad = new AlertDialog.Builder(context);
        ad.setTitle(R.string.title_problem);//заголовок віконця
        ad.setMessage(R.string.what_do);//текс повідомлення

        ad.setPositiveButton(R.string.return_to_menu, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                intent = new Intent(PracticeLesson3.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ad.setNegativeButton(R.string.practLes3, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                intent = new Intent(PracticeLesson3.this, SecondPracticeLesson1.class);
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

        final RadioGroup rGroup3 = findViewById(R.id.rGroup2);
        ch1P3 = findViewById(R.id.ch1P3);
        ch2P3 = findViewById(R.id.ch2P3);
        ch3P3 = findViewById(R.id.ch3P3);

        targetBox1 = findViewById(R.id.target1);
        targetBox2 = findViewById(R.id.target2);
        targetBox3 = findViewById(R.id.target3);
        targetBox1.setOnDragListener(dragListener);
        targetBox2.setOnDragListener(dragListener);
        targetBox3.setOnDragListener(dragListener);


        txt1 = findViewById(R.id.and);
        txt2 = findViewById(R.id.oR);
        txt3 = findViewById(R.id.ifl2);
        txt4 = findViewById(R.id.ifl);
        txt1.setOnTouchListener(touchClickListener);
        txt2.setOnTouchListener(touchClickListener);
        txt3.setOnTouchListener(touchClickListener);
        txt4.setOnTouchListener(touchClickListener);

        box1 = findViewById(R.id.box11);
        box3 = findViewById(R.id.box33);
        box4 = findViewById(R.id.box44);


        answQwest2 = findViewById(R.id.answTest2);
        answQwest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rGroup3.setVisibility(View.VISIBLE);
                answQwest2.setVisibility(View.GONE);
            }
        });

        check3 = findViewById(R.id.nextBut3);
        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch1P3.isChecked()){
                    ad.show();

                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.for_drag_elem2, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
    View.OnTouchListener touchClickListener = new View.OnTouchListener(){

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

                    if ((view.getId()==R.id.ifl && v.getId()==R.id.target1) || (view.getId()==R.id.ifl2 && v.getId()==R.id.target1)){
                        LinearLayout oldPar = (LinearLayout) view.getParent();
                        oldPar.removeView(view);
                        LinearLayout newPar = (LinearLayout)v;
                        box1.setVisibility(View.GONE);
                        newPar.addView(view);

                    }else if(view.getId()==R.id.and && v.getId()==R.id.target2){
                        LinearLayout oldPar = (LinearLayout) view.getParent();
                        oldPar.removeView(view);
                        LinearLayout newPar = (LinearLayout)v;
                        box3.setVisibility(View.GONE);
                        newPar.addView(view);

                    }else if((view.getId()==R.id.ifl && v.getId()==R.id.target3) || (view.getId()==R.id.ifl2 && v.getId()==R.id.target3)){
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
