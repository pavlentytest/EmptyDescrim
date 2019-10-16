package com.samsung.myitschool.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // создаем объект класс EditText
        EditText koeff_a = findViewById(R.id.KoeffA);
        // получение строчного значения
        String string_a = koeff_a.getText().toString();
        // конвертирование из строки в вещ. число
        double a = Double.parseDouble(string_a);



    }
}

