package com.example.clinicon.responses;

public class Recetas {
    private int idReceta;
    private String descReceta;

    public Recetas(int idReceta, String descReceta) {
        this.idReceta = idReceta;
        this.descReceta = descReceta;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getDescReceta() {
        return descReceta;
    }

    public void setDescReceta(String descReceta) {
        this.descReceta = descReceta;
    }
}
