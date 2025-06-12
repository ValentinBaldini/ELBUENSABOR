package com.elbuensabor.app.entities;

import org.hibernate.envers.Audited;

import jakarta.persistence.CascadeType;
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
@Table(name="articuloManufacturadoDetalle")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class ArticuloManufacturadoDetalle {

    @Column(name="cantidad")
    private double cantidad;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "articuloInsumo_id")
    private ArticuloInsumo articuloInsumo;

    @ManyToOne
    @JoinColumn(name = "articuloManufacturado_id")
    private ArticuloManufacturado articuloManufacturado;
}
