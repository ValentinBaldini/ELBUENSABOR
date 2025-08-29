package com.elbuensabor.app.repositories;

import com.elbuensabor.app.entities.Empleado;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado, Long> {

}
