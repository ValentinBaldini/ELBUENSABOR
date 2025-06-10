
package com.elbuensabor.app.services;

import org.springframework.stereotype.Service;

import com.elbuensabor.app.entities.Empresa;
import com.elbuensabor.app.repositories.BaseRepository;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa, Long> {

    public EmpresaServiceImpl(BaseRepository<Empresa, Long> baseRepository) {
        super(baseRepository);
    }
}
