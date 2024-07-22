package com.webbin.gestion.riad.dto;

public class ChambreDTO {
    private Long id;
    private String nom;
    private int nombreDOccupation;
    private int etage;
    private String etat;

    // Getters et setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreDOccupation() {
        return nombreDOccupation;
    }

    public void setNombreDOccupation(int nombreDOccupation) {
        this.nombreDOccupation = nombreDOccupation;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }



}