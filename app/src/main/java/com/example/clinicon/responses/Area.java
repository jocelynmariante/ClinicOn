package com.example.clinicon.responses;

public class Area {
    private int idArea;
    private String especializaion;

    public Area(int idArea, String especializaion) {
        this.idArea = idArea;
        this.especializaion = especializaion;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getEspecializaion() {
        return especializaion;
    }

    public void setEspecializaion(String especializaion) {
        this.especializaion = especializaion;
    }
}
