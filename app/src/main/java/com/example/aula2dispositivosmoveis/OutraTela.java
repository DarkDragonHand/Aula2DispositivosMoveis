package com.example.aula2dispositivosmoveis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class OutraTela extends AppCompatActivity {

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

        Log.d("LOG", "onResume-Tela2");
    }
}