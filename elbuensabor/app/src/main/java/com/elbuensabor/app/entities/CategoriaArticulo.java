package com.elbuensabor.app.entities;

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
@Table(name = "categoriaArticulo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class CategoriaArticulo extends Base {

    @Column(name = "denominacion")
    private String denominacion;

    @ManyToOne
    @JoinColumn(name = "categoria_padre_id")
    private CategoriaArticulo categoriaPadre;

    @OneToMany(mappedBy = "categoriaPadre")
    private List<CategoriaArticulo> subcategorias;

    @OneToMany(mappedBy = "categoriaArticulo")
    private List<ArticuloInsumo> articulosInsumo;

}
