package com.webbin.gestion.riad.service.impl;

import com.webbin.gestion.riad.model.Client;

import java.util.List;

public interface ClientService {
    Client createClient(Client client);
    Client getClientById(Long id);
    Client updateClient(Long id, Client client);
    void deleteClient(Long id);
    List<Client> getAllClients();
}
