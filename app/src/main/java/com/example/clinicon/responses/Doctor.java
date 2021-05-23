package com.example.clinicon.responses;

import com.google.gson.annotations.SerializedName;

public class Doctor {
    @SerializedName("run_doc")
    private String rut;
    @SerializedName("d_email")
    private String email;
    @SerializedName("d_nombre")
    private String nombre;
    @SerializedName("d_apellido_p")
    private String apellidoPaterno;
    @SerializedName("d_apellido_m")
    private String apellidoMaterno;
    @SerializedName("d_edad")
    private int edad;
    @SerializedName("d_clave")
    private String clave;
    @SerializedName("d_firma")
    private String firma;
    @SerializedName("foto")
    private String foto;
    @SerializedName("area")
    private Area area;
    @SerializedName("sexo")
    private Sexo sexo;
    @SerializedName("estado")
    private Estado estado;

    public Doctor() { //Constructor vacío
    }

    //Constructor con parametros
    public Doctor(String rut, String email, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String clave, String firma, String foto, Area area, Sexo sexo, Estado estado) {
        this.rut = rut;
        this.email = email;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.clave = clave;
        this.firma = firma;
        this.foto = foto;
        this.area = area;
        this.sexo = sexo;
        this.estado = estado;
    }

    //Comienzan getter's and setter's
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
