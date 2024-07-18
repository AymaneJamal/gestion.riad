package com.webbin.gestion.riad.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int nombreDOccupation;
    private int etage;
    private String etat;

    @ManyToOne
    @JoinColumn(name = "riad_id")
    private Riad riad;

}
