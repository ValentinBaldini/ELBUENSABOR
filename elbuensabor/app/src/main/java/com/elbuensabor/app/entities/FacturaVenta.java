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
@Table(name="facturaVenta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class FacturaVenta {

    @Column(name="fechaFacturacion")
    private String fechaFacturacion;

    @Column(name="numeroComprobante")
    private String numeroComprobante;
    
    @Column(name="formaPago")
    private FormaPago formaPago;

    @Column(name="subtotal")
    private BigDecimal subtotal;

    @Column(name="descuento")
    private BigDecimal descuento;

    @Column(name="gastosEnvio")
    private BigDecimal gastosEnvio;

    @Column(name="totalVenta")
    private BigDecimal totalVenta;

}
