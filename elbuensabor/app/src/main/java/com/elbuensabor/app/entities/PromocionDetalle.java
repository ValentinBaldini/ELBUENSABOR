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
@Table(name="promocionDetalle")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class PromocionDetalle {

    @Column(name="cantidad")
    private int cantidad;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "articuloInsumo_id")
    private ArticuloInsumo articuloInsumo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "articuloManufacturado_id")
    private ArticuloManufacturado articuloManufacturado;

    @ManyToOne
    @JoinColumn(name = "promocion_id", nullable = false)
    private Promocion promocion;

}
