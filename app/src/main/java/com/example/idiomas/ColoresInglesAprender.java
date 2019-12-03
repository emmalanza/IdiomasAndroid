package com.example.idiomas;

import android.os.Bundle;
import android.text.style.BulletSpan;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ColoresInglesAprender extends AppCompatActivity {

    private TextView tv_azul, tv_rojo, tv_verde, tv_amarillo, tv_rosa, tv_morado, tv_naranja, tv_marron, tv_gris, tv_negro, tv_blanco;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingles_colores);

        tv_azul = (TextView)findViewById(R.id.tv_azul_i);
        tv_rojo = (TextView)findViewById(R.id.tv_rojo_i);
        tv_verde = (TextView)findViewById(R.id.tv_verde_i);
        tv_amarillo = (TextView)findViewById(R.id.tv_amarillo_i);
        tv_rosa = (TextView)findViewById(R.id.tv_rosa_i);
        tv_morado = (TextView)findViewById(R.id.tv_morado_i);
        tv_naranja = (TextView)findViewById(R.id.tv_naranja_i);
        tv_marron = (TextView)findViewById(R.id.tv_marron_i);
        tv_gris = (TextView)findViewById(R.id.tv_gris_i);
        tv_negro = (TextView)findViewById(R.id.tv_negro_i);
        tv_blanco = (TextView)findViewById(R.id.tv_blanco_i);
    }

    public void cambiaAzuli(View view){ tv_azul.setText(R.string.azul_i); }
    public void cambiaRojoi(View view){
        tv_rojo.setText(R.string.rojo_i);
    }
    public void cambiaVerdei(View view){
        tv_verde.setText(R.string.verde_i);
    }
    public void cambiaAmarilloi(View view){
        tv_amarillo.setText(R.string.amarillo_i);
    }
    public void cambiaRosai(View view){
        tv_rosa.setText(R.string.rosa_i);
    }
    public void cambiaMoradoi(View view){
        tv_morado.setText(R.string.morado_i);
    }
    public void cambiaNaranjai (View view){
        tv_naranja.setText(R.string.naranja_i);
    }
    public void cambiaMarroni(View view){
        tv_marron.setText(R.string.marron_i);
    }
    public void cambiaGrisi(View view){
        tv_gris.setText(R.string.gris_i);
    }
    public void cambiaNegroi(View view){
        tv_negro.setText(R.string.negro_i);
    }
    public void cambiaBlancoi(View view){
        tv_blanco.setText(R.string.blanco_i);
    }

}
