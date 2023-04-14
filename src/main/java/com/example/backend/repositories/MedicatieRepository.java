package com.example.backend.repositories;

import com.example.backend.entities.Medicatie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicatieRepository extends JpaRepository<Medicatie, Long> {
}

