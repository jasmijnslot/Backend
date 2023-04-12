package com.example.backend;

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
}
