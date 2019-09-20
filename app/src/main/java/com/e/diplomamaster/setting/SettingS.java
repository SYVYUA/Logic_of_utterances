package com.e.diplomamaster.setting;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Button;

import com.e.diplomamaster.R;

import java.util.Locale;

public class SettingS extends AppCompatActivity {

    private Button butUaLang, butEngLang;
    private Locale locale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_s);

        //В завершение совместим всю работу со сменой языка в методе onCreate() нашей Activity:
        this.txt_hello = (TextView)findViewById(R.id.txt_hello);
        this.btn_en = (Button)findViewById(R.id.btn_en);
        this.btn_ru = (Button)findViewById(R.id.btn_ru);
        this.btn_fr = (Button)findViewById(R.id.btn_fr);
        this.btn_de = (Button)findViewById(R.id.btn_de);

        this.btn_en.setOnClickListener(this);
        this.btn_ru.setOnClickListener(this);
        this.btn_fr.setOnClickListener(this);
        this.btn_de.setOnClickListener(this);

        loadLocale();
    }

        /*Resources res = context.getResources();
// Change locale settings in the app.
        DisplayMetrics dm = res.getDisplayMetrics();
        android.content.res.Configuration conf = res.getConfiguration();
        conf.setLocale(new Locale(language_code.toLowerCase())); // API 17+ only.
// Use conf.locale = new Locale(...) if targeting lower versions
        res.updateConfiguration(conf, dm);*/
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
        editor.commit();
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
        txt_hello.setText(R.string.hello_world);
        btn_en.setText(R.string.btn_en);
        btn_ru.setText(R.string.btn_ru);
        btn_fr.setText(R.string.btn_fr);
        btn_de.setText(R.string.btn_de);
    }

    //Добавим события на нажатие кнопок. Для этого имплементируем интерфейс OnClickListener для нашей Activity (implements OnClickListener). И реализуем метод onClick().
    public void onClick(View v) {
        String lang = "en";
        switch (v.getId()) {
            case R.id.btn_en:
                lang = "en";
                break;
            case R.id.btn_ru:
                lang = "ru";
                break;
            case R.id.btn_de:
                lang = "de";
                break;
            case R.id.btn_fr:
                lang = "fr";
                break;
            default:
                break;
        }
        changeLang(lang);
    }
}
