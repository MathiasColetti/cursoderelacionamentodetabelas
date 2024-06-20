package com.mathias.coletti.demo.springJPAProject.controllers;

import com.mathias.coletti.demo.springJPAProject.Repositorio.PessoaRepository;
import com.mathias.coletti.demo.springJPAProject.models.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoa> listar() {
        return pessoaRepository.findAllPessoas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> pesquisar(@PathVariable Long id) {
        Pessoa pessoa = pessoaRepository.findById(id).get();
        if (pessoa == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(pessoa);
        }
    }
}
