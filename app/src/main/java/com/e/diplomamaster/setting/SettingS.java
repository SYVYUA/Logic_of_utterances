package com.e.diplomamaster.setting;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import com.e.diplomamaster.R;

import java.util.Locale;

public class SettingS extends AppCompatActivity implements View.OnClickListener {

    private Button butUaLang, butEngLang;
    private Locale myLocale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_s);

        //В завершение совместим всю работу со сменой языка в методе onCreate() нашей Activity:
        butEngLang = findViewById(R.id.changeLang2);
        butUaLang = findViewById(R.id.changeLang1);

        butEngLang.setOnClickListener(this);
        butUaLang.setOnClickListener(this);

        loadLocale();
}

    //Смена языка в приложении:
    public void changeLang(String lang)
    {
        if (lang.equalsIgnoreCase(""))
            return;
        myLocale = new Locale(lang);
        saveLocale(lang);
        Locale.setDefault(myLocale);
        android.content.res.Configuration config = new android.content.res.Configuration();
        config.locale = myLocale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        updateTexts();
    }

    //Сохранение текущей локали:
    public void saveLocale(String lang)
    {
        String langPref = "Language";
        SharedPreferences prefs = getSharedPreferences("CommonPrefs", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(langPref, lang);
        editor.apply();
    }

    //Загрузка ранее сохраненной локали:
    public void loadLocale()
    {
        String langPref = "Language";
        SharedPreferences prefs = getSharedPreferences("CommonPrefs", Activity.MODE_PRIVATE);
        String language = prefs.getString(langPref, "");
        changeLang(language);
    }

   // Обновление UI элементов текущего окна (обновлять необходимо только окно, в котором происходит смена локали):
    private void updateTexts()
    {

        butEngLang.setText(R.string.engLang);
        butUaLang.setText(R.string.uaLang);
    }

    //Добавим события на нажатие кнопок. Для этого имплементируем интерфейс OnClickListener для нашей Activity (implements OnClickListener). И реализуем метод onClick().
    public void onClick(View v) {
        String lang = "";
        switch (v.getId()) {
            case R.id.changeLang2:
                lang = "en";
                break;
            case R.id.changeLang1:
                lang = "ru";
                break;
            default:
                break;
        }
        changeLang(lang);
    }
}
