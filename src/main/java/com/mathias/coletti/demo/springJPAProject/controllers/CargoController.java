package com.mathias.coletti.demo.springJPAProject.controllers;

import com.mathias.coletti.demo.springJPAProject.Repositorio.CargoRespository;
import com.mathias.coletti.demo.springJPAProject.models.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    private CargoRespository cargoRespository;

    @GetMapping
    public ResponseEntity<List<Cargo>> findAll() {
        List<Cargo> cargoList = cargoRespository.findAll();
        if (cargoList.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(cargoList);
        }
    }

    @GetMapping("/{id}")
    public Cargo findOne(@PathVariable long id) {
        return cargoRespository.findById(id).get();
    }

    @PostMapping
    public Cargo post(@RequestBody Cargo cargo) {
        return cargoRespository.save(cargo);
    }

    @PutMapping("/{id}")
    public Cargo post(@RequestBody Cargo cargo, @PathVariable long id) {
        Cargo optionalCargo = cargoRespository.findById(id).get();
        optionalCargo.setCargo(cargo.getCargo());
        optionalCargo.setSalario(cargo.getSalario());
        return cargoRespository.save(optionalCargo);

    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable long id) {
        cargoRespository.deleteById(id);
    }
}
