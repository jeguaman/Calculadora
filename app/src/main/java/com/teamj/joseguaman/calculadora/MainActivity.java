package com.teamj.joseguaman.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText valor1;
    private EditText valor2;
    private Button sumar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1= (EditText) findViewById(R.id.txt_numero_1);
        valor2= (EditText) findViewById(R.id.txt_numero_2);
        sumar = (Button) findViewById(R.id.btnCalculo);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumar();
            }
        });
    }

    private void sumar(){
        String total = "La suma es: ";
        Integer suma = Integer.parseInt(valor1.getText().toString()) + Integer.parseInt(valor2.getText().toString());
        Toast.makeText(getApplicationContext(), total+ suma, Toast.LENGTH_LONG).show();
    }
}
