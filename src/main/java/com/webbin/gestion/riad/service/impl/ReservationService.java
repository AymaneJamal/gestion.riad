package com.webbin.gestion.riad.service.impl;

import com.webbin.gestion.riad.model.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation createReservation(Reservation reservation);
    Reservation getReservationById(Long id);
    Reservation updateReservation(Long id, Reservation reservation);
    void deleteReservation(Long id);
    List<Reservation> getAllReservations();
}
