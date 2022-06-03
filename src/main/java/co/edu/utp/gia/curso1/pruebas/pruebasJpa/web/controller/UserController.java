package co.edu.utp.gia.curso1.pruebas.pruebasJpa.web.controller;

import co.edu.utp.gia.curso1.pruebas.pruebasJpa.services.UserService;
import co.edu.utp.gia.curso1.pruebas.pruebasJpa.web.DTOs.UserDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("userControl")
@NoArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("createUser")
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @GetMapping("getUserByName")
    public List<UserDTO> getUserByName(@RequestParam("name") String name){
        return userService.getUserByName(name);
    }

}