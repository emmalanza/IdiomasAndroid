package com.example.idiomas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SaberMas extends AppCompatActivity {

    private int sistema; //1 sino 2 nativo
    private TextView informacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saber_mas);

        informacion = (TextView) findViewById(R.id.tv_info);

        Bundle extras = getIntent().getExtras();
        sistema = extras.getInt("sistema");

        if(sistema==1){
            informacion.setText(R.string.informacion_sino);
        }else if(sistema==2){
            informacion.setText(R.string.informacion_nativos);
        }

    }

}
