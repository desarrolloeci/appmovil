package com.escuela.appmovil.service;

import org.springframework.stereotype.Service;
import com.escuela.appmovil.model.IndicadorEstudiante;
import com.escuela.appmovil.repository.IndicadorRepository;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class IndicadorService {

    private final IndicadorRepository indicadorRepository;

    public IndicadorService(IndicadorRepository indicadorRepository) {
        this.indicadorRepository = indicadorRepository;
    }

    public List<IndicadorEstudiante> obtenerIndicadoresVigentes(String emplid) {
        return indicadorRepository.findVigentesByEmplid(emplid, LocalDateTime.now());
    }
}