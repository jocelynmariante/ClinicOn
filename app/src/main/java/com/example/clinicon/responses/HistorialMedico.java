package com.example.clinicon.responses;

import com.google.gson.annotations.SerializedName;

public class HistorialMedico {
    @SerializedName("id_historialMedico")
    private int id;
    @SerializedName("hm_historial")
    private String HistorialMedico;

    public HistorialMedico() {}

    public HistorialMedico(int id, String historialMedico) {
        this.id = id;
        HistorialMedico = historialMedico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistorialMedico() {
        return HistorialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        HistorialMedico = historialMedico;
    }
}
