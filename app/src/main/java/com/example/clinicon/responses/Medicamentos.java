package com.example.clinicon.responses;

public class Medicamentos {
    private int idMedicamento;
    private String nombre;

    public Medicamentos(int idMedicamento, String nombre) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
