package com.example.idiomas;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ColoresIngles extends AppCompatActivity {

    private final String colores [] = {"AMARILLO", "VERDE", "AZUL", "ROSA", "MARRÓN",
            "BLANCO", "NEGRO", "GRIS", "MORADO", "NARANJA"};

    private TextView tv_color, tv_mensaje, tv_resultado;
    private RadioGroup radio_group;
    private RadioButton rb_1, rb_2, rb_3;
    private int i = 0;
    private int errores, aciertos;

   protected void onCreate(Bundle savedInstancedState){

        super.onCreate(savedInstancedState);
        setContentView(R.layout.jugar);

        tv_color = (TextView) findViewById(R.id.tv_texto);
        radio_group = (RadioGroup) findViewById(R.id.rg_respuestas);
        rb_1 = (RadioButton) findViewById(R.id.rb1);
        rb_2 = (RadioButton) findViewById(R.id.rb2);
        rb_3 = (RadioButton) findViewById(R.id.rb3);

        tv_color.setText("ROJO");
        tv_color.setBackgroundColor(getResources().getColor(R.color.rojo));
        tv_color.setTextColor(getResources().getColor(R.color.blanco));
        rb_1.setText(R.string.amarillo_i);
        rb_2.setText(R.string.rojo_i);
        rb_3.setText(R.string.blanco_i);
    }

    public void siguiente(View view){

        comprobar();

        if(i<colores.length){
            String color = colores[i];
            tv_color.setText(color);
            cambiar();
            radio_group.clearCheck();
            i++;
        }else{
            errores = 11 - aciertos;
            setContentView(R.layout.fin_jugar);
            tv_mensaje = (TextView)findViewById(R.id.tv_mensaje);
            tv_resultado = (TextView)findViewById(R.id.tv_resultado);
            tv_resultado.setText("Aciertos: " + aciertos + " Fallos:" + errores);

            if(aciertos>=5){
                tv_mensaje.setText("¡ENHORABUENA!");
            }else{
                tv_mensaje.setText("OOOOOOOOH");
            }
        }
    }

    public void cambiar(){

        String color = (String)tv_color.getText();

        if(color.equals("AMARILLO")){
            tv_color.setBackgroundColor(getResources().getColor(R.color.amarillo));
            tv_color.setTextColor(getResources().getColor(R.color.blanco));
            rb_1.setText(R.string.rojo_i);
            rb_2.setText(R.string.negro_i);
            rb_3.setText(R.string.amarillo_i);
        }else if(color.equals("VERDE")){
            tv_color.setBackgroundColor(getResources().getColor(R.color.verde));
            tv_color.setTextColor(getResources().getColor(R.color.blanco));
            rb_1.setText(R.string.verde_i);
            rb_2.setText(R.string.rojo_i);
            rb_3.setText(R.string.rosa_i);
        }else if(color.equals("AZUL")){
            tv_color.setBackgroundColor(getResources().getColor(R.color.azul));
            tv_color.setTextColor(getResources().getColor(R.color.blanco));
            rb_1.setText(R.string.amarillo_i);
            rb_2.setText(R.string.verde_i);
            rb_3.setText(R.string.azul_i);
        }else if(color.equals("ROSA")){
            tv_color.setBackgroundColor(getResources().getColor(R.color.rosa));
            tv_color.setTextColor(getResources().getColor(R.color.blanco));
            rb_1.setText(R.string.rosa_i);
            rb_2.setText(R.string.verde_i);
            rb_3.setText(R.string.rojo_i);
        }else if(color.equals("MARRÓN")){
            tv_color.setBackgroundColor(getResources().getColor(R.color.marron));
            tv_color.setTextColor(getResources().getColor(R.color.blanco));
            rb_1.setText(R.string.marron_i);
            rb_2.setText(R.string.gris_i);
            rb_3.setText(R.string.morado_i);
        }else if(color.equals("BLANCO")){
            tv_color.setBackgroundColor(getResources().getColor(R.color.blanco));
            tv_color.setTextColor(getResources().getColor(R.color.negro));
            rb_1.setText(R.string.gris_i);
            rb_2.setText(R.string.negro_i);
            rb_3.setText(R.string.blanco_i);
        }else if(color.equals("NEGRO")){
            tv_color.setBackgroundColor(getResources().getColor(R.color.negro));
            tv_color.setTextColor(getResources().getColor(R.color.blanco));
            rb_1.setText(R.string.naranja_i);
            rb_2.setText(R.string.negro_i);
            rb_3.setText(R.string.azul_i);
        }else if(color.equals("GRIS")){
            tv_color.setBackgroundColor(getResources().getColor(R.color.gris));
            tv_color.setTextColor(getResources().getColor(R.color.blanco));
            rb_1.setText(R.string.verde_i);
            rb_2.setText(R.string.gris_i);
            rb_3.setText(R.string.marron_i);
        }else if(color.equals("MORADO")){
            tv_color.setBackgroundColor(getResources().getColor(R.color.morado));
            tv_color.setTextColor(getResources().getColor(R.color.blanco));
            rb_1.setText(R.string.blanco_i);
            rb_2.setText(R.string.rosa_i);
            rb_3.setText(R.string.morado_i);
        }else if(color.equals("NARANJA")){
            tv_color.setBackgroundColor(getResources().getColor(R.color.naranja));
            tv_color.setTextColor(getResources().getColor(R.color.blanco));
            rb_1.setText(R.string.naranja_i);
            rb_2.setText(R.string.rojo_i);
            rb_3.setText(R.string.verde_i);
        }

    }

    public void comprobar(){

        String color = (String)tv_color.getText();

        if(color.equalsIgnoreCase("ROJO") && rb_2.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_LONG).show();
        }else if(color.equalsIgnoreCase("AMARILLO") && rb_3.isChecked()){
            aciertos++;
        }else if(color.equalsIgnoreCase("VERDE") && rb_1.isChecked()){
            aciertos++;
        }else if(color.equalsIgnoreCase("AZUL") && rb_3.isChecked()){
            aciertos++;
        }else if(color.equalsIgnoreCase("ROSA") && rb_1.isChecked()){
            aciertos++;
        }else if(color.equalsIgnoreCase("MARRÓN") && rb_1.isChecked()){
            aciertos++;
        }else if(color.equalsIgnoreCase("BLANCO") && rb_3.isChecked()){
            aciertos++;
        }else if(color.equalsIgnoreCase("NEGRO") && rb_2.isChecked()){
            aciertos++;
        }else if(color.equalsIgnoreCase("GRIS") && rb_2.isChecked()){
            aciertos++;
        }else if(color.equalsIgnoreCase("MORADO") && rb_3.isChecked()){
            aciertos++;
        }else if(color.equalsIgnoreCase("NARANJA") && rb_1.isChecked()){
            aciertos++;
        }

    }

}
