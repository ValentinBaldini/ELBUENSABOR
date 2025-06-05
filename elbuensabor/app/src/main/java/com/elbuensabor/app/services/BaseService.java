package com.elbuensabor.app.services;

import java.io.Serializable;
import java.util.List;

import com.elbuensabor.app.entities.Base;

public interface BaseService<E extends Base, Id extends Serializable>{
    public List<E> findAll() throws Exception;
    public E findById(Id id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(Id id, E entity) throws Exception;
    public boolean delete(Id id) throws Exception;
}
