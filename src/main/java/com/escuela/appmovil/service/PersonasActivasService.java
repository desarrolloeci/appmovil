package com.escuela.appmovil.service;

import org.springframework.stereotype.Service;

import com.escuela.appmovil.model.PersonasActivas;
import com.escuela.appmovil.repository.PersonasActivasRepository;

import java.util.List;

@Service
public class PersonasActivasService {

    private final PersonasActivasRepository repository;

    public PersonasActivasService(PersonasActivasRepository repository) {
        this.repository = repository;
    }

    public List<PersonasActivas> buscarPorEmail(String email) {
        return repository.findByEmail(email);
    }

    public List<PersonasActivas> buscarPorRol(String tipoRol) {
        return repository.findByTipoRol(tipoRol);
    }

    public List<String> listarAreasDistinct() {
        return repository.findDistinctAreas();
    }

    
}