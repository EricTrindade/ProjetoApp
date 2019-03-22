package com.example.a26146045.aula13_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Exercicio4_2 extends AppCompatActivity {
    private TextView tela;
    private EditText modelo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio4_2);

        modelo = findViewById(R.id.modelo);
        tela = findViewById(R.id.tela);
        Bundle dados = getIntent().getExtras();
        double resultado = dados.getDouble("resultado");

        tela.setText("" + resultado);
    }


}
