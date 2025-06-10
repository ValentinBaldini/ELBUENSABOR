package com.elbuensabor.app.entities;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.envers.Audited;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Localidad")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Localidad extends Base{

    @Column(name="nombre")
    private String nombre;

    @OneToMany(mappedBy="localidad", cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Domicilio> domicilios = new ArrayList<>();

    @ManyToOne(optional=false)
    @JoinColumn(name="provincia_id")
    private Provincia provincia;
}
