package com.e.diplomamaster.learning.withExplain;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

import com.e.diplomamaster.R;

public class Theorem1 extends AppCompatActivity implements View.OnTouchListener {
    private ViewFlipper myFlip = null;
    private float fromPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theorem1);

        LinearLayout theoremLiner = findViewById(R.id.theoremLiner);
        theoremLiner.setOnTouchListener(this);

        myFlip = findViewById(R.id.myFlip);

        // Создаем View и добавляем их в уже готовый flipper
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        int layoutArr[] = new int[] {R.layout.fragment_page, R.layout.fragment_page2};
        for(int layout : layoutArr){
            myFlip.addView(inflater.inflate(layout,null));
        }
    }
    public boolean onTouch(View view, MotionEvent event)
    {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN: // Пользователь нажал на экран, т.е. начало движения
                // fromPosition - координата по оси X начала выполнения операции
                fromPosition = event.getX();
                break;
            case MotionEvent.ACTION_UP: // Пользователь отпустил экран, т.е. окончание движения
                float toPosition = event.getX();
                if (fromPosition > toPosition){
                    myFlip.setInAnimation(AnimationUtils.loadAnimation(this,R.anim.go_next_in));
                myFlip.setOutAnimation(AnimationUtils.loadAnimation(this,R.anim.go_next_out));
                myFlip.showNext();}
                else if (fromPosition < toPosition){
                myFlip.setInAnimation(AnimationUtils.loadAnimation(this,R.anim.go_prev_in));
                myFlip.setOutAnimation(AnimationUtils.loadAnimation(this,R.anim.go_prev_out));
                myFlip.showPrevious();}
            default:
                break;
        }
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
