package com.example.clinicon.responses;

public class AvisoMedicamento {
    private int idAvisoMedicamento;
    private int dias;
    private String mensaje;

    public AvisoMedicamento(int idAvisoMedicamento, int dias, String mensaje) {
        this.idAvisoMedicamento = idAvisoMedicamento;
        this.dias = dias;
        this.mensaje = mensaje;
    }

    public int getIdAvisoMedicamento() {
        return idAvisoMedicamento;
    }

    public void setIdAvisoMedicamento(int idAvisoMedicamento) {
        this.idAvisoMedicamento = idAvisoMedicamento;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
