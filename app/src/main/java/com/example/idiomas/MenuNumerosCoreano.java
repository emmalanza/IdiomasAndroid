package com.example.idiomas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MenuNumerosCoreano extends AppCompatActivity {

    private Button bt_jugar, bt_aprender;
    private RadioGroup radioGroup;
    private RadioButton rb_sino, rb_nativo;
    private int sistema; //1 sino 2 nativo
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coreano_sistema_numerico);

        bt_aprender = (Button) findViewById(R.id.bt_aprender);
        bt_jugar = (Button) findViewById(R.id.bt_jugar);
        radioGroup = (RadioGroup) findViewById(R.id.rg_opciones);
        rb_sino = (RadioButton) findViewById(R.id.rb_sino);
        rb_nativo = (RadioButton) findViewById(R.id.rb_nativo);

    }

    public void aprender(View v){

        if(rb_sino.isChecked()){
            i = new Intent(this, NumerosCoreanoAprender.class);
            sistema = 1;
            i.putExtra("sistema", sistema);
        }else if(rb_nativo.isChecked()){
            i = new Intent(this, NumerosCoreanoAprender.class);
            sistema = 2;
            i.putExtra("sistema", sistema);
        }

    }
}
