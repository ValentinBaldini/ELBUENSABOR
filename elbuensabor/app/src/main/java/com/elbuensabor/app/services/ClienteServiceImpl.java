package com.elbuensabor.app.services;

import org.springframework.stereotype.Service;

import com.elbuensabor.app.entities.Cliente;
import com.elbuensabor.app.repositories.BaseRepository;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long>{

    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository){
        super(baseRepository);
    }
    
}
