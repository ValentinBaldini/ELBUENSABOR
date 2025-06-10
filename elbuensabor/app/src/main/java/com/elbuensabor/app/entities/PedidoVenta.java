package com.elbuensabor.app.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.hibernate.envers.Audited;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="pedidoVenta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class PedidoVenta {
   
    // revisar Type
    @Column(name="horaEstimadaFinalizacion")
    private String horaEstimadaFinalizacion;

    @Column(name="subtotal")
    private BigDecimal subtotal;

    @Column(name="descuento")
    private BigDecimal descuento;

    @Column(name="gastosEnvio")
    private BigDecimal gastosEnvio;

    @Column(name="total")
    private BigDecimal total;

    @Column(name="totalCosto")
    private BigDecimal totalCosto;

    @Column(name="estado")
    private Estado estado;

    @Column(name="tipoEnvio")
    private TipoEnvio tipoEnvio;
    
    @Column(name="formaPago")
    private BigDecimal formaPago; 

    @Column(name="fechaPedido")
    private LocalDate fechaPedido;

}
