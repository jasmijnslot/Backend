package com.example.backend.controllers;

import com.example.backend.entities.Dier;
import com.example.backend.repositories.KlantRepository;
import com.example.backend.entities.Klant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class KlantController {

    @Autowired
    private KlantRepository klantRepository;


    @PostMapping("/klanten")
    public Klant createKlant(@RequestBody Klant klant) {
        return klantRepository.save(klant);
    }

    @GetMapping("/klanten/{id}")
    public Klant getKlantById(@PathVariable Long id) {
        return klantRepository.findById(id).orElse(null);
    }

    @GetMapping("/klanten")
    public List<Klant> getAllKlanten() {
        return klantRepository.findAll();
    }

    @PutMapping("/klanten/{id}")
    public Klant updateKlant(@RequestBody Klant klant) {
        return klantRepository.save(klant);
    }

    @DeleteMapping("/klanten/{id}")
    public void deleteKlant(@PathVariable Long id) {
        klantRepository.deleteById(id);
    }

}