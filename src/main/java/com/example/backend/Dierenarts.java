package com.example.backend;

import jakarta.persistence.*;

@Entity
@Table(name = "Dierenarts")
public class Dierenarts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "achterNaam")
    private String Achternaam;

    @Column(name = "telefoonNr")
    private int telefoonNr;

    @Column(name = "specialisatie")
    private String specialisatie;
}
