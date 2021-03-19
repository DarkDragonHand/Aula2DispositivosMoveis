package com.example.aula2dispositivosmoveis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class OutraTela extends AppCompatActivity {
    TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_outra_tela);
        Log.d("LOG", "onCreate-Tela2");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("LOG", "onStart-Tela2");
    }

    @Override
    protected void onResume() {
        super.onResume();

        float resultado = 0.0f;

        textResultado = (TextView) findViewById(R.id.textResultado);
        
        Intent intent = getIntent();

        resultado = intent.getFloatExtra("result", 0);

        textResultado.setText(String.valueOf(resultado));

        Log.d("LOG", "onResume-Tela2");
    }
}