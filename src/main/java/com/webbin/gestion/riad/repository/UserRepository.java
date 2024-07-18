package com.webbin.gestion.riad.repository;

import com.webbin.gestion.riad.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> {
    User findByUsername(String username);
}
