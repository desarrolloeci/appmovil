package com.escuela.appmovil.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escuela.appmovil.dto.VCardResponse;
import com.escuela.appmovil.service.ContactoService;

@RestController
@RequestMapping("/api/contacto")
@CrossOrigin("*")
public class ContactoController {

    private final ContactoService contactoService;

    public ContactoController(ContactoService contactoService) {
        this.contactoService = contactoService;
    }

    @GetMapping("/vcard/{emplid}")
    public ResponseEntity<?> obtenerVCard(@PathVariable String emplid) {

        VCardResponse response = contactoService.obtenerVCardPorEmplid(emplid);

        if (response == null) {
            return ResponseEntity.noContent().build(); // 204 No Content
        }

        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/mostrar/{emplid}")
    public ResponseEntity<Boolean> validarMostrarBoton(@PathVariable String emplid) {
        boolean mostrar = contactoService.validarMostrarBoton(emplid);
        return ResponseEntity.ok(mostrar);
    }
}