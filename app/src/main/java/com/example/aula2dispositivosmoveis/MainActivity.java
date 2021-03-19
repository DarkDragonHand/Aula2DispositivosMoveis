package com.example.aula2dispositivosmoveis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numeroTemperatura;
    private float resultado;
    private TextView resultadoConversao;
    private Button botaoConverter;

    int soma = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroTemperatura = findViewById(R.id.editartexto_numero_1);

        botaoConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numeroTemperatura.getText().toString().length() == 0){
                    numeroTemperatura.setText("0");
                }
                float num1 = Integer.parseInt(numeroTemperatura.getText().toString());

                Fahreinheit fahreinheit = new Fahreinheit();
                resultado = fahreinheit.converterCelsiusParaFahreinheit(num1);

                resultadoConversao.setText(String.valueOf(resultado));
            }
        });

        Log.d("LOG", "onCreate-Tela1");
        soma++;
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("LOG", "onStart-Tela1");
        soma++;
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("LOG", "onResume-Tela1");
        
    }


}