package com.example.a26146045.aula13_03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Exercicio4_2 extends AppCompatActivity {
    private TextView tela;
    String tudo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio4_2);
        tela = findViewById(R.id.tela);

        Bundle dados = getIntent().getExtras();


        tela.setText(dados.getString("modelo")+" "+dados.getString("potencia")+" gasta R$"+dados.getString("resultado")+" para percorer "+
                dados.getString("distancia")+"km com gasolina a "+dados.getString("valorGasolina")+" por litro.");
        tudo=(dados.getString("modelo")+" "+dados.getString("potencia")+" gasta R$"+dados.getString("resultado")+" para percorer "+
                dados.getString("distancia")+"km com gasolina a "+dados.getString("valorGasolina")+" por litro.");

    }

    public void compartilhar(View tf){
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT,tudo);
        startActivity(Intent.createChooser(i,"compartilhar"));
    }

}
