package com.example.clinicon.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.clinicon.R;


public class MenuDoctor extends AppCompatActivity {
    private ImageButton btnPacientes;
    private ImageButton btnHorario;
    private ImageButton btnReceta;
    private ImageButton btnRecordatorio;
    private ImageButton btnClinica;
    private ImageButton btnSalirDoc;
    private TextView txtNombreDoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_doctor);
        ImageButton btnPacientes = (ImageButton) findViewById(R.id.btnPacientes);
        ImageButton btnHorario = (ImageButton) findViewById(R.id.btnHorario);
        ImageButton btnReceta = (ImageButton) findViewById(R.id.btnReceta);
        ImageButton btnRecordatorio = (ImageButton) findViewById(R.id.btnRecordatorio);
        ImageButton btnClinica = (ImageButton) findViewById(R.id.btnClinica);
        ImageButton btnSalirDoc = (ImageButton) findViewById(R.id.btnSalirDoc);
        TextView nombreDoc= (TextView)findViewById(R.id.txtNombreDoc);

        btnPacientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuDoctor.this, VerPacientes.class));
            }
        });

        btnHorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuDoctor.this, MiHorario.class));

            }
        });
    }
}