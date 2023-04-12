package com.example.backend;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "Behandeling")
public class Behandeling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "beschrijving")
    private String beschrijving;

    @Column(name = "datum")
    private Date datum;
}
