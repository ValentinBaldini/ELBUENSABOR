package com.elbuensabor.app.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.envers.Audited;

import jakarta.persistence.CascadeType;
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

    @OneToMany(mappedBy = "pedidoVenta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PedidoVentaDetalle> pedidoVentaDetalles;

    @OneToMany(mappedBy = "pedidoVenta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FacturaVenta> facturasVenta;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "empleado_id", nullable = false)
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "sucursalEmpresa_id", nullable = false)
    private SucursalEmpresa sucursalEmpresa;

}
