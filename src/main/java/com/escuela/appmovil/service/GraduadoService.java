package com.escuela.appmovil.service;


import org.springframework.stereotype.Service;

import com.escuela.appmovil.dto.GraduadoDto;
import com.escuela.appmovil.model.Graduado;
import com.escuela.appmovil.repository.GraduadoRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class GraduadoService {

    private final GraduadoRepository repository;

    public GraduadoService(GraduadoRepository repository) {
        this.repository = repository;
    }

    public List<Graduado> buscarPorFiltros(String tipoDocumento, String nroDocumento, String programa, Integer anio) {
        return repository.findByTipoDocumentoAndNroDocumentoAndProgramaAndAnio(tipoDocumento, nroDocumento, programa, anio);
    }

    public List<Map<String, Object>> buscarProgramasPorDocumento(String nroDocumento, String tipoDocumento) {
    List<Object[]> results = repository.findDistinctProgramaCodAnioByNroDocumento(nroDocumento, tipoDocumento);
    return results.stream().map(r -> {
        Map<String, Object> map = new HashMap<>();
        map.put("programa", r[0]);
        map.put("codPrograma", r[1]);
        map.put("anio", r[2]);
        map.put("nombre", r[3]);
        return map;
    }).collect(Collectors.toList());
}
    public static List<GraduadoDto> toDtoList(List<Graduado> entities) {
        return entities.stream()
                .map(g -> new GraduadoDto(
                        g.getId(),
                        g.getTipoDocumento(),
                        g.getNroDocumento(),
                        g.getPrograma(),
                        g.getCodPrograma(),
                        g.getAnio(),
                        g.getEmplid(),
                        g.getNombre()
                ))
                .collect(Collectors.toList());
    }
}