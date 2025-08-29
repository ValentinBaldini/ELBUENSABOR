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
@Table(name = "pedidoVentaDetalle")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class PedidoVentaDetalle extends Base {

    @Column(name = "cantidad")
    private double cantidad;

    @Column(name = "subtotal")
    private double subtotal;

    @OneToMany(mappedBy = "pedidoVentaDetalle")
    private List<ArticuloInsumo> articulosInsumo = new ArrayList<>();

    @OneToMany(mappedBy = "pedidoVentaDetalle", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ArticuloManufacturado> articulosManufacturados = new ArrayList<>();

    @OneToMany(mappedBy = "pedidoVentaDetalle", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Promocion> promociones = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "pedidoVenta_id", nullable = false)
    private PedidoVenta pedidoVenta;

}
