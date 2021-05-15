package com.example.clinicon.service;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListAdapter;

import com.example.clinicon.R;
import com.example.clinicon.adapter.adapterPaciente;
import com.example.clinicon.responses.Paciente;

import java.util.ArrayList;
import java.util.List;

public class VerPacientes extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Paciente> pacientes =new ArrayList<>();
    adapterPaciente lpaciente;
    Paciente paciente = new Paciente();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_pacientes);
        recyclerView= (RecyclerView)findViewById(R.id.recyclerPacientes);
        llenar();
        mostrar();
        init();


    }
    public void init(){
        pacientes= new ArrayList<>();


    }

    public void llenar(){
        paciente.setRut("11.111.111-1");
        paciente.setEmail("a@gmail.com");
        paciente.setNombre("carlos");
        paciente.setApellidoPaterno("aros");
        paciente.setApellidoMaterno("flores");
        paciente.setEdad(34);
        paciente.setClave("1234");
        paciente.setGenero("masculino");
        paciente.setPrevision("fonasa");

        pacientes.add(paciente);


    }
    public void mostrar(){
        recyclerView.setLayoutManager(new LinearLayoutManager(VerPacientes.this));
        lpaciente=new adapterPaciente(pacientes, VerPacientes.this);
        recyclerView.setAdapter(lpaciente);
    }

}