package com.elbuensabor.app.entities;

import org.hibernate.envers.Audited;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "imagenArticuloManufacturado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class ImagenArticuloManufacturado extends Base {

    private String denominacion;

    @ManyToOne
    @JoinColumn(name = "articuloManufacturado_id")
    private ArticuloManufacturado articuloManufacturado;
}
