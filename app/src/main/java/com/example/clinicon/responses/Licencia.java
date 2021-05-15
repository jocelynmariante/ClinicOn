package com.example.clinicon.responses;

public class Licencia {
    private int idLicencia;
    private String descripcion;

    public Licencia(int idLicencia, String descripcion) {
        this.idLicencia = idLicencia;
        this.descripcion = descripcion;
    }

    public int getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
