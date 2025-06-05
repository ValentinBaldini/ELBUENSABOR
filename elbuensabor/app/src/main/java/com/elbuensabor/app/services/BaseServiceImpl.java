package com.elbuensabor.app.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import com.elbuensabor.app.entities.Base;
import com.elbuensabor.app.repositories.BaseRepository;

import jakarta.transaction.Transactional;

public abstract class BaseServiceImpl<E extends Base, Id extends Serializable> implements BaseService<E, Id> {

    protected BaseRepository<E, Id> baseRepository;

    public BaseServiceImpl(BaseRepository<E, Id> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try {
            List<E> entities = baseRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(Id id) throws Exception {
        try {
            Optional<E> entity = baseRepository.findById(id);
            return entity.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            entity = baseRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(Id id, E entity) throws Exception {
        try {
            Optional<E> entityOpt = baseRepository.findById(id);
            E entityObj = entityOpt.get();
            entityObj = baseRepository.save(entity);
            return entityObj;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Id id) throws Exception {
        try {
            if (baseRepository.existsById(id)) {
                baseRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}