package com.escuela.appmovil.model;

import jakarta.persistence.*;

@Entity
@Table(name = "graduados")
public class Graduado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_documento", nullable = false)
    private String tipoDocumento;

    @Column(name = "nro_documento", nullable = false)
    private String nroDocumento;

    @Column(name = "programa")
    private String programa;

    @Column(name = "cod_prog")
    private String codPrograma;

    @Column(name = "anio")
    private Integer anio;

    @Column(name = "emplid")
    private String emplid;

    @Column(name = "nombre")
    private String nombre;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }

    public String getNroDocumento() { return nroDocumento; }
    public void setNroDocumento(String nroDocumento) { this.nroDocumento = nroDocumento; }

    public String getPrograma() { return programa; }
    public void setPrograma(String programa) { this.programa = programa; }

    public String getCodPrograma() { return codPrograma; }
    public void setCodPrograma(String codPrograma) { this.codPrograma = codPrograma; }

    public Integer getAnio() { return anio; }
    public void setAnio(Integer anio) { this.anio = anio; }

    public String getEmplid() { return emplid; }
    public void setEmplid(String emplid) { this.emplid = emplid; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}