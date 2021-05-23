package com.example.clinicon.responses;

import com.google.gson.annotations.SerializedName;

public class Area {
    @SerializedName("id_area")
    private int id;
    @SerializedName("a_especializacion")
    private String especializaion;

    public Area() {} //Constructor vacío

    public Area(int id, String especializaion) { //Constructor con parametros
        this.id = id;
        this.especializaion = especializaion;
    }

    //Comienzan getter's and setter's


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecializaion() {
        return especializaion;
    }

    public void setEspecializaion(String especializaion) {
        this.especializaion = especializaion;
    }
}
