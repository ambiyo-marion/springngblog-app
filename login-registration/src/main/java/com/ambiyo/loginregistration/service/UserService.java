package com.ambiyo.loginregistration.service;

import com.ambiyo.loginregistration.model.User;
import com.ambiyo.loginregistration.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
