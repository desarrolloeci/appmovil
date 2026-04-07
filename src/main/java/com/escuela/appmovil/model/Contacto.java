package com.escuela.appmovil.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contactos")
public class Contacto {

    @Id
    @Column(name = "emplid", nullable = false)
    private String emplid;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String cargo;

    @Column(nullable = false)
    private String empresa;

    @Column(nullable = false)
    private String telefono; // Celular personal

    @Column(nullable = false)
    private String telefonoEmpresa;

    @Column(nullable = true)
    private String ext;

    @Column(nullable = true)
    private String oficina;

    @Column(nullable = true)
    private String direccionEmpresa;

    @Column(nullable = true)
    private String ubicacionEmpresa;

    @Column(nullable = true)
    private String urlEmpresa;

    @Column(nullable = false)
    private String correo;

    public Contacto() {}

    public String getEmplid() { return emplid; }
    public String getNombre() { return nombre; }
    public String getCargo() { return cargo; }
    public String getEmpresa() { return empresa; }
    public String getTelefono() { return telefono; }
    public String getTelefonoEmpresa() { return telefonoEmpresa; }
    public String getExt() { return ext; }
    public String getOficina() { return oficina; }
    public String getDireccionEmpresa() { return direccionEmpresa; }
    public String getUbicacionEmpresa() { return ubicacionEmpresa; }
    public String getUrlEmpresa() { return urlEmpresa; }
    public String getCorreo() { return correo; }
}
