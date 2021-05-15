package com.example.clinicon.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.clinicon.R;

public class RegistroUsuario extends AppCompatActivity {
   private TextView txtRut;
    private TextView txtMail;
    private TextView txtNombre;
    private TextView txtApellidoP;
    private TextView txtApellidoM;
    private ImageButton btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);
        final TextView txtRut = (TextView)findViewById(R.id.txtRutR);
        final TextView txtMail = (TextView)findViewById(R.id.txtMailR);
        final TextView txtNombre = (TextView)findViewById(R.id.txtNombreR);
        final TextView txtApellidoP = (TextView)findViewById(R.id.txtApePR);
        final TextView txtApellidoM = (TextView)findViewById(R.id.txtApeMR);
        ImageButton btnSiguente = (ImageButton) findViewById(R.id.btnSgte);

        btnSiguente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String rut = txtRut.getText().toString();
                String mail = txtMail.getText().toString();
                String nombre = txtNombre.getText().toString();
                String apellidoP = txtApellidoP.getText().toString();
                String apellidoM = txtApellidoM.getText().toString();



        Intent intent = new Intent(RegistroUsuario.this, RegistroUsuario2.class );
        Bundle bundle= new Bundle();
      /*  bundle.putString("P1",rut.toString());
        bundle.putString("P2",mail.toString());
        bundle.putString("P3",nombre.toString());
        bundle.putString("P4",apellidoP.toString());
        bundle.putString("P5",apellidoM.toString());*/

        intent.putExtras(bundle);
        startActivity(intent);


            }
        });

    }
}