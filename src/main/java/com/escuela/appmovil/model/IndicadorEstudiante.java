package com.escuela.appmovil.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "indicadores_estudiantes", schema = "dbo")
public class IndicadorEstudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String emplid;

    @Column(name = "cod_indicador")
    private String codIndicador;

    @Column(name = "descripcion_ind")
    private String descripcionInd;

    @Column(name = "descripción_motivo")
    private String descripcionMotivo;

    private String ciclo;

    @Column(name = "fecha_ini_ind")
    private LocalDateTime fechaIniInd;

    @Column(name = "fecha_fin_ind")
    private LocalDateTime fechaFinInd;

    public IndicadorEstudiante() {}

    // Getters
    public Long getId() { return id; }
    public String getEmplid() { return emplid; }
    public String getCodIndicador() { return codIndicador; }
    public String getDescripcionInd() { return descripcionInd; }
    public String getDescripcionMotivo() { return descripcionMotivo; }
    public String getCiclo() { return ciclo; }
    public LocalDateTime getFechaIniInd() { return fechaIniInd; }
    public LocalDateTime getFechaFinInd() { return fechaFinInd; }
}