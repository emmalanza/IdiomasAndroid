package com.example.idiomas;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ColoresCoreanoAprender extends AppCompatActivity {

    private TextView tv_azul, tv_rojo, tv_verde, tv_amarillo, tv_rosa, tv_morado, tv_naranja, tv_marron, tv_gris, tv_negro, tv_blanco;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coreano_colores);

        tv_azul = (TextView)findViewById(R.id.tv_azul_c);
        tv_rojo = (TextView)findViewById(R.id.tv_rojo_c);
        tv_verde = (TextView)findViewById(R.id.tv_verde_c);
        tv_amarillo = (TextView)findViewById(R.id.tv_amarillo_c);
        tv_rosa = (TextView)findViewById(R.id.tv_rosa_c);
        tv_morado = (TextView)findViewById(R.id.tv_morado_c);
        tv_naranja = (TextView)findViewById(R.id.tv_naranja_c);
        tv_marron = (TextView)findViewById(R.id.tv_marron_c);
        tv_gris = (TextView)findViewById(R.id.tv_gris_c);
        tv_negro = (TextView)findViewById(R.id.tv_negro_c);
        tv_blanco = (TextView)findViewById(R.id.tv_blanco_c);

    }

    public void cambiaAzulc(View view){ tv_azul.setText(R.string.azul_c); }
    public void cambiaRojoc(View view){
        tv_rojo.setText(R.string.rojo_c);
    }
    public void cambiaVerdec(View view){
        tv_verde.setText(R.string.verde_c);
    }
    public void cambiaAmarilloc(View view){
        tv_amarillo.setText(R.string.amarillo_c);
    }
    public void cambiaRosac(View view){
        tv_rosa.setText(R.string.rosa_c);
    }
    public void cambiaMoradoc(View view){
        tv_morado.setText(R.string.morado_c);
    }
    public void cambiaNaranjac (View view){
        tv_naranja.setText(R.string.naranja_c);
    }
    public void cambiaMarronc(View view){
        tv_marron.setText(R.string.marron_c);
    }
    public void cambiaGrisc(View view){
        tv_gris.setText(R.string.gris_c);
    }
    public void cambiaNegroc(View view){
        tv_negro.setText(R.string.negro_c);
    }
    public void cambiaBlancoc(View view){
        tv_blanco.setText(R.string.blanco_c);
    }


}
