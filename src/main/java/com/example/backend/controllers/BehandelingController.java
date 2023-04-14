package com.example.backend.controllers;

import com.example.backend.repositories.BehandelingRepository;
import com.example.backend.entities.Behandeling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class BehandelingController {

    @Autowired
    private BehandelingRepository behandelingRepository;


    @PostMapping("/behandelingen")
    public Behandeling createBehandeling(@RequestBody Behandeling behandeling) {
        return behandelingRepository.save(behandeling);
    }

    @GetMapping("/behandelingen/{id}")
    public Behandeling getBehandelingById(@PathVariable Long id) {
        return behandelingRepository.findById(id).orElse(null);
    }

    @GetMapping("/behandelingen")
    public List<Behandeling> getAllBehandelingen() {
        return behandelingRepository.findAll();
    }

    @PutMapping("/behandlingen{id}")
    public Behandeling updateBehandeling(@RequestBody Behandeling behandeling) {
        return behandelingRepository.save(behandeling);
    }
}
