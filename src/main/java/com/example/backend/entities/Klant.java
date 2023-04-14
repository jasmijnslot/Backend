package com.example.backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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