package com.example.backend.controllers;

import com.example.backend.entities.Dier;
import com.example.backend.repositories.DierenartsRepository;
import com.example.backend.entities.Dierenarts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DierenartsController {

    @Autowired
    private DierenartsRepository dierenartsRepository;


    @PostMapping("/dierenartsen")
    public Dierenarts createDierenarts(@RequestBody Dierenarts dierenarts) {
        return dierenartsRepository.save(dierenarts);
    }

    @GetMapping("/dierenartsen/{id}")
    public Dierenarts getDierenartsById(@PathVariable Long id) {
        return dierenartsRepository.findById(id).orElse(null);
    }

    @GetMapping("/dierenartsen")
    public List<Dierenarts> getAllDierenartsen() {
        return dierenartsRepository.findAll();
    }

    @PutMapping("/dierenartsen/{id}")
    public Dierenarts updateDierenarts(@RequestBody Dierenarts dierenarts) {
        return dierenartsRepository.save(dierenarts);
    }

    @DeleteMapping("/dierenartsen/{id}")
    public void deleteDierenarts(@PathVariable Long id) {
        dierenartsRepository.deleteById(id);
    }
}