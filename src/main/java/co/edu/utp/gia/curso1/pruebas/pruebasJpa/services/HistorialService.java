package co.edu.utp.gia.curso1.pruebas.pruebasJpa.services;

import co.edu.utp.gia.curso1.pruebas.pruebasJpa.web.DTOs.HistorialDTO;
import org.springframework.stereotype.Service;


public interface HistorialService {

    HistorialDTO saveHistorial(HistorialDTO historialDTO);

}