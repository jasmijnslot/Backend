package com.example.backend.controllers;

import com.example.backend.entities.Dier;
import com.example.backend.repositories.MedicatieRepository;
import com.example.backend.entities.Medicatie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicatieController {

    @Autowired
    private MedicatieRepository medicatieRepository;


    @PostMapping("/medicaties")
    public Medicatie createMedicatie(@RequestBody Medicatie medicatie) {
        return medicatieRepository.save(medicatie);
    }

    @GetMapping("/medicaties/{id}")
    public Medicatie getMedicatieById(@PathVariable Long id) {
        return medicatieRepository.findById(id).orElse(null);
    }

    @GetMapping("/medicaties")
    public List<Medicatie> getAllMedicatie() {
        return medicatieRepository.findAll();
    }

    @PutMapping("/medicaties/{id}")
    public Medicatie updateMedicatie(@RequestBody Medicatie medicatie) {
        return medicatieRepository.save(medicatie);
    }

    @DeleteMapping("/medicaties/{id}")
    public void deleteMedicatie(@PathVariable Long id) {
        medicatieRepository.deleteById(id);
    }
}

