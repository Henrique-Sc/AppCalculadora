package com.example.appcalculadora;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtNumber1, edtNumber2;
    Button btnAdic, btnSub, btnMult, btnDiv;

    Double num1, num2, soma, sub, mult, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumber1 = findViewById(R.id.edtNumber1);
        edtNumber2 = findViewById(R.id.edtNumber2);

        btnAdic = findViewById(R.id.btnAdic);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);

        btnAdic.setOnClickListener(view -> {
            num1 = Double.parseDouble(edtNumber1.getText().toString());
            num2 = Double.parseDouble(edtNumber2.getText().toString());
            soma = num1 + num2;

            Toast.makeText(MainActivity.this, "A soma é " + soma, Toast.LENGTH_SHORT).show();
        });

        btnSub.setOnClickListener(view -> {
            num1 = Double.parseDouble(edtNumber1.getText().toString());
            num2 = Double.parseDouble(edtNumber2.getText().toString());
            sub = num1 - num2;

            Toast.makeText(MainActivity.this, "A subtração é " + sub, Toast.LENGTH_SHORT).show();
        });

        btnMult.setOnClickListener(view -> {
            num1 = Double.parseDouble(edtNumber1.getText().toString());
            num2 = Double.parseDouble(edtNumber2.getText().toString());
            mult = num1 * num2;

            Toast.makeText(MainActivity.this, "A multiplicação é " + mult, Toast.LENGTH_SHORT).show();
        });

        btnDiv.setOnClickListener(view -> {
            num1 = Double.parseDouble(edtNumber1.getText().toString());
            num2 = Double.parseDouble(edtNumber2.getText().toString());
            div = num1 / num2;

            Toast.makeText(MainActivity.this, "A divisão é " + div, Toast.LENGTH_SHORT).show();
        });
    }
}