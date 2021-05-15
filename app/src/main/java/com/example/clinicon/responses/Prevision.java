package com.example.clinicon.responses;

public class Prevision {
    private int idPrevision;
    private String descPrevision;

    public Prevision(int idPrevision, String descPrevision) {
        this.idPrevision = idPrevision;
        this.descPrevision = descPrevision;
    }

    public int getIdPrevision() {
        return idPrevision;
    }

    public void setIdPrevision(int idPrevision) {
        this.idPrevision = idPrevision;
    }

    public String getDescPrevision() {
        return descPrevision;
    }

    public void setDescPrevision(String descPrevision) {
        this.descPrevision = descPrevision;
    }
}
