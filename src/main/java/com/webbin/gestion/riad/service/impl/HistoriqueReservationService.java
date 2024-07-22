package com.webbin.gestion.riad.service.impl;

import com.webbin.gestion.riad.model.HistoriqueReservation;

import java.util.List;

public interface HistoriqueReservationService {
    HistoriqueReservation createHistoriqueReservation(HistoriqueReservation reservationHistory);
    HistoriqueReservation getHistoriqueReservationById(Long id);
    HistoriqueReservation updateHistoriqueReservation(Long id, HistoriqueReservation reservationHistory);
    void deleteHistoriqueReservation(Long id);
    List<HistoriqueReservation> getAllHistoriqueReservations();
}
