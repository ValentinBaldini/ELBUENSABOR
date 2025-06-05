package com.elbuensabor.app.entities;

import java.util.List;

import org.hibernate.envers.Audited;

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
@Table(name="provincia")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Provincia extends Base{

    @Column(name="nombre")
    private String nombre;

    @OneToMany(mappedBy="provincia")
    private List<Localidad> localidades;

    @ManyToOne
    @JoinColumn(name="pais_id")
    private Pais pais;
}
