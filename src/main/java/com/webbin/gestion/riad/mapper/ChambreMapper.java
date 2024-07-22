package com.webbin.gestion.riad.mapper;

import com.webbin.gestion.riad.dto.ChambreDTO;
import com.webbin.gestion.riad.model.Chambre;
import org.springframework.stereotype.Component;

@Component
public class ChambreMapper {
    public ChambreDTO toDTO(Chambre chambre) {
        ChambreDTO dto = new ChambreDTO();
        dto.setId(chambre.getId());
        dto.setNom(chambre.getNom());
        dto.setEtage(chambre.getEtage());
        dto.setNombreDOccupation(chambre.getNombreDOccupation());
        dto.setEtat(chambre.getEtat());
        return dto;
    }

    public Chambre toEntity(ChambreDTO dto) {
        Chambre chambre = new Chambre();
        chambre.setId(dto.getId());
        chambre.setNom(dto.getNom());
        chambre.setEtage(dto.getEtage());
        chambre.setNombreDOccupation(dto.getNombreDOccupation());
        chambre.setEtat(dto.getEtat());
        return chambre;
    }
}