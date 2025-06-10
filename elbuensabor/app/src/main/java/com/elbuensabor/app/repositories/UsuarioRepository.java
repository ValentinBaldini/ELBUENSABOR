package com.elbuensabor.app.repositories;

import org.springframework.stereotype.Repository;

import com.elbuensabor.app.entities.Usuario;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long>{
}
