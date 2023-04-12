package com.example.backend;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Paspoort")
public class Paspoort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "afgifteDatum")
    private Date afgifteDatum;

    @Column(name = "nummer")
    private String nummer;


}
