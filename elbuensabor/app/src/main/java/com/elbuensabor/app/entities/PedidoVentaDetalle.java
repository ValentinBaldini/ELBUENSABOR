package com.elbuensabor.app.entities;

import java.util.List;

import org.hibernate.envers.Audited;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="pedidoVentaDetalle")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class PedidoVentaDetalle {
    
    @Column(name="cantidad")
    private double cantidad;

    @Column(name="subtotal")
    private double subtotal;

    @OneToMany(mappedBy = "pedidoVentaDetalle")
    private List<ArticuloInsumo> articulosInsumo;

}
