package com.edu.isc.tesoem.francisco.gvbaseadaptadoradmin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetallesActivity2 extends AppCompatActivity {
    TextView lblnombre, lbledad, lblsexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles2);

        lblnombre= findViewById(R.id.dlblNombre);
        lbledad = findViewById(R.id.dlblEdad);
        lblsexo  = findViewById(R.id.dlblSexo);

        String nombre = getIntent().getExtras().get("Nombre").toString();
        DatadosParcelable dato = getIntent().getParcelableExtra("DatosParcelable");

        lblnombre.setText(dato.getNombre());
        lbledad.setText(dato.getEdad());
        lblsexo.setText(dato.getSexo());

        getSupportActionBar().setTitle(nombre);
    }
}