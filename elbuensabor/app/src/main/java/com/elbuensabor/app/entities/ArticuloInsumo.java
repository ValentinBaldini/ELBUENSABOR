package com.elbuensabor.app.entities;

import org.hibernate.envers.Audited;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="articuloInsumo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class ArticuloInsumo {

    @Column(name="denominacion")
    private String denominacion;

    @Column(name="precioCompra")
    private double precioCompra;

    @Column(name="precioVenta")
    private double precioVenta;

    @Column(name="esParaElaborar")
    private boolean esParaElaborar;

}
