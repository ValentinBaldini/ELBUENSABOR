package com.elbuensabor.app.services;

import com.elbuensabor.app.entities.Empleado;
import com.elbuensabor.app.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl extends BaseServiceImpl<Empleado, Long> {

    public EmpleadoServiceImpl(BaseRepository<Empleado, Long> baseRepository) {
        super(baseRepository);
    }
}
