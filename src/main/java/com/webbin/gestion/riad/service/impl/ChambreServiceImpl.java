package com.webbin.gestion.riad.service.impl;


import com.webbin.gestion.riad.model.Chambre;
import com.webbin.gestion.riad.repository.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChambreServiceImpl implements ChambreService {

    @Autowired
    private ChambreRepository roomRepository;

    @Override
    public Chambre createChambre(Chambre room) {
        return roomRepository.save(room);
    }

    @Override
    public Chambre getChambreById(Long id) {
        Optional<Chambre> room = roomRepository.findById(id);
        return room.orElse(null);
    }

    @Override
    public Chambre updateChambre(Long id, Chambre room) {
        if (roomRepository.existsById(id)) {
            room.setId(id);
            return roomRepository.save(room);
        } else {
            return null;
        }
    }

    @Override
    public void deleteChambre(Long id) {
        roomRepository.deleteById(id);
    }

    @Override
    public List<Chambre> getAllChambres() {
        return roomRepository.findAll();
    }
}