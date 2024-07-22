package com.webbin.gestion.riad.mapper;

import com.webbin.gestion.riad.dto.ClientDTO;
import com.webbin.gestion.riad.model.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {
    public ClientDTO toDTO(Client client) {
        ClientDTO dto = new ClientDTO();
        dto.setId(client.getId());
        dto.setNom(client.getNom());
        dto.setPrenom(client.getPrenom());
        dto.setTelephone(client.getNumeroDeTelephone());
        return dto;
    }

    public Client toEntity(ClientDTO dto) {
        Client client = new Client();
        client.setId(dto.getId());
        client.setNom(dto.getNom());
        client.setPrenom(dto.getPrenom());
        client.setNumeroDeTelephone(dto.getTelephone());
        return client;
    }
}