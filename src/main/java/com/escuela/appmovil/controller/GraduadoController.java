package com.escuela.appmovil.controller;

import com.escuela.appmovil.dto.BuscarGraduadoRequest;
import com.escuela.appmovil.model.Graduado;
import com.escuela.appmovil.service.GraduadoService;
import com.escuela.appmovil.util.JwtUtil;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/graduados")
public class GraduadoController {

    private final GraduadoService service;
    private final JwtUtil jwtUtil;

    public GraduadoController(GraduadoService service, JwtUtil jwtUtil) {
        this.service = service;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/buscar")
    public String buscarGraduados(@RequestBody Map<String, Object> body) {
        BuscarGraduadoRequest request;

        if (body.containsKey("token")) {
            Map<String, Object> data = jwtUtil.decode((String) body.get("token"));
            request = mapToRequest(data);
        } else {
            request = mapToRequest(body);
        }

        List<Graduado> resultado = service.buscarPorFiltros(
                request.getTipoDocumento(),
                request.getNroDocumento(),
                request.getPrograma(),
                request.getAnio());

        Map<String, Object> responseData = new HashMap<>();
        responseData.put("resultado", resultado);
        return jwtUtil.encode(responseData);
    }

    @GetMapping("/programas/{nroDocumento}/{tipoDocumento}")
    public String obtenerProgramas(@PathVariable String nroDocumento, @PathVariable String tipoDocumento) {
        Map<String, Object> responseData = new HashMap<>();
        try {
            List<Map<String, Object>> programas = service.buscarProgramasPorDocumento(nroDocumento, tipoDocumento);

            if (programas == null) {
                programas = List.of(); // Lista vacía si el servicio retorna null
            }

            responseData.put("programas", programas);

        } catch (Exception e) {
            responseData.put("programas", List.of());
            responseData.put("error", "No se pudo obtener los programas");
        }

        return jwtUtil.encode(responseData);
    }

    private BuscarGraduadoRequest mapToRequest(Map<String, Object> data) {
        BuscarGraduadoRequest req = new BuscarGraduadoRequest();
        req.setTipoDocumento((String) data.get("tipoDocumento"));
        req.setNroDocumento((String) data.get("nroDocumento"));
        req.setPrograma((String) data.get("programa"));
        Object anioObj = data.get("anio");
        if (anioObj != null) {
            req.setAnio(Integer.valueOf(anioObj.toString()));
        }
        return req;
    }
}
