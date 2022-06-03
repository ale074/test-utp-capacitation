package co.edu.utp.gia.curso1.pruebas.pruebasJpa.model.repository;

import co.edu.utp.gia.curso1.pruebas.pruebasJpa.model.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    List<UserEntity> findByName(String name);
}
