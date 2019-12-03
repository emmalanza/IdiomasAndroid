package com.example.idiomas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {

    private RadioButton rb_ingles, rb_coreano, rb_dias, rb_colores;
    private Button bt_aceptar;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        rb_ingles= (RadioButton)findViewById(R.id.rb_ingles);
        rb_coreano= (RadioButton)findViewById(R.id.rb_coreano);
        rb_colores = (RadioButton)findViewById(R.id.rb_colores);
        rb_dias = (RadioButton)findViewById(R.id.rb_dias);
        bt_aceptar = (Button)findViewById(R.id.bt_jugar);
    }

    public void jugar (View view){

        Intent i;

        if(rb_ingles.isChecked() && rb_dias.isChecked()){

            i = new Intent(this, DiasInglesJugar.class);
            startActivity(i);
        }
        else if(rb_ingles.isChecked() && rb_colores.isChecked()){

            i = new Intent(this, ColoresInglesJugar.class);
            startActivity(i);
        }
        else if(rb_coreano.isChecked() && rb_dias.isChecked()){
            i = new Intent(this, DiasCoreanoJugar.class);
            startActivity(i);
        }
        else if(rb_coreano.isChecked() && rb_colores.isChecked()){
            i = new Intent(this, ColoresCoreanoJugar.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Selecciona opciones", Toast.LENGTH_LONG).show();
        }
    }

    public void aprender(View view){

        Intent i;

        if(rb_ingles.isChecked() && rb_dias.isChecked()){

            i = new Intent(this, DiasInglesAprender.class);
            startActivity(i);
        }
        else if(rb_ingles.isChecked() && rb_colores.isChecked()){

            i = new Intent(this, ColoresInglesAprender.class);
            startActivity(i);
        }
        else if(rb_coreano.isChecked() && rb_dias.isChecked()){
            i = new Intent(this, DiasCoreanoAprender.class);
            startActivity(i);
        }
        else if(rb_coreano.isChecked() && rb_colores.isChecked()){
            i = new Intent(this, ColoresCoreanoAprender.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Selecciona opciones", Toast.LENGTH_LONG).show();
        }


    }
}
