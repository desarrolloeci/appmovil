package com.escuela.appmovil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.escuela.appmovil.model.PersonasActivas;

import java.util.List;

public interface PersonasActivasRepository extends JpaRepository<PersonasActivas, Long> {

    List<PersonasActivas> findByEmail(String email);

    List<PersonasActivas> findByTipoRol(String tipoRol);

    @Query("SELECT DISTINCT p.area FROM PersonasActivas p WHERE p.area IS NOT NULL")
    List<String> findDistinctAreas();

   
}