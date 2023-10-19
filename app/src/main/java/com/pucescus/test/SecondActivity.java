package com.pucescus.test;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    private TextView input2, input3, input4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);

        //получение ответа с прошлого ответа
        Intent intent = getIntent();
        String answer1 = intent.getStringExtra("answer1");
        String answer2 = intent.getStringExtra("answer2");
        String answer3 = intent.getStringExtra("answer3");

        if (answer1.equals("Александр Сергеевич")) {
        input2.setText("Верный ответ ");
            input2.setBackgroundColor(Color.argb(0xFF, 0xBD,0xF4, 0x00 ));
        }
        else {
            input2.setText("Ответ неправильный, правильный ответ Александр Сергеевич");
            input2.setBackgroundColor(Color.argb(0xFF, 0xBf,0x30, 0x30 ));
        }
        if (answer2.equals("4")) {
            input3.setText("Верный ответ");
            input3.setBackgroundColor(Color.argb(0xFF, 0xBD,0xF4, 0x00 ));
        }
        else {
            input3.setText("Ответ неправильный, правильный ответ 4");
            input3.setBackgroundColor(Color.argb(0xFF, 0xBF,0x30, 0x30 ));
        }
        if (answer3.equals("Князь Владимир")) {
            input4.setText("Верный ответ");
            input4.setBackgroundColor(Color.argb(0xFF, 0xBD,0xF4, 0x00 ));
        }
        else {
            input4.setText("Ответ неправильный правильный ответ Князь Владимир");
            input4.setBackgroundColor(Color.argb(0xFF, 0xBF,0x30, 0x30 ));
        }
        }






        }

