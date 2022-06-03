package co.edu.utp.gia.curso1.pruebas.pruebasJpa.services.impl;

import co.edu.utp.gia.curso1.pruebas.pruebasJpa.model.entities.HistorialEntity;
import co.edu.utp.gia.curso1.pruebas.pruebasJpa.model.entities.UserEntity;
import co.edu.utp.gia.curso1.pruebas.pruebasJpa.model.repository.HistorialRespository;
import co.edu.utp.gia.curso1.pruebas.pruebasJpa.services.HistorialService;
import co.edu.utp.gia.curso1.pruebas.pruebasJpa.services.UserService;
import co.edu.utp.gia.curso1.pruebas.pruebasJpa.web.DTOs.HistorialDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistorialServiceImpl implements HistorialService {

    @Autowired
    private HistorialRespository historialRespository;

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper = new ModelMapper();

    public HistorialDTO saveHistorial(HistorialDTO historialDTO){
        HistorialEntity historialEntity = modelMapper.map(historialDTO,HistorialEntity.class);
        historialEntity.setUserEntity(modelMapper.map(userService.getUser(historialDTO.getIdHistorial()),
                UserEntity.class));
        return modelMapper.map(historialRespository.save(historialEntity),HistorialDTO.class);

    }

}