package com.elbuensabor.app.entities;

import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="datosMercadoPago")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class DatosMercadoPago {

    @Column(name="date_created")
    private String date_created;

    @Column(name="date_approved")
    private String date_approved;

    @Column(name="date_last_updated")
    private String date_last_updated;

    @Column(name="payment_type_id")
    private String payment_type_id;

    @Column(name="payment_method_id")
    private String payment_method_id;

    @Column(name="status")
    private String status;

    @Column(name="status_detail")
    private String status_detail;

    @OneToOne
    @JoinColumn(name = "facturaVenta_id")
    @JsonBackReference
    private FacturaVenta facturaVenta;
}
