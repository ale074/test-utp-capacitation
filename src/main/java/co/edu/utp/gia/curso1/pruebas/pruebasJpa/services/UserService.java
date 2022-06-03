package co.edu.utp.gia.curso1.pruebas.pruebasJpa.services;

import co.edu.utp.gia.curso1.pruebas.pruebasJpa.web.DTOs.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO createUser(UserDTO userDTO);


    UserDTO getUser(Long id);

    List<UserDTO> getUserByName(String name);
}
