package com.example.l4_20213686.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "apis")
public class Api {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "version")
    private String version;

    @Column(name = "fecha_registro")
    private String fechaRegistro;

    @Column(name = "estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

}
