package com.example.clinicon.service;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.clinicon.R;

import java.util.Calendar;

public class MiHorario extends AppCompatActivity {
    private TextView tvTitulo;
    private EditText txtHorario;
    DatePickerDialog.OnDateSetListener setListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_horario);

        tvTitulo =(TextView) findViewById(R.id.tvTitulo);
        txtHorario =(EditText)findViewById(R.id.txtHorario);

        Calendar calendario = Calendar.getInstance();
        final int anyo=calendario.get(Calendar.YEAR);
        final int mes = calendario.get(Calendar.MONTH);
        final int dia= calendario.get(Calendar.DAY_OF_MONTH);

        tvTitulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(MiHorario.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth, setListener,anyo, mes,dia);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        setListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int anyo, int mes, int dayMes) {
                mes= mes+1;
                String date = dia+"/" + mes+ "/" +anyo;
            }
        };

        txtHorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(MiHorario.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int anyo, int mes, int dia) {
                        mes = mes +1;
                        String date = dia+ "/" +mes+ "/" + anyo;
                        txtHorario.setText(date);
                    }
                }, anyo,mes,dia);
                datePickerDialog.updateDate(anyo,mes,dia);
                //Se limita que se puedan agendar dias previos al actual
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis()-1000);
                //datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
                datePickerDialog.show();
            }
        });

    }
}