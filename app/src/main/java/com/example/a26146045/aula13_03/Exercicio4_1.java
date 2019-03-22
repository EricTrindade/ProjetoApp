package com.example.a26146045.aula13_03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class Exercicio4_1 extends AppCompatActivity {

    private EditText valorGasolina;
    private EditText potencia;
    private EditText distancia;
    private EditText modelo;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio4_1);

        valorGasolina = findViewById(R.id.valorGasolina);
        potencia = findViewById(R.id.potencia);
        distancia = findViewById(R.id.distancia);
        modelo = findViewById(R.id.modelo);
    }

    public void calcularGasto (View et){
        double valor = Double.parseDouble(potencia.getText().toString());
        double dist = Double.parseDouble(distancia.getText().toString());
        double gas = Double.parseDouble(valorGasolina.getText().toString());
        double multiplicador;

        if ( valor <= 1.0){
        multiplicador = 13;
        }else if(valor > 1.0 && valor < 1.4){
        multiplicador = 11;
        }else if(valor > 1.4 && valor < 1.9){
        multiplicador = 9.5;
        }else{
        multiplicador = 7.75;
        }

        resultado=(dist/multiplicador)*gas;
        DecimalFormat d = new DecimalFormat("0.00");
        d.format(resultado);


        Intent i = new Intent(this,Exercicio4_2.class);
        i.putExtra("resultado",resultado);
        startActivity(i);
    }
}
