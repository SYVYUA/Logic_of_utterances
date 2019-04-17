package com.e.diplomamaster;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.e.diplomamaster.aboutCreators.AboutUs;
import com.e.diplomamaster.learning.LearningActivity;
import com.e.diplomamaster.setting.SettingS;
import com.e.diplomamaster.supportformulas.SupportFormula;
import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    //sgsg
    Intent intent = null;
    Button suppBut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = findViewById(R.id.cirlemenu);
        circleMenu.setMainMenu(Color.parseColor("#e69900"),R.drawable.add,R.drawable.cancel)
                .addSubMenu(Color.parseColor("#42EC23"),R.drawable.thik)
                .addSubMenu(Color.parseColor("#deff97"),R.drawable.ic_settings_24dp)
                .addSubMenu(Color.parseColor("#837373"),R.drawable.about_us)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int i) {
                        if(i==0){
                            intent = new Intent(MainActivity.this, LearningActivity.class);
                            startActivity(intent);

                        }
                        if(i == 1){
                            intent = new Intent(MainActivity.this, SettingS.class);
                            startActivity(intent);

                        }
                        if (i == 2){
                            intent = new Intent(MainActivity.this, AboutUs.class);
                            startActivity(intent);

                        }
                    }
                });


        suppBut = findViewById(R.id.supportBut);
        suppBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SupportFormula.class);
                startActivity(intent);

            }
        });



    }
}
