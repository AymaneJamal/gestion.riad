package com.webbin.gestion.riad.service.impl;


import com.webbin.gestion.riad.model.HistoriqueReservation;
import com.webbin.gestion.riad.repository.HistoriqueReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoriqueReservationServiceImpl implements HistoriqueReservationService {
    @Autowired
    private HistoriqueReservationRepository historiqueReservationRepository;

    @Override
    public HistoriqueReservation createHistoriqueReservation(HistoriqueReservation historiqueReservation) {
        return historiqueReservationRepository.save(historiqueReservation);
    }

    @Override
    public HistoriqueReservation getHistoriqueReservationById(Long id){
        Optional<HistoriqueReservation> historiqueReservation = historiqueReservationRepository.findById(id) ;
        return historiqueReservation.orElse(null) ;
    }

   @Override
    public HistoriqueReservation updateHistoriqueReservation(Long id , HistoriqueReservation historiqueReservation){
        if(historiqueReservationRepository.existsById(id)){
            historiqueReservation.setId(id);
            return historiqueReservationRepository.save(historiqueReservation) ;
        }else {
            return null ;
        }
   }

   @Override
    public void deleteHistoriqueReservation(Long id){
        historiqueReservationRepository.deleteById(id);
   }

   @Override
    public List<HistoriqueReservation> getAllHistoriqueReservations() {
        return historiqueReservationRepository.findAll() ;
   }



}
