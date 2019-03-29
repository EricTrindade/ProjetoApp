package com.example.a26146045.aula13_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Exercicio5 extends AppCompatActivity {
    private Spinner planetas;
    private EditText peso;
    private TextView tela;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio5);

        planetas= findViewById(R.id.planteas);
        peso=findViewById(R.id.peso);
        tela=findViewById(R.id.tela);
    }
    public void calcularPlaneta (View et){
        String opcao = planetas.getSelectedItem().toString();
        double ps= Double.parseDouble(peso.getText().toString());

        if(opcao.equals("Mercúrio")){
            resultado=(ps/10)*0.37;
        }if(opcao.equals("Vênus")) {
            resultado=(ps/10)*0.88;
        }if(opcao.equals("Marte")){
            resultado=(ps/10)*0.38;
        }if(opcao.equals("Júpiter")){
            resultado=(ps/10)*2.64;
        }if(opcao.equals("Saturno")){
            resultado=(ps/10)*1.15;
        }if(opcao.equals("Urano")){
            resultado=(ps/10)*1.17;
        }

        tela.setText("Seu peso em "+ opcao +" é: "+resultado);
    }
}
