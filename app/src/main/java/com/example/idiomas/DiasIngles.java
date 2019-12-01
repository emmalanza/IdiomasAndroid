package com.example.idiomas;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DiasIngles extends AppCompatActivity {
    private final String dias[] = {"MARTES", "MIÉRCOLES", "JUEVES", "VIERNES",
            "SÁBADO", "DOMINGO"};

    private TextView tv_dias, tv_mensaje, tv_resultado;
    private RadioGroup radio_group;
    private RadioButton rb_1, rb_2, rb_3;
    private int i = 0;
    private int errores, aciertos;

    protected void onCreate(Bundle savedInstancedState){

        super.onCreate(savedInstancedState);
        setContentView(R.layout.jugar);

        tv_dias = (TextView)findViewById(R.id.tv_texto);
        radio_group = (RadioGroup) findViewById(R.id.rg_respuestas);
        rb_1 = (RadioButton) findViewById(R.id.rb1);
        rb_2 = (RadioButton) findViewById(R.id.rb2);
        rb_3 = (RadioButton) findViewById(R.id.rb3);

        tv_dias.setText("LUNES");
        rb_1.setText(R.string.lunes_i);
        rb_2.setText(R.string.jueves_i);
        rb_3.setText(R.string.domingo_i);

    }

    public void siguiente(View view) {

        comprobar();

        if (i < dias.length) {
            String dia = dias[i];
            tv_dias.setText(dia);
            cambiar();
            radio_group.clearCheck();
            i++;
        } else {
            errores = 7 - aciertos;
            setContentView(R.layout.fin_jugar);
            tv_mensaje = (TextView) findViewById(R.id.tv_mensaje);
            tv_resultado = (TextView) findViewById(R.id.tv_resultado);
            tv_resultado.setText("Aciertos: " + aciertos + " Fallos:" + errores);

            if (aciertos >= 5) {
                tv_mensaje.setText("¡ENHORABUENA!");
            } else {
                tv_mensaje.setText("OOOOOOOOH");
            }
        }
    }

    public void cambiar() {

        String dia = (String) tv_dias.getText();

        if (dia.equals("MARTES")) {
            rb_1.setText(R.string.miercoles_i);
            rb_2.setText(R.string.lunes_i);
            rb_3.setText(R.string.martes_i);
        } else if (dia.equals("MIÉRCOLES")) {
            rb_1.setText(R.string.miercoles_i);
            rb_2.setText(R.string.sabado_i);
            rb_3.setText(R.string.domingo_i);
        } else if (dia.equals("JUEVES")) {
            rb_1.setText(R.string.viernes_i);
            rb_2.setText(R.string.sabado_i);
            rb_3.setText(R.string.jueves_i);
        } else if (dia.equals("VIERNES")) {
            rb_1.setText(R.string.martes_i);
            rb_2.setText(R.string.viernes_i);
            rb_3.setText(R.string.lunes_i);
        } else if (dia.equals("SÁBADO")) {
            rb_1.setText(R.string.miercoles_i);
            rb_2.setText(R.string.sabado_i);
            rb_3.setText(R.string.lunes_i);
        } else if (dia.equals("DOMINGO")) {
            rb_1.setText(R.string.domingo_i);
            rb_2.setText(R.string.jueves_i);
            rb_3.setText(R.string.viernes_i);
        }

    }

    public void comprobar() {

        String dias = (String) tv_dias.getText();

        if (dias.equalsIgnoreCase("LUNES") && rb_1.isChecked()) {
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_LONG).show();
        } else if (dias.equalsIgnoreCase("MARTES") && rb_3.isChecked()) {
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_LONG).show();
        } else if (dias.equalsIgnoreCase("MIÉRCOLES") && rb_1.isChecked()) {
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_LONG).show();
        } else if (dias.equalsIgnoreCase("JUEVES") && rb_3.isChecked()) {
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_LONG).show();
        } else if (dias.equalsIgnoreCase("VIERNES") && rb_2.isChecked()) {
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_LONG).show();
        } else if (dias.equalsIgnoreCase("SÁBADO") && rb_2.isChecked()) {
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_LONG).show();
        } else if (dias.equalsIgnoreCase("DOMINGO") && rb_1.isChecked()) {
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_LONG).show();
        }

    }
}
