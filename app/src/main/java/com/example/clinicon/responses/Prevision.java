package com.example.clinicon.responses;

import com.google.gson.annotations.SerializedName;

public class Prevision {
    @SerializedName("id_prevision")
    private int id;
    @SerializedName("p_nombre")
    private String descPrevision;

    public Prevision() {}

    public Prevision(int id, String descPrevision) {
        this.id = id;
        this.descPrevision = descPrevision;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescPrevision() {
        return descPrevision;
    }

    public void setDescPrevision(String descPrevision) {
        this.descPrevision = descPrevision;
    }


}
