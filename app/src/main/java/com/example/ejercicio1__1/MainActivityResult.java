package com.example.ejercicio1__1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivityResult extends AppCompatActivity {
TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_result);

        result = (TextView) findViewById(R.id.textView);
        result.setText("");
        result.setText(getIntent().getStringExtra("resultado").toString());


    }
}