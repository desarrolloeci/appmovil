package com.escuela.appmovil.dto;


public class BuscarGraduadoRequest {
    private String tipoDocumento;
    private String nroDocumento;
    private String programa;
    private Integer anio;

    public String getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }

    public String getNroDocumento() { return nroDocumento; }
    public void setNroDocumento(String nroDocumento) { this.nroDocumento = nroDocumento; }

    public String getPrograma() { return programa; }
    public void setPrograma(String programa) { this.programa = programa; }

    public Integer getAnio() { return anio; }
    public void setAnio(Integer anio) { this.anio = anio; }
}