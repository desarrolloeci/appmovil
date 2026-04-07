package com.escuela.appmovil.controller;

import org.springframework.web.bind.annotation.*;
import com.escuela.appmovil.model.PersonasActivas;
import com.escuela.appmovil.service.PersonasActivasService;
import com.escuela.appmovil.util.JwtUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/personas")
@CrossOrigin(origins = "*")
public class PersonasActivasController {

    private final PersonasActivasService service;
    private final JwtUtil jwtUtil;

    public PersonasActivasController(PersonasActivasService service, JwtUtil jwtUtil) {
        this.service = service;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/findByEmail/email")
    public String buscarPorEmail(@RequestBody Map<String, Object> payload) {
        String email;
        if (payload.containsKey("token")) {
            Map<String, Object> data = jwtUtil.decode((String) payload.get("token"));
            email = (String) data.get("email");
        } else {
            email = (String) payload.get("email");
        }

        List<PersonasActivas> personas = service.buscarPorEmail(email);
        Map<String, Object> response = new HashMap<>();
        response.put("personas", personas);
        return jwtUtil.encode(response);
    }

    @PostMapping("/findByRol/rol")
    public String buscarPorRol(@RequestBody Map<String, Object> payload) {
        String rol;
        if (payload.containsKey("token")) {
            Map<String, Object> data = jwtUtil.decode((String) payload.get("token"));
            rol = (String) data.get("tipoRol");
        } else {
            rol = (String) payload.get("tipoRol");
        }

        List<PersonasActivas> personas = service.buscarPorRol(rol);
        Map<String, Object> response = new HashMap<>();
        response.put("personas", personas);
        return jwtUtil.encode(response);
    }

    @GetMapping("/programas")
    public String listarAreas() {
        List<String> areas = service.listarAreasDistinct();
        Map<String, Object> response = new HashMap<>();
        response.put("areas", areas);
        return jwtUtil.encode(response);
    }

   
}
