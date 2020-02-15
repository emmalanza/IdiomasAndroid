package com.example.idiomas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MenuIngles extends AppCompatActivity {

    private RadioButton rb_colores, rb_dias, rb_numeros;
    private RadioGroup radioGroup;
    private Button bt_jugar, bt_aprender;
    private Intent i;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_ingles);

        rb_colores = (RadioButton) findViewById(R.id.rb_colores);
        rb_numeros = (RadioButton) findViewById(R.id.rb_num);
        rb_dias = (RadioButton) findViewById(R.id.rb_dias);
        radioGroup = (RadioGroup) findViewById(R.id.rg1);
        bt_aprender = (Button) findViewById(R.id.bt_aprender);
        bt_jugar = (Button) findViewById(R.id.bt_jugar);

    }

    public void aprender(View view){

        if(rb_dias.isChecked()){
            i = new Intent(this, DiasInglesAprender.class);
            startActivity(i);
        }else if(rb_colores.isChecked()){
            i = new Intent(this, ColoresInglesAprender.class);
            startActivity(i);
        }else if(rb_numeros.isChecked()){
            i = new Intent(this, NumerosInglesAprender.class);
            startActivity(i);
        }

        radioGroup.clearCheck();

    }

    public void jugar(View view){

        if(rb_dias.isChecked()){
            i = new Intent(this, DiasInglesJugar.class);
            startActivity(i);
        }else if(rb_colores.isChecked()){
            i = new Intent(this, ColoresInglesJugar.class);
            startActivity(i);
        } else if(rb_numeros.isChecked()){
            i = new Intent(this, NumerosInglesJugar.class);
            startActivity(i);
        }

        radioGroup.clearCheck();

    }
}
