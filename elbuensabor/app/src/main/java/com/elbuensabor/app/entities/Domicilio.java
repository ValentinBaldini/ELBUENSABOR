package com.elbuensabor.app.entities;

import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="domicilio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Domicilio extends Base{
    @Column(name="calle")
    private String calle;

    @Column(name="numero")
    private int numero;

    @Column(name="codigoPostal")
    private int codigoPostal;

    @OneToOne(mappedBy="domicilio")
    private SucursalEmpresa sucursalEmpresa;

    @ManyToOne
    @JoinColumn(name="localidad_id")
    private Localidad localidad;
}
