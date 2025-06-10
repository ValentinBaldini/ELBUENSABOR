package com.elbuensabor.app.entities;

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
@Table(name="promocion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Promocion {
    
    @Column(name="denominacion")
    private String denominacion;

    @Column(name="fechaDesde")
    private LocalDate fechaDesde;

    @Column(name="fechaHasta")
    private LocalDate fechaHasta;

    @Column(name="descuento")
    private double descuento;

}
