package com.elbuensabor.app.services;

import org.springframework.stereotype.Service;

import com.elbuensabor.app.entities.SucursalEmpresa;
import com.elbuensabor.app.repositories.SucursalEmpresaRepository;

@Service
public class SucursalEmpresaService extends BaseServiceImpl<SucursalEmpresa, Long> {

    public SucursalEmpresaService(SucursalEmpresaRepository sucursalEmpresaRepository) {
        super(sucursalEmpresaRepository);
    }
}
