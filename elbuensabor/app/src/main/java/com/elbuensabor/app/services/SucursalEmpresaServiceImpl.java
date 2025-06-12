package com.elbuensabor.app.services;

import org.springframework.stereotype.Service;

import com.elbuensabor.app.entities.SucursalEmpresa;
import com.elbuensabor.app.repositories.BaseRepository;

@Service
public class SucursalEmpresaServiceImpl extends BaseServiceImpl<SucursalEmpresa, Long> {

    public SucursalEmpresaServiceImpl(BaseRepository<SucursalEmpresa, Long> baseRepository) {
        super(baseRepository);
    }
}
