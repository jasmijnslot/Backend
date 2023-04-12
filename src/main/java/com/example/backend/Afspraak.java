package com.example.backend;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Afspraak")
public class Afspraak {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "datum")
    private Date datum;

    @Column(name = "reden")
    private String reden;


}
