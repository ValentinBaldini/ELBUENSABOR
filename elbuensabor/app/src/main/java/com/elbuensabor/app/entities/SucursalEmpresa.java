package com.elbuensabor.app.entities;

import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="sucursalEmpresa")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class SucursalEmpresa extends Base {

    @Column(name="nombre")
    private String nombre;

    @Column(name="horarioApertura")
    private String horarioApertura;

    @Column(name="horarioCierre")
    private String horarioCierre;

    @ManyToOne
    @JoinColumn(name="empresa_id")
    private Empresa empresa;
    
}
