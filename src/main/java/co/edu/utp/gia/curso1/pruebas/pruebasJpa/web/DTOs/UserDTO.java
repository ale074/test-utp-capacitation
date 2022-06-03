package co.edu.utp.gia.curso1.pruebas.pruebasJpa.web.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String name;
    private String lastName;
    private String phone;
}
