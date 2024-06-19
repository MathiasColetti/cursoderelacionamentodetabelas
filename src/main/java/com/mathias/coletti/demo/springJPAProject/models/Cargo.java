package com.mathias.coletti.demo.springJPAProject.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cargos")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
    private String cargo;
    private double salario;

    public Cargo() {
    }

    public Cargo(long codigo, String cargo, double salario) {
        this.codigo = codigo;
        this.cargo = cargo;
        this.salario = salario;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
