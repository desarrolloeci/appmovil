package com.escuela.appmovil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escuela.appmovil.model.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, String> {
	
	 boolean existsByEmplid(String emplid);

}