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

    public Colaborador(long codigo, String nome, Cargo cargo) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
    }

    public Colaborador() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
