package com.webbin.gestion.riad.AuthController;

import com.webbin.gestion.riad.model.RevokedToken;
import com.webbin.gestion.riad.repository.RevokedTokenRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LogoutService {

    private final RevokedTokenRepository revokedTokenRepository;

    public LogoutService(RevokedTokenRepository revokedTokenRepository) {
        this.revokedTokenRepository = revokedTokenRepository;
    }

    public void logout(String token) {
        RevokedToken revokedToken = new RevokedToken();
        revokedToken.setToken(token);
        revokedToken.setRevokedAt(new Date());
        revokedTokenRepository.save(revokedToken);
    }
}
