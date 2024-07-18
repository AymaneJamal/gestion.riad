package com.webbin.gestion.riad.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Prix {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int occupation;
    private double valeur;

    @ManyToOne
    @JoinColumn(name = "chambre_id")
    private Chambre chambre;
}
