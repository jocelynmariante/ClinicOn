package com.example.clinicon.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.clinicon.R;
import com.example.clinicon.responses.Area;
import com.example.clinicon.responses.Paciente;
import com.example.clinicon.webservice.Connect;
import com.example.clinicon.webservice.WebServiceAreas;
import com.example.clinicon.webservice.WebServiceFarmaceutica;
import com.example.clinicon.webservice.WebServicePaciente;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private Button btnRegistro;
    private Button btnLogin;
    private EditText user, pass;
    private Retrofit connection;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connection = Connect.getConnect(); /* Se llama a la clase Connect y
                                            se tra el metodo estatico con el objeto retrofit lleno*/
        inicializo_variables();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ejecuto_login();
            }
        });
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistroUsuario.class);
                Bundle bundle = new Bundle();
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void inicializo_variables() {
        btnRegistro = (Button) findViewById(R.id.btnAceptarRegistro);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
    }

    private void ejecuto_login() {
        if (!user.getText().toString().isEmpty() || !pass.getText().toString().isEmpty()) {
            WebServicePaciente webServicePaciente = connection.create(WebServicePaciente.class);
            Call<List<Paciente>> call = webServicePaciente.getPacientes();
            call.enqueue(new Callback<List<Paciente>>() {
                @Override
                public void onResponse(Call<List<Paciente>> call, Response<List<Paciente>> response) {
                    for (Paciente p : response.body()) {
                        if (user.getText().toString().equals(p.getRut()) & pass.getText().toString().equals(p.getClave())) {
                            Intent intent = new Intent(MainActivity.this, MenuUsuario.class);
                            Bundle bundle = new Bundle();
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    }
                }

                @Override
                public void onFailure(Call<List<Paciente>> call, Throwable t) {
                    Toast.makeText(MainActivity.this, "A ocurrido un error en la conexión", Toast.LENGTH_SHORT).show();
                }
            });
        } else {
            Toast.makeText(MainActivity.this, "Si las weas estan vacias dificilmente te vas a loguear po tonto ctmre", Toast.LENGTH_SHORT).show();
        }
    }

}