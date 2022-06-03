package co.edu.utp.gia.curso1.pruebas.pruebasJpa.model.repository;

import co.edu.utp.gia.curso1.pruebas.pruebasJpa.model.entities.HistorialEntity;
import org.springframework.data.repository.CrudRepository;

public interface HistorialRespository extends CrudRepository<HistorialEntity, Long> {
}