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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroTemperatura = findViewById(R.id.editartexto_numero_1);
        botaoConverter = findViewById(R.id.botaoConverter);

        botaoConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(numeroTemperatura.getText().toString().length() == 0){
                    numeroTemperatura.setText("0");
                }

                float num1 = Integer.parseInt(numeroTemperatura.getText().toString());

                Fahreinheit fahreinheit = new Fahreinheit();
                resultado = fahreinheit.converterCelsiusParaFahreinheit(num1);


                Intent i = new Intent(MainActivity.this, OutraTela.class);
                i.putExtra("result", resultado);

                startActivity(i);
            }
        });

        Log.d("LOG", "onCreate-Tela1");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("LOG", "onStart-Tela1");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("LOG", "onResume-Tela1");
    }


}