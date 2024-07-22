package com.webbin.gestion.riad.repository;

import com.webbin.gestion.riad.model.RevokedToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RevokedTokenRepository extends JpaRepository<RevokedToken , Long> {
    Optional<RevokedToken> findByToken(String token);

}
