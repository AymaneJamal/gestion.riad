package com.webbin.gestion.riad.repository;

import com.webbin.gestion.riad.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation  , Long> {
}
