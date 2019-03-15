package com.example.a26146045.aula13_03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup sexo;
    private EditText altura;
    private TextView tela;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sexo=findViewById(R.id.sexor);
        altura=findViewById(R.id.alturar);
        tela=findViewById(R.id.tela);


    }

    public void calcularPesoIdeal(View sc){
        int opcao=sexo.getCheckedRadioButtonId( );

        if (opcao==R.id.RBF){
            double alt = Double.parseDouble(altura.getText().toString());
            resultado= (alt*62.1)-44.7;

        }else{
            double alt = Double.parseDouble(altura.getText().toString());
            resultado= (alt*72.7)-58;

        }
        tela.setText("Seu peso ideal "+resultado);

    }
}
