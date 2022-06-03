package co.edu.utp.gia.curso1.pruebas.pruebasJpa.web.DTOs;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HistorialDTO implements Serializable {

    private Long id;

    private Date date;

    private String description;

    private Long idHistorial;
}