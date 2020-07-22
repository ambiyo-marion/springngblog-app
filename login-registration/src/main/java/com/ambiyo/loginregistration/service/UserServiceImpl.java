package com.ambiyo.loginregistration.service;


import com.ambiyo.loginregistration.model.Role;
import com.ambiyo.loginregistration.model.User;
import com.ambiyo.loginregistration.repository.UserRepository;
import com.ambiyo.loginregistration.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public  class UserServiceImpl implements UserService{


    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
      User user =new User(registrationDto.getFirstName(),registrationDto
      .getLastName(),registrationDto.getEmail(),registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
      return userRepository.save(user);

    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}