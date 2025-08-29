package com.elbuensabor.app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpleadoResponseDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private Long usuarioId;
    private String username;
}
