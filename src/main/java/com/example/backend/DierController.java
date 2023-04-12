package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DierController {

    @Autowired
    private DierRepository dierRepository;


    @PostMapping("/dieren")
    public Dier createDier(@RequestBody Dier dier) {
        return dierRepository.save(dier);
    }

    @GetMapping("/dieren/{id}")
    public Dier getDierById(@PathVariable Long id) {
        return dierRepository.findById(id).orElse(null);
    }

    @GetMapping("/dieren")
    public List<Dier> getAllDieren() {
        return dierRepository.findAll();
    }
}

