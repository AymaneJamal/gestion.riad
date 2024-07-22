package com.webbin.gestion.riad.service.impl;

import com.webbin.gestion.riad.model.Chambre;

import java.util.List;

public interface ChambreService {
    Chambre createChambre(Chambre room);
    Chambre getChambreById(Long id);
    Chambre updateChambre(Long id, Chambre room);
    void deleteChambre(Long id);
    List<Chambre> getAllChambres();
}
