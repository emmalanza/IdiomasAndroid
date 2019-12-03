package com.example.idiomas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InglesColoresAprender extends AppCompatActivity {

    private TextView textView,textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingles_colores);
/*
        textView= (TextView)findViewById(R.id.tv_azul_i);
        textView1= (TextView)findViewById(R.id.tv_rojo_i);
        textView2= (TextView)findViewById(R.id.tv_verde_i);
        textView3= (TextView)findViewById(R.id.tv_amarillo_i);
        textView4= (TextView)findViewById(R.id.tv_rosa_i);
        textView5= (TextView)findViewById(R.id.tv_morado_i);
        textView6= (TextView)findViewById(R.id.tv_naranja_i);
        textView7= (TextView)findViewById(R.id.tv_marron_i);
        textView8= (TextView)findViewById(R.id.tv_gris_i);
        textView9= (TextView)findViewById(R.id.tv_negro_i);
        textView10= (TextView)findViewById(R.id.tv_blanco_i);*/
    }

    public void cambiaAzul(View view){
        textView.setText("Blue");
    }
    public void cambiaRojo(View view){
        textView1.setText("Red");
    }
    public void cambiaVerde(View view){
        textView2.setText("Green");
    }
    public void cambiaAmarillo(View view){
        textView3.setText("Yellow");
    }
    public void cambiaRosa(View view){
        textView4.setText("Pink");
    }
    public void cambiaMorado(View view){
        textView5.setText("Purlple");
    }
    public void cambiaNaranja (View view){
        textView6.setText("Orange");
    }
    public void cambiaMarron(View view){
        textView7.setText("Brown");
    }
    public void cambiaGris(View view){
        textView8.setText("Grey");
    }
    public void cambiaNegro(View view){
        textView9.setText("Black");
    }
    public void cambiaBlanco(View view){
        textView10.setText("White");
    }

}
