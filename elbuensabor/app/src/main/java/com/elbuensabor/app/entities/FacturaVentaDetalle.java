package com.elbuensabor.app.entities;

import java.math.BigDecimal;
import java.util.List;
import org.hibernate.envers.Audited;
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
@Table(name="facturaVentaDetalle")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class FacturaVentaDetalle {
    
    @Column(name="cantidad")
    private Integer cantidad;

    @Column(name="subtotal")
    private BigDecimal subtotal;

    @OneToMany(mappedBy = "facturaVentaDetalle")
    private List<ArticuloInsumo> articulosInsumo;

    @ManyToOne
    @JoinColumn(name = "facturaVenta_id", nullable = false)
    private FacturaVenta facturaVenta;

}
