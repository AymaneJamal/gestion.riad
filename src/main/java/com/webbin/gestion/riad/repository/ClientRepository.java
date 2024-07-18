package com.webbin.gestion.riad.repository;

import com.webbin.gestion.riad.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client , Long> {
}
