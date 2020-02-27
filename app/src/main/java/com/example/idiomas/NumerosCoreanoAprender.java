package com.example.idiomas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NumerosCoreanoAprender extends AppCompatActivity {

    private int sistema; //1 sino 2 nativo
    private TextView uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coreano_numeros_aprender);

        Bundle extras = getIntent().getExtras();
        sistema = extras.getInt("sistema");

        if (sistema==2){
            //uno = (TextView) findViewById
        }

    }

    public void saber_mas (View v){

        Intent i = new Intent(this, SaberMas.class);
        i.putExtra("sistema", sistema);

    }
}
