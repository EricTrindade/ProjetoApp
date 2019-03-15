package com.example.a26146045.aula13_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class Exercicio2 extends AppCompatActivity {

    private Spinner operadoras;
    private TextView minutos;
    private TextView tela;
    double resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);

        operadoras = findViewById(R.id.op);
        minutos = findViewById(R.id.min);
        tela = findViewById(R.id.tela);


    }
    public void calcularValor(View sc){
        String opcao = operadoras.getSelectedItem().toString();
        Double min1=Double.parseDouble(minutos.getText().toString());
        Double min2=(min1*60)-5;


        if(opcao.equals("OP1")){
            resultado=min2*0.02;

        }else if(opcao.equals("OP2")){
            resultado=min2*0.025;

        }else{
            resultado=min2*0.019;

        }

        if (resultado<0.0) {
            resultado = 0.0;
        }
        tela.setText("Preço: "+resultado);
    }
}
