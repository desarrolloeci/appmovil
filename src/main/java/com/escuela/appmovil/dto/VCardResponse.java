package com.escuela.appmovil.dto;

public class VCardResponse {

    private String nombre;
    private String empresa;
    private String cargo;
    private String telefono;
    private String telefonoEmpresa;
    private String ext;
    private String oficina;
    private String direccionEmpresa;
    private String ubicacionEmpresa;
    private String correo;
    private String urlEmpresa;

    // Constructor vacío
    public VCardResponse() {}

    // Constructor con todos los campos
    public VCardResponse(String nombre, String empresa, String cargo, String telefono,
                         String telefonoEmpresa, String ext, String oficina,
                         String direccionEmpresa, String ubicacionEmpresa,
                         String correo, String urlEmpresa) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.cargo = cargo;
        this.telefono = telefono;
        this.telefonoEmpresa = telefonoEmpresa;
        this.ext = ext;
        this.oficina = oficina;
        this.direccionEmpresa = direccionEmpresa;
        this.ubicacionEmpresa = ubicacionEmpresa;
        this.correo = correo;
        this.urlEmpresa = urlEmpresa;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getUbicacionEmpresa() {
        return ubicacionEmpresa;
    }

    public void setUbicacionEmpresa(String ubicacionEmpresa) {
        this.ubicacionEmpresa = ubicacionEmpresa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUrlEmpresa() {
        return urlEmpresa;
    }

    public void setUrlEmpresa(String urlEmpresa) {
        this.urlEmpresa = urlEmpresa;
    }
}