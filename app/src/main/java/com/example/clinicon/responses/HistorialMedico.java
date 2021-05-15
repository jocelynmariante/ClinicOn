package com.example.clinicon.responses;

public class HistorialMedico {
    private int idHistorialMedico;
    private String HistorialMedico;

    public HistorialMedico(int idHistorialMedico, String historialMedico) {
        this.idHistorialMedico = idHistorialMedico;
        HistorialMedico = historialMedico;
    }

    public int getIdHistorialMedico() {
        return idHistorialMedico;
    }

    public void setIdHistorialMedico(int idHistorialMedico) {
        this.idHistorialMedico = idHistorialMedico;
    }

    public String getHistorialMedico() {
        return HistorialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        HistorialMedico = historialMedico;
    }
}
