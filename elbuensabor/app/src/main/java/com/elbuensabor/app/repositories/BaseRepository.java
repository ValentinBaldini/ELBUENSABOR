package com.elbuensabor.app.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.elbuensabor.app.entities.Base;

@NoRepositoryBean
public interface BaseRepository <E extends Base, Id extends Serializable> extends JpaRepository<E, Id>{

}
