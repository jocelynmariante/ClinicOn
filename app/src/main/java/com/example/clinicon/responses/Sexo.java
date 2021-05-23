package com.example.clinicon.responses;

import com.google.gson.annotations.SerializedName;

public class Sexo {
    @SerializedName("id_sexo")
    private int id;
    @SerializedName("s_nombre")
    private String sexo;

    public Sexo() { //Constructor vacío
    }

    public Sexo(int id, String sexo) { //Constructor con parametros
        this.id = id;
        this.sexo = sexo;
    }

    //Comienzan getter and setter's

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
