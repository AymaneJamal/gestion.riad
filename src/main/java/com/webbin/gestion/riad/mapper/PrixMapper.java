package com.webbin.gestion.riad.mapper;

import com.webbin.gestion.riad.dto.PrixDTO;
import com.webbin.gestion.riad.model.Prix;
import org.springframework.stereotype.Component;

@Component
public class PrixMapper {
    public PrixDTO toDTO(Prix prix) {
        PrixDTO dto = new PrixDTO();
        dto.setId(prix.getId());
        dto.setChambreId(prix.getChambre().getId());
        dto.setValeur(prix.getValeur());
        return dto;
    }

    public Prix toEntity(PrixDTO dto) {
        Prix prix = new Prix();
        prix.setId(dto.getId());
        prix.setValeur(dto.getValeur());
        return prix;
    }
}
