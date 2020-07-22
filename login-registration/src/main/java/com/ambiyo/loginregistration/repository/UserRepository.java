package com.ambiyo.loginregistration.repository;

import com.ambiyo.loginregistration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
    User findByEmail(String email);
}
