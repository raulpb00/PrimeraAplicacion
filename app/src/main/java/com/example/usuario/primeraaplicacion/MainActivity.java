package com.example.usuario.primeraaplicacion;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends Activity implements View.OnClickListener{

    Button boton;
    TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.button);
        texto = (TextView) findViewById(R.id.textView);
        boton.setOnClickListener(this);
        actualizar();

    }

    @Override
    public void onClick(View v) {
        if (v == boton)
            actualizar();
    }

    public void actualizar() {
        texto.setText(new Date().toString());
    }
}
