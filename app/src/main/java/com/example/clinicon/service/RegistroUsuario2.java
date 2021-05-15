package com.example.clinicon.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.clinicon.R;

public class RegistroUsuario2 extends AppCompatActivity {
    private TextView txtEdad;
    private TextView txtMail;
    private Spinner cbxGenero;
    private Spinner cbxPrevision;
    private Button btnVolver;
    private Button btnAceptarRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario2);
        TextView txtedad = (TextView)findViewById(R.id.txtEdadR);
        final TextView txtClave = (TextView)findViewById(R.id.txtClave);
        Spinner cbxGenero= (Spinner)findViewById(R.id.cbxGenero);
        Spinner cbxPrevision=(Spinner)findViewById(R.id.cbxPrevision);
        Button btnVolver=(Button)findViewById(R.id.btnVolver);
        Button btnRegistrar = (Button)findViewById(R.id.btnAceptarRegistro);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistroUsuario2.this, MainActivity.class );
                Bundle bundle= new Bundle();
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*Intent intent= getIntent(); //Recibimos el Intent de la activity
                Bundle bundle= intent.getExtras(); //Recibimos el Bundle que viajo con la activity
                String rut = bundle.getString("P1");
                String mail = bundle.getString("P2");
                String nombre = bundle.getString("P3");
                String apellidoP = bundle.getString("P4");
                String apellidoM = bundle.getString("P5");

                int edad = Integer.parseInt(txtEdad.getText().toString());
                String clave = txtClave.getText().toString();

                    if (rut.isEmpty() || mail.isEmpty() || nombre.isEmpty() || apellidoP.isEmpty() ||apellidoM.isEmpty()){
                        Toast.makeText(RegistroUsuario2.this,"Completa todo los campos" , Toast.LENGTH_LONG).show();
                    }else{

                    }*/



            }
        });

    }
}