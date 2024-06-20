package com.mathias.coletti.demo.springJPAProject.Repositorio;

import com.mathias.coletti.demo.springJPAProject.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query("select p.id, p.nome, e.sigla from Pessoa as p join p.estado e")
    List<Pessoa> findAllPessoas();


}
