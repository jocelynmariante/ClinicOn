package com.example.clinicon.responses;

import com.google.gson.annotations.SerializedName;

public class Estado {
    @SerializedName("id_estado")
    private int id;
    @SerializedName("e_estado")
    private String estado;

    public Estado() {} //Constructor vacío

    public Estado(int id, String estado) { //Constructor con parametros
        this.id = id;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
