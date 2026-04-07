package com.escuela.appmovil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.escuela.appmovil.model.IndicadorEstudiante;
import java.time.LocalDateTime;
import java.util.List;

public interface IndicadorRepository extends JpaRepository<IndicadorEstudiante, Long> {

    @Query("SELECT i FROM IndicadorEstudiante i WHERE i.emplid = :emplid " +
           "AND :fechaActual BETWEEN i.fechaIniInd AND i.fechaFinInd")
    List<IndicadorEstudiante> findVigentesByEmplid(
        @Param("emplid") String emplid, 
        @Param("fechaActual") LocalDateTime fechaActual
    );
}