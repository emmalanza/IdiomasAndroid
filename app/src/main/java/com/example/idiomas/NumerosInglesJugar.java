package com.example.idiomas;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NumerosInglesJugar extends AppCompatActivity {


    private final String numeros [] = {"2", "3", "4", "5",
            "6", "7", "8", "9", "10"};

    private TextView tv_num, tv_mensaje, tv_resultado;
    private RadioGroup radio_group;
    private RadioButton rb_1, rb_2, rb_3;
    private int i = 0;
    private int errores, aciertos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.jugar);

        tv_num = (TextView) findViewById(R.id.tv_texto);
        radio_group = (RadioGroup) findViewById(R.id.rg_respuestas);
        rb_1 = (RadioButton) findViewById(R.id.rb1);
        rb_2 = (RadioButton) findViewById(R.id.rb2);
        rb_3 = (RadioButton) findViewById(R.id.rb3);

        tv_num.setText("1");
        rb_1.setText(R.string.siete_i);
        rb_2.setText(R.string.cinco_i);
        rb_3.setText(R.string.uno_i);
    }

    public void siguiente(View view){

        comprobar();

        if(i<numeros.length){
            String num = numeros[i];
            tv_num.setText(num);
            cambiar();
            radio_group.clearCheck();
            i++;
        }else{
            errores = 10 - aciertos;
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

        String color = (String)tv_num.getText();

        if(color.equals("2")){
            rb_1.setText(R.string.dos_i);
            rb_2.setText(R.string.cuatro_i);
            rb_3.setText(R.string.diez_i);
        }else if(color.equals("3")){
            rb_1.setText(R.string.siete_i);
            rb_2.setText(R.string.tres_i);
            rb_3.setText(R.string.nueve_i);
        }else if(color.equals("4")){
            rb_1.setText(R.string.uno_i);
            rb_2.setText(R.string.cuatro_i);
            rb_3.setText(R.string.tres_i);
        }else if(color.equals("5")){
            rb_1.setText(R.string.ocho_i);
            rb_2.setText(R.string.nueve_i);
            rb_3.setText(R.string.cinco_i);
        }else if(color.equals("6")){
            rb_1.setText(R.string.cinco_i);
            rb_2.setText(R.string.tres_i);
            rb_3.setText(R.string.seis_i);
        }else if(color.equals("7")){
            rb_1.setText(R.string.siete_i);
            rb_2.setText(R.string.seis_i);
            rb_3.setText(R.string.uno_i);
        }else if(color.equals("8")){
            rb_1.setText(R.string.ocho_i);
            rb_2.setText(R.string.cinco_i);
            rb_3.setText(R.string.cuatro_i);
        }else if(color.equals("9")){
            rb_1.setText(R.string.seis_i);
            rb_2.setText(R.string.uno_i);
            rb_3.setText(R.string.nueve_i);
        }else if(color.equals("10")){
            rb_1.setText(R.string.ocho_i);
            rb_2.setText(R.string.diez_i);
            rb_3.setText(R.string.dos_i);
        }
    }

    public void comprobar(){

        String color = (String)tv_num.getText();

        if(color.equalsIgnoreCase("1") && rb_3.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(color.equalsIgnoreCase("2") && rb_1.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(color.equalsIgnoreCase("3") && rb_2.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(color.equalsIgnoreCase("4") && rb_2.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(color.equalsIgnoreCase("5") && rb_3.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(color.equalsIgnoreCase("6") && rb_3.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(color.equalsIgnoreCase("7") && rb_1.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(color.equalsIgnoreCase("8") && rb_1.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(color.equalsIgnoreCase("9") && rb_3.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else if(color.equalsIgnoreCase("10") && rb_2.isChecked()){
            aciertos++;
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }
    }
}
