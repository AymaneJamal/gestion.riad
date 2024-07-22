package com.webbin.gestion.riad.service.impl;

import com.webbin.gestion.riad.model.Prix;

import java.util.List;

public interface PrixService {
    Prix createPrix(Prix prix);
    Prix getPrixById(Long id);
    Prix updatePrix(Long id, Prix prix);
    void deletePrix(Long id);
    List<Prix> getAllPrix();
}

