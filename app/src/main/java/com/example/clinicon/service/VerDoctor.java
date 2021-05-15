package com.example.clinicon.service;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.clinicon.R;
import com.example.clinicon.adapter.adapterDoctor;
import com.example.clinicon.adapter.adapterPaciente;
import com.example.clinicon.responses.Doctor;
import com.example.clinicon.responses.Paciente;

import java.util.ArrayList;
import java.util.List;

public class VerDoctor extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Doctor> doctores = new ArrayList<>();
    adapterDoctor ldoctor;
    Doctor doctor = new Doctor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_doctor);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerViewDoctor);
        init();
    }
    public void init(){
        doctores= new ArrayList<>();
    }

    public void mostrar(){
        recyclerView.setLayoutManager(new LinearLayoutManager(VerDoctor.this));
        ldoctor=new adapterDoctor(doctores, VerDoctor.this);
        recyclerView.setAdapter(ldoctor);
    }

}