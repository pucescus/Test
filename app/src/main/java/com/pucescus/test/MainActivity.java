package com.pucescus.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText answer1, ansver2, ansver3;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer1 = findViewById(R.id.answer1);
        ansver2 = findViewById(R.id.answer2);
        ansver3 = findViewById(R.id.answer3);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans1 = answer1.getText().toString();
                String ans2 = ansver2.getText().toString();
                String ans3 = ansver3.getText().toString();
                //переход на 2 экран
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("answer1", ans1);
                intent.putExtra("answer2", ans2);
                intent.putExtra("answer3", ans3);
                startActivity(intent);
            }
        });




    }
}