package com.example.backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter

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
