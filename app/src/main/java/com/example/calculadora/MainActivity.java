package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtNum1, txtNum2, txtResultado;
    Button btn_sumar, btn_restar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        txtResultado = findViewById(R.id.txtResultado);
        btn_sumar = findViewById(R.id.btn_sumar);
        btn_restar = findViewById(R.id.btn_restar);

        btn_restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int primerNumero = Integer.parseInt(txtNum1.getText().toString());
                int segundoNumero = Integer.parseInt(txtNum2.getText().toString());
                int rest = primerNumero - segundoNumero;
                txtResultado.setText("Resultado: " + resta(primerNumero, segundoNumero));
            }
        });

        btn_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int primerNumero = Integer.parseInt(txtNum1.getText().toString());
                int segundoNumero = Integer.parseInt(txtNum2.getText().toString());
                int sum = primerNumero + segundoNumero;
                txtResultado.setText("Resultado: " + suma(primerNumero,segundoNumero));
            }
        });
    }
    public static int suma(int number1, int number2) {

        int result = number1 + number2;
        return result;
    }

    public static int resta(int number1, int number2) {

        int result = number1 - number2;
        return result;
    }
}