package com.escuela.appmovil.repository;

import com.escuela.appmovil.model.Graduado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GraduadoRepository extends JpaRepository<Graduado, Long> {

    List<Graduado> findByTipoDocumentoAndNroDocumentoAndProgramaAndAnio(
            String tipoDocumento,
            String nroDocumento,
            String programa,
            Integer anio
    );

    @Query("SELECT DISTINCT g.programa, g.codPrograma, g.anio, g.nombre " +
       "FROM Graduado g WHERE g.nroDocumento = :nroDocumento and g.tipoDocumento = :tipoDocumento")
List<Object[]> findDistinctProgramaCodAnioByNroDocumento(@Param("nroDocumento") String nroDocumento, @Param("tipoDocumento") String tipoDocumento);
}