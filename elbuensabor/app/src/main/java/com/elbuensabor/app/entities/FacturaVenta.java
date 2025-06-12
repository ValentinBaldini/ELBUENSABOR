package com.elbuensabor.app.entities;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

    @OneToMany(mappedBy = "facturaVenta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FacturaVentaDetalle> facturaVentaDetalles;

    @ManyToOne
    @JoinColumn(name = "pedidoVenta_id", nullable = false)
    private PedidoVenta pedidoVenta;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @OneToOne(mappedBy = "facturaVenta", cascade=CascadeType.ALL, orphanRemoval=true)
    @JsonManagedReference
    private DatosMercadoPago datosMercadoPago;

}
