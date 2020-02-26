package com.example.idiomas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class Informacion extends AppCompatActivity {


    private TextView textView;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        textView = (TextView)findViewById(R.id.tv_informacion);
        textView.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
    }
}
