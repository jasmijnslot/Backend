package com.example.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BehandelingRepository extends JpaRepository<Behandeling, Long> {
}