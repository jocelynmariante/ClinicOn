package com.example.clinicon.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.clinicon.R;

public class MenuUsuario extends AppCompatActivity {
    private ImageButton btnAgendar;
    private ImageButton btnDoctor;
    private ImageButton btnReceta;
    private ImageButton btnClinica;
    private ImageButton btnSalir;
    private TextView txtNombrePaciente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_usuario);




        ImageButton btnAgendar = (ImageButton) findViewById(R.id.btnAgendar);
        ImageButton btnDoc = (ImageButton) findViewById(R.id.btnDoctor);
        ImageButton btnReceta = (ImageButton) findViewById(R.id.btnReceta);
        ImageButton btnClinica = (ImageButton) findViewById(R.id.btnClinica);
        ImageButton btnSalir = (ImageButton) findViewById(R.id.btnSalir);
        TextView txtNombrePaciente = (TextView) findViewById(R.id.txtNombrePaciente);

        btnDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUsuario.this, VerDoctor.class));
            }
        });
        btnAgendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUsuario.this, Agendar.class));
            }
        });


    }

}
