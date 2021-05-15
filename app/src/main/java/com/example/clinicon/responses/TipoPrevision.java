package com.example.clinicon.responses;

public class TipoPrevision {
    private int idTipoPrevision;
    private String descPrevision;

    public TipoPrevision(int idTipoPrevision, String descPrevision) {
        this.idTipoPrevision = idTipoPrevision;
        this.descPrevision = descPrevision;
    }

    public int getIdTipoPrevision() {
        return idTipoPrevision;
    }

    public void setIdTipoPrevision(int idTipoPrevision) {
        this.idTipoPrevision = idTipoPrevision;
    }

    public String getDescPrevision() {
        return descPrevision;
    }

    public void setDescPrevision(String descPrevision) {
        this.descPrevision = descPrevision;
    }
}
