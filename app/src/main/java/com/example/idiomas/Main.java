package com.example.idiomas;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true; /** true -> el menú ya está visible */
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_info) {
            Intent i = new Intent(this, Informacion.class);
            startActivity(i);
            return true;
        }
        /*if (id == R.id.bt_crear) {

            return true;
        }*/
        return super.onOptionsItemSelected(item);
    }

}
