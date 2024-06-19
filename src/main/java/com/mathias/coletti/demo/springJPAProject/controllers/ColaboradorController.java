package com.mathias.coletti.demo.springJPAProject.controllers;

import com.mathias.coletti.demo.springJPAProject.Repositorio.ColaboradorRepository;
import com.mathias.coletti.demo.springJPAProject.models.Colaborador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    @Autowired
    public ColaboradorRepository colaboradorRepository;

    @GetMapping
    public ResponseEntity<List<Colaborador>> findAll(){
        List<Colaborador> colaboradors = colaboradorRepository.findAll();
        if (colaboradors.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(colaboradors);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Colaborador> findById(@PathVariable Long id){
        Colaborador colaborador = colaboradorRepository.findById(id).get();
        if (colaborador == null) {
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(colaborador);
        }
    }
    @PostMapping
    public Colaborador add(@RequestBody Colaborador colaborador){
        return colaboradorRepository.save(colaborador);
    }

}
