package com.elbuensabor.app.services;

import org.springframework.stereotype.Service;

import com.elbuensabor.app.entities.Usuario;
import com.elbuensabor.app.repositories.BaseRepository;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long> {

    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository) {
        super(baseRepository);
    }
}
