package com.example.backend.repositories;

import com.example.backend.entities.Afspraak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AfspraakRepository extends JpaRepository<Afspraak, Long> {

}