package com.escuela.appmovil.controller;

import org.springframework.web.bind.annotation.*;
import com.escuela.appmovil.model.PersonasActivas;
import com.escuela.appmovil.service.PersonasActivasService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/personas")
@CrossOrigin(origins = "*")
public class PersonasActivasController {

    private final PersonasActivasService service;

    // Eliminamos JwtUtil del constructor porque ya no lo necesitamos aquí
    public PersonasActivasController(PersonasActivasService service) {
        this.service = service;
    }

    @PostMapping("/findbyemail/{email}")
    public List<PersonasActivas> buscarPorEmail(@PathVariable String email) {
        // Retorna la lista directamente, el frontend la recibirá como un Array puro
        return service.buscarPorEmail(email); 
    }

    @PostMapping("/findbyrol/{rol}")
    public List<PersonasActivas> buscarPorRol(@PathVariable String rol) {
        return service.buscarPorRol(rol);
            }

    @GetMapping("/programas")
    public Map<String, Object> listarAreas() {
        List<String> areas = service.listarAreasDistinct();
        
        Map<String, Object> response = new HashMap<>();
        response.put("areas", areas);
        
        return response;
    }
}