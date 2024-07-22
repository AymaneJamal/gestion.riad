package com.webbin.gestion.riad.mapper;

import com.webbin.gestion.riad.dto.ReservationDTO;
import com.webbin.gestion.riad.model.Reservation;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper {
    public ReservationDTO toDTO(Reservation reservation) {
        ReservationDTO dto = new ReservationDTO();
        dto.setId(reservation.getId());
        dto.setClientId(reservation.getClient().getId());
        dto.setChambreId(reservation.getChambre().getId());
        dto.setDateArrivee(reservation.getDateArrivee());
        dto.setDateDepart(reservation.getDateDepart());
        dto.setTarif(reservation.getTarif());
        return dto;
    }

    public Reservation toEntity(ReservationDTO dto) {
        Reservation reservation = new Reservation();
        reservation.setId(dto.getId());
        reservation.setDateDepart(dto.getDateDepart());
        reservation.setDateArrivee(dto.getDateArrivee());
        return reservation;
    }
}