package com.example.backend;

import jakarta.persistence.*;

@Entity
@Table(name = "Klant")
public class Klant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "achterNaam")
    private String achterNaam;

    @Column(name = "telefoonNr")
    private String telefoonNr;

    @Column(name = "postcode")
    private String postcode;

    @Column(name = "email")
    private String email;


}