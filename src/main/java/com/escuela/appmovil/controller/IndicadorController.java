package com.escuela.appmovil.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.escuela.appmovil.model.IndicadorEstudiante;
import com.escuela.appmovil.service.IndicadorService;
import java.util.List;

@RestController
@RequestMapping("/api/indicadores")
@CrossOrigin("*")
public class IndicadorController {

    private final IndicadorService indicadorService;

    public IndicadorController(IndicadorService indicadorService) {
        this.indicadorService = indicadorService;
    }

    @GetMapping("/vigentes/{emplid}")
    public ResponseEntity<List<IndicadorEstudiante>> obtenerVigentes(@PathVariable String emplid) {
        List<IndicadorEstudiante> lista = indicadorService.obtenerIndicadoresVigentes(emplid);
        
        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(lista);
    }
}