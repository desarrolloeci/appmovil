package com.escuela.appmovil.dto;

public class GraduadoDto {
    private Long id;
    private String tipoDocumento;
    private String nroDocumento;
    private String programa;
    private String codPrograma;
    private Integer anio;
    private String emplid;
    private String nombre;

    public GraduadoDto() {}

    public GraduadoDto(Long id, String tipoDocumento, String nroDocumento,
                       String programa, String codPrograma, Integer anio,
                       String emplid, String nombre) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.programa = programa;
        this.codPrograma = codPrograma;
        this.anio = anio;
        this.emplid = emplid;
        this.nombre = nombre;
    }

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
