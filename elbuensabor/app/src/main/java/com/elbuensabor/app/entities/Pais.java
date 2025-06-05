package com.elbuensabor.app.entities;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="pais")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Pais extends Base{

    @Column(name="nombre")
    private String nombre;

    @OneToMany(mappedBy="pais")
    private List<Provincia> provincias = new ArrayList<>();
}
