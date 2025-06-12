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

    @ManyToOne
    @JoinColumn(name = "unidadMedida_id", nullable = false)
    private UnidadMedida unidadMedida;

    @OneToOne
    @JoinColumn(name="imagenInsumo_id")
    private ImagenInsumo imagenInsumo;

    @ManyToOne
    @JoinColumn(name = "categoriaArticulo_id", nullable = false)
    private CategoriaArticulo categoriaArticulo; 

    @ManyToOne
    @JoinColumn(name = "sucursalInsumo_id", nullable = false)
    private SucursalInsumo sucursalInsumo;


}
