package com.mathias.coletti.demo.springJPAProject.controllers;

import com.mathias.coletti.demo.springJPAProject.Repositorio.ColaboradorRepository;
import com.mathias.coletti.demo.springJPAProject.models.Colaborador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}
