package com.example.backend.repositories;

import com.example.backend.entities.Dierenarts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DierenartsRepository extends JpaRepository<Dierenarts, Long> {
}
