package com.mathias.coletti.demo.springJPAProject.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "estados")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String sigla;

    @OneToMany(mappedBy = "estado")
    private List<Pessoa> pessoas;

    public Estado() {

    }

    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }


    public Estado(Long id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;

    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
