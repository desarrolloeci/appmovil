package com.escuela.appmovil.service;

import org.springframework.stereotype.Service;

import com.escuela.appmovil.dto.VCardResponse;
import com.escuela.appmovil.model.Contacto;
import com.escuela.appmovil.repository.ContactoRepository;

import java.util.Optional;

@Service
public class ContactoService {

    private final ContactoRepository contactoRepository;

    public ContactoService(ContactoRepository contactoRepository) {
        this.contactoRepository = contactoRepository;
    }

    public VCardResponse obtenerVCardPorEmplid(String emplid) {

        Optional<Contacto> contactoOpt = contactoRepository.findById(emplid);

        if (contactoOpt.isEmpty()) {
            return null;
        }

        Contacto c = contactoOpt.get();

        return new VCardResponse(
                c.getNombre(),
                c.getCargo(),
                c.getEmpresa(),
                c.getTelefono(),
                c.getTelefonoEmpresa(),
                c.getExt(),
                c.getOficina(),
                c.getDireccionEmpresa(),
                c.getUbicacionEmpresa(),
                c.getCorreo(),
                c.getUrlEmpresa()
        );
    }
    
    public boolean validarMostrarBoton(String emplid) {
        // Si existe un registro en BD → mostrar botón
        return contactoRepository.existsByEmplid(emplid);
    }

}