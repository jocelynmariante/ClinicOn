package com.example.clinicon.responses;

import java.util.Date;

public class PeticionesMedicas {
    private int idPeticionesMedicas;
    private String descripcion;
    private Date fecha;

    public PeticionesMedicas(int idPeticionesMedicas, String descripcion, Date fecha) {
        this.idPeticionesMedicas = idPeticionesMedicas;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getIdPeticionesMedicas() {
        return idPeticionesMedicas;
    }

    public void setIdPeticionesMedicas(int idPeticionesMedicas) {
        this.idPeticionesMedicas = idPeticionesMedicas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
