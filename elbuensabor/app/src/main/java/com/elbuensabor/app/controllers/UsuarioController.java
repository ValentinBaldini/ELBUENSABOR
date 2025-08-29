package com.elbuensabor.app.controllers;

import com.elbuensabor.app.dto.ClienteResponseDTO;
import com.elbuensabor.app.dto.EmpleadoResponseDTO;
import com.elbuensabor.app.dto.UsuarioDTO;
import com.elbuensabor.app.entities.Cliente;
import com.elbuensabor.app.entities.Empleado;
import com.elbuensabor.app.entities.Rol;
import com.elbuensabor.app.entities.Usuario;
import com.elbuensabor.app.services.ClienteServiceImpl;
import com.elbuensabor.app.services.EmpleadoServiceImpl;
import com.elbuensabor.app.services.UsuarioServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/usuario")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl> {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;
    @Autowired
    private EmpleadoServiceImpl empleadoServiceImpl;

    @Transactional
    @PostMapping("/newUser")
    public ResponseEntity<?> crearCliente(@RequestBody UsuarioDTO entity) {

        try {
            System.out.println("Que recibe el backend de usuarios" + entity.toString());
            Usuario usuario = new Usuario();
            usuario.setAuth0Id(entity.getAuth0Id());
            usuario.setUsername(entity.getUsername());
            usuario.setPerfil(Rol.valueOf(entity.getPerfil()));
            usuario.setPassword(entity.getPassword());

            Usuario saveUsuario = service.save(usuario);

            if ("CLIENTE".equals(entity.getPerfil())) {
                Cliente cliente = new Cliente();
                cliente.setNombre(entity.getNombre());
                cliente.setApellido(entity.getApellido());
                cliente.setEmail(entity.getEmail());
                cliente.setTelefono(entity.getTelefono());
                cliente.setUsuario(usuario);

                Cliente saveClient = clienteServiceImpl.save(cliente);

                // Mapear a DTO
                ClienteResponseDTO dto = new ClienteResponseDTO();
                dto.setId(saveClient.getId());
                dto.setNombre(saveClient.getNombre());
                dto.setApellido(saveClient.getApellido());
                dto.setEmail(saveClient.getEmail());
                dto.setTelefono(saveClient.getTelefono());
                dto.setUsuarioId(usuario.getId());
                dto.setUsername(usuario.getUsername());
                return ResponseEntity.ok(dto);
            } else {
                Empleado empleado = new Empleado();
                empleado.setNombre(entity.getNombre());
                empleado.setApellido(entity.getApellido());
                empleado.setEmail(entity.getEmail());
                empleado.setTelefono(entity.getTelefono());
                empleado.setUsuario(usuario);

                Empleado saveEmpleado = empleadoServiceImpl.save(empleado);

                // Mapear a DTO
                EmpleadoResponseDTO dto = new EmpleadoResponseDTO();
                dto.setId(saveEmpleado.getId());
                dto.setNombre(saveEmpleado.getNombre());
                dto.setApellido(saveEmpleado.getApellido());
                dto.setEmail(saveEmpleado.getEmail());
                dto.setTelefono(saveEmpleado.getTelefono());
                dto.setUsuarioId(usuario.getId());
                dto.setUsername(usuario.getUsername());
                return ResponseEntity.ok(dto);
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al crear cliente: " + e.getMessage());
        }
    }
}
