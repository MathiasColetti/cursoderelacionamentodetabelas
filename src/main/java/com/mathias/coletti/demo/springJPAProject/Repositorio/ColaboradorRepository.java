package com.mathias.coletti.demo.springJPAProject.Repositorio;

import com.mathias.coletti.demo.springJPAProject.models.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {
}
