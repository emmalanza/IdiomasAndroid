package com.example.idiomas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NumerosCoreanoAprender extends AppCompatActivity {

    private int sistema; //1 sino 2 nativo
    private TextView uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez, numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coreano_numeros_aprender);

        Bundle extras = getIntent().getExtras();
        sistema = extras.getInt("sistema");

        uno = (TextView) findViewById(R.id.tv1_c);
        dos = (TextView) findViewById(R.id.tv2_c);
        tres = (TextView) findViewById(R.id.tv3_c);
        cuatro = (TextView) findViewById(R.id.tv4_c);
        cinco = (TextView) findViewById(R.id.tv5_c);
        seis = (TextView) findViewById(R.id.tv6_c);
        siete = (TextView) findViewById(R.id.tv7_c);
        ocho = (TextView) findViewById(R.id.tv8_c);
        nueve = (TextView) findViewById(R.id.tv9_c);
        diez = (TextView) findViewById(R.id.tv10_c);
        numeros = (TextView) findViewById(R.id.tv_numeros);



        if (sistema==2){
            numeros.setText(R.string.nativoCoreanos);
            uno.setText(R.string.uno_n);
            dos.setText(R.string.dos_n);
            tres.setText(R.string.tres_n);
            cuatro.setText(R.string.cuatro_n);
            cinco.setText(R.string.cinco_n);
            seis.setText(R.string.seis_n);
            siete.setText(R.string.siete_n);
            ocho.setText(R.string.ocho_n);
            nueve.setText(R.string.nueve_n);
            diez.setText(R.string.diez_n);
        }

    }

    public void saber_mas (View v){

        Intent i = new Intent(this, SaberMas.class);
        i.putExtra("sistema", sistema);
        startActivity(i);
    }
}
