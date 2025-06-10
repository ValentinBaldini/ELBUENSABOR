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
@Table(name="articuloManufacturadoDetalle")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class ArticuloManufacturadoDetalle {

    @Column(name="cantidad")
    private double cantidad;
}
