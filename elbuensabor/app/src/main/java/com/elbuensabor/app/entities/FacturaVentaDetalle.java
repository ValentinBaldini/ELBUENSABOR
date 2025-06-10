package com.elbuensabor.app.entities;

import java.math.BigDecimal;
import org.hibernate.envers.Audited;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

}
