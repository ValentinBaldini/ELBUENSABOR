package com.elbuensabor.app.entities;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="articuloManufacturado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class ArticuloManufacturado extends Base{

    @Column(name="denominacion")
    private String denominacion;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="precioVenta")
    private double precioVenta;

    @Column(name="precioCosto")
    private double precioCosto;

    @Column(name="tiempoEstimado")
    private int tiempoEstimado;

    @OneToOne
    @JoinColumn(name="categoriaArticuloManufacturado_id")
    private CategoriaArticuloManufacturado categoriaArticuloManufacturado;

    @OneToMany(mappedBy = "articuloManufacturado")
    private List<ImagenArticuloManufacturado> imagenesArticulosManufacturados;

    /*@OneToMany(mappedBy="articuloManufacturado")
    private List<ArticuloManufacturadoDetalle> articulosManufacturadosDetalle = new ArrayList<>();*/
}
