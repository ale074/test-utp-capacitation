package co.edu.utp.gia.curso1.pruebas.pruebasJpa.services.impl;

import co.edu.utp.gia.curso1.pruebas.pruebasJpa.model.entities.UserEntity;
import co.edu.utp.gia.curso1.pruebas.pruebasJpa.model.repository.UserRepository;
import co.edu.utp.gia.curso1.pruebas.pruebasJpa.services.UserService;
import co.edu.utp.gia.curso1.pruebas.pruebasJpa.web.DTOs.UserDTO;
import co.edu.utp.gia.curso1.pruebas.pruebasJpa.web.exceptions.UserNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        // " CASTEO"
        //UserEntity userEntity = new UserEntity(userDTO.getName(), userDTO.getLastName(), userDTO.getPhone());
        UserEntity userEntity = modelMapper.map(userDTO, UserEntity.class);
        UserEntity userEntityResponse = userRepository.save(userEntity);
        return modelMapper.map(userEntityResponse, UserDTO.class);
    }

    @Override
    public UserDTO getUser(Long id) {
        if (userRepository.existsById(id)) {
            UserEntity usuarioEntity = userRepository.findById(id).get();
            return modelMapper.map(userRepository.findById(id).get(), UserDTO.class);
        } else {
            throw new UserNotFoundException("EL usuario no existe");
        }
    }

    @Override
    public List<UserDTO> getUserByName(String name) {
        if (name != "" && name != null){
            List<UserEntity> userEntities = userRepository.findByName(name);
            List<UserDTO> userDTOS = new ArrayList<>();
            userEntities.forEach(userEntity -> {
                userDTOS.add(modelMapper.map(userEntity, UserDTO.class));
            });
            return userDTOS;
        } else {
            throw new UserNotFoundException("Nombre no puede ser vacio");
        }
    }
}
