package com.webbin.gestion.riad.dto;


import java.util.Date;

public class ReservationDTO {
    private Long id;
    private Long chambreId ;
    private Long ClientId ;
    private Date dateDepart;
    private Date dateArrivee;
    private double tarif;

    // Getters et setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChambreId() {
        return chambreId;
    }

    public void setChambreId(Long chambreId) {
        this.chambreId = chambreId;
    }

    public Long getClientId() {
        return ClientId;
    }

    public void setClientId(Long clientId) {
        ClientId = clientId;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }
}