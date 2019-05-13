package com.e.diplomamaster.learning.withExplain;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.e.diplomamaster.R;

public class ExerciseWithExplain1_2 extends AppCompatActivity {

    TextView trueRow11, trueRow12, trueRow13, trueRow14, trueRow15, trueRow21, trueRow22, trueRow23, trueRow24, trueRow25, trueRow31, trueRow32, trueRow33, trueRow34, trueRow35, trueRow41, trueRow42, trueRow43, trueRow44, trueRow45, trueRow51, trueRow52, trueRow53, trueRow54, trueRow55, trueRow61, trueRow62, trueRow63, trueRow64, trueRow65, trueRow71, trueRow72, trueRow73, trueRow74, trueRow75, trueRow81, trueRow82, trueRow83, trueRow84, trueRow85, falseRow11, falseRow12, falseRow13, falseRow14, falseRow15, falseRow21, falseRow22, falseRow23, falseRow24, falseRow25, falseRow31, falseRow32, falseRow33, falseRow34, falseRow35, falseRow41, falseRow42, falseRow43, falseRow44, falseRow45, falseRow51, falseRow52, falseRow53, falseRow54, falseRow55, falseRow61, falseRow62, falseRow63, falseRow64, falseRow65, falseRow71, falseRow72, falseRow73, falseRow74, falseRow75, falseRow81, falseRow82, falseRow83, falseRow84, falseRow85;
    boolean flag_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_with_explain1_2);

        trueRow11 = findViewById(R.id.trueRow11);
        trueRow12 = findViewById(R.id.trueRow12);
        trueRow13 = findViewById(R.id.trueRow13);
        trueRow14 = findViewById(R.id.trueRow14);
        trueRow15 = findViewById(R.id.trueRow15);
        trueRow21 = findViewById(R.id.trueRow21);
        trueRow22 = findViewById(R.id.trueRow22);
        trueRow23 = findViewById(R.id.trueRow23);
        trueRow24 = findViewById(R.id.trueRow24);
        trueRow25 = findViewById(R.id.trueRow25);
        trueRow31 = findViewById(R.id.trueRow31);
        trueRow32 = findViewById(R.id.trueRow32);
        trueRow33 = findViewById(R.id.trueRow33);
        trueRow34 = findViewById(R.id.trueRow34);
        trueRow35 = findViewById(R.id.trueRow35);
        trueRow41 = findViewById(R.id.trueRow41);
        trueRow42 = findViewById(R.id.trueRow42);
        trueRow43 = findViewById(R.id.trueRow43);
        trueRow44 = findViewById(R.id.trueRow44);
        trueRow45 = findViewById(R.id.trueRow45);
        trueRow51 = findViewById(R.id.trueRow51);
        trueRow52 = findViewById(R.id.trueRow52);
        trueRow53 = findViewById(R.id.trueRow53);
        trueRow54 = findViewById(R.id.trueRow54);
        trueRow55 = findViewById(R.id.trueRow55);
        trueRow61 = findViewById(R.id.trueRow61);
        trueRow62 = findViewById(R.id.trueRow62);
        trueRow63 = findViewById(R.id.trueRow63);
        trueRow64 = findViewById(R.id.trueRow64);
        trueRow65 = findViewById(R.id.trueRow65);
        trueRow71 = findViewById(R.id.trueRow71);
        trueRow72 = findViewById(R.id.trueRow72);
        trueRow73 = findViewById(R.id.trueRow73);
        trueRow74 = findViewById(R.id.trueRow74);
        trueRow75 = findViewById(R.id.trueRow75);
        trueRow81 = findViewById(R.id.trueRow81);
        trueRow82 = findViewById(R.id.trueRow82);
        trueRow83 = findViewById(R.id.trueRow83);
        trueRow84 = findViewById(R.id.trueRow84);
        trueRow85 = findViewById(R.id.trueRow85);

        //***************/

        falseRow11 = findViewById(R.id.falseRow11);
        falseRow12 = findViewById(R.id.falseRow12);
        falseRow13 = findViewById(R.id.falseRow13);
        falseRow14 = findViewById(R.id.falseRow14);
        falseRow15 = findViewById(R.id.falseRow15);
        falseRow21 = findViewById(R.id.falseRow21);
        falseRow22 = findViewById(R.id.falseRow22);
        falseRow23 = findViewById(R.id.falseRow23);
        falseRow24 = findViewById(R.id.falseRow24);
        falseRow25 = findViewById(R.id.falseRow25);
        falseRow31 = findViewById(R.id.falseRow31);
        falseRow32 = findViewById(R.id.falseRow32);
        falseRow33 = findViewById(R.id.falseRow33);
        falseRow34 = findViewById(R.id.falseRow34);
        falseRow35 = findViewById(R.id.falseRow35);
        falseRow41 = findViewById(R.id.falseRow41);
        falseRow42 = findViewById(R.id.falseRow42);
        falseRow43 = findViewById(R.id.falseRow43);
        falseRow44 = findViewById(R.id.falseRow44);
        falseRow45 = findViewById(R.id.falseRow45);
        falseRow51 = findViewById(R.id.falseRow51);
        falseRow52 = findViewById(R.id.falseRow52);
        falseRow53 = findViewById(R.id.falseRow53);
        falseRow54 = findViewById(R.id.falseRow54);
        falseRow55 = findViewById(R.id.falseRow55);
        falseRow61 = findViewById(R.id.falseRow61);
        falseRow62 = findViewById(R.id.falseRow62);
        falseRow63 = findViewById(R.id.falseRow63);
        falseRow64 = findViewById(R.id.falseRow64);
        falseRow65 = findViewById(R.id.falseRow65);
        falseRow71 = findViewById(R.id.falseRow71);
        falseRow72 = findViewById(R.id.falseRow72);
        falseRow73 = findViewById(R.id.falseRow73);
        falseRow74 = findViewById(R.id.falseRow74);
        falseRow75 = findViewById(R.id.falseRow75);
        falseRow81 = findViewById(R.id.falseRow81);
        falseRow82 = findViewById(R.id.falseRow82);
        falseRow83 = findViewById(R.id.falseRow83);
        falseRow84 = findViewById(R.id.falseRow84);
        falseRow85 = findViewById(R.id.falseRow85);

        View.OnClickListener forTrueFalse = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.trueRow11:
                        if(flag_g){
                            trueRow11.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                    }else{
                            trueRow11.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                    }
                        break;
                    case R.id.trueRow12:
                        if(flag_g){
                            trueRow12.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow12.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow13:
                        if(flag_g){
                            trueRow13.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow13.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow14:
                        if(flag_g){
                            trueRow14.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow14.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow15:
                        if(flag_g){
                            trueRow15.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow15.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow21:
                        if(flag_g){
                            trueRow21.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow21.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow22:
                        if(flag_g){
                            trueRow22.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow22.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow23:
                        if(flag_g){
                            trueRow23.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow23.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow24:
                        if(flag_g){
                            trueRow24.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow24.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow25:
                        if(flag_g){
                            trueRow25.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow25.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow31:
                        if(flag_g){
                            trueRow31.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow31.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow32:
                        if(flag_g){
                            trueRow32.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow32.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow33:
                        if(flag_g){
                            trueRow33.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow33.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow34:
                        if(flag_g){
                            trueRow34.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow34.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow35:
                        if(flag_g){
                            trueRow35.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow35.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow41:
                        if(flag_g){
                            trueRow41.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow41.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow42:
                        if(flag_g){
                            trueRow42.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow42.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow43:
                        if(flag_g){
                            trueRow43.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow43.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow44:
                        if(flag_g){
                            trueRow44.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow44.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow45:
                        if(flag_g){
                            trueRow45.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow45.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow51:
                        if(flag_g){
                            trueRow51.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow51.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow52:
                        if(flag_g){
                            trueRow52.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow52.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow53:
                        if(flag_g){
                            trueRow53.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow53.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow54:
                        if(flag_g){
                            trueRow54.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow54.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow55:
                        if(flag_g){
                            trueRow55.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow55.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow61:
                        if(flag_g){
                            trueRow61.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow61.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow62:
                        if(flag_g){
                            trueRow62.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow62.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow63:
                        if(flag_g){
                            trueRow63.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow63.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow64:
                        if(flag_g){
                            trueRow64.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow64.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow65:
                        if(flag_g){
                            trueRow65.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow65.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow71:
                        if(flag_g){
                            trueRow71.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow71.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow72:
                        if(flag_g){
                            trueRow72.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow72.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow73:
                        if(flag_g){
                            trueRow73.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow73.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow74:
                        if(flag_g){
                            trueRow74.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow74.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow75:
                        if(flag_g){
                            trueRow75.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow75.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow81:
                        if(flag_g){
                            trueRow81.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow81.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow82:
                        if(flag_g){
                            trueRow82.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow82.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow83:
                        if(flag_g){
                            trueRow83.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow83.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow84:
                        if(flag_g){
                            trueRow84.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow84.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.trueRow85:
                        if(flag_g){
                            trueRow85.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            trueRow85.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;

                    case R.id.falseRow11:
                        if(flag_g){
                            falseRow11.setBackgroundColor(Color.RED);
                            flag_g = false;
                        }else{
                            falseRow11.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow12:
                        if(flag_g){
                            falseRow12.setBackgroundColor(Color.RED);
                            flag_g = false;
                        }else{
                            falseRow12.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow13:
                        if(flag_g){
                            falseRow13.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow13.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow14:
                        if(flag_g){
                            falseRow14.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow14.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow15:
                        if(flag_g){
                            falseRow15.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow15.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow21:
                        if(flag_g){
                            falseRow21.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow21.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow22:
                        if(flag_g){
                            falseRow22.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow22.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow23:
                        if(flag_g){
                            falseRow23.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow23.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow24:
                        if(flag_g){
                            falseRow24.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow24.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow25:
                        if(flag_g){
                            falseRow25.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow25.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow31:
                        if(flag_g){
                            falseRow31.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow31.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow32:
                        if(flag_g){
                            falseRow32.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow32.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow33:
                        if(flag_g){
                            falseRow33.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow33.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow34:
                        if(flag_g){
                            falseRow34.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow34.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow35:
                        if(flag_g){
                            falseRow35.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow35.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow41:
                        if(flag_g){
                            falseRow41.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow41.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow42:
                        if(flag_g){
                            falseRow42.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow42.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow43:
                        if(flag_g){
                            falseRow43.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow43.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow44:
                        if(flag_g){
                            falseRow44.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow44.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow45:
                        if(flag_g){
                            falseRow45.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow45.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow51:
                        if(flag_g){
                            falseRow51.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow51.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow52:
                        if(flag_g){
                            falseRow52.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow52.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow53:
                        if(flag_g){
                            falseRow53.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow53.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow54:
                        if(flag_g){
                            falseRow54.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow54.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow55:
                        if(flag_g){
                            falseRow55.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow55.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow61:
                        if(flag_g){
                            falseRow61.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow61.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow62:
                        if(flag_g){
                            falseRow62.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow62.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow63:
                        if(flag_g){
                            falseRow63.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow63.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow64:
                        if(flag_g){
                            falseRow64.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow64.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow65:
                        if(flag_g){
                            falseRow65.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow65.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow71:
                        if(flag_g){
                            falseRow71.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow71.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow72:
                        if(flag_g){
                            falseRow72.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow72.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow73:
                        if(flag_g){
                            falseRow73.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow73.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow74:
                        if(flag_g){
                            falseRow74.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow74.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow75:
                        if(flag_g){
                            falseRow75.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow75.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow81:
                        if(flag_g){
                            falseRow81.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow81.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow82:
                        if(flag_g){
                            falseRow82.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow82.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow83:
                        if(flag_g){
                            falseRow83.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow83.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow84:
                        if(flag_g){
                            falseRow84.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow84.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                    case R.id.falseRow85:
                        if(flag_g){
                            falseRow85.setBackgroundColor(Color.GREEN);
                            flag_g = false;
                        }else{
                            falseRow85.setBackgroundColor(Color.WHITE);
                            flag_g = true;
                        }
                        break;
                }
            }
        };
        trueRow11.setOnClickListener(forTrueFalse);
        trueRow12.setOnClickListener(forTrueFalse);
        trueRow13.setOnClickListener(forTrueFalse);
        trueRow14.setOnClickListener(forTrueFalse);
        trueRow15.setOnClickListener(forTrueFalse);
        trueRow21.setOnClickListener(forTrueFalse);
        trueRow22.setOnClickListener(forTrueFalse);
        trueRow23.setOnClickListener(forTrueFalse);
        trueRow24.setOnClickListener(forTrueFalse);
        trueRow25.setOnClickListener(forTrueFalse);
        trueRow31.setOnClickListener(forTrueFalse);
        trueRow32.setOnClickListener(forTrueFalse);
        trueRow33.setOnClickListener(forTrueFalse);
        trueRow34.setOnClickListener(forTrueFalse);
        trueRow35.setOnClickListener(forTrueFalse);
        trueRow41.setOnClickListener(forTrueFalse);
        trueRow42.setOnClickListener(forTrueFalse);
        trueRow43.setOnClickListener(forTrueFalse);
        trueRow44.setOnClickListener(forTrueFalse);
        trueRow45.setOnClickListener(forTrueFalse);
        trueRow51.setOnClickListener(forTrueFalse);
        trueRow52.setOnClickListener(forTrueFalse);
        trueRow53.setOnClickListener(forTrueFalse);
        trueRow54.setOnClickListener(forTrueFalse);
        trueRow55.setOnClickListener(forTrueFalse);
        trueRow61.setOnClickListener(forTrueFalse);
        trueRow62.setOnClickListener(forTrueFalse);
        trueRow63.setOnClickListener(forTrueFalse);
        trueRow64.setOnClickListener(forTrueFalse);
        trueRow65.setOnClickListener(forTrueFalse);
        trueRow71.setOnClickListener(forTrueFalse);
        trueRow72.setOnClickListener(forTrueFalse);
        trueRow73.setOnClickListener(forTrueFalse);
        trueRow74.setOnClickListener(forTrueFalse);
        trueRow75.setOnClickListener(forTrueFalse);
        trueRow81.setOnClickListener(forTrueFalse);
        trueRow82.setOnClickListener(forTrueFalse);
        trueRow83.setOnClickListener(forTrueFalse);
        trueRow84.setOnClickListener(forTrueFalse);
        trueRow85.setOnClickListener(forTrueFalse);

        falseRow11.setOnClickListener(forTrueFalse);
        falseRow12.setOnClickListener(forTrueFalse);
        falseRow13.setOnClickListener(forTrueFalse);
        falseRow14.setOnClickListener(forTrueFalse);
        falseRow15.setOnClickListener(forTrueFalse);
        falseRow21.setOnClickListener(forTrueFalse);
        falseRow22.setOnClickListener(forTrueFalse);
        falseRow23.setOnClickListener(forTrueFalse);
        falseRow24.setOnClickListener(forTrueFalse);
        falseRow25.setOnClickListener(forTrueFalse);
        falseRow31.setOnClickListener(forTrueFalse);
        falseRow32.setOnClickListener(forTrueFalse);
        falseRow33.setOnClickListener(forTrueFalse);
        falseRow34.setOnClickListener(forTrueFalse);
        falseRow35.setOnClickListener(forTrueFalse);
        falseRow41.setOnClickListener(forTrueFalse);
        falseRow42.setOnClickListener(forTrueFalse);
        falseRow43.setOnClickListener(forTrueFalse);
        falseRow44.setOnClickListener(forTrueFalse);
        falseRow45.setOnClickListener(forTrueFalse);
        falseRow51.setOnClickListener(forTrueFalse);
        falseRow52.setOnClickListener(forTrueFalse);
        falseRow53.setOnClickListener(forTrueFalse);
        falseRow54.setOnClickListener(forTrueFalse);
        falseRow55.setOnClickListener(forTrueFalse);
        falseRow61.setOnClickListener(forTrueFalse);
        falseRow62.setOnClickListener(forTrueFalse);
        falseRow63.setOnClickListener(forTrueFalse);
        falseRow64.setOnClickListener(forTrueFalse);
        falseRow65.setOnClickListener(forTrueFalse);
        falseRow71.setOnClickListener(forTrueFalse);
        falseRow72.setOnClickListener(forTrueFalse);
        falseRow73.setOnClickListener(forTrueFalse);
        falseRow74.setOnClickListener(forTrueFalse);
        falseRow75.setOnClickListener(forTrueFalse);
        falseRow81.setOnClickListener(forTrueFalse);
        falseRow82.setOnClickListener(forTrueFalse);
        falseRow83.setOnClickListener(forTrueFalse);
        falseRow84.setOnClickListener(forTrueFalse);
        falseRow85.setOnClickListener(forTrueFalse);
    }
}
