package com.mathias.coletti.demo.springJPAProject.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pessoas")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_estado", referencedColumnName = "id")
    private Estado estado;

    public Pessoa(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(long id, String nome, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public Pessoa() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
