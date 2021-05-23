package com.example.clinicon.responses;
//Importacion de Serializable
import com.google.gson.annotations.SerializedName; //Sirve para vincular los datos del json a los atributos de la clase
public class Paciente {
    @SerializedName("run_usuario")
    private String rut;
    @SerializedName("u_email")
    private String email;
    @SerializedName("u_nombre")
    private String nombre;
    @SerializedName("u_apellido_p")
    private String apellidoPaterno;
    @SerializedName("u_apellido_m")
    private String apellidoMaterno;
    @SerializedName("u_edad")
    private int edad;
    @SerializedName("u_clave")
    private String clave;
    @SerializedName("historialMedico")
    private HistorialMedico historialMedico;
    @SerializedName("prevision")
    private Prevision prevision;
    @SerializedName("sexo")
    private Sexo sexo;
    @SerializedName("doctor")
    private Doctor doctor;
    @SerializedName("p_firma")
    private String firma;

    public Paciente() {} //Constructor vacío

    public Paciente(String rut, String email, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String clave, HistorialMedico historialMedico, Prevision prevision, Sexo sexo, Doctor doctor, String firma) {
        this.rut = rut;
        this.email = email;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.clave = clave;
        this.historialMedico = historialMedico;
        this.prevision = prevision;
        this.sexo = sexo;
        this.doctor = doctor;
        this.firma = firma;
    }

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

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }

    public Prevision getPrevision() {
        return prevision;
    }

    public void setPrevision(Prevision prevision) {
        this.prevision = prevision;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
}
