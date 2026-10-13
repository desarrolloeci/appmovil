package com.escuela.appmovil.model;

import jakarta.persistence.*;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "personas_activas")
public class PersonasActivas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String sexo;
    private String email;

    @Column(name = "tipo_documento")
    @JsonProperty("tipo_documento")
    private String tipoDocumento;

    @Column(name = "nro_documento")
    @JsonProperty("nro_documento")
    private String nroDocumento;

    private String emplid;

    @Column(name = "tipo_rol")
    @JsonProperty("tipo_rol")
    private String tipoRol;

    private String estado;

    @Column(name = "fecha_nacimiento")
    @JsonProperty("fecha_nacimiento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;

    @Column(name = "cod_area")
    @JsonProperty("cod_area")
    private String codArea;

    private String area;
    private String ciclo;
    private String grado;

    @Column(name = "ciclo_descr")
    @JsonProperty("ciclo_descr")
    private String cicloDescr;

    private String semestre;

    @Column(name = "primer_nombre")
    @JsonProperty("primer_nombre")
    private String primerNombre;

    @Column(name = "segundo_nombre")
    @JsonProperty("segundo_nombre")
    private String segundoNombre;

    @Column(name = "primer_apellido")
    @JsonProperty("primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    @JsonProperty("segundo_apellido")
    private String segundoApellido;

    @Column(name = "categoria_profesor")
    @JsonProperty("categoria_profesor")
    private String categoriaProfesor;

    private String telefono;
    private String direccion;

    @Column(name = "fecha_vigencia")
    @JsonProperty("fecha_vigencia")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate fechaVigencia;

    // ====== Getters y Setters ======

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getEmplid() {
        return emplid;
    }

    public void setEmplid(String emplid) {
        this.emplid = emplid;
    }

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getCicloDescr() {
        return cicloDescr;
    }

    public void setCicloDescr(String cicloDescr) {
        this.cicloDescr = cicloDescr;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCategoriaProfesor() {
        return categoriaProfesor;
    }

    public void setCategoriaProfesor(String categoriaProfesor) {
        this.categoriaProfesor = categoriaProfesor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(LocalDate fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }
}