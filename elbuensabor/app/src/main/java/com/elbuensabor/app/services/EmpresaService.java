
package com.elbuensabor.app.services;

import org.springframework.stereotype.Service;

import com.elbuensabor.app.entities.Empresa;
import com.elbuensabor.app.repositories.EmpresaRepository;


@Service
public class EmpresaService extends BaseServiceImpl<Empresa, Long> {

    public EmpresaService(EmpresaRepository empresaRepository) {
        super(empresaRepository);
    }
}
