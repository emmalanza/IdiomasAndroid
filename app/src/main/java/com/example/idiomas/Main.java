package com.example.idiomas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {

    private ImageButton bt_coreano, bt_ingles;


    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        bt_coreano = (ImageButton) findViewById(R.id.bt_coreano);
        bt_ingles = (ImageButton) findViewById(R.id.bt_ingles);

    }

    public void ingles(View view){

        Intent i = new Intent(this, MenuIngles.class);
        startActivity(i);

    }

    public void coreano(View view){

        Intent i = new Intent(this, MenuCoreano.class);
        startActivity(i);

    }

}
