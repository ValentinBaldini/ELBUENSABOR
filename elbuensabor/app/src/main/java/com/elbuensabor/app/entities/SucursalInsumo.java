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
@Table(name="sucursalInsumo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class SucursalInsumo {

    @Column(name="stockActual")
    private double stockActual;

    @Column(name="stockMinimo")
    private double stockMinimo;

    @Column(name="stockMaximo")
    private double stockMaximo;

    @OneToMany(mappedBy = "sucursalInsumo")
    private List<ArticuloInsumo> articulosInsumo;
}
