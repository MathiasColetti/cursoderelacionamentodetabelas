package com.mathias.coletti.demo.springJPAProject.Repositorio;

import com.mathias.coletti.demo.springJPAProject.models.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRespository extends JpaRepository<Cargo, Long> {
}
