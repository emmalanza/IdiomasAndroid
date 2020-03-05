package com.example.idiomas;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class NumerosInglesJugar extends AppCompatActivity {


    private final String numeros [] = {"2", "3", "4", "5",
            "6", "7", "8", "9", "10"};

    private TextView tv_mensaje, tv_resultado;
    private ImageView imagen;
    private GifImageView img_final;
    private String numero;
    private RadioGroup radio_group;
    private RadioButton rb_1, rb_2, rb_3;
    private int i = 0;
    private int errores, aciertos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.jugar_numeros);

        imagen = (ImageView) findViewById(R.id.img_num);
        radio_group = (RadioGroup) findViewById(R.id.rg_respuestas);
        rb_1 = (RadioButton) findViewById(R.id.rb1);
        rb_2 = (RadioButton) findViewById(R.id.rb2);
        rb_3 = (RadioButton) findViewById(R.id.rb3);

        numero = "1";
        imagen.setImageResource(R.drawable.uno);
        rb_1.setText(R.string.siete_i);
        rb_2.setText(R.string.cinco_i);
        rb_3.setText(R.string.uno_i);
    }

    public void siguiente(View view){

        comprobar();

        if(i<numeros.length){
            String num = numeros[i];
            numero = num;
            cambiar();
            radio_group.clearCheck();
            i++;
        }else{
            errores = 10 - aciertos;
            setContentView(R.layout.fin_jugar);
            tv_mensaje = (TextView)findViewById(R.id.tv_mensaje);
            tv_resultado = (TextView)findViewById(R.id.tv_resultado);
            img_final = (GifImageView)findViewById(R.id.img_final);
            tv_resultado.setText("Aciertos: " + aciertos + " \nFallos:" + errores);

            if(aciertos>=5){
                img_final.setImageResource(R.drawable.congrats);
                tv_mensaje.setText("¡GOOD JOB!");
            }else{
                img_final.setImageResource(R.drawable.fail);
                tv_mensaje.setText("OOOOOOOOH");
            }
        }
    }

    public void cambiar(){

        if(numero.equals("2")){
            imagen.setImageResource(R.drawable.dos);
            rb_1.setText(R.string.dos_i);
            rb_2.setText(R.string.cuatro_i);
            rb_3.setText(R.string.diez_i);
        }else if(numero.equals("3")){
            imagen.setImageResource(R.drawable.tres);
            rb_1.setText(R.string.siete_i);
            rb_2.setText(R.string.tres_i);
            rb_3.setText(R.string.nueve_i);
        }else if(numero.equals("4")){
            imagen.setImageResource(R.drawable.cuatro);
            rb_1.setText(R.string.uno_i);
            rb_2.setText(R.string.cuatro_i);
            rb_3.setText(R.string.tres_i);
        }else if(numero.equals("5")){
            imagen.setImageResource(R.drawable.cinco);
            rb_1.setText(R.string.ocho_i);
            rb_2.setText(R.string.nueve_i);
            rb_3.setText(R.string.cinco_i);
        }else if(numero.equals("6")){
            imagen.setImageResource(R.drawable.seis);
            rb_1.setText(R.string.cinco_i);
            rb_2.setText(R.string.tres_i);
            rb_3.setText(R.string.seis_i);
        }else if(numero.equals("7")){
            imagen.setImageResource(R.drawable.siete);
            rb_1.setText(R.string.siete_i);
            rb_2.setText(R.string.seis_i);
            rb_3.setText(R.string.uno_i);
        }else if(numero.equals("8")){
            imagen.setImageResource(R.drawable.ocho);
            rb_1.setText(R.string.ocho_i);
            rb_2.setText(R.string.cinco_i);
            rb_3.setText(R.string.cuatro_i);
        }else if(numero.equals("9")){
            imagen.setImageResource(R.drawable.nueve);
            rb_1.setText(R.string.seis_i);
            rb_2.setText(R.string.uno_i);
            rb_3.setText(R.string.nueve_i);
        }else if(numero.equals("10")){
            imagen.setImageResource(R.drawable.diez);
            rb_1.setText(R.string.ocho_i);
            rb_2.setText(R.string.diez_i);
            rb_3.setText(R.string.dos_i);
        }
    }

    public void comprobar(){

        if(numero.equalsIgnoreCase("1") && rb_3.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(numero.equalsIgnoreCase("2") && rb_1.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(numero.equalsIgnoreCase("3") && rb_2.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(numero.equalsIgnoreCase("4") && rb_2.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(numero.equalsIgnoreCase("5") && rb_3.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(numero.equalsIgnoreCase("6") && rb_3.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(numero.equalsIgnoreCase("7") && rb_1.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(numero.equalsIgnoreCase("8") && rb_1.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(numero.equalsIgnoreCase("9") && rb_3.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(numero.equalsIgnoreCase("10") && rb_2.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }
    }
}
