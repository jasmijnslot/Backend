package com.example.backend;

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
}

