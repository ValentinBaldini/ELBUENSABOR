package com.elbuensabor.app.entities;

import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Usuario extends Base {

    @Column(name = "auth0Id")
    private String auth0Id;

    @Column(name = "username")
    private String username;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol")
    private Rol perfil;

    @OneToOne(mappedBy = "usuario")
    private Empleado empleado;

    @OneToOne(mappedBy = "usuario")
    private Cliente cliente;
}
