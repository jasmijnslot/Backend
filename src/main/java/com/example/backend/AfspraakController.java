package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AfspraakController {

    @Autowired
    private AfspraakRepository afspraakRepository;

    @PostMapping("/afspraken")
    public Afspraak createAfspraak(@RequestBody Afspraak afspraak) {
        return afspraakRepository.save(afspraak);
    }

    @GetMapping("/afspraken/{id}")
    public Afspraak getAfspraakById(@PathVariable Long id) {
        return afspraakRepository.findById(id).orElse(null);
    }

    @GetMapping("/afspraken")
    public List<Afspraak> getAllAfspraken() {
        return afspraakRepository.findAll();
    }
}
