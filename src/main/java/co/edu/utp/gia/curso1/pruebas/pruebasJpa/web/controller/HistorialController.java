package co.edu.utp.gia.curso1.pruebas.pruebasJpa.web.controller;

import co.edu.utp.gia.curso1.pruebas.pruebasJpa.services.HistorialService;
import co.edu.utp.gia.curso1.pruebas.pruebasJpa.web.DTOs.HistorialDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("historial")
public class HistorialController {

    private HistorialService historialService;

    public HistorialController(HistorialService historialService) {
        this.historialService = historialService;
    }

    @PostMapping()
    public HistorialDTO saveHistorial(@RequestBody HistorialDTO historialDTO){
        return historialService.saveHistorial(historialDTO);
    }
}