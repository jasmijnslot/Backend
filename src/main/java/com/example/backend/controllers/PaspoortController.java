package com.example.backend.controllers;

import com.example.backend.entities.Dier;
import com.example.backend.repositories.PaspoortRepository;
import com.example.backend.entities.Paspoort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaspoortController {

    @Autowired
    private PaspoortRepository paspoortRepository;


    @PostMapping("/paspoorten")
    public Paspoort createPaspoort(@RequestBody Paspoort paspoort) {
        return paspoortRepository.save(paspoort);
    }

    @GetMapping("/paspoorten/{id}")
    public Paspoort getPaspoortById(@PathVariable Long id) {
        return paspoortRepository.findById(id).orElse(null);
    }

    @GetMapping("/paspoorten")
    public List<Paspoort> getAllPaspoorten() {
        return paspoortRepository.findAll();
    }

    @PutMapping("/paspoorten/{id}")
    public Paspoort updatePaspoort(@RequestBody Paspoort paspoort) {
        return paspoortRepository.save(paspoort);
    }

    @DeleteMapping("/paspoorten/{id}")
    public void deletePaspoort(@PathVariable Long id) {
        paspoortRepository.deleteById(id);
    }
}
