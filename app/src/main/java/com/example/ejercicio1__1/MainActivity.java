package com.example.ejercicio1__1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editTextUno,editTextDos;
Button btnSuma, btnresta,btnmultiplicacion,btndivision;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUno = (EditText) findViewById(R.id.numeroUno);
        editTextDos = (EditText) findViewById(R.id.numerodos);

        btnSuma = (Button) findViewById(R.id.Btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        btnmultiplicacion = (Button) findViewById(R.id.btnmultiplicacion);
        btndivision = (Button) findViewById(R.id.btndivision);
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    suma();
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resta();
            }
        });

        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multiplicacion();
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                division();
            }
        });

    }

    public void suma()
    {
        double numero1,numero2,result;
        numero1=Integer.parseInt(editTextUno.getText().toString());
        numero2=Integer.parseInt(editTextDos.getText().toString());
        result=numero1+numero2;
        Intent intent = new Intent(getApplicationContext(),MainActivityResult.class);
        intent.putExtra("resultado","Total  suma"+result);
        startActivity(intent);
    }

    public void resta()
    {
        double numero1,numero2,result;
        numero1=Integer.parseInt(editTextUno.getText().toString());
        numero2=Integer.parseInt(editTextDos.getText().toString());
        result=numero1-numero2;
        Intent intent = new Intent(getApplicationContext(),MainActivityResult.class);
        intent.putExtra("resultado","Total resta"+result);
        startActivity(intent);
    }

    public void multiplicacion()
    {
        double numero1,numero2,result;
        numero1=Integer.parseInt(editTextUno.getText().toString());
        numero2=Integer.parseInt(editTextDos.getText().toString());
        result=numero1*numero2;
        Intent intent = new Intent(getApplicationContext(),MainActivityResult.class);
        intent.putExtra("resultado","Total  multiplicacion"+result);
        startActivity(intent);
    }

    public void division()
    {
        double numero1,numero2,result;
        numero1=Integer.parseInt(editTextUno.getText().toString());
        numero2=Integer.parseInt(editTextDos.getText().toString());
        result=numero1/numero2;
        Intent intent = new Intent(getApplicationContext(),MainActivityResult.class);
        intent.putExtra("resultado","Total  division"+result);
        startActivity(intent);
    }

}