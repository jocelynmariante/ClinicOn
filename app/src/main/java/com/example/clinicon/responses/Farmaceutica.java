package com.example.clinicon.responses;

public class Farmaceutica {
    private int idFarmaceutica;
    private String nombre;

    public Farmaceutica(int idFarmaceutica, String nombre) {
        this.idFarmaceutica = idFarmaceutica;
        this.nombre = nombre;
    }

    public int getIdFarmaceutica() {
        return idFarmaceutica;
    }

    public void setIdFarmaceutica(int idFarmaceutica) {
        this.idFarmaceutica = idFarmaceutica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
