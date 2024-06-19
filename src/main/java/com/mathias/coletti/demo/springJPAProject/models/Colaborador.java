package com.mathias.coletti.demo.springJPAProject.models;

import jakarta.persistence.*;

@Entity
@Table(name = "colaboradores")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
    private String nome;

    @OneToOne
    @JoinColumn(name = "id_cargo", referencedColumnName = "codigo")
    private Cargo cargo;
}
