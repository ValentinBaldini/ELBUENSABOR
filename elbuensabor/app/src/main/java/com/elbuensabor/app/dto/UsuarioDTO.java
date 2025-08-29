package com.elbuensabor.app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String username;
    private String auth0Id;
    private String password;
    private String perfil;

    @Override
    public String toString() {
        return "UsuarioDTO{"
                + "nombre='" + nombre + '\''
                + ", apellido='" + apellido + '\''
                + ", telefono='" + telefono + '\''
                + ", email='" + email + '\''
                + ", username='" + username + '\''
                + ", auth0Id='" + auth0Id + '\''
                + ", perfil='" + perfil + '\''
                + '}';
    }
}
