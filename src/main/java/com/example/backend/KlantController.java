package com.example.backend;

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

}