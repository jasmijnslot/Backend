package com.example.backend.repositories;

import com.example.backend.entities.Paspoort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaspoortRepository extends JpaRepository<Paspoort, Long> {
}

